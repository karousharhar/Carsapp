package projet.pack.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projet.pack.DTO.AllVoituresDTO;
import projet.pack.DTO.VoitureDTOsaver;
import projet.pack.Services.VoitureService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Voiture")
@CrossOrigin("*")
public class VoitureController {
    private final VoitureService voitureservice;
    @GetMapping()
    public ResponseEntity<AllVoituresDTO> getallvoitures( @RequestParam(name = "page", defaultValue = "0") int page,
                                                          @RequestParam(name = "size", defaultValue = "5") int size){
        AllVoituresDTO voituresdtos=voitureservice.getallvoitures(page,size);
        return new ResponseEntity<>(voituresdtos, HttpStatus.OK);
    }
    @PostMapping("/savevoiture")
    public void savevoiture(@RequestBody VoitureDTOsaver voituredto){
        voitureservice.savevoiture(voituredto);
    }
}
