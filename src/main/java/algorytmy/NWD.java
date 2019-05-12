package algorytmy;

public class NWD {

    public int odejmowanie(int a,int b) {

        if (a>0 & b>0){

            while (b!=0) {

                if (a > b) {
                    a = a - b;

                } else {
                    b = b - a;
                }
            }
            return a;
        }else
            System.out.println("nieprawidlowe liczby ");
            return -1;
    }

    static public int resztaZDzielenia(int a,int b){
        while(b!=0){
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
