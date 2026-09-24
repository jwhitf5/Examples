public class Elephant{
    //attributes, fields, PRIVATE INSTANCES VARIABLES PIVs
    int weight;
    boolean hasTusks;
    String name;
    //CONSTRUCTORS
    //default constructor
    public Elephant() {
            //the purpose of a constructor is to initialize the
            //the values of the instance variables
            weight = 2000;
            hasTusks = false;
            name = "Dumbo";
    }
    public Elephant(int weightIN, boolean hasTusksIN, String nameIN){
        weight = weightIN;
        hasTusks = hasTusksIN;
        name = nameIN;
    }
}