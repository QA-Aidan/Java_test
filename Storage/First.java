package Storage;

public class First {
    private String name = "Sauron";
    public String get_name() {return name;}
    
    
    public static void main(String[] args){
        int age = 1500;
        char ring = 'o';
        long c = 60000;
        float d = 0.01f;

    	First first = new First();
        
        System.out.println(first.get_name().toUpperCase()+ " is = " + age + " years old, he is searching for the one ring " 
        + ring + ", he has an army of " + c + " orcs & goblins and is " + d + "% popular (not very)!");
    }
}

