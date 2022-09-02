package Main_Company;

import Prtner_Company.Class3;

public class main {
	public static void main(String[] args) {
	Class1 obj01 = new Class1();
	Class3 obj02 = new Class3();
	
	
	
	obj01.setValve(1000);
	obj01.setSpark_plug(2000);
	obj01.setpiston(3000);
	obj02.setcylinder(4000);
	obj02.setcrank(5000);
	obj01.setcombustion_chamber(6000);
	
	
	
	System.out.println("Valve :"+ obj01.getValve());
	System.out.println("Spark_plug :"+ obj01.getSpark_plug());
	//System.out.println("piston :"+ obj01.getpiston());
	System.out.println("Cylinder :"+ obj02.getcylinder());
	System.out.println("crank :"+ obj02.getcrank());
	System.out.println("Combustion_Chamber :"+ obj01.getcombustion_chamber());
	
}	

}
