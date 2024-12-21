package hu.unideb.inf.hangszerek.controller;

import hu.unideb.inf.hangszerek.service.EladoHangszerManagementService;
import hu.unideb.inf.hangszerek.service.dto.EladoHangszerDto;
import hu.unideb.inf.hangszerek.service.dto.HangszerDto;
import hu.unideb.inf.hangszerek.service.HangszerManagementService;
import hu.unideb.inf.hangszerek.service.dto.VonosDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/elado")
public class EladoHangszerController {

    @Autowired
    EladoHangszerManagementService service;

    @RequestMapping(value = "/**", method = RequestMethod.OPTIONS)
    public ResponseEntity<Void> handleOptions() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/savehangszer")
    public EladoHangszerDto saveHangszer(@RequestBody EladoHangszerDto dto){
        return service.save(dto);
    }

    @DeleteMapping("/deletehangszer")
    public void deleteHangszer(@RequestParam Long id){
        service.delete(id);
    }

    @GetMapping("/allhangszer")
    public List<EladoHangszerDto> getAllHangszer(){
        return service.findAll();
    }

    @GetMapping("/hangszer")
    public List<EladoHangszerDto> getAllHangszer(@RequestParam Long id){
        return service.findByHangszerId(id);
    }
}









