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
	
	


}
