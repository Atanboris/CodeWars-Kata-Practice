public class isNarcissisticNumber {
    public static void main(String[] args) {
        if(isNarcissistic(1634)){
            System.out.println("Number is Narcassistic");
        }else{
            System.out.printf("Number is very generous");
        }

    }


    public static boolean isNarcissistic(int number) {
        int sum = 0;
        char[] numArray = String.valueOf(Math.abs(number)).toCharArray();
        int numLength = numArray.length;

        for (char num: numArray){
            int currentNum = Integer.parseInt(String.valueOf(num));
            sum += Math.pow(currentNum, numLength);
        }
            if (sum == number){
                return true;
            }
                return false;
    }

}