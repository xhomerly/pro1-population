package pro1;

import pro1.data.Muni;

import java.util.List;

public class FunFact1 {
    /**
     * @return TODO: Počet obcí, které mají více než 10 000 obyvatel
     */
    public static int getFunFact(List<Muni> data) {
        return (int) data
                .stream()
                .filter(m -> m.getPopulation() > 10_000)
                .count();

//        var count = 0;
//        for (var m : data) {
//            if (m.getPopulation() > 10000) {
//                count++;
//            }
//        }
//        return count;
    }
}