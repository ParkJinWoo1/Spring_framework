package com.mvc.upgrade.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LogFilter implements Filter {

   @Override
   public void init(FilterConfig filterConfig) throws ServletException {


   }

   //FilterChain : 클라이언트에서 서버로 넘어오는 사이에 필터가 있는데
   //필터가 또 있을 수 있고, 서버로 넘어간다 치자.
   //이 때 첫번째 필터에서 뭐뭐 하고 두번째 필터로 넘어갈 때
   // filterChain이 연결해준다.
   @Override
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
         throws IOException, ServletException {

      HttpServletRequest req = (HttpServletRequest) request;
      
      String remoteAddr = req.getRemoteAddr();
      String uri = req.getRequestURI();
      String url = req.getRequestURL().toString();
      String queryString = req.getQueryString();
      
      String referer = req.getHeader("refere");
      String agent = req.getHeader("User-Agent");
      
      StringBuffer sb = new StringBuffer();
      sb.append("* remoteAddr : " + remoteAddr + "\n")   //client의 ip 주소
         .append("* uri : " + uri + "\n")            //
         .append("* url : " + url + "\n")
         .append("* queryString : " + queryString + "\n")
         .append("* refere : " + referer + "\n")         // 이전 페이지(보내는 페이지) url
         .append("* agent : " + agent);               // 사용자 정보 (browser, os, ...)
      
      System.out.println("LogFilter");
      System.out.println(sb);
      

      chain.doFilter(req, response);
      //chain.doFilter(req, response); 2번 쓰면 2번 요청하기 때문에 list 2번 찍힘
   }

   @Override
   public void destroy() {
      
   }

}