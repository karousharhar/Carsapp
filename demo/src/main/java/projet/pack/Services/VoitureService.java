package projet.pack.Services;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import projet.pack.DTO.AllVoituresDTO;
import projet.pack.DTO.VoitureDTOgetter;
import projet.pack.DTO.VoitureDTOsaver;
import projet.pack.entity.Voiture;
import projet.pack.mappers.VoitureMapper;
import projet.pack.repository.VoitureRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Data
public class VoitureService {
    private final VoitureRepository voiturerepository;
    private final VoitureMapper voituremapper;
    public void savevoiture(VoitureDTOsaver voituredtosaver ){
       Voiture voiture= voituremapper.fromvoitureDTO(voituredtosaver);
        voiturerepository.save(voiture);
    }
public AllVoituresDTO getallvoitures(int page,int size){
     Page<Voiture> Voiturespages=voiturerepository.findAllByOrderByEnregistrementdateDesc(PageRequest.of(page,size));
    List<VoitureDTOgetter> voituresdtos=Voiturespages.stream().map(voiture -> voituremapper.fromvoiture(voiture)).collect(Collectors.toList());
    AllVoituresDTO voituresresponse=new AllVoituresDTO();
    voituresresponse.setVoituresDTO(voituresdtos);
    voituresresponse.setCurrentPage(page);
    voituresresponse.setTotalPages(Voiturespages.getTotalPages());
    voituresresponse.setPageSize(Voiturespages.getSize());
    return voituresresponse;
}

}
