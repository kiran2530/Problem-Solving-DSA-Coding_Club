/*
 *  Q) Input : 22
 *     Output : twenty two
 */
public class IntegerToWordsExactly {

  public static String integerToWordsExactly(int n) {
    String[] oneToTwenty = {
      "",
      "one",
      "two",
      "three",
      "four",
      "five",
      "six",
      "seven",
      "eight",
      "nine",
      "ten",
      "eleven",
      "twelve",
      "thirteen",
      "fourteen",
      "fifteen",
      "sixteen",
      "seventeen",
      "eighteen",
      "nineteen",
    };
    String[] tens = {
      "",
      "",
      "twenty",
      "thirty",
      "forty",
      "fifty",
      "sixty",
      "seventy",
      "eighty",
      "ninety",
    };

    if(n < 20) {
      return oneToTwenty[n];
    }
    else if(n < 100) {
      return tens[n/10] + " " + integerToWordsExactly(n%10);
    }
    else if(n < 1000) {
      return oneToTwenty[n/100] + " hundred "  + integerToWordsExactly(n%100);
    }
    else if(n < 100000) {
      return integerToWordsExactly(n/1000) + " Thousand " + integerToWordsExactly(n%1000);
    }
    else {
      return "number from renge 1 - 99999 are only converted";
    }
  }
  public static void main(String[] args) {
    int n = 101;
    System.out.println(n + " : " + integerToWordsExactly(n));
  }
}
