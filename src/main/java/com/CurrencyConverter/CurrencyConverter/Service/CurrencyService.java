package com.CurrencyConverter.CurrencyConverter.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

  
@Service
public class CurrencyService {
    
    private final RestTemplate restTemplate;
    
    @Autowired
    public CurrencyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public double getConvertedAmount(double amount, String fromCurrency, String toCurrency) throws JsonMappingException, JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        String apiUrl = "https://api.freecurrencyapi.com/v1/latest?apikey=" + "" + "&currencies=" + toCurrency + "&base_currency=" + fromCurrency; //insert API key
        
        String json = restTemplate.getForObject(apiUrl, String.class);

        JsonNode jsonNode = objectMapper.readTree(json);

        double exchangeRate = jsonNode.get("data").get(toCurrency).asDouble();

        return amount * exchangeRate;
    }


    public String getStatus() {
        ObjectMapper objectMapper = new ObjectMapper();

        String apiUrl = "https://api.freecurrencyapi.com/v1/status?apikey="; //insert API KEY

        String json = restTemplate.getForObject(apiUrl, String.class);

        String totalRequest;
        try {
            JsonNode jsonNode = objectMapper.readTree(json);
            totalRequest = jsonNode.get("quotas").get("grace").get("total").asText();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            totalRequest = "";   
        }
        

        return totalRequest;

    }

}
