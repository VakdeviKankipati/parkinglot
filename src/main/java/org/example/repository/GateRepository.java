package org.example.repository;

import org.example.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {

    private Map<Long,Gate> hm = new HashMap<>();

    public Optional<Gate> findGateById(Long gateId){
        if(hm.containsKey(gateId)){
            return  Optional.of(hm.get(gateId));
        }
        return Optional.empty();
    }
}
