package web.app.demo.util;

import java.util.UUID;

public class CodeUtil {
	//生成唯一的驗證碼
	public static String generateUniqueCode(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}