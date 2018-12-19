package com.qngolg.springcloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class TokenFilter extends ZuulFilter
{


    @Override
    public String filterType() {
        return "pre";//可在请求路由之前调用
    }

    @Override
    public int filterOrder() {
        return 0;//filter执行顺序，优先级为0，数字越大，优先级越低
    }

    @Override
    public boolean shouldFilter() {
        return true;//是否执行该过滤器，此处为true,说明需要过滤
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        System.out.println(String.format("--->TokenFilter {},{}",request. getMethod(),request.getRequestURL().toString()));

        String token = request.getParameter("token");
        if(StringUtils.isNotBlank(token)){
            ctx.setSendZuulResponse(true);//token存在 对请求进行路由
            ctx.setResponseStatusCode(200);
            ctx.set("isSuccess",true);
            return null;
        }else{
            ctx.setSendZuulResponse(false); //token不存在 不对其路由 中断路由
            ctx.setResponseStatusCode(400);
            ctx.set("isSuccess",false);
            return null;
        }
    }
}
