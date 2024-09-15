package stanik.piotr.colorlibrary_v2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import stanik.piotr.colorlibrary_v2.entities.UserPaintsEntity;

import java.util.Optional;

@Transactional
@Repository
public interface UserPaintsRepository extends JpaRepository<UserPaintsEntity, Long> {

    Optional<UserPaintsEntity> findByBrandAndRangeAndName(String brand, String range, String name);
}
