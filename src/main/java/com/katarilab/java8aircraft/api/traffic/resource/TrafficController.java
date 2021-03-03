package com.katarilab.java8aircraft.api.traffic.resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Traffic")
public class TrafficController {

    private final static Queue<Long> State = new ConcurrentLinkedQueue<>();

    @GetMapping
    public List<Integer> Get(){
        List<Long> copy = new ArrayList<>(TrafficController.State);
        Hashtable<Long, Integer> temporal = new Hashtable<>();
        for (Long temp: copy) {
            int value = temporal.getOrDefault(temp, -1);
            if ( value != -1 ){
                temporal.put(temp, value + 1);
            }
            else{
                temporal.put(temp, 1);
            }
        }
        List<Integer> result = new ArrayList<>(temporal.values());
        return result.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    }

    @PostMapping("/reset")
    public long PostReset(){
        TrafficController.State.clear();
        return 0;
    }

    @PostMapping
    public long Post(){
        long key = System.currentTimeMillis();
        TrafficController.State.add(key);
        return key;
    }

}