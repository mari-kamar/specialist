
import java.util.List;
import java.util.ArrayList;

public class Switcher {
	
	private List<ElectricityListener> listeners = 
			new ArrayList<ElectricityListener>();
	
	public void addElectricityListener(ElectricityListener l) {
		listeners.add(l);
	}
	public void removeElectricityListener(ElectricityListener l) {
		listeners.remove(l);
	}
	
	
	public void switchOn() {
		System.out.println("Выключатель включен");
		// генерация события
		for(ElectricityListener l : listeners)
			l.electricity(this);
		
	}

}
