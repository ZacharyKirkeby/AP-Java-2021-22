package objectIntro;

public class ObjectPractice {

	public static void main(String[] args) {
		Point bob = new Point();
		Point joe = new Point(4,7);
		double d = bob.distance(joe);
		System.out.println(joe);
		joe.flip();
		System.out.println(joe);

	}

}
