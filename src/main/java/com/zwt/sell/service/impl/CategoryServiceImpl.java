package com.zwt.sell.service.impl;

import com.zwt.sell.dataobject.ProductCategory;
import com.zwt.sell.repository.ProductCategoryRepository;
import com.zwt.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public List<ProductCategory> findAll() {
        List<ProductCategory> productCategories = repository.findAll();
        return productCategories;
    }

    @Override
    public List<ProductCategory> findProductCategoryByCategoryType(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
