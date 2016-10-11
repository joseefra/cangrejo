import greenfoot.*;

/**
 * Escribe una descrición de la clase Lobster aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Lobster extends Actor
{
    /**
     * Act - hace lo que Lobster quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        // Agrega tus códigos de acción aquí.
        move(4);
        if(Greenfoot.getRandomNumber(100) < 10)
        {
        turn(Greenfoot.getRandomNumber(90));
        }
        if(isTouching(Crab.class))
        {
           World mundo = getWorld();
            
          ((CrabWorld)mundo).cangrejoAtrapado();
           
        }
    }    
}
