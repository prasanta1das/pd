import java.util.Arrays;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		/*int i =5;
		System.out.println(i+i---i);
       int j=4;
       System.out.println(j/j+++j);
       int k=9;
       System.out.println((k+k)/Math.sqrt(k));*/
       
       Arrays.stream(new int[] {14, 22, 3, 4, 9})
       .sorted()
       .forEach(p->System.out.println(p));
       
       Stream.of("d2", "a2", "b1", "b3", "c")
       .sorted((s1, s2) -> {
           System.out.printf("sort: %s; %s\n", s1, s2);
           return s1.compareTo(s2);
       })
       .filter(s -> {
           System.out.println("filter: " + s);
           return s.startsWith("a");
       })
       .map(s -> {
           System.out.println("map: " + s);
           return s.toUpperCase();
       })
       .forEach(s -> System.out.println("forEach: " + s));
	}

}
