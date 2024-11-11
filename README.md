Untuk mengonversi proyek Java menjadi proyek Maven, kita perlu mengikuti langkah-langkah berikut:
Maven memiliki struktur direktori standar. Sebagai contoh:

**Struktur Maven**
```
your-project/
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   └── test
│       ├── java
│       └── resources
└── pom.xml
```

Pindahkan semua file sumber Java Anda ke dalam direktori src/main/java, dan jika ada file test, pindahkan ke src/test/java. File lain yang digunakan oleh aplikasi, seperti file konfigurasi, bisa ditempatkan di src/main/resources.

**Buat File POM**
```
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>  <!-- Ganti dengan nama groupId proyek Anda -->
    <artifactId>your-project</artifactId>  <!-- Ganti dengan nama proyek Anda -->
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <!-- Tambahkan dependensi yang Anda butuhkan -->
    </dependencies>
</project>
```
