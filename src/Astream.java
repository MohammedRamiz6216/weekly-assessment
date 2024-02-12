//2  Write a Java program to convert a list of strings to uppercase or lowercase using streams.
/*
import java.util.*;
import java.util.stream.Collectors;

public class Astream {
    public static void main(String[] args) {
        int n;

        List<String> names = Arrays.asList("orange","banana","apple","strawberry","pineapple");
        List<String> namesToupper = new ArrayList<>();
        List<String>namesTolower = new ArrayList<>();
        namesToupper = names.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
        namesTolower = names.stream().map(str->str.toLowerCase()).collect(Collectors.toList());
        n = 1+(int)(Math.random()*10)%3;
        if(n==1){
            System.out.println(namesToupper);
        }else{
            System.out.println(namesTolower);
        }

    }
}


//4 Write a Java program to remove all duplicate elements from a list using streams.
import java.util.*;import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Collectors;
public class Astream{
    public static void main(String[] args) {
        List<Integer> duplicatElements = Arrays.asList(1,2,3,3,44,55,44,55,8,9);
        List<Integer> dupElements1 = new ArrayList<>();
        dupElements1 = duplicatElements.stream().distinct().collect(Collectors.toList());
        System.out.println(dupElements1);
    }
}


//7 Write a Java program to find the second smallest and largest elements in a list of integers using streams.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Astream{
    public static void main(String[] args) {


List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
// Find the maximum value
        Stream<Integer> data=nums.stream();
        Stream<Integer>meta = nums.stream();
Integer max_val = data
        .max(Integer::compare)
        .orElse(null);
        Integer min_val = meta
                .min(Integer::compare)
                .orElse(null);

        System.out.println(max_val);
        System.out.println(min_val);

    }}


//1. Write a Java program to calculate the average of a list of integers using streams.
import java.util.*;
import java.util.stream.Collectors;
public class Astream {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(12,11,10,9,8,7,6,5,4,3,2,1);

        System.out.println(numbersList.stream().mapToDouble(Integer::doubleValue).average());
    }
}



//3  Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
import java.util.*;
import java.util.stream.Collectors;
public class Astream {
    public static void main(String[] args) {
        List<Integer> nLists = Arrays.asList(12,16,10,9,18,47,61,25,34,13);
        int sum1 = nLists.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
        int sum2 = nLists.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum();
        System.out.println(sum1+sum2);



    }
}


//8 Write a Java program to find the second smallest and largest elements in a list of integers using streams.
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Astream {
    public static void main(String[] args) {
        List<Integer> numOfLists = Arrays.asList(12,16,10,9,18);
       Integer seSmallest = numOfLists.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        Integer secondLargest = numOfLists.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(seSmallest);
        System.out.println(secondLargest);

    }
}

// 5 Write a Java program to count the number of strings in a list that start with a specific letter using streams.
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Astream {
    public static void main(String[] args) {
        List < String > colors = Arrays.asList("Yellow", "Green", "Blue", "Black", "White");
        char startLetter = 'B';
        long str = colors.stream().filter(s->s.startsWith(String.valueOf(startLetter))).count();
        System.out.println(str);

    }
}

// 6 Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Astream {
    public static void main(String[] args) {
        List < String > nofColors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        List<String> ascOrder = nofColors.stream().sorted().collect(Collectors.toList());
        List<String> descOrder = nofColors.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(ascOrder);
        System.out.println(descOrder);
    }
}

 */