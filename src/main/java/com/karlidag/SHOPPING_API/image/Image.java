package com.karlidag.SHOPPING_API.image;

import com.karlidag.SHOPPING_API.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_type")
    private String fileType;

    @Lob
    private Blob data;

    @Column(name = "download_url")
    private String downloadUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;
}
