package com.CurrencyConverter.CurrencyConverter.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

  
@Service
public class CurrencyService {
    
    private final RestTemplate restTemplate;
    
    @Autowired
    public CurrencyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public double getConvertedAmount(double amount, String fromCurrency, String toCurrency) {
        
        
        
        return 2;
    }


    public String getStatus() {
        ObjectMapper objectMapper = new ObjectMapper();

        String apiUrl = "https://api.freecurrencyapi.com/v1/status?apikey="; //insert API KEY

        String json = restTemplate.getForObject(apiUrl, String.class);
        System.out.println(json);

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
