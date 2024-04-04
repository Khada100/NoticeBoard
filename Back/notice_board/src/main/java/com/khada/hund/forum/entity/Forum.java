package com.khada.hund.forum.entity;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "post")
public class Forum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_code")
    private Long postCode;
    @Column(name = "title")
    private String title;
    @Column(name = "writer")
    private String writer;
    @Column(name = "detail")
    private String detail;
    @Column(name = "recommend")
    private Long recommend;
    @Column(name = "notice")
    private String notice;
    @Column(name = "write_date_time")
    private String writeDateTime;
    @Column(name = "post_password")
    private String postPassword;
}
