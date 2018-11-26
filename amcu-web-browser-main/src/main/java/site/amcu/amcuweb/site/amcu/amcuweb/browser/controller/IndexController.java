package site.amcu.amcuweb.site.amcu.amcuweb.browser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:    默认访问首页
 * @Author: Ben-Zheng
 * @Date: 2018/11/22 22:43
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "forward:/index.html";
    }

}