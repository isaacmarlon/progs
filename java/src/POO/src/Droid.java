/*
 * This program is like little robot that you
 * can create and do cool somethings.
 *
 * @author isaacmsl;
 *
 */
public class Droid {
  
  private int batteryLevel;
  private String name;
  
  
  
  
  
  public Droid() {   
    
  	batteryLevel = 100; 
    name = "Droid";
    
  }
  
  
  public String toString() {
	
	  return "Droid cool robot!";
  
  }
  
  
  
  
  
  public void setName(String input) {
	  
	  System.out.printf("I'm %s! :)\n\n",input);
	  this.name = input;
	  
  }
  
  
  
  
  
  private void statusBattery() { 
    
    System.out.printf("%s's Battery level is: %d%s\n\n",this.name,this.batteryLevel,"%");
    
  }
  
  
  
  
  
  public void decreaseBattery(int percent) {
    
   	this.batteryLevel -= percent;
    
  }
  
  
  
  
  
  public void activate() {
    
    System.out.printf("Activated.\nHow can I help you?\n");
    
    this.decreaseBattery(5);
    this.statusBattery();
    
  }
  
  
  
  
 
  public void chargeBattery(int hours) {
 
    if ((this.batteryLevel != 100) && (hours > 0)) {
      
      System.out.printf("%s charging for %d hours...\n",this.name,hours);

      int charge = 5 * hours;
      charge += this.batteryLevel;

      if (charge > 100) {
        this.batteryLevel = 100;
      } else {
        this.batteryLevel = charge;
      }
      
      System.out.printf("%s has been successfully charged!\n",this.name);
      
      this.statusBattery();
      
    } else if (hours > 0) {
      
      System.err.printf("%s is already full!\n\n",this.name);
    
    } 
  }  
  
  
  
  
  
  public void hover(int feet) {
    
    if (feet > 2) {
      System.err.printf("%s cannot hover above 2 feet ;-;\n",this.name);
    }
    else {
      
      System.out.println("Hovering...");
      
      this.decreaseBattery(20);
      
      this.statusBattery();
      
    }
    
  }
  
  
  
  
  
  public static void main(String[] args) {
    
    Droid mike = new Droid();
    
    mike.setName("Mike");
    mike.activate();
    mike.chargeBattery(5);
    mike.hover(1);
    
    System.out.println(mike);
    
  }
  
}