package com.mertcan.lootdrop.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@MappedSuperclass // bu class'ın tablosu olmaz, diğer class'lar miras alır
@Data
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // oto id artışı
    private Long id;

    @CreationTimestamp
    @Column(updatable = false) // oluşturulunca tarih atar, değişmez
    private LocalDateTime createdAt;

    @UpdateTimestamp // her güncellemede tarih yenileme
    private LocalDateTime updatedAt;
}