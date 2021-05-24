package iaProject.iaProjectNorthwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iaProject.iaProjectNorthwind.business.abstracts.ProductService;
import iaProject.iaProjectNorthwind.core.utilities.results.DataResult;
import iaProject.iaProjectNorthwind.core.utilities.results.SuccsessDataResult;
import iaProject.iaProjectNorthwind.dataAccsess.abstracts.ProductDao;
import iaProject.iaProjectNorthwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;

	// @Autowired spring arka planda ProductDao instance si olabilecek bir sınıfı
	// üretir ve verir. .net te autofac kullanımı gibi. IProductRepository gelirse
	// ProductRepository
	// ver anlamında kullanılır
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccsessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi");	
	}
}
