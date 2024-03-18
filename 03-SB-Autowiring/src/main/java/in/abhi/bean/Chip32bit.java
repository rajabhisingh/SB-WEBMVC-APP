package in.abhi.bean;

import org.springframework.stereotype.Component;

@Component("chip32")
public class Chip32bit implements IChip {

	public Chip32bit() {
		System.out.println("Chip32bit :: constractor");
	}
	@Override
	public boolean process() {
		System.out.println("32bit processing start...");
		return true;
	}

}
