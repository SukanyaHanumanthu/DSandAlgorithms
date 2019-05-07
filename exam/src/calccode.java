/*
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;


class Solution {


    public int solution(String S) {
        Comparator<List<Solution.CalltoSecond>> list_compare = (l1, l2) -> {
            int comparedValue = -1 * l1.stream().map(x -> x.sec).reduce(0, (x, y) -> x + y)
                    .compareTo(l2.stream().map(x -> x.sec).reduce(0, (x, y) -> x + y));
            return comparedValue == 0
                    ? l1.stream().findFirst().get().mobilenum.replace("-", "")
                    .compareTo(l2.stream().findFirst().get().mobilenum.replace("-", ""))
                    : comparedValue;
        };
        return Arrays.stream(S.split("\r?\n")).map(x -> x.split(",")).map(Arrays::asList)
                .map(Solution.CalltoSecond::new).collect(Collectors.groupingBy(x -> x.mobilenum)).values()
                .stream().sorted(list_compare).skip(1).flatMap(List::stream)
                .reduce(0, (curCost, call) -> curCost + charges(call), (curCost, addCost) -> curCost + addCost);
    }

    private int charges(CalltoSecond call) {
        return call.totsec >= 300
                ? ((call.hours * 60) + (call.min) + (call.sec > 0 ? 1 : 0)) * 150
                : ((call.min * 60) + (call.sec)) * 3;
    }

    private static class CalltoSecond {
        String mobilenum;
        int hours, min, sec, totsec;
        CalltoSecond(List<String> values) {
            mobilenum = values.get(1);
            String[] time = values.get(0).split(":");
            hours = Integer.valueOf(time[0]);
            min = Integer.valueOf(time[1]);
            sec = Integer.valueOf(time[2]);
            totsec = (hours * 3600) + (min * 60) + (sec);
        }
        public static void main(String... args) {
            String INPUT = "00:01:07,400-234-090\n" +
                    "00:06:07,701-080-080\n" +
                    "00:05:00,400-234-090";
            System.out.println(new Solution().solution(INPUT));
        }

    }
}*/
