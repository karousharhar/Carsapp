package projet.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.pack.entity.Message;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
