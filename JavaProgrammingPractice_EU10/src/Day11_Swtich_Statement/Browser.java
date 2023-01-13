package Day11_Swtich_Statement;

public class Browser {
    public static void main(String[] args) {
        String browserName="firefox",
                result2="";
        boolean result=browserName=="chrome"||browserName=="firefox"||browserName=="opera"||browserName=="safari"||browserName=="edge";
        if(result){
            if(browserName=="chrome"){
                result2="Chrome is Selected";
            } else if (browserName=="firefox") {
                result2="firefox is Selected";
            } else if (browserName=="opera") {
                result2="Opera is Selected";
            } else if (browserName=="safari") {
                result2="safari is Selected";
            }else {
                result2="edge is Selected";
            }

        }else{
            result2="Invalid browser is selected";
        }
        System.out.println(result2);
    }
    }

