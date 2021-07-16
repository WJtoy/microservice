package example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther wj
 * @Date 2021/7/16 15:02
 */
@FeignClient(name= "nacos-provider")
public interface FeignController {

    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);

}
