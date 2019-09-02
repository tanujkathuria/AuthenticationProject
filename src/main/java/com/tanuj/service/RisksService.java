package com.tanuj.service;

import com.tanuj.model.Risk;
import org.springframework.http.ResponseEntity;

/**
 * @author Tanuj Kathuria
 * @version 1.0
 */
public interface RisksService {
    public Iterable<Risk>  getRisks();
    public ResponseEntity<String> addRisk(Risk risk);
    public ResponseEntity<String> deleteRisk(String riskId);
}
