package stanik.piotr.colorlibrary_v2.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import stanik.piotr.colorlibrary_v2.entities.StockPaintsEntity;
import stanik.piotr.colorlibrary_v2.repositories.StockPaintsRepository;

import java.util.List;

@RestController
@CrossOrigin
public class StockPaintsController {


    @Autowired
    private StockPaintsRepository stockPaintsRepository;


@GetMapping("/stockpaints")
    public List<StockPaintsEntity> listOfAllPaints() {
        return stockPaintsRepository.findAll();
    }
}
