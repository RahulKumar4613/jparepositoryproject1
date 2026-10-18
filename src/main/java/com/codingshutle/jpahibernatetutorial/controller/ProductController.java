package com.codingshutle.jpahibernatetutorial.controller;

import com.codingshutle.jpahibernatetutorial.entities.ProductEntity;
import com.codingshutle.jpahibernatetutorial.repositories.ProductRepository;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping   //  this is just for testing
    public List<ProductEntity> getAllProduct(@RequestParam Double price)
    {
          return productRepository.findByOrderByPrice(price);
    }

//    @GetMapping
//    public List<ProductEntity> getAllProduct(@RequestParam(defaultValue = ) Sort sort_by){
//
//
//    }

}
