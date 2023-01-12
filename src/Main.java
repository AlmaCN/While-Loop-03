public class Main {

    public static void main(String[] args) {

        /**
        Per creare un while loop con i primi 10 numeri dei numeri di Fibonacci
        ho creato tre variabili.
        n = che sono i 10 numeri che vorro stampare
        firstTerm = che sara il primo numero del loop
        secondTerm = che sara il secondo numero del loop
         */
        int n = 10;
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        /**
        Ho poi creato il while loop affinche mi stampasse il primo numero
        e poi di seguito ho creato il resto dei numeri.
        nextTerm = che sara uguale alla somma del firstTerm e del secondTerm
        firstTerm = che sara uguale a secondoTerm
        secondTerm = che sara uguale a nextTerm
         */
        int i = 1;
        while(i <= n){
            System.out.println(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            i++;
        }
    }
}