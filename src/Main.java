import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if(string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }

    /*
      	Calculate the complexity of the problem:
      	1 outer loop = n;
      	1 inner loop = n - 1;
        1 command = 1
      	1 loop * 1 command = 1;
        T(n) = (n * (n - 1)) + (1 + 1);
        T(n) = O(n^2) + O(n);
      	T(n) = O(n^2);
      	=> The complexity of this problem is O(n^2)
     */

}


