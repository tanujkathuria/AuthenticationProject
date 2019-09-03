package com.tanuj.service;

import com.tanuj.model.Risk;
import com.tanuj.repository.RisksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
            return new ResponseEntity(ris,HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity deleteRisk(String riskId) {
        risksRepository.deleteById(riskId);
        if(!risksRepository.existsById(riskId)){
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
}
