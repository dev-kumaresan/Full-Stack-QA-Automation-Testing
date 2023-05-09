package task.types;

public class ParameterMethod {

	public void sampleDetail(String name, int age, float percentage, double mark, long aadhar, char gender) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(percentage);
		System.out.println(mark);
		System.out.println(aadhar);
		System.out.println(gender);
	}

	public void testTypes(byte batch_no, short ref_no, boolean P) {
		System.out.println(batch_no);
		System.out.println(ref_no);
		System.out.println(P);
	}

	public static void main(String[] args) {

		ParameterMethod PM = new ParameterMethod();
		PM.sampleDetail("Kumaresan", 24, 69.43f, 23.456, 111111111111l, 'M');
		ParameterMethod PA = new ParameterMethod();
		PA.testTypes((byte) 43, (short) 2, true);

	}

}
