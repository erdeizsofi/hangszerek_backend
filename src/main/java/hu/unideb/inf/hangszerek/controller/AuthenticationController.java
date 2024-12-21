package hu.unideb.inf.hangszerek.controller;

import hu.unideb.inf.hangszerek.service.AuthenticationService;
import hu.unideb.inf.hangszerek.service.dto.BejelentkezesDto;
import hu.unideb.inf.hangszerek.service.dto.FelhasznaloDto;
import hu.unideb.inf.hangszerek.service.impl.AuthenticationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    @Autowired
    AuthenticationServiceImpl authenticationService;

    @RequestMapping(value = "/**", method = RequestMethod.OPTIONS)
    public ResponseEntity<Void> handleOptions() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/regisztracio")
    public String regisztracio(@RequestBody FelhasznaloDto felhasznalo) {
        return authenticationService.regisztracio(felhasznalo);
    }

    @PostMapping("/bejelentkezes")
    public String bejelentkezes(@RequestBody BejelentkezesDto bejelentkezesDto){
        return authenticationService.bejelentkezes(bejelentkezesDto);
    }
}
