package com.services.users.payloads;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class putUsersPayloads {

    public static String payload(String lat, String ing, String email) {
        JsonObject jsonObject = Json.createObjectBuilder()
                .add("name", "Chelsey Dietrich")
                .add("username", "Kamren")
                .add("email", email)
                .add("address", Json.createObjectBuilder()
                        .add("street", "Skiles Walks")
                        .add("suite", "Suite 351")
                        .add("city", "Roscoeview")
                        .add("zipcode", "33263")
                        .add("geo", Json.createObjectBuilder()
                                .add("lat", lat)
                                .add("lng", ing)
                                .build())
                        .build())
                .add("phone", "(254)954-1289")
                .add("website", "demarco.info")
                .add("company", Json.createObjectBuilder()
                        .add("name", "Keebler LLC")
                        .add("catchPhrase", "User-centric fault-tolerant solution")
                        .add("bs", "revolutionize end-to-end systems")
                        .build())
                .build();
        return jsonObject.toString();
    }
}