package ua.lviv.iot.hockey.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.hockey.model.HockeyPuck;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


@RequestMapping("/hockeypucks")
@RestController
public class HockeyPuckController {

    private Map<Integer, HockeyPuck> hockeyPucks = new HashMap<>();

    private AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public List<HockeyPuck> getAllHockeyPuck() {
        return new ArrayList<>(hockeyPucks.values());
    }

    @GetMapping(path = "/{id}")
    public HockeyPuck getHockeyPuck(final @PathVariable("id") Integer studentId) {
        return hockeyPucks.get(studentId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public HockeyPuck createHockeyPuck(final @RequestBody HockeyPuck hockeyPuck) {
        hockeyPuck.setId(idCounter.incrementAndGet());
        hockeyPucks.put(hockeyPuck.getId(), hockeyPuck);
        return hockeyPuck;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<HockeyPuck> deleteHockeyPucks(@PathVariable("id") int studentId) {
        HttpStatus status = hockeyPucks.remove(studentId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();

    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<HockeyPuck> updateHockeyPuck(final @PathVariable("id") Integer hockeyPuckId,
                                                       final @RequestBody HockeyPuck hockeyPuck) {
        HttpStatus status;
        hockeyPuck.setId(hockeyPuckId);
        if (hockeyPucks.containsKey(hockeyPuckId)) {
            hockeyPucks.put(hockeyPuckId, hockeyPuck);
            status = HttpStatus.OK;
        } else {
            status = HttpStatus.NOT_FOUND;
        }
        return ResponseEntity.status(status).build();
    }
}
