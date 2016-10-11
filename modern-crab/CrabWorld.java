import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
    public final int TIEMPO_NIVEL = 15;
    private Counter contGusanos;
    private Counter contVidas;
    private Crab cangrejo;
    private Lobster langosta;
    private Counter contTiempo;
    private SimpleTimer reloj;
    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        contGusanos = new Counter("Gusanos: ");
        addObject(contGusanos,64,20);
        contVidas = new Counter("Vidas: ");
        addObject(contVidas,176,20);
        contTiempo = new Counter("Tiempo: ");
        addObject(contTiempo,290,20);
        prepare();
        contTiempo.setValue(TIEMPO_NIVEL );
        reloj = new SimpleTimer();
    }
    public void started()
    {
        reloj.mark();
     System.out.println("boton run presionado");
    }
    public void atapped()
    {
        System.out.println("boton pause presionado");
    }
    public void act()
    {
        if(reloj.millisElapsed() > 1000){
        contTiempo.add(-1);
        reloj.mark();
        }
        //contGusanos.act();
    }
    public void incrementaGusanos()
    {
        contGusanos.add(1);
    }
    public void decremVidas()
    {
        contVidas.add(-1);   
    }
    public void cangrejoAtrapado()
    {
        decremVidas();
        langosta.setLocation(20,30);
        cangrejo.setLocation(14,211);
        if(contVidas.getValue()==0){
        Label etiquetafin = new Label("game over",30);
        addObject(etiquetafin,250,250);
        Greenfoot.stop();
        }
        
    }
     public void reiniciarPosCangrejo()
     {
      //cangrejo.setLocation();    
     }
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab, 465, 268);
        Worm worm = new Worm();
        addObject(worm, 95, 190);
        Worm worm2 = new Worm();
        addObject(worm2, 83, 299);
        Worm worm3 = new Worm();
        addObject(worm3, 116, 398);
        Worm worm4 = new Worm();
        addObject(worm4, 297, 406);
        Worm worm5 = new Worm();
        addObject(worm5, 403, 404);
        Worm worm6 = new Worm();
        addObject(worm6, 406, 170);
        Worm worm7 = new Worm();
        addObject(worm7, 278, 278);
        Worm worm8 = new Worm();
        addObject(worm8, 278, 278);
        Worm worm9 = new Worm();
        addObject(worm9, 260, 139);
        Worm worm10 = new Worm();
        addObject(worm10, 495, 61);
        Worm worm11 = new Worm();
        addObject(worm11, 512, 444);
        Worm worm12 = new Worm();
        addObject(worm12, 229, 487);
        Lobster lobster = new Lobster();
        addObject(lobster, 191, 142);
    }
}
