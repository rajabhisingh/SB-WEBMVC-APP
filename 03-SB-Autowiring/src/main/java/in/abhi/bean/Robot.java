package in.abhi.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Robot {
	 public Robot() {
		 System.out.println("Robot :: constractor");
	}
	 @Autowired
	// @Qualifier("chip32")
	private IChip chip;
	

	public void doWork() {
		System.out.println("Injected:" +chip.getClass().getName());
		boolean status = chip.process();
		if(status) {
			System.out.println("Robot is working...");
		}else {
			System.out.println("Robot is having fault...");
		}
	}

}
