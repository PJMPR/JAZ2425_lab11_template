package com.westeros.diagnostics.runners;

import com.westeros.diagnostics.services.contract.Diagnostics;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DiagnosticsRunner implements IRunDiagnoses {


    private final List<IDiagnose> diagnoses;

    @Override
    public List<Diagnostics> runAll() {
        return diagnoses.stream().map(x->x.run()).toList();
    }
}
