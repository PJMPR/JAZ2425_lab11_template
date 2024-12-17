package com.westeros;

import com.westeros.diagnostics.services.IDiagnosticsServiceClient;
import com.westeros.tools.schedulers.Scheduler;
import com.westeros.tools.schedulers.SchedulerThread;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class DiagnosticsConfiguration {
    private final SchedulerThread schedulerThread;
    private final IDiagnosticsServiceClient diagnosticsServiceClient;
    private final Scheduler scheduler;

    @PostConstruct
    public void runScheduler(){


    }
}
