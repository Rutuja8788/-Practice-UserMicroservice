
package com.example.Combined.Service.service;


import com.example.Combined.Service.entity.User;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.springframework.stereotype.Service;

@Service
public class CombinedService {

    private final String registerServiceUrl = "http://localhost:8081/register";
    private final String loginServiceUrl = "http://localhost:8082/login";

    public String registerUser(User user)
    {
        HttpResponse<String> response = Unirest.post(registerServiceUrl)
                .header("Content-Type", "application/json")
                .body(user)
                .asString();
        return response.getBody();
    }

    public String loginUser(User user)
    {
        HttpResponse<String> response = Unirest.post(loginServiceUrl)
                .header("Content-Type", "application/json")
                .body(user)
                .asString();
        return response.getBody();
    }
}
