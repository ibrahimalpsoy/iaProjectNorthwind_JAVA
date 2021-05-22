package iaProject.iaProjectNorthwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iaProject.iaProjectNorthwind.business.abstracts.ProductService;
import iaProject.iaProjectNorthwind.entities.concretes.Product;

@RestController
@RequestMapping("api/products")
public class ProductsController {

	private ProductService productService;

	@Autowired // projeyi tarıyo kim ProductService i implemente ettiyse bulunca otomatik
				// olarak ProductManager p = new ProductManager() yapıyo.
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getAll")
	public List<Product> getAll() {
		return productService.getAll();
	}

}
