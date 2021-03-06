package com.ankoye.coursems.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .host("www.course.ankoye.com")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.anko.coursems.controller"))
                .paths(PathSelectors.any())
                .build()
        ;
    }

    private ApiInfo apiInfo() {
        // 定义联系人信息
        Contact contact = new Contact("ankoye","https://github.com/ankoye", "ankoye@qq.com");
        return new ApiInfoBuilder()
                .title("接口文档")
                .description("Spring Boot 集成 Swagger")
                .termsOfServiceUrl("http://www.ankoye.com")
                .version("1.0")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .contact(contact)
                .build();
    }

}
