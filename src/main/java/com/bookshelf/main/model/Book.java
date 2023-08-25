package com.bookshelf.main.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.text.SimpleDateFormat;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column
    String title;

    @Column(columnDefinition="TEXT")
    String summary;

    @Column
    String author;

    @Column
    String imageUrl;

    @Column
    String publisher;

    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate publishDate;
    
    @CreationTimestamp
    @Column(updatable = false)
    Timestamp dateCreated;

    @UpdateTimestamp
    Timestamp lastModified;


    
    // public Integer getId() {
    //     return id;
    // }

    // public void setId(Integer id) {
    //     this.id = id;
    // }

    // public String getTitle() {
    //     return title;
    // }

    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // public String getSummary() {
    //     return summary;
    // }

    // public void setSummary(String summary) {
    //     this.summary = summary;
    // }

    // public String getAuthor() {
    //     return author;
    // }

    // public void setAuthor(String author) {
    //     this.author = author;
    // }

    // public String getImageUrl() {
    //     return imageUrl;
    // }

    // public void setImageUrl(String imageUrl) {
    //     this.imageUrl = imageUrl;
    // }

    // public String getPublisher() {
    //     return publisher;
    // }

    // public void setPublisher(String publisher) {
    //     this.publisher = publisher;
    // }

    // public Date getPublishDate() {
    //     return publishDate;
    // }

    // public void setPublishDate(String publishDate) {
    //     LocalDate localDate = LocalDate.parse(publishDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    //     this.publishDate = localDate;
    // }
    

    // public Timestamp getDateCreated() {
    //     return dateCreated;
    // }

    // public Timestamp getLastModified() {
    //     return lastModified;
    // }

}
