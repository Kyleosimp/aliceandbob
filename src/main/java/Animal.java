public class Animal {
//    private String food;
//
//    public String getFood() {
//        return food;
//    }
//
//    public void setFood(String food) {
//        this.food = food;
//    }

    public void makeNoise(){
        System.out.println();
    }
}
class Cat extends Animal{
    public void makeNoise(){
        System.out.println("Meow");
    }
}
class Dog extends Animal{
    public void makeNoise(){
        System.out.println("Bark");
    }


    public static void main(String[] args) {
        Animal a = new Dog();
        Animal c = new Cat();
        a.makeNoise();
        c.makeNoise();
    }
}


