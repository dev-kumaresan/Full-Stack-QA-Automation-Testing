package org.phone;

public class InternalStorage {
	public void processorName() {
		System.out.println("Processor Name : Intel");
	}

	public void ramSize() {
		System.out.println("RAM size : 512 GB");
	}

	public static void main(String[] args) {

		InternalStorage IS = new InternalStorage();
		ExternalStorage ES = new ExternalStorage();
		ES.size();
		IS.processorName();
		IS.ramSize();
	}

}
