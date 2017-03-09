package dron;

public class DronController {

	public static void main(String[] args) {
		
		Dron dron = new Dron();
		int boundaries [] = {10,10,10};
		dron.setBoundaries(boundaries);
		
		System.out.println(dron.getFormatedCoordinates());
		System.out.println(dron.moveUp(5));
		System.out.println(dron.moveUp(2));
		System.out.println(dron.moveUp(1));
		System.out.println(dron.moveUp(3));
		System.out.println(dron.moveUp(4));
		
		System.out.println(dron.moveDown(2));
		System.out.println(dron.moveDown(3));
		System.out.println(dron.moveDown(1));
		System.out.println(dron.moveDown(4));
		System.out.println(dron.moveDown(5));
	}
}
