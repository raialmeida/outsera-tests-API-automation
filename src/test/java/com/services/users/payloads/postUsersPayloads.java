package com.services.users.payloads;

import com.github.javafaker.Faker;
import jakarta.json.JsonObject;
import jakarta.json.Json;

public class postUsersPayloads {

	static String name = Faker.instance().name().fullName().toString();
	static String userName = Faker.instance().name().username().toString();
	static String email = Faker.instance().internet().emailAddress();

	public static String payload() {
		JsonObject JsonObject = Json.createObjectBuilder()
				.add("name", name)
				.add("username", userName)
				.add("email", email)
				.build();
		return JsonObject.toString();
	}
}