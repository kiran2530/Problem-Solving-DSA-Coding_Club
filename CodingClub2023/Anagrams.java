package CodingClub2023;
import java.util.*;

public class Anagrams {

  public static boolean istrue(char[] x, char[] y) {
    if (x.length != y.length) return false;
    for (int i = 0; i < x.length; i++) {
      if (x[i] == y[i]) {} else return false;
    }
    return true;
  }

  public static ArrayList<ArrayList<String>> listOfAnagrams(
    ArrayList<String> list
  ) {
    ArrayList<ArrayList<String>> listOfList = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      ArrayList<String> list1 = new ArrayList<>();
      list1.add(list.get(i));
      String x = list.get(i);
      char[] x1 = x.toCharArray();
      Arrays.sort(x1);

      for (int j = i + 1; j < list.size();) {
        String y = list.get(j);
        char[] y1 = y.toCharArray();
        Arrays.sort(y1);
        if (istrue(x1, y1)) {
          list1.add(y);
          list.remove(j);
        } else j++;
      }
      listOfList.add(list1);
    }
    return listOfList;
  }

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("eat");
    list.add("tea");
    list.add("tan");
    list.add("ate");
    list.add("nat");
    list.add("bat");

    System.out.println(listOfAnagrams(list));
  }
}
