package Ejercicios;

public class Ejercicios_tema_9 {
    public static void main(String[] args) {
        Cliente objeto = new Cliente();
        objeto.nombre = "Azzemod";
        objeto.edad = 24;
        objeto.telefono = 58123456789L;
        objeto.credito = 0;
        
        System.out.println("Nombre:"+objeto.nombre);
        System.out.println("Edad:"+objeto.edad);
        System.out.println("telefono:+"+objeto.telefono);
        if ( objeto.credito > 0){
            System.out.println("Credito:Positivo");
        }
        else if (objeto.credito < 0){
            System.out.println("Credito:Negativo");
        }
        else {
            System.out.println("Credito:Neutro");
            

        }

        Trabajador objeto2 = new Trabajador();
        objeto2.salario = 1_000;

        System.out.println("Salario:"+objeto2.salario+"$");
            
    }

    static class Persona {
        int edad;
        String nombre;
        Long telefono;
    }

    static class Cliente extends Persona {
        int credito;
        }

    static class Trabajador extends Persona {
        int salario; 
    }
    }


