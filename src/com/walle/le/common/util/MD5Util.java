package com.walle.le.common.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MD5Util {

	private static final Logger LOGGER = LoggerFactory.getLogger(MD5Util.class);

	public static MD5Util _instance = null;

	public static MD5Util getInstance() {
		if (_instance == null) {
			return new MD5Util();
		} else {
			return _instance;
		}
	}

	public String generateMD5Code(String str) {
		String ret = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			byte[] md5string = md.digest();
			StringBuffer sb = new StringBuffer();
			for (byte bytes : md5string) {
				sb.append(String.format("%02x", bytes & 0xff));
			}
			ret = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}

	public static void main(String[] args) {
		String a = "This is a message";
		String b = " to be digested";
		String c = " using MD5";
		int aa = 000;
		System.out.println(aa);
		
		String s = getInstance().generateMD5Code(a + b + c);
		System.out.println(s);

	}
	

}
