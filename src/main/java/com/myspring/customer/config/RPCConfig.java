package com.myspring.customer.config;

import com.myspring.customer.service.HessianTestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.util.Properties;

/**
 * created by xuyuan 18/8/31
 */
@Configuration
public class RPCConfig {

    // 创建hessian服务发布器,因为hessian是基于http的远程协议，因为需要发布为web应用
    // 注意斜杠是一定需要的
    @Bean("/hessianService")
    public HessianServiceExporter hessianService(HessianTestService hessianTestService) {
        // Hessian没有注册表，因此也就没必要为Hessian服务进行命名
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(hessianTestService);
        exporter.setServiceInterface(HessianTestService.class);
        return exporter;
    }
    //配置hessian映射处理器
//    @Bean
//    public HandlerMapping hessianMapping() {
//        SimpleUrlHandlerMapping handlerMapping = new SimpleUrlHandlerMapping();
//        Properties mappings = new Properties();
//        mappings.setProperty("/hessianService", "hessianService");
//        handlerMapping.setMappings(mappings);
//        return handlerMapping;
//    }
}
