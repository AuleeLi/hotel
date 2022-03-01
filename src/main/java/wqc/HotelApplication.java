package wqc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName: WqcApplication
 * @Description: 酒店管理系统
 * @Author: wqc
 * @Date: 2022/2/26 0:03
 **/
@SpringBootApplication
@MapperScan(value = "wqc.mapper")
@EnableSwagger2
public class HotelApplication {
    public static void main(String args[]){
        SpringApplication.run(HotelApplication.class, args);
    }
}
