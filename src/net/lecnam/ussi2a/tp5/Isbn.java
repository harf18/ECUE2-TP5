package net.lecnam.ussi2a.tp5;

public class Isbn {

    private Isbn(){
    }

    public static boolean estValide(String isbn){
        int tot = 0;
        for (int i = 0; i < 13; i++){
            if (i%2 == 0){
                tot += Integer.parseInt(isbn.substring(i, i+1)) * 1;
            } else {
                tot += Integer.parseInt(isbn.substring(i, i+1)) * 3;
            }
        }
        if (tot%10==0){
            return true;
        }
        return false;
    }

}
