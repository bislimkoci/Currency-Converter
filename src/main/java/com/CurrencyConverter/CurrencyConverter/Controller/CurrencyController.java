package com.CurrencyConverter.CurrencyConverter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CurrencyConverter.CurrencyConverter.Service.CurrencyService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Controller
public class CurrencyController {
    
    private final CurrencyService currencyService;

    @Autowired
    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("convertedAmount", null);
        return "index";
    }

    @PostMapping("/convert")
    public String submit(
        @RequestParam("amount") double amount,
        @RequestParam("fromCurrency") String fromCurrency, 
        @RequestParam("toCurrency") String toCurrency, 
        Model model) throws JsonMappingException, JsonProcessingException {
        
        double convertedAmount = currencyService.getConvertedAmount(amount, fromCurrency, toCurrency);
        

        model.addAttribute("convertedAmount", convertedAmount);
        return "index";
    }

    @GetMapping("/status") 
    public String getStatus(Model model) {
        String requests = currencyService.getStatus();
        model.addAttribute("requestMade", requests);
        return "status";
    }


}
