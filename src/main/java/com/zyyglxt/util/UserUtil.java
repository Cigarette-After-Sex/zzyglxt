package com.zyyglxt.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @Author nongcn
 * @Date 2020/11/1 9:25
 * @Version 1.0
 */
public class UserUtil {

    private static final String userName = "username";

    private HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
    }

    public String getUserName() {
        HttpSession session = getRequest().getSession();
        return (String) session.getAttribute(userName);
    }

    /**
     * 讲登录时获取的用户名设置到Session中
     *
     * @param username
     */
    public void setUserName(String username) {
        HttpSession session = getRequest().getSession();
        session.setAttribute(userName, username);
        //session过期时间设置，以秒为单位，即在没有活动15分钟后，session将失效
        session.setMaxInactiveInterval(15 * 60);
    }
}