package com.services.users.tests;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.services.users.payloads.putUsersPayloads;
import com.services.users.requests.putUsersRequest;

@DisplayName("Testes da rota PUT /users")
public class putUsersTest {

    String latitude = "-45.8129";
    String longitude = "84.5342";
    String email = "Lucio_Teste@annie.ca";

    String payload = putUsersPayloads.payload(latitude, longitude, email);

    @Test
    @DisplayName("Validar status code 200 e alteração do usuário")
    public void validarStatusCodeUpdateUsuarios() {
        putUsersRequest.requestUsers(5, payload)
                .assertThat().statusCode(200)
                .body("address.geo.lat", equalTo(latitude))
                .body("address.geo.lng", equalTo(longitude))
                .body("email", equalTo(email));
    }
}
