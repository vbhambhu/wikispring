package kir.xo.wiki.repositories;

import kir.xo.wiki.models.PostCategory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostCategoryRepository extends JpaRepository<PostCategory, Long> {

}
