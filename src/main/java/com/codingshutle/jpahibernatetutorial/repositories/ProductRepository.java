package com.codingshutle.jpahibernatetutorial.repositories;

import com.codingshutle.jpahibernatetutorial.entities.ProductEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.hibernate.sql.model.MutationType.INSERT;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {


    List<ProductEntity> findByTitle(String title);

    List<ProductEntity> findByPriceAndTitle(double price, String title);

    List<ProductEntity> findByTitleLike(String title);

        @Modifying
        @Transactional
        @Query(value = """
        INSERT INTO test.product_table
        (sku, title_x, price, quantity, created_at, updated_at)
        VALUES
        (:sku, :title, :price, :quantity, NOW(), NOW())
        """, nativeQuery = true)
        int insertData(
                @Param("sku") String sku,
                @Param("title") String title,
                @Param("price") Double price,
                @Param("quantity") Integer quantity
        );

    List<ProductEntity> findByOrderByPrice(Double price);
}

