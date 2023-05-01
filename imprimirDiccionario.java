import java.util.HashMap;
import java.util.Map;

public class imprimirDiccionario {
    public static void main(String[] args) {
      // Creamos un HashMap y lo inicializamos con la clave "clave1" y el valor "valor1"
        HashMap<String, String> map = new HashMap<>();

        map.put("clave1", "valor1");
        map.put("clave2", "valor2");
        map.put("fecha", "hora");
        map.put("messi", "GOAT");

        for(Map.Entry<String,String> entry : map.entrySet()){
            String clave = entry.getKey();
            String valor = entry.getValue();
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        } 

        // Imprimimos el HashMap después del cambio
        

     /*    HashMap<String, Integer> map = new HashMap<>();
        map.put("Uno", 1);
        map.put("Dos", 2);
        map.put("Tres", 3);

        // Recorremos el HashMap e imprimimos cada clave y valor
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String clave = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        }*/ 
    }
    

}
