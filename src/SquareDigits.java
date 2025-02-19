public class SquareDigits {



    public int squareDigits(int n) {
        String returnString = "";
        char[] numArray = String.valueOf(n).toCharArray();
        for (char num: numArray){
            int currentNum = Integer.parseInt(String.valueOf(num));
            int poweredNum = (int) Math.pow(currentNum, 2);
            returnString += poweredNum;
        }

        return Integer.parseInt(returnString);
    }
}

