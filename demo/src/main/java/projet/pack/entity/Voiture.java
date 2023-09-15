package projet.pack.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Entity
@RequiredArgsConstructor
@Data
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idvoiture;
    private int anneeenregistrement;
    private String marque;
    private double Horsepower;
    private int kilometrage;
    private String fueltype;
    private int prix;
    private Date enregistrementdate;
    @ManyToOne
    private Utilisateur user;
    @OneToOne(mappedBy = "voiture")
    private Commande commande;

}
