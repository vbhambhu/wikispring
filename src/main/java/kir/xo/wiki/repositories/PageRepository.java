package kir.xo.wiki.repositories;

import kir.xo.wiki.models.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PageRepository extends JpaRepository<Page, Long> {

    Page findBySlug(String slug);


}
