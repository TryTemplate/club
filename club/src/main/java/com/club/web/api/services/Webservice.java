package com.club.web.api.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;

import net.sf.json.JSONObject;

public class Webservice extends WebserviceHelp {
	private final static Logger log = Logger.getLogger(WebserviceHelp.class);

	private static final String Webservice_Tag = "网络服务";

	/***
	 * 用户登陆
	 * 
	 * @param userPhone
	 *            手机号
	 * @param password
	 *            密码
	 * @return
	 */
	public static int login(String userPhone, String password) {
		JSONObject object;

		try {
			List<NameValuePair> params = new ArrayList<NameValuePair>();

			params.add(new BasicNameValuePair("userPhone", userPhone));
			params.add(new BasicNameValuePair("password", password));

			object = HttpUtils.post(URL, Login, params);

			return object.optInt("results");

		} catch (Exception e) {
			log.error("aa" + Webservice_Tag + Login, e);
			return -1;
		}

	}
}