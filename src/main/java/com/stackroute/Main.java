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
        //   Movie movie2=(Movie)applicationContext.getBean("movie3");

        XmlBeanFactory xmlBeanFactory= new XmlBeanFactory ( new ClassPathResource("JavaBean.xml"));
        Movie movieFirst= (Movie)xmlBeanFactory.getBean("movie1");

        System.out.println(movie.getActor());
//        System.out.println(movie2.getActor());

        movie.setApplicationContext(applicationContext);
        movieFirst.setBeanFactory(xmlBeanFactory);
        movie.setBeanName("beam123");
    }
}
