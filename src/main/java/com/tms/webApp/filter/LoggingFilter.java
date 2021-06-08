package com.tms.webApp.filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class LoggingFilter extends HttpFilter {
  private static final Logger ROOT_LOGGER = LogManager.getLogger(LoggingFilter.class);

  @Override
  protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
    ROOT_LOGGER.info("Хост запроса: {}, {} {}", req.getRemoteHost(), " URL запроса: ", req.getRequestURL());
    chain.doFilter(req, res);
  }
}