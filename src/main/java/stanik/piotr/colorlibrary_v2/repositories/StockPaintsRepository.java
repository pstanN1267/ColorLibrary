package stanik.piotr.colorlibrary_v2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import stanik.piotr.colorlibrary_v2.entities.StockPaintsEntity;

import java.util.Optional;

@Transactional
//@Repository
public interface StockPaintsRepository extends JpaRepository<StockPaintsEntity, Long> {


    //    @Query(value = "INSERT INTO USERPAINTS (Id, Brand, Paint_Range, Color_Name, Color_Hex)  SELECT Id, Brand, Paint_Range, Color_Name, Color_Hex FROM stockpaints WHERE Id = Id", nativeQuery = true)
//    void copyDataToUserPaints(@Param("id") Long id);
//    @Modifying
    Optional<StockPaintsEntity> findByBrandAndRangeAndName(String brand, String range, String name);


}
