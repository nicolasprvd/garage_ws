package parsers;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * Classe AuthentificationHash
 * Permet de crypter le mot de passe de l'utilsateur
 * @author Nicolas - Audrey - Maroua
 *
 */
public class AuthenficationHash {
	
	public static String hash(String motDePasse) {
		String hash = null;
		
		try {
			MessageDigest messageDigest = null;
			messageDigest = MessageDigest.getInstance("SHA-256");
			messageDigest.update(motDePasse.getBytes());
			byte byteData[] = messageDigest.digest();
			StringBuilder stringBuffer = new StringBuilder();
			for(byte aByteData : byteData) {
				stringBuffer.append(Integer.toString((aByteData & 0xff) + 0x100, 16).substring(1));
			}
			hash = stringBuffer.toString();
			
		}catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return hash;
	}

}
