package com.pattern.facade.impl;

/**
 * 家庭影院外观
 * @author chuzhen
 *
 */
public class HomeTheaterFacade {
	
	private Amplifier amp;
	private Tuner tuner;
	private DvdPlayer dvd;
	private CdPlayer cd;
	private Projector projector;
	private TheaterLights lights;
	private Screen screen;
	private PopcornPopper popper;
	
	public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd,
			CdPlayer cd, Projector projector, TheaterLights lights,
			Screen screen, PopcornPopper popper) {
		super();
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}
	
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		popper.on();
		popper.pop();
		
		lights.dim(10);
		
		screen.down();
		
		projector.on();
		projector.wideScreenMode();
		
		amp.on();
		amp.setDvd();
		amp.setSurroundSoud();
		amp.setVolume(5);
		
		dvd.on();
		dvd.play(movie);
		
	}
	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		popper.off();
		
		lights.on();
		
		screen.up();
		
		projector.off();
		
		amp.off();
		
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
	public void listenToCd() {
		
	}
	public void endCd() {
		
	}
	public void listenToRadio() {
		
	}
	public void endRadio() {
		
	}
}
