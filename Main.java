/* Dado un array, el método nos devuelve el índice 
del valor más alto*/

public class Main {

    public static int indexOfMax (int[] a) {
        int maxValue = a[0]; //VALOR DE REFERENCIA
        int index = 0;
        for(int i=1;i < a.length;i++){
            if(a[i] > maxValue){
                maxValue = a[i];    //LA VARIABLE ALMACENA EL VALOR MÁS ALTO CUANDO LO ENCUENTRA//
                index = i;          //LA VARIABLE i ALMACENA EL INDICE DE ESE NUEVO MAXVALUE//
                }
            }
        return index;
        }

    public static void main(String[] args) {
        int[] a = {1274747474, 43, 86, 222, 65, 876, 44, 444445};
        System.out.println(Arrays.toString(a));
        System.out.println(indexOfMax(a));
    }

}
