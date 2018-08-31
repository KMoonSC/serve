package com.myspring.customer.controller;

import com.myspring.customer.service.HessianTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by xuyuan 18/8/31
 */
@RestController
public class ServeController {

    @Autowired
    private HessianTestService hessianTestService;

    @GetMapping("get_serve")
    public String getServe() {
        return hessianTestService.provideHessianServe();
    }
}
