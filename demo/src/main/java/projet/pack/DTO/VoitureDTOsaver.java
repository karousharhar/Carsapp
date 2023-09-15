package projet.pack.DTO;

import lombok.Data;

@Data
public class VoitureDTOsaver {
    private int anneeenregistrement;
    private String marque;
    private double horsepower;
    private int kilometrage;
    private String fueltype;
    private int prix;

    private Long iduser;
}
