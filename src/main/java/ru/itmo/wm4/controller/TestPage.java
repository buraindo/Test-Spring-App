package ru.itmo.wm4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itmo.wm4.domain.TestDomain;
import ru.itmo.wm4.security.Guest;

@Controller
public class TestPage extends Page {

    @Guest
    @GetMapping("/test/{message}")
    public String testGet(@PathVariable("message") String message) {
        System.out.println("GET: " + message);
        TestDomain domain = new TestDomain();
        domain.setMessage(message);
        getTestDomainService().save(domain);
        return "IndexPage";
    }

    @Guest
    @PostMapping("/test/{message}")
    public String testPost(@PathVariable("message") String message) {
        System.out.println(message);
        TestDomain domain = new TestDomain();
        domain.setMessage(message);
        getTestDomainService().save(domain);
        return "IndexPage";
    }

}
