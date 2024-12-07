package ma.projet.grpc.reposetories;

import ma.projet.grpc.entities.Compte;
import ma.projet.grpc.entities.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CompteRepository extends JpaRepository<Compte, UUID> {
    List<Compte> findByDateCreation(String dateCreation);
    List<Compte> findByType(TypeCompte type);
}