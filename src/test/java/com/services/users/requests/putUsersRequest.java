package com.services.users.requests;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

public class putUsersRequest {

    /**
     * Request update de usuários
     *
     * @param payload
     * @param idUser
     * @return response
     */
    public static ValidatableResponse requestUsers(int idUser, String payload) {
        return given()
                .pathParam("id", idUser)
                .contentType(ContentType.JSON)
                .when()
                .body(payload)
                .put("/users/{id}")
                .then();
    }
}
