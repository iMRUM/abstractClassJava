public abstract class Animal {
    private int legs;
    Food food;
    //String name;
    public Animal(int l, Food f) {
        legs = l;
        food = new Food(f);
    }

    public int getLegs() {
        return legs;
    }

    public String getFoodSource() {
        return food.getSource();
    }
    public double getFoodQuantity() {
        return food.getQuantity();
    }


    public abstract void makeSound();
}
class Bird extends Animal{
    int wings = 2;
    public Bird(){
        super(2, new Food("grains", 33.5));
    }
    @Override
    public void makeSound(){
        System.out.println("twit");
    }
    public void fly(){
        System.out.println("fly");
    }
}
class StrayCat extends Animal{
    private String name;
    public StrayCat(String n){
        super(4, new Food("fish", 5.5));
        this.name=n;
    }
    @Override
    public void makeSound(){
        System.out.println("meow");
    }
    public void sneak(){
        System.out.println("sneak");
    }

    public String getName() {
        return name;
    }
}
class Dog extends Animal{

    private String owner;
    private String name;
    public Dog(String n, String o){
        super(4, new Food("bonzo", 7.5));
        this.owner = o;
        this.name = n;
    }
    @Override
    public void makeSound(){
        System.out.println("haw");
    }
    public void play(){
        System.out.println("play");
    }
    public String getOwner() {
        return owner;
    }

    public void printOwner(){
        System.out.println(getOwner());
    }
}
class Food {
    private double quantity;
    private String source;

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


    public Food(String s, double q) {
        this.quantity = q;
        this.source = s;
    }

    public Food(Food food) {
        this.quantity= food.getQuantity();
        this.source = food.getSource();
    }
}

