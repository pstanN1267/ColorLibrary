package stanik.piotr.colorlibrary_v2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import stanik.piotr.colorlibrary_v2.entities.StockPaintsEntity;
import stanik.piotr.colorlibrary_v2.entities.UserPaintsEntity;
import stanik.piotr.colorlibrary_v2.repositories.StockPaintsRepository;
import stanik.piotr.colorlibrary_v2.repositories.UserPaintsRepository;

import java.util.List;

@Service
public class UserPaintsService {

    @Autowired
    private UserPaintsRepository userPaintsRepository;
    @Autowired
    private StockPaintsRepository stockPaintsRepository;

    @Transactional
    public void copyRow(String brand, String range, String name) {

        boolean existsInUserPaintsTable = userPaintsRepository.findByBrandAndRangeAndName(brand, range, name).isPresent();

        if (existsInUserPaintsTable) {
            throw new RuntimeException("Paint already added.");
        }

        StockPaintsEntity stockPaint = stockPaintsRepository.findByBrandAndRangeAndName(brand, range, name)
                .orElseThrow(() -> new RuntimeException("Paint not found"));

        UserPaintsEntity newUserPaint = new UserPaintsEntity();
        newUserPaint.setBrand(stockPaint.getBrand());
        newUserPaint.setRange(stockPaint.getRange());
        newUserPaint.setName(stockPaint.getName());
        newUserPaint.setHex(stockPaint.getHex());

        userPaintsRepository.save(newUserPaint);
    }

    public void removeRowById(Long id) {

        userPaintsRepository.deleteById(id);
    }

public List<UserPaintsEntity> userPaintsEntityList() {

return userPaintsRepository.findAll();
}

}
