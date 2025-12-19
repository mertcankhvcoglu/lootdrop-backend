package com.mertcan.lootdrop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Product extends BaseEntity {

    private Boolean isNew;

    private String name; // ürün adı (mantis blades)

    @Column(length = 1000) // 1000 karakter açıklama
    private String description;

    // ara birimleri için Double yerine BigDecimal hassasiyer için !!!
    private BigDecimal price;

    private String imageUrl; // resim urlsi

    private Integer stockQuantity; // stok sayısı (kullanılmıyor, farazi)

    // 1 ürüne 1 kategori
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}