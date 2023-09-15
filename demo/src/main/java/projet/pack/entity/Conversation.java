package projet.pack.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@RequiredArgsConstructor
@Data
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idconversation;
    @ManyToOne
    private Utilisateur user;
    @OneToMany(mappedBy="conversation")
    private List<Message> messages;

}
