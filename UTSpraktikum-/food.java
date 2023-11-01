import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class food extends Actor
{
    public void addedToWorld(World Latar)
    {
        setImage(10);
    }
    
    private void setImage(int d)
    {
        GreenfootImage img = this.getImage();
        img.scale(20,25);
        this.setImage(img);
    }
    
}
