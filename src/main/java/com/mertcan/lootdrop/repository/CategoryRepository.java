package com.mertcan.lootdrop.repository;

import com.mertcan.lootdrop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // kategoriyi ismine göre bul
    Optional<Category> findByName(String name);
}