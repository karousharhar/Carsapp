package projet.pack.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Entity
@RequiredArgsConstructor
@Data
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcommande;
    private int cartebancaire;
    private String poteurcarte;
    private  double prix;
    private LocalDate date;
    private int codeverification;
    @ManyToOne
    private Utilisateur user;
    @OneToOne
    private Voiture voiture;
}
