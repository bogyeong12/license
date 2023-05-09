package org.sbdc.licensealarm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
public class MainController {

    @RequestMapping(value = "testListPage", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        return "test/testList";
    }
}
