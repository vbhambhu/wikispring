package kir.xo.wiki.controllers;


import kir.xo.wiki.models.Post;
import kir.xo.wiki.models.PostCategory;
import kir.xo.wiki.repositories.PostCategoryRepository;
import kir.xo.wiki.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    PostCategoryRepository postCategoryRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String projectDashboard() {

//        PostCategory postCategory = new PostCategory();
//        postCategory.setName("Categorty 1");
//        Post post = new Post();
//        post.setTitle("Hello World");
//        post.setContent("Something");
//        post.setPostCategory(postCategory);
//
//        postRepository.save(post);

        for (PostCategory postCategory : postCategoryRepository.findAll()) {
            System.out.println(postCategory.getPosts());
        }


        return "home";

    }
}
