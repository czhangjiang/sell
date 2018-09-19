package com.zwt.sell.service.impl;

import com.zwt.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findById() {
        ProductCategory productCategory = categoryService.findById(1);
        Assert.assertEquals(new Integer(1), productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategories = categoryService.findAll();
        Assert.assertNotNull(productCategories);
    }

    @Test
    public void findProductCategoryByCategoryType() {
        List<Integer> categoryTypes = Arrays.asList(1, 2, 3, 4);
        List<ProductCategory> productCategories = categoryService.findProductCategoryByCategoryType(categoryTypes);
        Assert.assertNotNull(productCategories);
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryType(3);
        productCategory.setCategoryName("女生最爱");
        ProductCategory category = categoryService.save(productCategory);
        Assert.assertNotNull(category);
    }
}