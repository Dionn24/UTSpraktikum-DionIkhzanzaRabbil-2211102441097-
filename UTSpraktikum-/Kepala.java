import greenfoot.*;

public class Kepala extends Ular
{    
    public void addUlar()
    {
        
    }
    
    public void act() 
    {
        Actor actor=getOneIntersectingObject(Ular.class);
        if(actor!=null){
            getWorld().addObject(new gameover(),(int)(0.5*getWorld().getWidth()),(int)(0.5*getWorld().getHeight()));
            ((MyWorld)getWorld()).GAMEOVER=true;
            return;
        }
        
        actor=getOneIntersectingObject(food.class);
        if(actor!=null){
            getWorld().removeObject(actor);
            ((MyWorld)getWorld()).setScore(5);
            Ular.ADDEKOR=true;
            ((MyWorld)getWorld()).addMakanan();
        }
        
        actor=getOneIntersectingObject(trap.class);
        if(actor!=null){
            getWorld().removeObject(actor);
            ((MyWorld)getWorld()).setScore(-3);
            Ular.ADDEKOR=false;
            ((MyWorld)getWorld()).addtrap();
        }
        
        if(Greenfoot.isKeyDown("up") && arahy!=1){
            arahx=0;
            arahy=-1;
        }else if(Greenfoot.isKeyDown("down") && arahy!=-1){
            arahx=0;
            arahy=1;
        }else if(Greenfoot.isKeyDown("right") && arahx!=-1){
            arahx=1;
            arahy=0;
        }else if(Greenfoot.isKeyDown("left") && arahx!=1){
            arahx=-1;
            arahy=0;
        }
        
        if(isAtEdge()){
            getWorld().addObject(new gameover(),(int)(0.5*getWorld().getWidth()),(int)(0.5*getWorld().getHeight()));
            ((MyWorld)getWorld()).GAMEOVER=true;
            return;
        }
        super.act();
    }    
}
