package com.xie.controller;

import com.xie.domain.Product;
import com.xie.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductMapper productMapper;

    @GetMapping(value = "/{productId}")
    public Product findProductById(@PathVariable Integer productId) {
        return productMapper.selProductById(productId);
    }
}
