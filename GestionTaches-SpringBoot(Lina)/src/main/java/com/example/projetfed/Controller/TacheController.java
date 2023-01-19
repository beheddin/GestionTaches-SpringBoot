package com.example.projetfed.Controller;

import com.example.projetfed.Models.Tache;
import com.example.projetfed.Service.TacheService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/taches")
public class TacheController {
    private final TacheService tacheService;

    public TacheController(TacheService tacheService) {
        this.tacheService = tacheService;
    }


    @GetMapping
    public List<Tache> findAllTache(){
        return tacheService.findAllTache();
    }
    @GetMapping("/user={userid}")
    public List<Tache> findAllTacheByUser(@PathVariable("userid") Long id){
        return tacheService.findAllTacheByUser(id);
    }
    @GetMapping("/projet={projetid}")
    public List<Tache> findAllTacheByProjet(@PathVariable("projetid") Long id){
        return tacheService.findAllTacheByProjet(id);
    }
    @PostMapping
    public Tache saveTache(@RequestBody Tache tache){
        return tacheService.saveTache(tache);
    }
    @PutMapping
    public Tache updateTache(@RequestBody Tache tache){
        return tacheService.updateTache(tache);
    }
    @DeleteMapping("/{id}")
    public  void deleteTache(@PathVariable("id") Long id)
    { tacheService.deleteTache(id);

    }
}
