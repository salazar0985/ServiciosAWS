package com.springaws.servicios.serviciosartifact.mvc.view;

import com.springaws.servicios.serviciosartifact.mvc.model.dao.PersistenceExampleDao;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.PersistenceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by IDEX1010 on 30/01/2019.
 */

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    private String appName;


    @Autowired
    private PersistenceExampleDao persistenceExampleDao;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage(Model model, @RequestParam(required = false) String rfc){

        model.addAttribute("appName", appName);

        persistenceExampleDao.findByRfc(rfc);

        return "home";

    }

}
