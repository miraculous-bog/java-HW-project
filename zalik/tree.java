package zalik;

import java.util.*;

class Segment implements Comparable<Segment> {
    int start;
    int end;

    public Segment(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Segment other) {
        return Integer.compare(this.start, other.start);
    }
}

public class tree {
    public static void main(String[] args) {
        TreeMap<Segment, Integer> segments = new TreeMap<>();

        addSegment(segments, new Segment(1, 5));
        addSegment(segments, new Segment(3, 8));
        addSegment(segments, new Segment(6, 10));
        addSegment(segments, new Segment(9, 12));

        int[] intersectionPoint = findIntersectionPoint(segments);

        System.out.println("Intersection Point with min absyc:  (" + intersectionPoint[0] + ", " + intersectionPoint[1] + ")");
    }

   
    private static int[] findIntersectionPoint(TreeMap<Segment, Integer> segments) {
        int[] intersectionPoint = new int[2];

        Iterator<Map.Entry<Segment, Integer>> iterator = segments.entrySet().iterator();

        Map.Entry<Segment, Integer> firstSegment = iterator.next();
        Map.Entry<Segment, Integer> secondSegment = iterator.next();

        intersectionPoint[0] = Math.max(firstSegment.getKey().start, secondSegment.getKey().start);
        intersectionPoint[1] = Math.min(firstSegment.getKey().end, secondSegment.getKey().end);

        return intersectionPoint;
    }

	private static void addSegment(TreeMap<Segment, Integer> segments, Segment segment) {
        segments.put(segment, 0);
    }

}