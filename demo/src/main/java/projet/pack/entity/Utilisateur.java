package projet.pack.entity;
import java.util.*;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Data
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastname;
    private int age;
    private String email;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Conversation> conversations;
    @OneToMany(mappedBy="user")
    private List<Voiture> voitures;
    @OneToMany(mappedBy = "user")
    private List<Commande> commandes;

}
