package com.GameWeb;

import javax.servlet.*;
import java.io.IOException;

/**
 *
 */
public class MyFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException{
        String site = filterConfig.getInitParameter("Site");

        System.out.println("The name of Website: " + site);
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException{

        System.out.println("Before servlet -> encode: " + request.getCharacterEncoding() + " contenttype: " + request.getContentType());

        chain.doFilter(request, response);

        System.out.println("After servlet -> encode: " + response.getCharacterEncoding() + " contenttype: " + response.getContentType());

    }

    public void destroy(){


    }
}
