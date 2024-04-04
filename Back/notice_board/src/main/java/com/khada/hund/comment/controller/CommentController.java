package com.khada.hund.comment.controller;


import com.khada.hund.comment.service.CommentService;
import com.khada.hund.common.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
@Slf4j
public class CommentController {

    private final CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }

    @GetMapping("/{postCode}")
    public ResponseEntity<ResponseDTO> selectAllComment (@PathVariable Long postCode) {

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "전체조회", null));
    }
}
