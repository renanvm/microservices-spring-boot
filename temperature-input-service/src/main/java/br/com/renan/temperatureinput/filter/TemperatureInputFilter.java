package br.com.renan.temperatureinput.filter;

import br.com.renan.temperatureinput.service.TemperatureInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class TemperatureInputFilter implements Filter {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private TemperatureInputService temperatureInputService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;

        String requestUrl = req.getRequestURI();

        temperatureInputService.saveConversionTempLog(requestUrl);

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
