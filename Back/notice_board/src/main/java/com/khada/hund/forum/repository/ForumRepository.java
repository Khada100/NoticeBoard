package com.khada.hund.forum.repository;

import com.khada.hund.forum.entity.Forum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForumRepository extends JpaRepository<Forum, Long> {
    Page<Forum> findByNotice(Pageable pageForum, String n);
}
