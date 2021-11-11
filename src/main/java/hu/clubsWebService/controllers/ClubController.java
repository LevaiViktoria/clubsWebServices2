package hu.clubsWebService.controllers;

import hu.clubsWebService.domain.Club;
import hu.clubsWebService.services.ClubService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClubController {

    private final ClubService service;

    public ClubController(ClubService service) {
        this.service = service;
    }

    @GetMapping("/clubs")
    public List<Club> getClubs(){
        return service.getClubs();
    }
    @GetMapping("/clubs/{id}")
    public Club getClub(@PathVariable("id") Long id){
        return service.getClub(id);
    }
    @PostMapping("clubs")
    @ResponseStatus(HttpStatus.CREATED)
    public Club addClub(@RequestBody Club club){
        return service.addClub(club);
    }

}
