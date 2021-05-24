package iaProject.iaProjectNorthwind.business.abstracts;
 
import java.util.List;

import iaProject.iaProjectNorthwind.core.utilities.results.DataResult;
import iaProject.iaProjectNorthwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
}
