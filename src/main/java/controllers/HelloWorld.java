package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by nhancao on 3/9/16.
 */
@WebServlet( name = "hello", urlPatterns = "/" )
public class HelloWorld extends HttpServlet
{
    @Override protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException
    {
        resp.getWriter().write( "hi, :)" );
    }
}