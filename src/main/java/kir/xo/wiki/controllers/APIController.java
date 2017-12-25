package kir.xo.wiki.controllers;

import kir.xo.wiki.models.Post;
import kir.xo.wiki.models.PostCategory;
import kir.xo.wiki.repositories.PostCategoryRepository;
import kir.xo.wiki.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@RestController
public class APIController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    PostCategoryRepository postCategoryRepository;

    @ResponseBody
    @RequestMapping(value = "api/post/create", method = RequestMethod.POST)
    public String createResource(
            @RequestParam(name = "title", required = true) String title,
            @RequestParam(name = "slug", required = true) String slug
            ){


        PostCategory postCategory = postCategoryRepository.findOne(Long.valueOf(1));
        Post post = new Post();
        post.setTitle(title);
        post.setSlug(slug);
        post.setPostCategory(postCategory);
        post.setContent("");
        postRepository.save(post);

        return "OK";
    }

}
