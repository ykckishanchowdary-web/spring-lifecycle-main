package com.pieshop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


//Before Initialization and After Initialization

@Component
public class CustomBPP implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof PieService){
            System.out.println("Custom BPP before initialization "+beanName );
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof PieService){
            System.out.println("Custom BPP After initialization "+beanName );
        }
        return bean;
    }

    
}
