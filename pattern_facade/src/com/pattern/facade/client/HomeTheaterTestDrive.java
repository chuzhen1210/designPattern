package com.pattern.facade.client;

import com.pattern.facade.impl.Amplifier;
import com.pattern.facade.impl.CdPlayer;
import com.pattern.facade.impl.DvdPlayer;
import com.pattern.facade.impl.HomeTheaterFacade;
import com.pattern.facade.impl.PopcornPopper;
import com.pattern.facade.impl.Projector;
import com.pattern.facade.impl.Screen;
import com.pattern.facade.impl.TheaterLights;
import com.pattern.facade.impl.Tuner;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner();
		DvdPlayer dvd = new DvdPlayer();
		CdPlayer cd = new CdPlayer();
		Projector projector = new Projector();
		TheaterLights lights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper popper = new PopcornPopper();
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}
}
