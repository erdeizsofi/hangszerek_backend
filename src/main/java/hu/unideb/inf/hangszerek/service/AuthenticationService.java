package hu.unideb.inf.hangszerek.service;

import hu.unideb.inf.hangszerek.service.dto.BejelentkezesDto;
import hu.unideb.inf.hangszerek.service.dto.FelhasznaloDto;

public interface AuthenticationService {

    public String regisztracio(FelhasznaloDto felhasznalo);
    //felhasználónév és jelszó is elég lenne
    public String bejelentkezes(BejelentkezesDto bejelentkezesDto);
}
