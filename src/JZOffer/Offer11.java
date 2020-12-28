package JZOffer;

import java.util.Arrays;

public class Offer11 {
    //二分查找法失败
//    public int minArray(int[] numbers) {
//
//        int start = 0;
//        int end = numbers.length-1;
//        if(numbers[end] >= numbers[start]) return numbers[start];
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//            if (numbers[mid] >= numbers[start]) {
//                start = mid+1;
//            } else if (numbers[mid] < numbers[start]) {
//                end = mid;
//            }
//        }
//        return numbers[end];
//    }
    public int minArray(int[] numbers) {
        int f = numbers[0];
        for (int number : numbers) {
            if(number < f) return number;
        }
        return f;
    }
//    public int minArray(int[] numbers) {
//        if (numbers.length == 1) return numbers[0];
//        for (int i = 0; i < numbers.length - 1; i++) {
//            if (numbers[i] > numbers[i + 1]) return numbers[i + 1];
//        }
//        return numbers[0];
//    }
}
