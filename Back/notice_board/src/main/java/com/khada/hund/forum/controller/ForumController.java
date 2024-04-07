package com.khada.hund.forum.controller;

import com.khada.hund.common.ResponseDTO;
import com.khada.hund.forum.dto.ForumDTO;
import com.khada.hund.forum.entity.Forum;
import com.khada.hund.forum.service.ForumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        log.info("number : " + number);


        return service.selectAllPost(number);
    }

    @PostMapping("/write")
    public ResponseEntity<ResponseDTO> postingForum(@RequestBody ForumDTO forum){

        log.info("forum :  "  + forum);

        return ResponseEntity.ok()
                .body(new ResponseDTO(HttpStatus.OK, "게시글 작성이 완료되었습니다.",
                        service.postingForum(forum)));
    }
}
