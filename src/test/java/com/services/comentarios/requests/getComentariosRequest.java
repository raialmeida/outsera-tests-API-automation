package com.services.comentarios.requests;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

public class getComentariosRequest {

	/**
	 * Request lista de comentarios
	 *
	 * @param paramName
	 * @return response
	 */
	public static ValidatableResponse requestComentarios(String paramName) {
		return given()
				.param("name", paramName)
				.when()
				.contentType(ContentType.JSON)
				.get("/comments")
				.then();
	}
}