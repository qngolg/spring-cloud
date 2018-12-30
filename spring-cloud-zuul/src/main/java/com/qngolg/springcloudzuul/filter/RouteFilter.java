package com.qngolg.springcloudzuul.filter;

import com.netflix.ribbon.Ribbon;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;
public class RouteFilter extends ZuulFilter
{
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER -1;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        return !ctx.containsKey(FORWARD_TO_KEY)
                && !ctx.containsKey(SERVICE_ID_KEY);
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        if(request.getParameter("foo") != null){
//            RibbonFilterContextHolder.
//                    getCurrentContext().add("lancher",1);
        }else{
//            RibbonFilterContextHolder.
//                    getCurrentContext().add("lancher",2);
        }
        return null;
    }
}
