package com.mertcan.lootdrop.repository;

import com.mertcan.lootdrop.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // kategori ismine göre ürünleri sayfalı getir (pagination desteği -- kullanımda değil, çoklu kategori seçimi için kullanımdan çıktı )
    Page<Product> findByCategoryName(String categoryName, Pageable pageable);

    // çÇOĞUL KATEGORİ SEÇİMİ METODU:
    // SQL----> SELECT * FROM products WHERE category_name IN ('A', 'B')
     Page<Product> findByCategoryNameIn(List<String> categories, Pageable pageable);

    // Mülakat Notu: "Containing" -> SQL'deki LIKE %name% karşılığıdır.
    // "IgnoreCase" -> Büyük/küçük harf duyarlılığını ortadan kaldırır (Case-insensitive).
     Page<Product> findByNameContainingIgnoreCase(String productName, Pageable pageable);
}