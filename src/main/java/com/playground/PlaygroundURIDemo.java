package com.playground;

import org.springframework.web.util.UriComponentsBuilder;

public class PlaygroundURIDemo {
	public static void main(String[] args) {
		String baseUri = "/sample-uri";
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUri);
		System.out.println("Baseuri: " + baseUri);
		builder.queryParam("id", "1");
		String uri = builder.build().encode().toUriString();
		System.out.println("uri: " + uri);
	}
}
