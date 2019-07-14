package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("This is destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This is using propertiesSet()");

    }
    public void customInit(){
        System.out.println("This is called before initialization");
    }
    public void customDestroy(){
        System.out.println("This is called before destroy");
    }
}
