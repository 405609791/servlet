package fun.codefarmer.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @ @ClassName MyFilter
 * @ Descriotion TODO
 * @ Author admin
 * @ Date 2020/2/27 15:43
 **/
//要拦截的地址是所有地址
@WebFilter(urlPatterns = "/*")
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
