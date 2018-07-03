package com.club.web.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	
	
	/**
	 * 是否是手机号码
	 * 
	 * @param phone.No
	 * @return
	 */
	public static boolean isMobileNO(String phoneNo) {
		
		
		Pattern pattern = Pattern.compile("((^1)\\d{10}$)");
		Matcher matcher = pattern.matcher(phoneNo);
		return matcher.matches();
	}
	
	/**
	 * 判断是否为空
	 * 
	 * @param obj
	 * @return boolean
	 */
	public static boolean isNotBlank(Object obj) {
		
		
		if (obj != null && !("").equals(obj)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 判断是否为0
	 * 
	 * @param obj
	 * @return boolean
	 */
	public static boolean isNotZero(Integer parame) {
		
		
		if (parame != null && parame != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 获取字符串 不为空直接返回
	 * 
	 * <BR/>
	 * 为空则返回默认值(第二个参数)
	 * 
	 * @param o
	 * @param str
	 * @return String
	 */
	public static String getStrParameOrDefault(String parame, String defaultStr) {
		
		
		if (parame != null && !("").equals(parame)) {
			return parame;
		} else {
			return defaultStr;
		}
	}
	
	/**
	 * 获取字符串一千个长度 如果没有超过一千则返回本身
	 * 
	 * <BR/>
	 * 如果length不为空则返回传入的长度
	 * 
	 * <BR/>
	 * 如果startIndex不为空则返回传入的位置开始后面1000个长度 兼容length参数
	 * 
	 * @param parame
	 * @param length
	 * @return
	 */
	public static String getStrThousandLengths(Object parames, Integer length, Integer startIndex) {
		
		
		try {
			
			String parame = parames.toString();
			
			int defaultLength = 1000;
			
			if (parame != null && !("").equals(parame)) {
				int len = parame.length();
				
				if (isNotZero(length)) {
					if (isNotZero(startIndex)) {
						
						if (len > (startIndex + length)) {
							return parame.substring(startIndex, startIndex + length);
						} else {
							if (len > startIndex) {
								return parame.substring(startIndex, len);
							} else {
								return null;
							}
						}
					} else {
						
						if (len > length) {
							return parame.substring(0, length);
						} else {
							return parame.substring(0, len);
						}
					}
				} else {
					if (isNotZero(startIndex)) {
						
						if (len > (startIndex + defaultLength)) {
							return parame.substring(startIndex, (startIndex + defaultLength));
						} else {
							
							if (len > startIndex) {
								return parame.substring(startIndex, len);
							} else {
								return null;
							}
						}
						
					} else {
						
						if (len > defaultLength) {
							return parame.substring(0, defaultLength);
						} else {
							return parame.substring(0, len);
						}
					}
				}
			} else {
				return null;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		
		String str = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(str);
		
		String strn = "";
		for (int i = 1; i <= 30; i++) {
			String is = String.valueOf(i);
			strn += is.substring(is.length() - 1, is.length());
		}
		str += "景";
		
		System.out.println(getStrThousandLengths(str, 0, 100));
		
		System.out.println(strn);
		
	}
}
