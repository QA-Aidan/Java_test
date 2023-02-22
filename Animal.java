public class Animal {
    
    /**
     * @return
     */
    public  static String iAmADog() {
        System.out.println("I am a dog");
        return "I am a dog";
    }

    public static void stuff() {
        int a = 5;
        if(a == 0){
            System.out.println("a is equal to 0");
        } else if (a == 1){
            System.out.println("a is equal to 1");
        } else if (a == 2){
            System.out.println("a is equal to 2");
        } else if (a == 3){
            System.out.println("a is equal to 3");
        } else if (a == 4){
            System.out.println("a is equal to 4");
        } else if (a == 5){
            System.out.println("a is equal to 5");
        }
        else{
            System.out.println("I have no idea what a is equal to");
        }
    }
}
