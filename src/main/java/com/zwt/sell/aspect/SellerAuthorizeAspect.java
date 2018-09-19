package com.zwt.sell.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SellerAuthorizeAspect {

    @Pointcut("execution(public * com.zwt.sell.controller.Seller*.*(..))")
    public void verify() {}

    @Before("verify()")
    public void doVerify() {

    }
}
