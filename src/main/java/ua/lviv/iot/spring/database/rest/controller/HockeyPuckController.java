package ua.lviv.iot.spring.database.rest.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.spring.database.rest.HockeyPuck;
import ua.lviv.iot.spring.database.rest.business.HockeyPuckService;

import java.util.List;


@RequestMapping("/hockeypucks")
@RestController
@RequiredArgsConstructor

public class HockeyPuckController {

    @Autowired
    private HockeyPuckService hockeyPuckrService;

    @GetMapping
    public List<HockeyPuck> getAllHockeyPucks() {
        return hockeyPuckrService.getAllHockeyPucks();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<HockeyPuck> getHockeyPuck(final @PathVariable("id") Integer hockeyPuckId) {
        return hockeyPuckrService.getHockeyPuck(hockeyPuckId);
    }

    @PostMapping
    public HockeyPuck createHockeyPuck(final @RequestBody HockeyPuck newHockeyPuck) {
        return hockeyPuckrService.createHockeyPuck(newHockeyPuck);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<HockeyPuck> updateHockeyPuck(final @PathVariable("id") Integer hockeyPuckId,
                                                       final @RequestBody HockeyPuck hockeyPuck) {
        return hockeyPuckrService.updateHockeyPuck(hockeyPuck, hockeyPuckId);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<HockeyPuck> deleteHockeyPuck(final @PathVariable("id") Integer hockeyPuckId) {
        HttpStatus status = hockeyPuckrService.deleteHockeyPuck(hockeyPuckId);
        return ResponseEntity.status(status).build();
    }
}

