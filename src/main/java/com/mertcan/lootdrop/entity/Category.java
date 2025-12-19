package com.mertcan.lootdrop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "categories") // veritabanında tablonun adı 'categories'
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true) // base entity'deki id'yi de eşitlik kontrolüne katması için
public class Category extends BaseEntity {

    private String name; // kategori adı

    private String description; // açıklama
}