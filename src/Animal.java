public class Animal {


    void makesound()
    {
        System.out.println("The animal sounds of Dog");

    }

    public static class Dog extends Animal
    {
        Animal a=new Animal();
        void makesound()
        {a.makesound();
            System.out.println("The cat qualrrels");
        }
    }
    public static void main(String Args[])
    {
      Dog d=new Dog();
      d.makesound();


    }
}
