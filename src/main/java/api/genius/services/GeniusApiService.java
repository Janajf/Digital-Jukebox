package api.genius.services;

import api.genius.model.Example;
import api.genius.model.Hit;
import api.genius.model.Response;
import api.genius.util.BasicLogger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

public class GeniusApiService {

    private static final String API_BASE_URL = "https://genius-song-lyrics1.p.rapidapi.com/";

    private final RestTemplate restTemplate;


    public GeniusApiService(){
        this.restTemplate = new RestTemplate();
    }

    public Hit[] getHits(String songTitle){

        KeyReader reader = new KeyReader();

        String key = reader.getKey();

        System.out.println(key);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("X-RapidAPI-Host","genius-song-lyrics1.p.rapidapi.com");
        httpHeaders.add("X-RapidAPI-Key",key);

        HttpEntity<Void> entity = new HttpEntity<>(httpHeaders);

        String queryString = "?q=" + songTitle;

        try{
            ResponseEntity<Example> responseEntity = restTemplate.exchange(API_BASE_URL+ "/search" + queryString, HttpMethod.GET, entity,Example.class);

            if(responseEntity.getBody() != null){
                return responseEntity.getBody().getResponse().getHits().toArray(new Hit[0]);
            }
        } catch (RestClientResponseException ex){
            System.out.println("API Error: " + ex.getStatusText());
        } catch (ResourceAccessException ex){
            System.out.println("API Error: " + ex.getMessage());
        }
        return new Hit[] {};

    }
}
