package com.westeros.diagnostics.runners;

import com.westeros.diagnostics.services.contract.Diagnostics;
import org.springframework.stereotype.Component;

@Component
public class DiskSpaceDiagnostics implements IDiagnose {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public Diagnostics run() {
        return null;
    }
}
