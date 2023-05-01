public class Matrices {


    boolean algunaFlilaYcolumSumaMas(int[][] matriz,int[]arreglo){
    if(matrizVaciaOarregloVacio(matriz, arreglo))//separado 2 funciones distintas con un or.
        return false;
    boolean filaSumaEsMayor = false;
    boolean columSumaEsMayor = false;

    int sumaArreglo = sumarArreglo(arreglo);
    for(int i = 0;i<matriz.length;i++)
        filaSumaEsMayor |= sumarFilas(matriz[i],sumaArreglo);
    for(int i = 0;i<matriz[0].length;i++)
        columSumaEsMayor |= sumarColumnas(matriz,i,sumaArreglo);
    

    return filaSumaEsMayor && columSumaEsMayor;

    }
    
    boolean sumarFilas(int[] m, int sumaArreglo) {
        int suma = 0;
        for (int i : m) 
            suma+=i;      
        return esMayor(suma, sumaArreglo);
    }
    boolean sumarColumnas(int[][] m,int c, int sumaArreglo) {
        int suma = 0;
        for(int i = 0;i<m.length;i++){
            suma+=m[i][c];
        }
        return esMayor(suma, sumaArreglo);
    }

    boolean esMayor(int i,int j){
        return i>j;
    }
    boolean ordenColumanaArreglo(int[][] matriz, int[] arreglo){
        if(largoColumnaArreglo(matriz, arreglo))
            return false;
        
        boolean ordenIgual = false; 
        for(int i = 0;i<matriz[0].length;i++){
            ordenIgual |= arregloIgualColumna(matriz,i,arreglo);
        }
        return ordenIgual;
    }

    boolean arregloIgualColumna(int[][] matriz, int c, int[] arreglo) {
        boolean columnaIgual = true;
        for(int i = 0;i<matriz.length;i++){
            columnaIgual &= esIgual(matriz[i][c],arreglo[i]);
        }

        return columnaIgual;
    }

    boolean esIgual(int i, int j) {
        return i==j;
    }

    boolean largoColumnaArreglo(int[][]m ,int a []){
        return m[0].length != a.length;
    }

    boolean algunaColumnaSuma(int[][] m,int[]a){

        if(matrizVaciaOarregloVacio(m,a))
            return false;     
        boolean algunColumnaSuma = false;
        int suma = sumarArreglo(a);
        for(int i = 0;i<m[0].length;i++)
            algunColumnaSuma |= columnaIgual(m,i,suma);
        return algunColumnaSuma;
    }

     boolean columnaIgual(int[][] m,int columna, int suma){

        int sumar = 0;
        for(int i = 0;i<m.length;i++)
            sumar+= m[i][columna];
        return sumar == suma;
    }

    int sumarArreglo(int[]a){
     int suma = 0;
     for(int i: a)
        suma+=i;  
     return suma;
   }

   int sumarDiagonal(int[][] matriz){
        if(!matrizEsCuadrada(matriz))
            return 0;  
        int cont = 0;
        int suma = 0;

        for(int i = 0; i < matriz.length;i++){
            suma+=matriz[cont][cont];
            cont++;
        }
        return suma;
   }
    boolean diagonalIgualArreglo(int[][] matriz,int[] arreglo){
        if(matrizEsCuadrada(matriz))
            return sumarArreglo(arreglo) == sumarDiagonal(matriz);     
        return false;
    } 
    boolean matrizVaciaOarregloVacio(int[][] m , int[] a){
     return m.length == 0 || a.length ==0;
   }

   boolean matrizEsCuadrada(int[][] matriz){
    return matriz[0].length ==  matriz.length;
   }

   int devolverValor(int[][] matriz ,int f, int c){
        return matriz[f][c];
   }

   boolean arregloEnFilas(int[][] matriz,int[] arreglo){
        boolean aEnFilas = true;
        for(int i = 0;i<matriz.length;i++)
            aEnFilas &= cumpleOrden(matriz[i],arreglo[i]);
        return aEnFilas;
   }

    boolean cumpleOrden(int[] fila, int v) {
        boolean hayCoincidencia = false;
        for(int i = 0;i<fila.length;i++)
            hayCoincidencia |= esIgual(fila[i], v);
        return hayCoincidencia;
    }
}
