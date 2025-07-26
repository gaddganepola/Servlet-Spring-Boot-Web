package com.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("Inside Service");

        PrintWriter out;
        try {
            out = res.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        res.setContentType("text/html");

        out.println("<h1><b><i>Hello World</i></b></h1>");

//        try {
//            res.getWriter().println("Hello World");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
