package com.khada.hund.forum.service;


import com.khada.hund.forum.entity.Forum;
import com.khada.hund.forum.repository.ForumRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ForumService {

    private final ForumRepository forumRepository;

    public ForumService(ForumRepository forumRepository) {
        this.forumRepository = forumRepository;
    }

    public Page<Forum> selectAllPost(int number){

        Pageable pageForum = PageRequest.of(number, 10);

        return forumRepository.findByNotice(pageForum, "N");
    }
}
