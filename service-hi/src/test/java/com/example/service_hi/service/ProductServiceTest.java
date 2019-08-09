package com.example.service_hi.service;

import com.example.service_hi.ServiceHiApplicationTests;
import com.example.service_hi.pojo.ProductInfo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.Assert.*;

/**
 * All Rights Reserved, Designed By ZHB.
 *
 * @author:
 * @date:
 * @copyright:
 */
@Component
public class ProductServiceTest extends ServiceHiApplicationTests {

    @Autowired
    private ProductService productService;


    @Test
    public void findUpAll() {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue(list.size() > 0);
    }
}