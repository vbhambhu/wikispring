package kir.xo.wiki.controllers;


import kir.xo.wiki.repositories.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    PageRepository postRepository;



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String projectDashboard() {

//        Category postCategory = new Category();
//        postCategory.setName("Categorty 1");
//        Page page = new Page();
//        page.setTitle("Hello World");
//        page.setContent("Something");
//        page.setCategory(postCategory);
//        postRepository.save(page);

//        for (Category category : postCategoryRepository.findAll()) {
//            System.out.println(category.getPosts());
//        }


        return "home";

    }
}
