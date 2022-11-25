package utility;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.*;

public class Security {

	private static byte[] key = {
		'l', 'o', 'v', 'e', '-', 'i', 'A', 'C', 'A', 'D', 'E', 'M', 'Y', '1', '4', '3'
	};

	public static String encrypt(String strToEncrypt) {
		String encryptedString = null;
		try {
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			final SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			encryptedString = Base64.encodeBase64String(cipher.doFinal(strToEncrypt.getBytes()));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return encryptedString;
	}

	public static String decrypt(String codeDecrypt){
		String decryptedString = null;
		try{
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
			final SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			decryptedString = new String(cipher.doFinal(Base64.decodeBase64(codeDecrypt)));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return decryptedString;
	}
	
	public static void main(String[] args) {
		
		System.out.println("JDBC Driver: " 
			+ Security.encrypt("jdbcDriver"));
		System.out.println("JDBC URL: " 
			+ Security.encrypt("jdbcURL"));
		System.out.println("DB UserName: " 
			+ Security.encrypt("dbUserName"));
		System.out.println("DB Password: " 
			+ Security.encrypt("dbPassword"));

	}

}
