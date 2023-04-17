import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Schachbrett here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Schachbrett extends World
{
    /**
     * Constructor for objects of class Schachbrett.
     * 
     */
    public Schachbrett()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(8 , 8 , 79); 
    
        Bauer b1 = new Bauer();
        this.addObject(b1 , 0 , 6);
        Bauer b2 = new Bauer();
        this.addObject(b2 , 1 , 6);
        Bauer b3 = new Bauer();
        this.addObject(b3 , 2 , 6);
        Bauer b4 = new Bauer();
        this.addObject(b4 , 3 , 6);
        Bauer b5 = new Bauer();
        this.addObject(b5 , 4 , 6);
        Bauer b6 = new Bauer();
        this.addObject(b6 , 5 , 6);
        Bauer b7 = new Bauer();
        this.addObject(b7 , 6 , 6);
        Bauer b8 = new Bauer();
        this.addObject(b8 , 7 , 6);
        
        Koenig k1 = new Koenig();
        this.addObject(k1 , 3 , 7);
        
        Queen q1 = new Queen();
        this.addObject(q1 , 4 , 7);
        
        Turm t1 = new Turm();
        this.addObject(t1 , 7 , 7);
        Turm t2 = new Turm();
        this.addObject(t2 , 0 , 7);
        
        Laeufer l1 = new Laeufer();
        this.addObject(l1 , 5 , 7);
        Laeufer l2 = new Laeufer();
        this.addObject(l2 , 2 , 7);
        
        Springer s1 = new Springer();
        this.addObject(s1 , 1 , 7);
        Springer s2 = new Springer();
        this.addObject(s2 , 6 , 7);
        
        
        BauerS b9 = new BauerS();
        this.addObject(b9 , 0 , 1);
        BauerS b10 = new BauerS();
        this.addObject(b10 , 1 , 1);
        BauerS b11 = new BauerS();
        this.addObject(b11 , 2 , 1);
        BauerS b12 = new BauerS();
        this.addObject(b12 , 3 , 1);
        BauerS b13 = new BauerS();
        this.addObject(b13 , 4 , 1);
        BauerS b14 = new BauerS();
        this.addObject(b14 , 5 , 1);
        BauerS b15 = new BauerS();
        this.addObject(b15 , 6 , 1);
        BauerS b16 = new BauerS();
        this.addObject(b16 , 7 , 1);
        
        
        KoenigS k2 = new KoenigS();
        this.addObject(k2 , 3 , 0);
        
        QueenS q2 = new QueenS();
        this.addObject(q2 , 4 , 0);
        
        TurmS t3 = new TurmS();
        this.addObject(t3 , 7 , 0);
        TurmS t4 = new TurmS();
        this.addObject(t4 , 0 , 0);
        
        LaeuferS l3 = new LaeuferS();
        this.addObject(l3 , 5 , 0);
        LaeuferS l4 = new LaeuferS();
        this.addObject(l4 , 2 , 0);
        
        SpringerS s3 = new SpringerS();
        this.addObject(s3 , 1 , 0);
        SpringerS s4 = new SpringerS();
        this.addObject(s4 , 6 , 0);
    }
}
