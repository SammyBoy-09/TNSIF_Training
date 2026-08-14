package org.tnsif.acc.c2tc.multipleinheritance;

class SmartPhone implements Camera, MusicPlayer {
	@Override
	public void playMusic() {
		System.out.println("Playing Music 🎶");
	}

	@Override
	public void takePhoto() {
		System.out.println("Clicking a Photo 📸");
	}
}

public class MultipleInterfaceDemo {

	public static void main(String[] args) {
		SmartPhone obj = new SmartPhone();
		obj.takePhoto();
		obj.playMusic();
	}
} 	