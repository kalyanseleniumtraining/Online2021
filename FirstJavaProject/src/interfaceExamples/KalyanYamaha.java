package interfaceExamples;

public class KalyanYamaha implements Yamaha {
//*******************Parent methods******************
	public void gears() {
		System.out.println(5);

	}

	public void tyres() {
		System.out.println(2);

	}

	public void color() {
		System.out.println("Black");

	}
//****************************Own methods***********************

	public void labour() {
		System.out.println("100");
	}

	public void profitPerBike() {
		System.out.println("10000 rs");
	}

}
