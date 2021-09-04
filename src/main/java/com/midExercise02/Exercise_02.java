package com.midExercise02;

import java.util.Scanner;

public class Exercise_02 {
	public static boolean isPasswordWeak(String s) {
		return (s.length() < 10) ? true : false;
	}

	public static boolean isPasswordNotStrong(String s) {

		String regex = "[^\\w\\s]";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c) || Character.isUpperCase(c) || s.matches(regex))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

//		Viết chương trình nhập mật khẩu, yêu cầu mật khẩu phải có từ 10 ký tự trở lên 
//		trong đó có ít nhất 1 ký tự in hoa, 1 ký tự số, 1 ký tự đặc biệt như . - _ …
//
//		Nếu mật khẩu ít hơn 10 ký tự thông báo mật khẩu yếu
//		Nếu thiếu một trong các ký tự đặc biệt thì thông báo mật khẩu chưa đủ mạnh

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào mật khẩu");
		String password = sc.nextLine();

		if (isPasswordWeak(password)) {
			System.out.println("Mật khẩu yếu");
		}

		if (isPasswordNotStrong(password)) {
			System.out.println("Mật khẩu chưa đủ mạnh");
		}

	}
}
