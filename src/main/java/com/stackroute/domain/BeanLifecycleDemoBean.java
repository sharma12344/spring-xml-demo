package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {



    public void destroy() throws Exception {
        System.out.println("Destroy method called");

    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Init called");
    }

    public void customInit()
    {
        System.out.println("MyInit called");

    }
    public void customDestroy()
    {
        System.out.println("Clean Up called");
    }
}
