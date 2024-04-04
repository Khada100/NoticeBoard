package com.khada.hund.forum.controller;

import com.khada.hund.forum.entity.Forum;
import com.khada.hund.forum.service.ForumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/board")
public class ForumController {

    private final ForumService service;

    public ForumController(ForumService service) {
        this.service = service;
    }

    @GetMapping("/{pageNumber}")
    public Page<Forum> selectAllPost(@PathVariable String pageNumber){

        int number = Integer.parseInt(pageNumber);


        return service.selectAllPost(number);
    }
}
