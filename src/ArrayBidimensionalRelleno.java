public class ArrayBidimensionalRelleno {

    // Crear un array 8x8 de enteros.
    // En cada fila, todas las columnas tendrán el valor de la fila ( 0 0 0 / 1 1 1 / 2 2 2)
    private int [][] myArrayDeInt;

    public ArrayBidimensionalRelleno(int filas,int columnas){
        myArrayDeInt=new int[filas][columnas];
    }

    public void rellenar(){
        for (int i = 0; i < myArrayDeInt.length; i++) {
            for (int j = 0; j < myArrayDeInt[i].length; j++) {
                myArrayDeInt[i][j]=i;
            }
        }
    }

    public void draw(){
        for (int i = 0; i < myArrayDeInt.length; i++) {
            for (int j = 0; j < myArrayDeInt[i].length; j++) {
                System.out.print(myArrayDeInt[i][j]);
            }
            System.out.println();
        }
    }


}
