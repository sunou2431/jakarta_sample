package com.sample;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
@SuppressWarnings("serial")
public class HelloWorld extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException
  {
      res.setContentType("text/plain");
      res.setCharacterEncoding("UTF-8");
      res.getWriter().println("Hello World!");
  }
}
