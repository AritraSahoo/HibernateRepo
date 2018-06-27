package com.hibernate.aritra;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleId(1);
		vehicle.setVehicleName("Vehicle");
		TwoWheeler twoWheeler = new TwoWheeler();
		FourWheeler fourWheeler = new FourWheeler();
		twoWheeler.setVehicleId(2);
		twoWheeler.setVehicleName("Bike");
		twoWheeler.setSteeringWheel("SteeringWheel");
		fourWheeler.setVehicleId(3);
		fourWheeler.setVehicleName("BMW");
		fourWheeler.setRoundWheel("roundWheel");

		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(vehicle);
		session.save(fourWheeler);
		session.save(twoWheeler);
		session.getTransaction().commit();
		session.close();

	}

}
