package academy.kata.platform.spring.spring_boot_security_bootstrap.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*Для страниц которые не обрабатываются в контроллерх и просто возвращают страницу,
* маппинг можно настроить в addViewControllers
* https://habr.com/ru/post/482552/*/
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("user").setViewName("index");
        registry.addViewController("admin").setViewName("index");
    }

}
