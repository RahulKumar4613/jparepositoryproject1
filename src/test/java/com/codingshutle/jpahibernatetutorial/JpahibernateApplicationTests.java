package com.codingshutle.jpahibernatetutorial;

import com.codingshutle.jpahibernatetutorial.entities.ProductEntity;
import com.codingshutle.jpahibernatetutorial.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class JpahibernateApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void saveProduct(){
//
//
//		  ProductEntity savedproductEntity=productRepository.save(ProductEntity.builder()
//				  .sku("panama4")
//				  .price(2582.25)
//				  .title("cigerate panama4")
//				  .quantity(202)
//				  .build());
//
//
//	}

	@Test
	void getAllproduct(){

		List<ProductEntity> entities=productRepository.findAll();

		entities.size();

	}


	@Test
	void getTitleProduct(){

		List<ProductEntity> entities=productRepository.findByTitle("Nirma rose");

	}

//	@Test
//	void getPriceAndTitle(){
//		List<ProductEntity> productEntity=productRepository.findByPriceAndTitle(2582.25,"cigerate panama3");
//
//	}
//
//	@Test
//	void getTitleWithLikeOperator() {
//		List<ProductEntity> productEntity = productRepository.findByTitleLike("%rma%");
//	}
//
//		@Test
//		void insertData() {
//			int rowsInserted = productRepository.insertData(
//					"blu1",
//					"surfexcel2",
//					8520.25,
//					null
//			);

		//}
	}

