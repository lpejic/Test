package com.amplify.app.service;

import com.amplify.app.rest.SptfyRestService;
import org.springframework.stereotype.Service;

@Service
public class SptfyService {

    SptfyRestService sptfyRestService;

    public SptfyService(SptfyRestService sptfyRestService) {
        this.sptfyRestService = sptfyRestService;
    }

    public String getToken(){

        return sptfyRestService.getToken();
    }



}
