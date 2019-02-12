package com.springaws.servicios.serviciosartifact.mvc.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by IDEX1010 on 11/02/2019.
 */

@Controller
@RequestMapping("/services")
public class ServiceController {

    public static final Logger LOGGER = LoggerFactory.getLogger(ServiceController.class);

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getAddServices(){

         LOGGER.info("Se accedió al método GET ");

        return "/servicios/service-register";

    }



}
