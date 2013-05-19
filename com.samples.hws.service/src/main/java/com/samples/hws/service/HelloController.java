package com.samples.hws.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping(value="/welcome", method = RequestMethod.GET)
    public String welcome(final ModelMap model) {
        model.addAttribute("message", "Hello [anonymous]");
        return "welcome";
    }

    @RequestMapping(value="/welcome/{name}", method = RequestMethod.GET)
    public String welcomeName(@PathVariable final String name, final ModelMap model) {
        model.addAttribute("message", "hello " + name);
        return "welcome";
    }
}
