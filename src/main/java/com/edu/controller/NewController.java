package com.edu.controller;


import com.edu.pojo.News;
import com.edu.service.NewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/new")
public class NewController {

    @Autowired
    @Qualifier("NewServiceImpl")
    private NewService newService;

    @RequestMapping("/add")
    public String addnew() {
        return "addnew";
    }

    @RequestMapping("/allnew")
    public String list(Model model) {
        List<News> list = newService.queryNew();
        model.addAttribute("list", list);
        return "allnew";
    }

    @RequestMapping("/addnew")
    public String addNew(News news) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        news.setTime(df.format(new Date()));
        newService.addNew(news);
        return "redirect:/new/allnew";
    }

    @RequestMapping("/del/{newid}")
    public String deletenew(@PathVariable("newid") int id) {
        newService.deleteNew(id);
        return "redirect:/new/allnew";
    }


    @RequestMapping("/toupdatenew")
    public String toUpdateNew(Model model, int newid) {
        News news = newService.queryNewId(newid);
        model.addAttribute("list",news );
        return "updatenew";
    }
    @RequestMapping("/updatenew")
    public String updateNew(Model model, News news) {
        newService.updateNew(news);
        return "redirect:/new/allnew";
    }
}
