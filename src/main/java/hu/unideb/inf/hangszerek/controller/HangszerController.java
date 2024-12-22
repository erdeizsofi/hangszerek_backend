package hu.unideb.inf.hangszerek.controller;

import hu.unideb.inf.hangszerek.service.dto.HangszerDto;
import hu.unideb.inf.hangszerek.service.HangszerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController //json-t vár, json-t küld
@RequestMapping("/api")
public class HangszerController {

    @Autowired
    HangszerManagementService service;

    @RequestMapping(value = "/**", method = RequestMethod.OPTIONS)
    public ResponseEntity<Void> handleOptions() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/savehangszer")
    public HangszerDto saveHangszer(@RequestBody HangszerDto dto){
        return service.save(dto);
    }

    //entity rendelkezik ID-val, akkor update, amúgy save
    @PutMapping("/updatehangszer")
    public HangszerDto updateHangszer(@RequestBody HangszerDto dto){
        return service.update(dto);
    }

    // /api/deletehangszer?id=x
    @DeleteMapping("/deletehangszer")
    public void deleteHangszer(@RequestParam Long id){
        service.delete(id);
    }

    @GetMapping("/allhangszer")
    public List<HangszerDto> getAllHangszer(){
        return service.findAll();
    }

    // /hangszer/vonos
    @GetMapping("/hangszer/{tipus}")
    public List<HangszerDto> getHangszerByTipus(@PathVariable String tipus){
        return service.hangszerByTipus(tipus);
    }

    @GetMapping("/hangszer")
    public List<HangszerDto> getHangszerByNev(@RequestParam String nev){
        return service.hangszerByNev(nev);
    }

    @GetMapping("/filteredhangszer")
    public List<HangszerDto> getFilteredHangszer(@RequestParam(required = false) String nev,
                                             @RequestParam(required = false) String tipus){
        return service.hangszerByParams(nev,tipus);

    }

}









