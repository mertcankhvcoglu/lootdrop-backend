# --- 1. AŞAMA: İNŞAAT (BUILD) ---
# Maven ve Java 21 içeren Eclipse Temurin imajı kullanıyoruz
FROM maven:3.9.6-eclipse-temurin-21 AS build

WORKDIR /app

# Proje dosyalarını kopyala
COPY . .

# Uygulamayı derle (.jar dosyasını oluştur)
RUN mvn clean package -DskipTests

# --- 2. AŞAMA: VİTRİN (RUN) ---
# Çalıştırmak için çok hafif olan Alpine Linux tabanlı Java 21 kullanıyoruz
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# İlk aşamadan çıkan .jar dosyasını buraya al
COPY --from=build /app/target/*.jar app.jar

# Portu aç
EXPOSE 8080

# Başlat
ENTRYPOINT ["java", "-jar", "app.jar"]
# Built with Gemini only - Sadece Gemini ile yapılmıştır, Docker bilgisi bana ait değil.