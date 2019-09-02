package com.tanuj.service;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.tanuj.model.Risk;
import com.tanuj.repository.RisksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * @author Tanuj Kathuria
 * @version 1.0
 */
@Service
public class RisksServiceImpl  implements RisksService{

    @Autowired
    RisksRepository risksRepository;


    @Override
    public Iterable<Risk> getRisks() {
        return risksRepository.findAll();
    }

    @Override
    public Optional<Risk> getRisk(String id) {
         return risksRepository.findById(id);
    }

    @Override
    public ResponseEntity<String> addRisk(Risk risk) {
        Risk ris = risksRepository.save(risk);
        if(ris!=null){
            return new ResponseEntity<>("RiskAdded", HttpStatus.OK);
        }
        return new ResponseEntity<>("RiskAdded", HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<String> deleteRisk(String riskId) {
        risksRepository.deleteById(riskId);
        if(!risksRepository.existsById(riskId)){
            return new ResponseEntity<>("RiskDeleted", HttpStatus.OK);
        }
        return new ResponseEntity<>("RiskDeleted", HttpStatus.BAD_REQUEST);
    }
}
