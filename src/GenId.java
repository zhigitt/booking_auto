public class GenId {

    private static int counter = 1;

    public static int genId(){
        return counter++;
    }
}
