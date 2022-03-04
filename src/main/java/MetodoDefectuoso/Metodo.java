package MetodoDefectuoso;

public class Metodo {

    public static void main(String[] args) {
         int [] Matriz1 = new int [10];
         
         for (int i = 0; i < Matriz1.length; i++) {
            Matriz1[i]= (int)(Math.random() * 101);
        }
         
         menoraMayor(Matriz1);
         
          for (int elemento: Matriz1) {
            System.out.println(elemento);
        }
    }

    public static void menoraMayor(int[] Matriz1) {
        int ValorMasPequeño = 0;
        //Un metodo que acomoda los valores de un Array de mayor a menor
        for (int i = 0; i < Matriz1.length - 1; i++) {
            for ( int j = 0; j < Matriz1.length - i - 1; j++) {
                //un if que compara si el valor de la posicion de adelante es menor a la posicion del array actual.
                if (Matriz1[j + 1] < Matriz1[j]) {
                    ValorMasPequeño = Matriz1[j + 1];
                    //se guarda el valor menor en la variable ValorMasPequeño
                    Matriz1[j + 1] = Matriz1[j];
                    //se actualiza el valor de la posicion siguiente con el valor mas alto
                    Matriz1[j] = ValorMasPequeño;
                    //y se guarda el valor mas bajo en la posicion actual. 
                }
                
            }
        }
    }
}
