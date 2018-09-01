package com.myspring.customer.config;

import com.myspring.customer.service.TestService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

/**
 * created by xuyuan 18/8/31
 */
@Configuration
public class RPCConfig {

    // 创建hessian服务发布器,因为hessian是基于http的远程协议，因为需要发布为web应用
    // 注意斜杠是一定需要的
    @Bean("/hessianService")
    public HessianServiceExporter hessianService(@Qualifier("hessianTestService") TestService testService) {
        // Hessian没有注册表，因此也就没必要为Hessian服务进行命名
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(testService);
        exporter.setServiceInterface(TestService.class);
        return exporter;
    }
    // 并不需要做映射，因为bean的name带/，会被BeanNameUrlHandlerMapping映射处理
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
