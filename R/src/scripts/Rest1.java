package scripts;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest1 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification res = RestAssured.given();
		Response a = res.request(Method.GET,"/api/users?page=2");
		System.out.println(a.asString());
		System.out.println(a.prettyPrint());
		System.out.println(a.statusCode());
		System.out.println(a.getTime());
		

	}

}
