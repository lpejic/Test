package com.amplify.app.controller;

import com.amplify.app.service.SptfyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/sptfy")
public class SptfyController {

    SptfyService sptfyService;

    public SptfyController(SptfyService sptfyService) {
        this.sptfyService = sptfyService;
    }

    @GetMapping(value = "/getToken")
    public String getToken(){

        return sptfyService.getToken();
    }




}
