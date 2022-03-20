package tarea;

public class Main {
    public static void main(String[] args) {

        Suma suma = a -> {
            return a++;
        };

        Resta resta = (a,b) -> {
            return a-b;
        };

        //System.out.println(suma.Sumar(5, 3));

        Producto producto = (a, b) -> {
            var resultado = 0;
            for (int i = 0; i < b; i++) {
                resultado += suma.sumar(a);
            }
            return resultado;
        };

        System.out.println(producto.multiplicar(5,3));

        Division division = (a,b) -> {
            var resultado = 0;
            var valor = a;
            var inicial = resta.restar(a, b);
            if(inicial>0){
                while(valor>0){
                    valor = resta.restar(valor,b);
                    resultado++;
                }
            }
            return resultado;
        };

        System.out.println(division.dividir(16, 2));



    }
}
