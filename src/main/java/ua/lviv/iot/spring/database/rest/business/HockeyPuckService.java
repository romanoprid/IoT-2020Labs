package ua.lviv.iot.spring.database.rest.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.database.rest.dataaccess.HockeyPuckRepository;
import ua.lviv.iot.spring.database.rest.HockeyPuck;

import java.util.List;

@Service
public class HockeyPuckService {
    @Autowired
    private HockeyPuckRepository hockeyPuckRepository;

    public HockeyPuck createHockeyPuck(HockeyPuck hockeyPuck) {

        return hockeyPuckRepository.save(hockeyPuck);
    }

    public ResponseEntity<HockeyPuck> getHockeyPuck(Integer hockeyPuckId) {
        if (hockeyPuckRepository.existsById(hockeyPuckId)) {
            HockeyPuck selectedHockeyPuck = hockeyPuckRepository.findById(hockeyPuckId).get();
            return new ResponseEntity<HockeyPuck>(selectedHockeyPuck, HttpStatus.OK);
        } else {
            return new ResponseEntity<HockeyPuck>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<HockeyPuck> updateHockeyPuck(HockeyPuck hockeyPuckToUpdate, Integer hockeyPuckId) {
        if (hockeyPuckRepository.existsById(hockeyPuckId)) {
            hockeyPuckToUpdate.setId(hockeyPuckId);
            HockeyPuck updatedHockeyPuck = hockeyPuckRepository.save(hockeyPuckToUpdate);
            return new ResponseEntity<HockeyPuck>(updatedHockeyPuck, HttpStatus.OK);
        } else {
            return new ResponseEntity<HockeyPuck>(HttpStatus.NOT_FOUND);
        }
    }

    public List<HockeyPuck> getAllHockeyPucks() {
        return hockeyPuckRepository.findAll();
    }

    public HttpStatus deleteHockeyPuck(Integer hockeyPuckId) {
        if (hockeyPuckRepository.existsById(hockeyPuckId)) {
            hockeyPuckRepository.deleteById(hockeyPuckId);
            return HttpStatus.OK;
        } else {
            return HttpStatus.NOT_FOUND;
        }
    }
}

