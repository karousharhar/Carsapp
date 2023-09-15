package projet.pack.Controllers;




import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projet.pack.DTO.UtilisateurDTO;
import projet.pack.security.AuthService;
import projet.pack.security.AuthenticationRequest;
import projet.pack.security.AuthenticationResponse;
import projet.pack.security.JwtService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/authentication")
@CrossOrigin("*")
public class AuthenticationController {
    private final AuthService authService;
    private final JwtService jwtservice;
   @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody UtilisateurDTO personneDTO) {
        AuthenticationResponse authResponse = authService.register(personneDTO);
        if (authResponse.getErrorMessage() != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(authResponse);
        }
        return ResponseEntity.ok(authResponse);
    }


    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest authenticationRequest) {
        AuthenticationResponse authResponse = authService.authenticate(authenticationRequest);
        return ResponseEntity.ok(authResponse);
    }

/*    @PostMapping("/logout")
    public void logout(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        String jwt = authHeader.substring(7);
        jwtservice.setTokenExpirationToPast(jwt);
    }*/
}