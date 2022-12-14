package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.enities.concrets.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BrandRepository extends JpaRepository<Brand,Long> {

}
