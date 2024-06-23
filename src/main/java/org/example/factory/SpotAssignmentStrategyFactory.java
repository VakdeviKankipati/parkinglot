package org.example.factory;

import org.example.models.SpotAssigmentStrategyType;
import org.example.strategies.RandomSpotAssigmentStrategy;
import org.example.strategies.SpotAssigmentStrategy;

public class SpotAssignmentStrategyFactory {
    public static SpotAssigmentStrategy getSpotAssignmentStrategyForType(
            SpotAssigmentStrategyType spotAssignmentStrategyType) {
//        if (spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.NEAREST)) {
//            return new NearestSpotAssignmentStrategy();
//        } else if (spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.CHEAPEST)) {
//            return new CheapestSpotAssignmentStrategy();
//        }
        return new RandomSpotAssigmentStrategy();
    }
}
