
package clasemiercoles04demayo;

import java.util.Stack;

/**
 *
 * @author germanriveros
 */
public class EjerciciosStacks
{
 
    public void _4()
    {
        Stack libros = new Stack();
        
        libros.push("Filosofía del budismo Zen");
        libros.push("El aroma del tiempo");
        libros.push("Psicopolítica");
        libros.push("En el enjambre");
        libros.push("La sociedad del cansancio");
        
        while(! libros.empty())
        
            System.out.println("Eliminando... " + libros.pop());
        
        if(libros.empty())
            System.out.println("La pila está vacía.");
        
        else
            System.out.println("Aún quedan elementos.");
        
    }//..
    
    public void _3()
    {
        
        Stack calificaciones = new Stack();
        
        calificaciones.push(7.0);
        calificaciones.push(6.8);
        calificaciones.push(6.5);
        calificaciones.push(7.0);
        calificaciones.push(6.7);
        
        System.out.println("Calificaciones: ");
        
        for(Object clf : calificaciones)
            System.out.println(clf);
        
        
    }//..
    
    public void _2()
    {
        
        Stack notas = new Stack();
        
        notas.push(6.8);
        notas.push(5.9);
        notas.push(6.0);
        notas.push(6.3);
        notas.push(7.0);
        
        System.out.println("Notas: ");
        
        for (int i = 0; i < notas.size(); i++) 
            
            System.out.println(notas.get(i));
        
        //------- Fin del segundo ejercicio -------\\
        
        double[] nts = new double[notas.size()];
        double sum = 0;
        
        for (int i = 0; i < notas.size(); i++) 
        { 
            nts[i] = (double) notas.get(i); //casting explícito
            sum += nts[i];
        }  
        System.out.println("El promedio es: " + (sum / notas.size()));
        
        
    }//..
    
    public void _1()
    {
        Stack juegos = new Stack();
        
        juegos.push("Snow bros");
        juegos.push("Super metroid");
        juegos.push("Killer instinct");        
        juegos.push("Shadow of the colossus");
        juegos.push("Cadillacs and Dinosaurs");
        
        System.out.println("La cantidad de elementos de la pila juegos es: "
                + juegos.size());
        
        System.out.println("El elemento que está en la cima es: " 
                +  juegos.peek());
        
        System.out.println("¿Cuál es la posición del juego Super metroid? "
                + juegos.search("Super metroid"));
        
        System.out.println("¿Está en la pila el juego Tumblepop? ");
        
        if(juegos.search("Tumblepop") == -1)
            System.out.println("El juego NO está en la pila");
                
        System.out.println("Eliminando el juego: " + juegos.pop());
        
        System.out.println("¿La pila juegos está vacía?");
        
        if(juegos.empty())
            System.out.println("Sí, está vacía");
        
        else
            System.out.println("No, no está vacía y sus elementos son: " 
                    + juegos);    
           
    }//.
    
    
}//.
