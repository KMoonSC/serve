package com.myspring.customer.service.impl;

import com.myspring.customer.service.TestService;
import org.springframework.stereotype.Service;

/**
 * created by xuyuan 18/8/31
 */
@Service("hessianTestService")
public class HessianTestServiceImpl implements TestService {

    @Override
    public String provideServe() {
        return "serve by hessian";
    }
}
