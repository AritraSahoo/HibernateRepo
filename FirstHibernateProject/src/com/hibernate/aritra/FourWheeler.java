package com.hibernate.aritra;

import javax.persistence.Entity;

@Entity

public class FourWheeler extends Vehicle {
private String roundWheel;

public String getRoundWheel() {
	return roundWheel;
}

public void setRoundWheel(String roundWheel) {
	this.roundWheel = roundWheel;
}

}
