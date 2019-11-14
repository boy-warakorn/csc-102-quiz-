import javax.sound.sampled.SourceDataLine;

public class check{
    public static void main(String[] args) {
        human a1 = new human(100,"PAINT");
        human a2 = new human(100,"GUS");
        a1.attack(a2);
        a1.attack(a2);
        a1.attack(a2);
        a1.attack(a2);
        a1.attack(a2);
        a1.attack(a2);
        a1.attack(a2);
        a1.attack(a2);

        a1.attack(a2);a1.attack(a2);a1.sleep();
        a1.attack(a2);
        a2.attack(a1);
     
      
    }
}
class human{
    private static int avianNumber;
    private int health;
    private String name;
    private int age;
    private int energy;
    public human(int health,String name){
       this.health = health;
       this.name = name;
       this.age = 1;
       this.energy = 100;
    }
    public void growth(){
        this.age += 1 ;
        this.energy -= 10;
        System.out.println("Age now is "+this.age);
        System.out.println("Energy is reduce to "+this.energy);
    }
    public void sleep(){
        if(this.energy >= 90){
            this.energy = 100;
            System.out.println("Energy is full now");
        }else{
            this.energy += 10;
            System.out.println("Energy recover to "+this.energy);
        }
    }
    public void attack(human a){
        if(isDeath()){
            System.out.println("YOU ARE ALREADY DIED !!!");
        }else{
        if(energy < 10){
            System.out.println("required more Energy");
        }else{
            if(!a.isDeath()){
            this.energy -= 10 ;
            a.health -= 10;
            System.out.println(a.name +" got hit. Health remain "+ a.health);
            }else{
                System.out.println(a.name +" already dead");
            }
        
        }
    }
    }
    public boolean isDeath(){
        return this.health <= 0;
    }
  
    
    
}