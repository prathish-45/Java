class Animal {
	void eat(){System.out.println("This animal eats food.");}
}

class Dog extends Animal{
	void bark(){System.out.println("Dog barks.");}
}

class Husky extends Dog {
	void showBreed(){System.out.println("Husky is a breed of dog");}
}

class Cat extends Animal{
	void meow(){System.out.println("Cat meows.");}
}

interface Pet{
	void showLove();
}

interface GuideDog {
	void assistBlind();
}

class ServiceDog extends Dog implements Pet, GuideDog {
	public void showLove(){
		System.out.println("Service Dog shows love to its owner");
	}

	public void assistBlind(){
		System.out.println("Service Dog guide blinds people");
	}
}

public class inheritance {
	public static void main(String[] args){
		//Single Inheritance
		Dog dog = new Dog();
		dog.eat();
		dog.bark();

		//Multilevel Inheritance
		Husky husky = new Husky();
		husky.eat();
		husky.bark();
		husky.showBreed();

		//Hierarchical Inheritance
		Cat cat = new Cat();
		cat.eat();
		cat.meow();

		ServiceDog serviceDog = new ServiceDog();
		serviceDog.showLove();
		serviceDog.bark();
		serviceDog.eat();
		serviceDog.bark();
	}
}


