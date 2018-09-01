package com.myspring.customer.controller;

import com.myspring.customer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by xuyuan 18/8/31
 */
@RestController
public class ServeController {

    @Autowired
    @Qualifier("restTestService")
    private TestService restTestService;

    @GetMapping("get_serve")
    public String getServeByRest() {
        return restTestService.provideServe();
    }
}
