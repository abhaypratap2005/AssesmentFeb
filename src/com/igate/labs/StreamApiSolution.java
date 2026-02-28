package com.igate.labs;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiSolution {

    public static void main(String[] args) {


        List<String> ownersWithNoCars = CarRepository.getOwners()
                .stream()
                .filter(o -> o.getCars() == null || o.getCars().isEmpty()).map(Owner::getName)
                .collect(Collectors.toList());

        System.out.println(ownersWithNoCars);


        Map<String, Integer> ownerCarCount = CarRepository.getOwners()
                .stream()
                .collect(Collectors.toMap(
                        Owner::getName,
                        o -> o.getCars() == null ? 0 : o.getCars().size()
                ));

        System.out.println(ownerCarCount);



        Set<Car> ownedCars = CarRepository.getOwners()
                .stream()
                .filter(o -> o.getCars() != null)
                .flatMap(o -> o.getCars().stream())
                .collect(Collectors.toSet());

        List<Car> unownedCars = CarRepository.getCars()
                .stream()
                .filter(car -> !ownedCars.contains(car))
                .collect(Collectors.toList());

        System.out.println(unownedCars);
    }
}