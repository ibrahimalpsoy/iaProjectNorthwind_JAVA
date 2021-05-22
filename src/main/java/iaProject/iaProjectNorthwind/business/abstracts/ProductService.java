package iaProject.iaProjectNorthwind.business.abstracts;

import java.util.List;

import iaProject.iaProjectNorthwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
