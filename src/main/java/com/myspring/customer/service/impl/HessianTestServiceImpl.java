package com.myspring.customer.service.impl;

import com.myspring.customer.service.HessianTestService;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * created by xuyuan 18/8/31
 */
@Service
public class HessianTestServiceImpl implements HessianTestService {


    @Override
    public String provideHessianServe() {
        return "serve";
    }
}
