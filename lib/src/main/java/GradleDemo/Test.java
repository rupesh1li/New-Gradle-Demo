package GradleDemo;

import org.apache.commons.codec.binary.Base64;

public class Test {
	public static void main(String[] args) {
		String input = "Hello";
		byte[] arr = Base64.encodeBase64(input.getBytes());
		String encStr = new String(arr);
		System.out.println("Encode  Data => " + encStr);
		//-------------------------------------------
		byte[] dec = Base64.decodeBase64(encStr.getBytes());
		String normal = new String(dec);
		System.out.println(normal);
	}
}
