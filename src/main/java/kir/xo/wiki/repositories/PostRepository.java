package kir.xo.wiki.repositories;

import kir.xo.wiki.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

    Post findBySlug(String slug);


}
