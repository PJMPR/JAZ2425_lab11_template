package com.westeros.diagnostics.controllers;

import com.westeros.diagnostics.runners.IRunDiagnoses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("diagnostics")
@RequiredArgsConstructor
public class DiagnosticsController {

    private final IRunDiagnoses diagnosticRunner;
    @GetMapping("check")
    public ResponseEntity check() {
        
        return ResponseEntity.ok(diagnosticRunner.runAll());
    }

    @GetMapping
    public ResponseEntity<String> checkStatus(){
        return ResponseEntity.ok("ALIVE");
    }
}
