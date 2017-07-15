
public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		h.regulateTempreture();
		h.StartSleeping();
		h.GoToWork();
		Boolean sleeping = h.isSleeping();
		if(sleeping) {
			System.out.println("the human is sleeping");
		}
	}

}
