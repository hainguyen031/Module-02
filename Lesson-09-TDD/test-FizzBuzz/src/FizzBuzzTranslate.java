public class FizzBuzzTranslate {
    private int number;
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return this.number;
    }
    public String traslate() {
        boolean div3 = this.number % 3 == 0;
        boolean div5 = this.number % 5 == 0;
        if(div3 && div5) {
            return "FizzBuzz";
        } else if (div5) {
            return "Buzz";
        } else if (div3) {
            return "Fizz";
        }
        return readNumber(number);
        }

    private static String readNumber(int number){
        int tens=number%10;
        int teens=(number-tens)/10;
        if(number<=12){
            return readDV(number);
        }else if(number<20){
            return readDV(tens)+"teen";
        }else if(number<30){
            return "Twenty"+readDV(tens);
        }else {
            return readDV(teens) +"ty"+readDV(tens);
        }
    }

    private static String readDV(int number) {
        switch (number) {
            case 0:
                return "";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            default:
                return "No error";
        }
    }
}

