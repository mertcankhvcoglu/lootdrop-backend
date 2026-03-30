package com.mertcan.lootdrop.service;

import com.mertcan.lootdrop.entity.Product;
import com.mertcan.lootdrop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    // tüm ürünleri veya kategoriye göre filtrelenmiş ürünleri getir
    public Page<Product> getProducts(List<String> categories, Pageable pageable) {
        if (categories != null && !categories.isEmpty()) {
            return productRepository.findByCategoryNameIn(categories, pageable);
        }
        return productRepository.findAll(pageable);
    }

    // tek bir ürün detayı getir
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ürün bulunamadı!"));
    }

    public Page<Product> searchProductsByName(String name, int size) {
        // sadece ilk sayfa ve istenen sayıdaki (size) ürünü getir.
        Pageable pageable = PageRequest.of(0, size);
        return productRepository.findByProductNameContainingIgnoreCase(name, pageable);
    }


}