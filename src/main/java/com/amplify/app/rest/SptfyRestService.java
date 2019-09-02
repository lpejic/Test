package com.amplify.app.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class SptfyRestService {

    private static final String CLIENT_ID = "1077b522eda44e73a73d74ae7285869a";
    private static final String RESPONSE_TYPE = "code";
    private static final String REDIRECT_URI = "http%3A%2F%2Fwww.google.com";

    public String getToken() {

        //String url = "https://reqres.in/api/users/2";
        String url = "https://accounts.spotify.com/authorize";


        return createHttpsConnection(buildSpotifyUri(url));

    }

    String createHttpsConnection(String url) {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

        return responseEntity.getBody();
    }

    private String buildSpotifyUri(String url){

        return UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("client_id", CLIENT_ID)
                .queryParam("response_type", RESPONSE_TYPE)
                .queryParam("redirect_uri", REDIRECT_URI).toUriString();
    }
}
