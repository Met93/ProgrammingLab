package Day16_ForLoopAndStringPractice;

public class SdigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str="Cydeo12345School!@#$%WoodenSpoon";
        //12345
        //CydeoWoodenSpoon
        //!@#$%
        String digits="",
                Letters="",
                SpecialChar="";
        for (int i = 0; i <=str.length()-1 ; i++) {
            char ch=str.charAt(i);
            if(ch>='0'&&ch<='9'){
                digits+=ch;
            } else if (ch>='a'&&ch<='z') {
               Letters+=ch;
            } else if (ch>='A'&&ch<='Z') {
                Letters+=ch;
            }else {
                SpecialChar+=ch;
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("Letters = " + Letters);
        System.out.println("SpecialChar = " + SpecialChar);
    }
}
