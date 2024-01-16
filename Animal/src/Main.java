public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Dog dog = new Dog("pepe", "momo");
        StrayCat cat = new StrayCat("trent");
        System.out.println("bird, quantity:"+bird.getFoodQuantity()+" source:"+bird.getFoodSource());
        bird.fly();
        bird.makeSound();
        System.out.println("dog, quantity:"+dog.getFoodQuantity()+" source:"+dog.getFoodSource());
        dog.play();
        dog.makeSound();
        System.out.println("cat, quantity:"+cat.getFoodQuantity()+" source:"+cat.getFoodSource());
        cat.sneak();
        cat.makeSound();


    }
}