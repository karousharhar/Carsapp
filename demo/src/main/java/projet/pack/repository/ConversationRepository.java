package projet.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.pack.entity.Conversation;

public interface ConversationRepository extends JpaRepository<Conversation,Long> {
}
