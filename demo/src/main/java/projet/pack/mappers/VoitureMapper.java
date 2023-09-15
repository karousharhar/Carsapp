package projet.pack.mappers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import projet.pack.DTO.VoitureDTOgetter;
import projet.pack.DTO.VoitureDTOsaver;
import projet.pack.entity.Voiture;
import projet.pack.repository.UtilisateurRepository;

@Service
@RequiredArgsConstructor
public class VoitureMapper {
    private final UtilisateurRepository utilisateurrepository;
    public VoitureDTOgetter fromvoiture(Voiture voiture){

        VoitureDTOgetter voituredto=new VoitureDTOgetter();
        voituredto.setIdvoiture(voiture.getIdvoiture());
        voituredto.setHorsepower(voiture.getHorsepower());
        voituredto.setFueltype(voiture.getFueltype());
        voituredto.setMarque(voiture.getMarque());
        voituredto.setPrix(voiture.getPrix());
        voituredto.setKilometrage(voiture.getKilometrage());
        voituredto.setAnneeenregistrement(voiture.getAnneeenregistrement());
        voituredto.setProprietaire(voiture.getUser().getName());
        return voituredto;
    }

public Voiture fromvoitureDTO(VoitureDTOsaver voituredto){
Voiture voiture=new Voiture();
    BeanUtils.copyProperties(voituredto,voiture);
    voiture.setUser(utilisateurrepository.getById(voituredto.getIduser()));
    voiture.setHorsepower(voituredto.getHorsepower());
    return voiture;
}
}
