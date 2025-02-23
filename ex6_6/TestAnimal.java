package ex6_6;

public class TestAnimal {
	   public static void main(String[] args) {
	      // Using the subclasses
	      Cat cat1 = new Cat("Miu");
	      cat1.greets();
	      Dog dog1 = new Dog("Ly");
	      dog1.greets();
	      BigDog bigDog1 = new BigDog("Bun");
	      bigDog1.greets();
	       
	      // Using Polymorphism
	      Animal animal1 = new Cat("Miu tu");
	      animal1.greets();
	      Animal animal2 = new Dog("Ly tu");
	      animal2.greets();
	      Animal animal3 = new BigDog("Bun tu");
	      animal3.greets();
	      //Animal animal4 = new Animal("Pikachu");
	      
	      // Downcast
	      Dog dog2 = (Dog)animal2;
	      BigDog bigDog2 = (BigDog)animal3;
	      Dog dog3 = (Dog)animal3;
	      Cat cat2 = (Cat)animal1;
	      dog2.greets(dog3);
	      dog3.greets(dog2);
	      dog2.greets(bigDog2);
	      bigDog2.greets(dog2);
	      bigDog2.greets(bigDog1);
	   }
	}