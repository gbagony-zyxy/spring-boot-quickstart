package com.ruyin.code.spring.boot.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ruyin on 2017/3/15.
 *
 * 扫包,将注有@Service、@Repository、@Controller、@Component等注解的bean实例化
 */
@Configuration
@ComponentScan("com.ruyin.code.spring.boot.annotation")
public class UserConfig {

}
