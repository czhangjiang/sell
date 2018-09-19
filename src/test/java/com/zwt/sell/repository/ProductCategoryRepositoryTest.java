package com.zwt.sell.repository;

import com.zwt.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findById() {
        ProductCategory productCategory = repository.findById(1).get();
        Assert.assertNotNull(productCategory);
    }

    @Test
    public void findProductCategoryTypeIn() {
        List<Integer> categoryTypes = Arrays.asList(1, 2, 3, 4);
        List<ProductCategory> productCategories = repository.findByCategoryTypeIn(categoryTypes);
        Assert.assertNotEquals(0, productCategories.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(4);
        repository.save(productCategory);
    }
}