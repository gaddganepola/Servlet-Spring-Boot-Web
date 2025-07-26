package com.servlet;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class App 
{
    public static void main( String[] args ) {

        System.out.println( "Hello World!" );

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);


        Context context = tomcat.addContext("", null);

        Tomcat.addServlet(context, "h1", new HelloServlet());
        context.addServletMappingDecoded("/hello", "h1");

        tomcat.getConnector();

        try {
            tomcat.start();
        } catch (LifecycleException e) {
            throw new RuntimeException(e);
        }
        tomcat.getServer().await();

    }
}
