package ma.projet.grpc.controllers;

import io.grpc.stub.StreamObserver;
import ma.projet.grpc.stubs.*;

import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;


@GrpcService
public class CompteServiceImpl extends CompteServiceGrpc.CompteServiceImplBase {

    // In-memory database simulation
    private final Map<String, Compte> compteDB = new ConcurrentHashMap<>();

    @Override
    public void allComptes(GetAllComptesRequest request, StreamObserver<GetAllComptesResponse> responseObserver) {
        GetAllComptesResponse response = GetAllComptesResponse.newBuilder()
                .addAllComptes(compteDB.values())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void compteById(GetCompteByIdRequest request, StreamObserver<GetCompteByIdResponse> responseObserver) {
        Compte compte = compteDB.get(request.getId());
        if (compte != null) {
            responseObserver.onNext(
                    GetCompteByIdResponse.newBuilder().setCompte(compte).build()
            );
        } else {
            responseObserver.onError(new Throwable("Compte non trouvé"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void totalSolde(GetTotalSoldeRequest request, StreamObserver<GetTotalSoldeResponse> responseObserver) {
        int count = compteDB.size();
        float sum = 0;
        for (Compte c : compteDB.values()) {
            sum += c.getSolde();
        }
        float average = (count > 0) ? (sum / count) : 0;

        SoldeStats stats = SoldeStats.newBuilder()
                .setCount(count)
                .setSum(sum)
                .setAverage(average)
                .build();

        responseObserver.onNext(
                GetTotalSoldeResponse.newBuilder().setStats(stats).build()
        );
        responseObserver.onCompleted();
    }

    @Override
    public void saveCompte(SaveCompteRequest request, StreamObserver<SaveCompteResponse> responseObserver) {
        CompteRequest compteReq = request.getCompte();

        boolean exists = compteDB.values().stream().anyMatch(
                c -> c.getSolde() == compteReq.getSolde()
                        && c.getDateCreation().equals(compteReq.getDateCreation())
                        && c.getType().equals(compteReq.getType())
        );

        if (exists) {
            responseObserver.onError(new Throwable("Duplicate compte entry."));
            return;
        }

        String id = UUID.randomUUID().toString();

        Compte compte = Compte.newBuilder()
                .setId(id)
                .setSolde(compteReq.getSolde())
                .setDateCreation(compteReq.getDateCreation())
                .setType(compteReq.getType())
                .build();

        compteDB.put(id, compte);

        responseObserver.onNext(
                SaveCompteResponse.newBuilder().setCompte(compte).build()
        );
        responseObserver.onCompleted();
    }


    @Override
    public void deleteCompte(DeleteCompteRequest request, StreamObserver<DeleteCompteResponse> responseObserver) {
        boolean removed = (compteDB.remove(request.getId()) != null);
        responseObserver.onNext(
                DeleteCompteResponse.newBuilder().setSuccess(removed).build()
        );
        responseObserver.onCompleted();
    }

    @Override
    public void getComptesByType(GetComptesByTypeRequest request, StreamObserver<GetComptesByTypeResponse> responseObserver) {
        TypeCompte requestedType = request.getType();
        var filtered = compteDB.values().stream()
                .filter(c -> c.getType().equals(requestedType))
                .collect(Collectors.toList());

        responseObserver.onNext(
                GetComptesByTypeResponse.newBuilder().addAllComptes(filtered).build()
        );
        responseObserver.onCompleted();
    }
    @Override
    public void searchComptesByDate(SearchComptesByDateRequest request, StreamObserver<SearchComptesByDateResponse> responseObserver) {
        String date = request.getDateCreation();
        var filteredComptes = compteDB.values().stream()
                .filter(compte -> compte.getDateCreation().equals(date))
                .collect(Collectors.toList());

        responseObserver.onNext(
                SearchComptesByDateResponse.newBuilder().addAllComptes(filteredComptes).build()
        );
        responseObserver.onCompleted();
    }

    @Override
    public void getSummary(GetSummaryRequest request, StreamObserver<GetSummaryResponse> responseObserver) {
        Map<TypeCompte, Long> summary = compteDB.values().stream()
                .collect(Collectors.groupingBy(Compte::getType, Collectors.counting()));

        var summaries = summary.entrySet().stream()
                .map(entry -> TypeCompteSummary.newBuilder()
                        .setType(entry.getKey())
                        .setCount(entry.getValue().intValue())
                        .build())
                .collect(Collectors.toList());

        responseObserver.onNext(
                GetSummaryResponse.newBuilder().addAllSummaries(summaries).build()
        );
        responseObserver.onCompleted();
    }

}
