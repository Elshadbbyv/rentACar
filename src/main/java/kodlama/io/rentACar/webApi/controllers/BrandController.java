package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.request.CreateBrandRequest;
import kodlama.io.rentACar.business.response.GetAllBrandsResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandController {
    private BrandService brandService;



    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }
    @GetMapping("/getAll")
    public List<GetAllBrandsResponse> getAll(){

        return brandService.getAll();
    }

    @PostMapping("/add")
    public String add(CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
        return "Gondeildi";

    }
}
