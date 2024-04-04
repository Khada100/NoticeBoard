package com.khada.hund.forum.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ForumDTO {

    private Long postCode;
    private String title;
    private String writer;
    private String detail;
    private Long recommend;
    private String notice;
    private String writeDateTime;
    private String postPassword;
}
