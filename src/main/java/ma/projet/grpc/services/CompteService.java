package ma.projet.grpc.services;

import ma.projet.grpc.entities.Compte;
import ma.projet.grpc.entities.TypeCompte;
import ma.projet.grpc.reposetories.CompteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompteService {
    private final CompteRepository compteRepository;

    public CompteService(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    public List<Compte> findAllComptes() {
        return compteRepository.findAll();
    }



    public List<Compte> findComptesByType(TypeCompte type) {
        return compteRepository.findByType(type);
    }

    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }


}