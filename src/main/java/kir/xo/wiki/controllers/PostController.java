package kir.xo.wiki.controllers;

import kir.xo.wiki.models.Post;
import kir.xo.wiki.models.PostCategory;
import kir.xo.wiki.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostController {

    @Autowired
    PostRepository postRepository;

    @RequestMapping(value = "/post/new", method = RequestMethod.GET)
    public String projectDashboard() {

        return "post/create";

    }


    @RequestMapping(value = "/post/{slug}", method = RequestMethod.GET)
    public String showPost(
            Model model,
            @PathVariable(required = true) String slug) {

        Post post = postRepository.findBySlug(slug);

        model.addAttribute("post", post);

        return "post/view";
    }

}
