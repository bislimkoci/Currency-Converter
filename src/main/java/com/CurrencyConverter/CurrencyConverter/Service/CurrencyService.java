package com.CurrencyConverter.CurrencyConverter.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

  
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


    public void getStatus() {

        String apiUrl = "https://api.freecurrencyapi.com/v1/status?apikey="; //insert API KEY

        String result = restTemplate.getForObject(apiUrl, String.class);

        System.out.println();

    }

}
