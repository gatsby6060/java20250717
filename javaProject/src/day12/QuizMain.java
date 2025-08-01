package day12;

public class QuizMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.makeSound();
		
		Cat cat = new Cat();
		cat.makeSound();
		
		TV tv = new TV("tv");
		tv.turnOn();
		
		Computer com = new Computer("컴터");
		com.turnOff();
		
	}

}
