package com.services.comentarios.tests;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.services.comentarios.requests.getComentariosRequest;

import Config.TestConfig;

@DisplayName("Testes da rota GET /comentarios")
public class getComentariosTest extends TestConfig {

	@Test
	@DisplayName("Validar busca de comentários por nome")
	public void validarBuscaComentariosPorNome() {
		getComentariosRequest.requestComentarios("alias odio sit")
				.statusCode(200)
				.assertThat().body("email[0]", equalTo("Lew@alysha.tv"));
	}
}