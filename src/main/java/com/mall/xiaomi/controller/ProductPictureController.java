package com.mall.xiaomi.controller;

import com.mall.xiaomi.pojo.ProductPicture;
import com.mall.xiaomi.service.ProductPictureService;
import com.mall.xiaomi.util.ResultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productPicture")
public class ProductPictureController {

    @Autowired
    private ResultMessage resultMessage;
    @Autowired
    private ProductPictureService productPictureService;

    @GetMapping("/product/{productId}")
    public ResultMessage productPicture(@PathVariable String productId) {
        List<ProductPicture> products = productPictureService.getProductPictureByProductId(productId);
        resultMessage.success("001", products);
        return resultMessage;
    }

}
