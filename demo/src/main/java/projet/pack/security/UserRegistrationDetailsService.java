package projet.pack.security;




import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import projet.pack.entity.Utilisateur;
import projet.pack.repository.UtilisateurRepository;
import projet.pack.security.UserRegistrationDetails;

@Service
@RequiredArgsConstructor
public class UserRegistrationDetailsService implements UserDetailsService {
    private final UtilisateurRepository personneRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Utilisateur personne = personneRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Cette utilisateur n'existe pas"));
        UserRegistrationDetails user = new UserRegistrationDetails(personne);
        return user;
    }
}
