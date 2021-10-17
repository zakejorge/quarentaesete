public class Hanoi47 {
    public class variavelglobal {
        public static int counter = 0;

    }

    public static void Hanoi3(int discos, int discosinicio, int discosfim, String origem, String destino, String auxiliar) {

        if (discos == 1) {
            System.out.println("disco " + (discosinicio + 1) + " para " + destino);
            variavelglobal.counter++;
            return;
        }
        Hanoi3(discos - 1, discosinicio, discosfim - 1, origem, auxiliar, destino);
        System.out.println("disco" + discosfim + " da " + origem + " para a " + destino);
        variavelglobal.counter++;
        Hanoi3(discos - 1, discosinicio, discosfim - 1, auxiliar, destino, origem);

    }

    public static void main(String[] args) {

        double N = Integer.parseInt(args[0]);
        int n = (int) N;
        int r = 0;

        int[] boas = new int[10];
        boas[0] = 1;
        boas[1] = 3;
        boas[2] = 6;
        boas[3] = 10;
        boas[4] = 15;
        boas[5] = 21;
        boas[6] = 28;
        boas[7] = 36;
        boas[8] = 45;
        boas[9] = 55;
        for (int i = 1; i < 10; i++) {
            if (n == boas[i]) {
                r = boas[i - 1];
            }
            if (n > boas[i - 1] && n < boas[i]) {
                r = boas[i - 1];
            }
        }//da muito pra fazer com raiz quadrada né. n+1 é n+1*n/2, que é quase n^2/2. azar.
        //                                          2

        System.out.println(r);
        System.out.println(n);

        String Torre0 = "Torre0";
        String Torre1 = "Torre1";
        String Torre2 = "Torre2";
        String Torre3 = "Torre3";
        Hanoi3(r, 0, r, Torre0, Torre3, Torre2);
        Hanoi3(n - r, r, n, Torre0, Torre1, Torre2);
        Hanoi3(r, 0, r, Torre3, Torre1, Torre2);

        System.out.println(variavelglobal.counter);


    }
}
