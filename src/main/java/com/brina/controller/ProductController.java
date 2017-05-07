package com.brina.controller;

import com.brina.model.Category;
import com.brina.model.Product;
import com.brina.service.CategoryService;
import com.brina.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/product")
    public String getProductByIdWithCategory(@RequestParam (value ="id", required = true) Long id, Model model){
        Product product = productService.getProductByIdWithCategory(id);
        model.addAttribute("product", product);
        return "product";
    }

    @RequestMapping("/product/add")
    public String addProduct(Model model) {
        model.addAttribute("newProduct", new Product());
        List<Category> categoryList = categoryService.getAllCategories();
        model.addAttribute("categories", categoryList);
        return "addProduct";
    }

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("newProduct") Product product, Model model){
        if(product != null) {
            productService.addProduct(product);
            model.addAttribute("newProduct", product);
            return "addProductSuccess";
        }
        return "error";
    }
}
