package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.security.*;
import javax.xml.bind.DatatypeConverter;


@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";

@RestController
class ServerController{
	@RequestMapping("/hash")
	public String dataCheckSum(@RequestParam(value="data", defaultValue = "Hello World Check Sum!") String input) throws NoSuchAlgorithmException{
		String algorithm = "SHA-256";
		try {
			MessageDigest md = MessageDigest.getInstance(algorithm);
			byte[] hashedValue = md.digest(input.getBytes());
			return "<p>Name: Charles Ballard" + "<br>Check Sum: " + bytesToHex(hashedValue);
		} catch (NoSuchAlgorithmException e) {
			//TODO: handle exception
			e.printStackTrace();
		}

		return "Empty";
	}

	private static String bytesToHex(byte[] hash){
		return DatatypeConverter.printHexBinary(hash).toLowerCase();
	}
}