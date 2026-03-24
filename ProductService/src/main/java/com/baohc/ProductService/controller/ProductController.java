package com.baohc.ProductService.controller;

import com.baohc.ProductService.entity.Product;
import com.baohc.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String getProducts(Model model) {
        model.addAttribute("products", productService.getProducts());
        return "products";
    }

    @GetMapping("/add-product")
    public String getAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("product") Product product) {
        productService.save(product);
        return "redirect:/";
    }

    @GetMapping("/remove")
    public String deleteById(@RequestParam("id") int id) {
        productService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String getEditForm(@RequestParam("id") int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "edit-product";
    }
}
