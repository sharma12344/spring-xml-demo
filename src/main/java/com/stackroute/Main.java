package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JavaBean.xml");
        Movie movie=(Movie)applicationContext.getBean("movie1");
        System.out.println(movie.getActor());

//        XmlBeanFactory xmlBeanFactory= new XmlBeanFactory ( new ClassPathResource("JavaBean.xml"));
//        Movie movieFirst= (Movie)xmlBeanFactory.getBean("movie2");
//        Movie movieSecond= (Movie)xmlBeanFactory.getBean("movie2");
//        System.out.println(movieFirst.getActor());
//        System.out.println(movieFirst==movieSecond);

    }

}
