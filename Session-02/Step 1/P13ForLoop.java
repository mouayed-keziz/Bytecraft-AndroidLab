//project 13

public class P13ForLoop {
    public static void main (String[] args) {

        int N = 100;
        int somme = 0;
        for (int i = 0; i < N; i++) {
            System.out.println(i);       
            somme += i;
            //somme = somme + i   
        }
        System.out.println("somme = "+somme);
    }
    
}
