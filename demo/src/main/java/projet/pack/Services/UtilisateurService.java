package projet.pack.Services;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import projet.pack.entity.Utilisateur;
import projet.pack.repository.UtilisateurRepository;

@Service
@RequiredArgsConstructor
@Data
public class UtilisateurService {
public final UtilisateurRepository utilisateurRepository;
 public void saveuser(Utilisateur user){
     utilisateurRepository.save(user);
 }

}
