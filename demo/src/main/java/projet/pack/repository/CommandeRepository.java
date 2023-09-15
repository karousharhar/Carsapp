package projet.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.pack.entity.Commande;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
