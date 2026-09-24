public class Zoo{

    public static void main(String[] args){
        //create an elephant instance using the default constructor
        Elephant elephant1 = new Elephant();
        System.out.println(elephant1.name);

        Elephant elephant2 = new Elephant(4000, true, "Little Gary");
        System.out.println(elephant2.name);
        System.out.println(elephant2.weight);
        System.out.println(elephant2.hasTusks);
    }
}