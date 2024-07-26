package com.services.users.tests;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.services.users.payloads.postUsersPayloads;
import com.services.users.requests.postUsersRequest;

import Config.TestConfig;

@DisplayName("Testes da rota POST /users")
public class postUsersTest extends TestConfig {

	String payload = postUsersPayloads.payload();

	@Test
	@DisplayName("Validar status code 201 e id do usuario")
	public void validarStatusCodeIdUsuarios() {
		postUsersRequest.requestUsers(payload)
				.assertThat().statusCode(201)
				.body("id", equalTo(11));
	}
}