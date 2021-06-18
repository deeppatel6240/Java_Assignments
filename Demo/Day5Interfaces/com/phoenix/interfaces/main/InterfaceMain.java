package com.phoenix.interfaces.main;
import com.phoenix.interfaces.Movable;
import com.phoenix.living.Animal;
import com.phoenix.living.pet.Cat;
import com.phoenix.living.wild.Tiger;
import com.phoenix.machines.HumanRobot;
import com.phoenix.machines.Robot;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.planets.Planet;
import com.phoenix.vehicles.Vehicle;
import com.phoenix.vehicles.cars.Car;

/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 16/06/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

//my pack
public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reference
		
		Planet planet;
		Animal animal;
		Vehicle vehicle;
		Robot robot;
		Movable movable;
		
		//Earth object
		System.out.println("********Earth object ********");
		planet = new Earth();
		
		//Moons
		planet.setNoOfMoons(2);
		
		//toString
		String earthStr = planet.toString();
		System.out.println(earthStr);
		
		//boolean
		if (((Earth)planet).supportLife()) {
			System.out.println("planet support life");
		} else {
			System.out.println("planet does not support life");
		}
		
		System.out.println();
		
		//Jupiter object
		System.out.println("************Jupiter object**********");
		planet = new Jupiter();
		
		//Moons
		planet.setNoOfMoons(45);
		
		//toString
		String jupiterStr = planet.toString();
		System.out.println(jupiterStr);
		
		//boolean
		if (((Jupiter) planet).supportLife()) {
			System.out.println("planet support life");
		} else {
			System.out.println("planet does not support life");
		}
		
		System.out.println();
		
		//tiger object
		
		System.out.println("***********Tiger object***********");
		animal = new Tiger();
		
		//jump
		((Tiger)animal).jump();
		
		//Move
		animal.move();
		
		//run
		((Tiger)animal).run();
		
		//walk
		((Tiger)animal).walk();
		
		System.out.println();
		
		// cat object

		System.out.println("***********Cat object***********");
		animal = new Cat();

		// jump
		((Cat)animal).jump();

		// Move
		animal.move();

		// run
		((Cat) animal).run();

		// walk
		((Cat) animal).walk();
		
		System.out.println();

		// car object

		System.out.println("***********Car object***********");
		vehicle = new Car();

		// start
		((Car) vehicle).start();

		// stop
		((Car) vehicle).stop();

		// run
		((Car) vehicle).run();

		// move
		((Car) vehicle).move();
		
		System.out.println();
		
		// human robot object
		
		System.out.println("************Human Robot object**************");
		robot = new HumanRobot();
		
		//jump
		((HumanRobot)robot).jump();
		
		//run
		((HumanRobot)robot).run();
		
		//walk
		((HumanRobot)robot).walk();		

		//move
		((HumanRobot)robot).move();		
		
		
	}

}

//end of the class
