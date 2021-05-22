package iaProject.iaProjectNorthwind.dataAccsess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import iaProject.iaProjectNorthwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

}
