package getRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class getData {

	@Test
	public void testResponseCode() {
		Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/forecast/daily?q=M%C3%BCnchen,DE&appid=b6907d289e10d714a6e88b30761fae22");
		int code = resp.getStatusCode();
		System.out.println("status code is: " + code);
		Assert.assertEquals(200, code);
	}
}
