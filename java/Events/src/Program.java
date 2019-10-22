
public class Program {
	
	public static void fireEnd(Object s) {
		System.out.println("Всё сгорело");
	}

	public static void main(String[] args) {
		Switcher sw = new Switcher();
		
		Lamp lamp = new Lamp();
		TvSet tv = new TvSet();
		AirCondition ac = new AirCondition();
		
		sw.addElectricityListener(lamp);
		sw.addElectricityListener(tv);
		
		
		String message = "Пожарные приехали";
		
		sw.addElectricityListener(
			new ElectricityListener() {
				public void electricity(Object s) {
					System.out.println("Пожар");
				}
			}
		);
		
		sw.addElectricityListener( s -> System.out.println(message));
		sw.addElectricityListener( s -> System.out.println(s));
		//sw.addElectricityListener(s -> ac.on(s));
		sw.addElectricityListener( ac::on );
		sw.addElectricityListener( Program::fireEnd );
		sw.addElectricityListener( ac::off);
		
		sw.switchOn();

	}

}
