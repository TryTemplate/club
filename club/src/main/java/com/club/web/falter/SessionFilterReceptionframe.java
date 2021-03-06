package com.club.web.falter;

import java.io.UnsupportedEncodingException;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import com.club.web.util.Constants;


public class SessionFilterReceptionframe extends OncePerRequestFilter {

	private final static Logger LOG = LoggerFactory.getLogger(SessionFilterReceptionframe.class);
	private static final String LOGIN_PAGE = "/login/gorelogin.htm";
	String[] notFilter = new String[] { "/login/resignin.htm", "/home/homepage.htm", "/" ,LOGIN_PAGE};

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws UnsupportedEncodingException {
		String uri = request.getRequestURI();

		boolean doFilter = true;
		for (String s : notFilter) {
			if (uri.equals(s)) {
				doFilter = false;
				break;
			}
		}
		
		try {
			if (doFilter) {
				Object obj = request.getSession().getAttribute(Constants.USER_SESSION);
				if (null == obj) {
					response.sendRedirect(LOGIN_PAGE);
				} else {
					filterChain.doFilter(request, response);
				}
			} else {
				filterChain.doFilter(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOG.error("login error : ", e);
		}
	}
}
