package com.jcs_java_sdk;

import java.io.FileReader;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.regex.Pattern;

import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.openssl.PEMDecryptorProvider;
import org.bouncycastle.openssl.PEMEncryptedKeyPair;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.bouncycastle.openssl.jcajce.JcePEMDecryptorProviderBuilder;

public class Utils {

	public static String getProtocol(String url)
	{	
		String regex = "(http[s]?)://((?:[a-zA-Z]|[0-9]|[$-_@.&+]|[!*\\(\\),]|(?:%[0-9a-fA-F][0-9a-fA-F]))+)";

		if(!Pattern.matches(regex, url))
		{
			System.out.println("Unsupported URL endpoint");
			return "None";
		}
		else
		{
			return url.split("://")[0];
		}

	}

	public static String getHost(String url)
	{	
		String regex = "(http[s]?)://((?:[a-zA-Z]|[0-9]|[$-_@.&+]|[!*\\(\\),]|(?:%[0-9a-fA-F][0-9a-fA-F]))+)";

		if(!Pattern.matches(regex, url))
		{
			System.out.println("Unsupported URL endpoint");
			return "None";
		}
		else
		{
			return url.split("://")[1];
		}		
	}

//	private static byte[] getKeyBytes(String filename)
//	{
//		byte[] keyBytes = null;
//		try{	
//			File f = new File(filename);
//			FileInputStream fis = new FileInputStream(f);
//			DataInputStream dis = new DataInputStream(fis);
//			keyBytes = new byte[(int)f.length()];
//			dis.readFully(keyBytes); 
//			dis.close();
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//
//		return keyBytes;
//	}
	
	
	
	public static PrivateKey readPrivateKey(String privateKeyPath, String keyPassword) throws IOException {

	    FileReader fileReader = new FileReader(privateKeyPath);
	    PEMParser keyReader = new PEMParser(fileReader);

	    JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
	    PEMDecryptorProvider decryptionProv = new JcePEMDecryptorProviderBuilder().build(keyPassword.toCharArray());

	    Object keyPair = keyReader.readObject();
	    PrivateKeyInfo keyInfo;

	    if (keyPair instanceof PEMEncryptedKeyPair) {
	        PEMKeyPair decryptedKeyPair = ((PEMEncryptedKeyPair) keyPair).decryptKeyPair(decryptionProv);
	        keyInfo = decryptedKeyPair.getPrivateKeyInfo();
	    } else {
	        keyInfo = ((PEMKeyPair) keyPair).getPrivateKeyInfo();
	    }

	    keyReader.close();
	    return converter.getPrivateKey(keyInfo);
	}
	
	
//	public static PrivateKey getPrivateKey(String filename) {
//
//		byte[] keyBytes = getKeyBytes(filename);
//
//		
//		String privateKey;
//		try {
//			privateKey = new String(keyBytes, "UTF-8");
//			privateKey = privateKey.replaceAll("(-+BEGIN RSA PRIVATE KEY-+\\r?\\n|-+END RSA PRIVATE KEY-+\\r?\\n?)", "");
//			keyBytes = DatatypeConverter.parseBase64Binary(privateKey);
//			PKCS8EncodedKeySpec spec =new PKCS8EncodedKeySpec(keyBytes);
//			KeyFactory kf = KeyFactory.getInstance("RSA");
//			return kf.generatePrivate(spec);
//		
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NoSuchAlgorithmException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InvalidKeySpecException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}


}
