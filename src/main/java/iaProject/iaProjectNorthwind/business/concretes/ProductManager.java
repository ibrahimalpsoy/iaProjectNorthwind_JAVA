package iaProject.iaProjectNorthwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iaProject.iaProjectNorthwind.business.abstracts.ProductService;
import iaProject.iaProjectNorthwind.dataAccsess.abstracts.ProductDao;
import iaProject.iaProjectNorthwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;

	@Autowired
	// @Autowired spring arka planda ProductDao instance si olabilecek bir sınıfı
	// üretir ve verir. .net te autofac kullanımı gibi. IProductRepository gelirse
	// ProductRepository
	// ver anlamında kullanılır
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		return this.productDao.findAll();
	}

}
