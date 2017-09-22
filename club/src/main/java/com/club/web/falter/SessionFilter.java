package com.club.web.falter;

import java.io.UnsupportedEncodingException;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import com.club.web.util.Constants;


public class SessionFilter extends OncePerRequestFilter {

	private final static Logger LOG = LoggerFactory.getLogger(SessionFilter.class);
	private static final String LOGIN_PAGE = "/balogin/gobalogin.do";
	String[] notFilter = new String[] { "/balogin/basignin.do", "/test/baindex.do" ,LOGIN_PAGE};

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws UnsupportedEncodingException {
		String uri = request.getRequestURI();

		boolean doFilter = true;
		for (String s : notFilter) {
			if (uri.indexOf(s) != -1) {
				doFilter = false;
				break;
			}
		}
		
		try {
			if (doFilter) {
				Object obj = request.getSession().getAttribute(Constants.ADMIN_SESSION);
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
