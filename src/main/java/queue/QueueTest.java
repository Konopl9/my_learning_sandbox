package queue;

import java.util.*;
import java.util.stream.Collectors;

public class QueueTest {
    public static void main(String[] args) {
        List<Double> list = new LinkedList<>();
        list.add(2.0d);
        list.add(1.0d);
        list.add(5.2d);
        Double[] arr = list.toArray(new Double[0]);

        List<Double[]> darr = new ArrayList<>();
        Double[][] darrr = darr.toArray(new Double[0][]);
    }
}

