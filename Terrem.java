import java.util.Scanner;
public class Terre {
    private static Terre laSeuleTerre = null; 
    private int age;
    private int population;
    
    private Terre(int age, int population) 
    {
    	this.age = age;
    	this.population = population;
    } 
    
    public synchronized static Terre getInstance() {
        if (laSeuleTerre == null) {
        	Scanner scanner = new Scanner(System.in);
    		System.out.println("enter age");
    		int age = scanner.nextInt();
    		System.out.println("enter population");
    		int population = scanner.nextInt();
    		scanner.close();
    		laSeuleTerre = new Terre(age, population);
    		System.out.println("La terre vient d'etre cree");
        }
        else {
        	System.out.println("Une terre existe deja");
        	}
        return laSeuleTerre; 
    } 
    
    public void getAge() {
    	System.out.println("L'age de votre Terre est: " + age);
    }
    
    public void getPopulation() {
    	System.out.println("La population de votre Terre est: " + population);
    }    
} 

