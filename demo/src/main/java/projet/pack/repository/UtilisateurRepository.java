package projet.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.pack.entity.Utilisateur;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
Optional<Utilisateur> findByEmail(String email);

}
