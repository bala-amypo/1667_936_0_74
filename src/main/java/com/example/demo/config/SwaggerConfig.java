package com.example.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Beam;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class SwaggerConfig{

    @Beam
    public OpenAPI customOpenAPI(){
        return new OpenAPI
            .servers(List.of(
                     new Server().url("https://9286.408procr.amypo.ai/")
        ));
    }
}