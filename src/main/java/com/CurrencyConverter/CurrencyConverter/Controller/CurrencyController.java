package com.CurrencyConverter.CurrencyConverter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CurrencyConverter.CurrencyConverter.Service.CurrencyService;

@Controller
public class CurrencyController {
    
    private CurrencyService currencyService;

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("convertedAmount", null);
        return "index";
    }

    @PostMapping("/convert")
    public String submit(
        @RequestParam("amount") int amount,
        @RequestParam("fromCurrency") String fromCurrency, 
        @RequestParam("toCurrency") String toCurrency, 
        Model model) {
        
        

        model.addAttribute("convertedAmount", 234);
        return "index";
    }


}
