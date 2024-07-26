package com.services.users.requests;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

public class postUsersRequest {

	/**
	 * Request cadastro de usuários
	 *
	 * @param payload
	 * @return response
	 */
	public static ValidatableResponse requestUsers(String payload) {
		return given()
				.when()
				.body(payload)
				.contentType(ContentType.JSON)
				.post("/users")
				.then();
	}
}
