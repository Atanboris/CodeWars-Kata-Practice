public class getXO {

    public static boolean getXO(String str){

        char[] strArray = str.toCharArray();
        int xAmount = 0;
        int oAmount = 0;

        for(char letter: strArray){
            if(Character.toUpperCase(letter) == 'X' ){
                xAmount ++;
            }else if(Character.toUpperCase(letter) == 'O'){
                oAmount ++;
            }
        }
        return xAmount == oAmount;
    }
}
