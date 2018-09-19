package com.zwt.sell.service;

import com.zwt.sell.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    ProductCategory findById(Integer id);

    List<ProductCategory> findAll();

    List<ProductCategory> findProductCategoryByCategoryType(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
