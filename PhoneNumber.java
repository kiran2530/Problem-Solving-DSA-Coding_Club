public class PhoneNumber {
    public static String integerNo(String no) {
        if(no.equals("one"))
            return "1";
        if(no.equals("two"))
            return "2";
        if(no.equals("three"))
            return "3";
        if(no.equals("four"))
            return "4";
        if(no.equals("five"))
            return "5";
        if(no.equals("six"))
            return "6";
        if(no.equals("seven"))
            return "7";
        if(no.equals("eight"))
            return "8";
        if(no.equals("nine"))
            return "9";
        if(no.equals("zero"))
            return "0";
        
        return "";
    }
    public static String getPhoneNo(String wordNo) {
        String no = "",number = "";
        boolean Doub = false, triple = false;

        for(int i = 0; i<wordNo.length(); i++) {
            if(wordNo.charAt(i) == ' ') {
                if(no.equals("double")) {
                    Doub = true;
                    no = "";
                    continue;
                }
                if(no.equals("triple")) {
                    triple = true;
                    no = "";
                    continue;
                }

                if(Doub) {
                    number = number + integerNo(no) + integerNo(no);
                    no = "";
                    Doub = false;
                }
                else if(triple) {
                    number = number + integerNo(no) + integerNo(no) + integerNo(no);
                    no = "";
                    triple = false;
                }
                else {
                    number = number + integerNo(no);
                    no = "";
                }
            }
            else {
                no += wordNo.charAt(i);
            }
        }

        if(Doub)
            number = number + integerNo(no) + integerNo(no);
        else if(triple)
            number = number + integerNo(no) + integerNo(no) + integerNo(no);
        else 
            number = number + integerNo(no);

        return number;
    }
    public static void main(String[] args) {
        // String phoneNo = "two one nine six eight one six four six zero";
        // String phoneNo = "five one zero two four eight zero double three two";
        // String phoneNo = "five one zero six triple eight nine six four";
        String phoneNo = "five eight double two double two four eight five six";
        System.out.println(getPhoneNo(phoneNo));
    }
}