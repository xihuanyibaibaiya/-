package com.school;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: zhanglibo
 * @Description : 拦截器
 * @Date: Create in 10:06 2018/11/24
 * @Modifed by
 */

@Configuration
public class WebSecurityConfig implements WebMvcConfigurer {

    @Override
    public void  addInterceptors(InterceptorRegistry registry){

        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/login/**")
                .excludePathPatterns("/static/**");
    }
}
