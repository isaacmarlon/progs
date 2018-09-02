/**
 *
 * @author isaacmsl;
 *
 */

import java.util.Random;

public class DudeRobotTest {
    
    static DudeRobot robots[] = new DudeRobot[5];
    static Random random = new Random();
    
    static String[] firstNames = {"Carl","Max","Steven","Bryan","Clodis","Bebe","Tico","Gus","Walt","Jesse","Mike"};
    static String[] lastNames =  {"Musk","Richard","Andersson","Smith","Jackson","Ground","Bis","Yellow","John","Black"};
    
    public static void initialize() {
        
        for (int i = 0; i < robots.length; i++) {
            
            robots[i] = new DudeRobot();
            
        }
        
    }
    
    public static void setNames() {
        
        for (DudeRobot robot : robots) {
            
            robot.setName(firstNames[random.nextInt(firstNames.length)]);
            robot.setName(robot.getName() + " " + lastNames[random.nextInt(lastNames.length)]);
            
        }
        
    }
    
    public static void setAges(int maxAge) {    
        
        for (DudeRobot robot : robots) {
            
            robot.setAge(random.nextInt(maxAge) + 1);
            
        }
    }
    
    public static void printRobots() {
        
        for (DudeRobot robot : robots) {
            
            // Name
            System.out.println(robot.getName() + " - ");
            
            // Age
            System.out.println("Age: " + robot.getAge() + "\n");
            
            
        }
        
    }

    public static void main(String[] args) {
        
        initialize();
        
        setNames();
        
        setAges(10);
        
        printRobots();

    }

}
