package com.mertcan.lootdrop.controller;

import com.mertcan.lootdrop.entity.Product;
import com.mertcan.lootdrop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // react projenin çalıştığı port local izni
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public Page<Product> getProducts(
            @RequestParam(required = false) List<String> categories,
            @RequestParam(defaultValue = "0") int page, // il sayfa
            @RequestParam(defaultValue = "12") int size // sayfa başı 12 ürünm
    ) {
        // pagination ayarı (id'ye göre azalan sırada - son eklenen en üstte)
        Pageable pageable = PageRequest.of(page, size, Sort.by("id").descending());
        return productService.getProducts(categories, pageable);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
}