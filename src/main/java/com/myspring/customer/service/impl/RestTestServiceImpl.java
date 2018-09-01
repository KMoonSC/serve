package com.myspring.customer.service.impl;

import com.myspring.customer.service.TestService;
import org.springframework.stereotype.Service;

/**
 * created by xuyuan 18/9/1
 */
@Service("restTestService")
public class RestTestServiceImpl implements TestService {

    @Override
    public String provideServe() {
        return "serve by rest";
    }
}
