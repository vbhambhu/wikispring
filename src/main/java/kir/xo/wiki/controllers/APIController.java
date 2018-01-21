package kir.xo.wiki.controllers;

import kir.xo.wiki.models.AjaxResponse;
import kir.xo.wiki.models.Category;
import kir.xo.wiki.models.Page;
import kir.xo.wiki.repositories.CategoryRepository;
import kir.xo.wiki.repositories.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

@RestController
public class APIController {

    @Autowired
    PageRepository pageRepository;

    @Autowired
    CategoryRepository categoryRepository;


    @ResponseBody
    @RequestMapping(value = "api/page/create", method = RequestMethod.POST)
    public AjaxResponse createNewPage(@Valid Page page, BindingResult result){


        System.out.println(page.getTitle());

        List<String> errors = new ArrayList<String>();

//        String slug = toSlug(title);
//
//        Category category = categoryRepository.findOne(Long.valueOf(1));
//
//        Page page = new Page();
//        page.setTitle(title);
//        page.setSlug(slug);
//        page.setCategory(category);
//        page.setContent("");
//        pageRepository.save(page);

        return new AjaxResponse(true, "ddd");

    }

    public static String toSlug(String input) {

        Pattern WHITESPACE = Pattern.compile("[\\s]");
        Pattern NONLATIN = Pattern.compile("[^\\w-]");
        String nowhitespace = WHITESPACE.matcher(input).replaceAll("-");
        String normalized = Normalizer.normalize(nowhitespace, Normalizer.Form.NFD);
        String slug = NONLATIN.matcher(normalized).replaceAll("");
        return slug.toLowerCase(Locale.ENGLISH);
    }

}
