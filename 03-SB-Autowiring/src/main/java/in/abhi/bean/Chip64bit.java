package in.abhi.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("chip64")
@Primary 
public class Chip64bit implements IChip {

	public Chip64bit() {
		System.out.println("Chip64bit :: constractor");
	}
	@Override
	public boolean process() {
		System.out.println("64bit processing start....");
		return true;
	}

}
