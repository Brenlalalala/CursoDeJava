package Ejercicio6;
//Usando la API de JAVA con Math


public class Ejercicio6 {

        public static void main(String[] args){

            double x = Math.sin(0.523599); /*El método Math. sin()/ cos() / tan () devuelven un valor numérico entre -1 y 1,
             que representa el seno/coseno y tangente del ángulo dado en radianes.
             Debido a que sin() cos() y tan() es un método estático de Math ,
             siempre se usa como Math.sin() , en vez de crear un objeto Math
             y usarlo como un método ( Math no es un constructor).*/

            double x1 = Math.cos(0.523599);
            double x2 = Math.tan(0.523599);
            double x3 = Math.atan(30);// devuelve la arcotangente (en radianes) de un número
            double x4 = Math.atan2(90, 16);//retorna la arcotangente del cociente de los argumentos. Math.atan2(y, x)

            double x5 = Math.exp(5);//devuelve el numero e
            double x6 = Math.log(4);/*devuelve el logaritmo natural o neperiano de x.
             Si se añade el segundo parámetro, base, la función math. log
             devuelve el logaritmo de x en la base indicada. x: Número del que calcular el logaritmo*/

            System.out.println("Seno del angulo 30 grados en radian = 0.523599: " +x);
            System.out.println("Coseno del angulo 30 grados en radian: " +x1);
            System.out.println("Tangente angulo 30 grados en radian: " +x2);
            System.out.println("Arcotangente en radianes del angulo 30: " +x3);
            System.out.println("Arcotangente del cociente de 90 y 16: "  +x4);
            System.out.println("El numero e elavado a la 5: " +x5);
            System.out.println("Logaritmo del numero 4: " +x6);


            //Las dos constantes PI y e
            System.out.println("PI es igual a: " + Math.PI);
            System.out.println("e es igual a: " + Math.E);

        }
    }

