
public class Main {

    public static String speak(String noise){
        return noise;
    }
    public static String name(String called){
        return called;
    }

    class Pet{

    }
    class Dogs extends Pet{
        String sfx = "Woof";
        speak(sfx);
    }
    public static void Cats(){
        String sfx = "Meow";
        speak(sfx);
    }
    public static void Rodent(){
        String sfx = "Squeak";
        speak(sfx);
    }
    public static void Fish(){
        String sfx = "Blub Blub";
        speak(sfx);
    }
    public static void Exotic(){

    }
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("How many pets do you have? ");
        //int petCount = scanner.nextInt();

        //scanner.close();
    }
}
