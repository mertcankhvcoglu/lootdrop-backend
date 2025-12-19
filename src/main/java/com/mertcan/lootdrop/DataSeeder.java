package com.mertcan.lootdrop;

import com.mertcan.lootdrop.entity.Category;
import com.mertcan.lootdrop.entity.Product;
import com.mertcan.lootdrop.repository.CategoryRepository;
import com.mertcan.lootdrop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


// !!!!! react'taki data.js'ten ai yardımıyla otomatik çevrildi.
// !!!!! react'taki data.js'ten ai yardımıyla otomatik çevrildi.
// !!!!! react'taki data.js'ten ai yardımıyla otomatik çevrildi.
// !!!!! react'taki data.js'ten ai yardımıyla otomatik çevrildi.


@Component
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        // Eğer veritabanında ürün varsa tekrar ekleme yapma (Çift kayıt olmasın)
        if (productRepository.count() > 0) {
            return;
        }

        List<ProductData> products = Arrays.asList(
                new ProductData("Chrome Samurai Statue", "Figures", 1200.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("RGB Hyper-Core Keycaps", "Keycaps", 85.50, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Cyber-Glow Desk Mat", "Accessories", 45.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Netrunner Resolve Figure", "Figures", 450.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("Neon City Light Bar", "Lighting", 120.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Artisan 'Oni' Mask Keycap", "Keycaps", 250.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("Holo-Visor MKII", "Accessories", 320.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Tactical Tech Backpack", "Accessories", 180.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Plasma Katana Replica", "Figures", 890.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("Void Black Keycap Set", "Keycaps", 210.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("WASD 'Neon' Rubber Keys", "Keycaps", 15.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Arasaka Corp Mug", "Accessories", 25.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Night City Map Poster", "Accessories", 40.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("Ambient Monitor Backlight", "Lighting", 55.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Cyber-Arm Sleeve", "Accessories", 75.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("Industrial Wall Lamp", "Lighting", 140.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Spacebar 'Hyperdrive' Custom", "Keycaps", 45.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Bio-Chip USB Drive", "Accessories", 60.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("Rogue AI Core Figure", "Figures", 380.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Street Samurai Jacket", "Accessories", 450.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("Holo-Projector Cube", "Lighting", 299.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Nano-Fiber Gloves", "Accessories", 45.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Flux Capacitor Lamp", "Lighting", 150.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("Trauma Team Helmet", "Figures", 670.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Enter Key 'Execute' Edition", "Keycaps", 35.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Heavy Metal Boots", "Accessories", 210.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Arrow Keys 'Vector' Set", "Keycaps", 25.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("Mantis Blade Prop", "Figures", 340.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Wireless Netrunner Deck", "Accessories", 950.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("Transparent Housing Keycaps", "Keycaps", 65.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Militech Drone Model", "Figures", 180.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Augmented Reality Glasses", "Accessories", 499.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("Dystopian Novel Collection", "Accessories", 85.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Neon Sign - 'Bar'", "Lighting", 130.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Esc Key 'Panic' Red", "Keycaps", 12.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Hacker's Utility Belt", "Accessories", 90.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Sound-Reactive LED Strip", "Lighting", 65.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("LED Cyber-Mask", "Lighting", 75.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("Corporate Plaza Diorama", "Figures", 550.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Metallic Gold Artisan Keycap", "Keycaps", 55.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Afterlife Bar Coasters", "Accessories", 20.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Tech-Noir Sunglasses", "Accessories", 180.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("Nomad Survival Kit", "Accessories", 240.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Hover-Car Model (V-Tech)", "Figures", 310.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("Neon Circuit Wall Decor", "Lighting", 150.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Cyber-Dog Bot", "Figures", 1200.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("Crystal Clear Keycaps", "Keycaps", 45.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Edgerunner Patch Set", "Accessories", 15.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false),
                new ProductData("Smart Desk Lamp", "Lighting", 85.00, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", true),
                new ProductData("Glowing Liquid Lamp", "Lighting", 35.50, "https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S2_03_1200x1600-b1847981214ac013383111fc457eb9c5", false)
        );
        //react'taki data.js'ten ai yardımıyla otomatik çevrildi.

        for (ProductData data : products) {
            // 1. Kategoriyi bul veya oluştur
            Category category = categoryRepository.findByName(data.category)
                    .orElseGet(() -> categoryRepository.save(new Category(data.category, data.category + " description")));

            // 2. Ürünü oluştur
            Product product = new Product();
            product.setName(data.name);
            product.setPrice(BigDecimal.valueOf(data.price));
            product.setImageUrl(data.image);
            product.setIsNew(data.isNew);
            product.setCategory(category);
            product.setStockQuantity(100); // Varsayılan stok
            product.setDescription("High quality cyberpunk gear."); // Varsayılan açıklama

            productRepository.save(product);
        }

        System.out.println("--- VERİLER BAŞARIYLA YÜKLENDİ ---");
    }

    // Veri taşıyıcı basit record sınıfı (Sınıfın içinde kalabilir)
    record ProductData(String name, String category, Double price, String image, Boolean isNew) {}
}