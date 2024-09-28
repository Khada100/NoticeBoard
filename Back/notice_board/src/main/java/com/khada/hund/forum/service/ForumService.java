package com.khada.hund.forum.service;


import com.khada.hund.forum.dto.ForumDTO;
import com.khada.hund.forum.entity.Forum;
import com.khada.hund.forum.repository.ForumRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ForumService {

    private final ForumRepository forumRepository;
    private final ModelMapper modelMapper;


    public ForumService(ForumRepository forumRepository, ModelMapper modelMapper) {
        this.forumRepository = forumRepository;

        this.modelMapper = modelMapper;
    }

    public Page<Forum> selectAllPost(int number){

        Pageable pageForum = PageRequest.of(number, 10);

        return forumRepository.findByNotice(pageForum, "N");
    }

    public String postingForum(ForumDTO forum) {

        String message = "";

        try {
            forumRepository.save(modelMapper.map(forum, Forum.class));

            message = "게시글 작성이 완료되었습니다.";
        }catch (Exception e){
            e.printStackTrace();
            message = "게시글 작성이 실패했습니다.";
        }

        return message;
    }
}
