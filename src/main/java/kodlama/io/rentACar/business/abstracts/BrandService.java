package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.request.CreateBrandRequest;
import kodlama.io.rentACar.business.response.GetAllBrandsResponse;


import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    public void add(CreateBrandRequest createBrandRequest);

}
