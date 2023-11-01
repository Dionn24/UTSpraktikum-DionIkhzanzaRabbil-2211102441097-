import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class trap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class trap extends Actor
{
    /**
     * Act - do whatever the trap wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void addedToWorld(World Latar)
    {
        setImage(10);
    }
    
    private void setImage(int d)
    {
        GreenfootImage img = this.getImage();
        img.scale(30,30);
        this.setImage(img);
    }
}
