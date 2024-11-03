package stanik.piotr.colorlibrary_v2.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import stanik.piotr.colorlibrary_v2.entities.UserPaintsEntity;
import stanik.piotr.colorlibrary_v2.repositories.UserPaintsRepository;
import stanik.piotr.colorlibrary_v2.services.UserPaintsService;

import java.util.List;

@RestController
@CrossOrigin
public class UserPaintsController {

    @Autowired
    private UserPaintsService userPaintsService;
    @Autowired
    private UserPaintsRepository userPaintsRepository;

    @PostMapping("/copy")
    public void copyRow(@RequestParam String brand,
                        @RequestParam String range,
                        @RequestParam String name) {

        userPaintsService.copyRow(brand, range, name);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRow(@PathVariable Long id) {

        userPaintsService.removeRowById(id);
    }
@GetMapping("/userpaints")
    public List<UserPaintsEntity> listOfUserPaints() {
        return userPaintsRepository.findAll();
    }
}
