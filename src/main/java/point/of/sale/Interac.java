package point.of.sale;

import java.util.ArrayList;

public class Interac {

	int channel;
	public Interac(int channel) {
		this.channel = channel; 
	}

	public void pay(ArrayList<String> items) {
		for (String item : items) {
			System.out.printf("Call to interac payment made on channel %d for %s",
					channel, item);
		}


	}

} 