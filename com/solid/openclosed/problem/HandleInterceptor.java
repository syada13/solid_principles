package com.solid.openclosed.problem;

public interface HandleInterceptor<HttpServletRequest, HttpServletResponse> {

    public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler);

}
