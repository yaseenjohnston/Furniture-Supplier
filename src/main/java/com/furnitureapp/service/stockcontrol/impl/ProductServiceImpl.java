package com.furnitureapp.service.stockcontrol.impl;

import com.furnitureapp.entity.stockcontrol.Product;
import com.furnitureapp.repository.stockcontrol.ProductRepository;
import com.furnitureapp.service.stockcontrol.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Set<Product> list() {

        return this.productRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Product create(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public Product read(Integer integer) {
        return this.productRepository.findById(integer).orElseGet(null);
    }

    @Override
    public Product update(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public boolean delete(Integer integer) {

        this.productRepository.deleteById(integer);
        if (this.productRepository.existsById(integer)) return false;
        return true;
    }
}
