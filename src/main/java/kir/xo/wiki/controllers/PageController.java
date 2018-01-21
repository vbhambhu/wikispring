package kir.xo.wiki.controllers;

import kir.xo.wiki.models.Page;
import kir.xo.wiki.repositories.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

    @Autowired
    PageRepository postRepository;

    @RequestMapping(value = "/page/new", method = RequestMethod.GET)
    public String projectDashboard() {
        return "page/new";
    }


    @RequestMapping(value = "/page/{slug}", method = RequestMethod.GET)
    public String showPost(
            Model model,
            @PathVariable(required = true) String slug) {

        Page post = postRepository.findBySlug(slug);


        System.out.println(post.getCategory().getName());

        model.addAttribute("post", post);

        return "post/view";
    }

}
