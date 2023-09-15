package projet.pack.mappers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import projet.pack.DTO.UtilisateurDTO;
import projet.pack.entity.Utilisateur;

@Service
@RequiredArgsConstructor
public class Utilisateurmapper {
    private final PasswordEncoder passwordEncoder;

    public Utilisateur fromUtilisateurDTO(UtilisateurDTO utilisateurdto){
        Utilisateur utilisateur=new Utilisateur();
        utilisateur.setAge(utilisateurdto.getAge());
        utilisateur.setName(utilisateurdto.getName());
        utilisateur.setLastname(utilisateurdto.getLastname());
        utilisateur.setEmail(utilisateurdto.getEmail());
        utilisateur.setPassword(passwordEncoder.encode(utilisateurdto.getPassword()));
        return utilisateur;

    }

}
