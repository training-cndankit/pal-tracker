package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.sampled.Port;
import java.util.HashMap;
import java.util.Map;

@RestController
public class EnvController {
    String port;
    String memory_limit;
    String cf_instance_index;
    String cf_instance_addr;

    public EnvController(@Value("${cf.instance.index:NOT SET}") String port,
                         @Value("${cf.instance.index:NOT SET}") String memory_limit,
                         @Value("${cf.instance.index:NOT SET}") String cf_instance_index,
                         @Value("${cf.instance.index:NOT SET}") String cf_instance_addr) {
         this.port= port;
         this.memory_limit=memory_limit;
         this.cf_instance_index=cf_instance_index;
         this.cf_instance_addr=cf_instance_addr;
    }

    @GetMapping("/env")
    public Map<String, String> getEnv() throws Exception {

        Map<String,String> env= new HashMap<>();
        env.put("PORT",port);
        env.put("MEMORY_LIMIT",memory_limit);
        env.put("CF_INSTANCE_INDEX",cf_instance_index);
        env.put("CF_INSTANCE_ADDR",cf_instance_addr);

        return env;
    }
}
