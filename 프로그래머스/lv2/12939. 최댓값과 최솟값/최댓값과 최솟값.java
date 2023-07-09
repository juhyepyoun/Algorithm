import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public String solution(String s) {
        int[] array = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(array);
        System.out.println(array[0]);
        String answer = array[0] + " " + array[array.length - 1];
        return answer;
    }
}