package projet.pack.DTO;

import lombok.Data;

@Data
public class VoitureDTOgetter {
    private Long idvoiture;
    private int anneeenregistrement;
    private String marque;
    private double Horsepower;
    private int kilometrage;
    private String fueltype;
    private int prix;

    private String proprietaire;
}
