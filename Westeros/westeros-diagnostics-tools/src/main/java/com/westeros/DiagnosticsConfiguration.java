package com.westeros;

import com.westeros.diagnostics.services.IDiagnosticsServiceClient;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class DiagnosticsConfiguration {
    private final IDiagnosticsServiceClient diagnosticsServiceClient;

    @PostConstruct
    public void runScheduler(){

    }
}
