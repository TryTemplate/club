/**
 * 
 */
package com.club.web.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;

/**
 * @author John Lee
 */
public class ResultUtil {

	/**
	 * 向结果页面发送消息。
	 * 
	 * @param locale
	 * @param response
	 * @param status
	 * @param returnUrl
	 * @param memo
	 */
	public static void sendMessageToResultPage(HttpServletResponse response, boolean status, String returnUrl)
			throws IOException {

		String resultUrl = "/admin/result.htm?";
		StringBuilder sb = new StringBuilder();
		sb.append("returnUrl=");
		sb.append(URLEncoder.encode(CharsetUtil.iso_8859_1ToUTF_8(returnUrl), "UTF-8"));
		sb.append("&status=");
		sb.append(status);
		sb.append("&memo=");
		sb.append("11");
		sb.append("&right=");
		sb.append("1");
		response.sendRedirect(resultUrl + sb.toString());
	}

	public static void sendMessageToResultPage(HttpServletResponse response, boolean status, String returnUrl,
			String memo) throws IOException {

		String resultUrl = "/admin/result.htm";
		StringBuilder sb = new StringBuilder();
		if (!resultUrl.contains("?"))
			sb.append("?");
		sb.append("returnUrl=");
		sb.append(URLEncoder.encode(CharsetUtil.iso_8859_1ToUTF_8(returnUrl), "UTF-8"));
		sb.append("&status=");
		sb.append(status);
		sb.append("&memo=");
		sb.append(URLEncoder.encode(new String(Base64.encodeBase64(memo.getBytes())), "UTF-8"));
		response.sendRedirect(resultUrl + sb.toString());
	}

	public static void writeResult(HttpServletResponse response, String res) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		// writer.write(sb.toString());
		writer.write(res);
		writer.flush();
	}
}
