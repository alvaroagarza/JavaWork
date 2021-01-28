package com.tts;

public class Main {

    public static void main(String[] args) {
	Pet ruby = new Pet();
	ruby.setAge(8);
	ruby.setName("Ruby");

	Car tacoma = new Car("Automatic", 2016);
	    tacoma.setEngineType("I4");

        System.out.println(ruby.getName() + " " + ruby.getAge());
        tacoma.setTransmission("Manual");
        System.out.println(tacoma.hasManual());

    }
}
