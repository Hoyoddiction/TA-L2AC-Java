class Animal{
    private String type = "Animal";
    void get_type(){
        System.out.println(type);
    }
    void get_population(){
        System.out.println("Sea");
    }
}
class Fish extends Animal{
    String gender;
    String name;
    String types;
    String behaviour;
    private String type = "Sea Creature";
    Fish(String names,String types, String gender,String behaviour){
        this.name = names;
        this.types = types;
        this.gender =gender;
        this.behaviour= behaviour;
    }
    void get_type(){
        System.out.println(type);
    }
    void get_info(){
        System.out.println(" My Pet " + name + " he is a " + types + " he is a " + gender + " and he is " + behaviour);
    }
    void get_population(){
        System.out.println("1 Blau");
    }
    void set_name(String Blaus){
        this.name = Blaus;
    }
}
public class Marine{
    public static void main(String[] Blau){
        Fish myFish = new Fish("Blau","Koi fish","Male","Calm");

        myFish.set_name("BlauBlau");
        myFish.get_type();
        myFish.get_info();
    }
}
