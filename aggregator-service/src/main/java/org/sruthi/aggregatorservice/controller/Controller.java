package org.sruthi.aggregatorservice.controller;

import org.anirudh.aggregatorservice.StudentDTO;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.ServerRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    List<Profile1DTO> profile = null;
    String url = "http://localhost:8000/profile/all";

    @GetMapping("/")
    public List<Profile1DTO> getAllProfile(){
        RestTemplate template = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(new MediaType[]{MediaType.APPLICATION_JSON}));
        HttpEntity<Profile1DTO[]> entity = new HttpEntity<>(headers);
        ResponseEntity<Profile1DTO[]> response = template.exchange(url,
                HttpMethod.GET, entity, Profile1DTO[].class);
        student = new ArrayList<>(Arrays.asList(response.getBody()));
        return profile;
    }
}
