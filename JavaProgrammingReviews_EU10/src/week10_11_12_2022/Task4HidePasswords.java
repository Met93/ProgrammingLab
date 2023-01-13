package week10_11_12_2022;

public class Task4HidePasswords {
    /*
     Hide Passwords

                    Given an array of passwords (String). Hide each password as a star (*) and show the hidden password

                    Ex:

                    Input:
                    {"one", "hi", "hold}

                    Output:
                    [ ***, **, **** ]
     */
    public static void main(String[] args) {
        String []array={"one","hi","hold"};
        String[]result=hidePassword(array);

    }

    public static String[] hidePassword(String[] array) {
        String[]results=new String[array.length];
        int index=0;
        //I need to get each element
        for (String s : array) {
            //convert letter to stars
            String result=convertLetterToStar(s);
            results[index++]=result;

        }
        return results;
        //this method will get the string it will convert into the stars
    }

    public static String convertLetterToStar(String s) {
        String temp="";
        for (int i = 0; i < s.length(); i++) {
            temp+="*";
        }
        return temp;
    }
}
