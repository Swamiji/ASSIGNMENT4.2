
public class TestShirt {

	
	public static void main(String[] args) {
		Shirt Shirt1=new Shirt();
	    Shirt Shirt2=new Shirt(12,38,"Cotton");
		Shirt Shirt3=new Shirt(0,0,"NULL");
	    Shirt1.setCollorSize(10);
		Shirt1.setSleeveLength(36);
		Shirt1.setMaterial("Silk");
		System.out.println("The Shirt Collor Size is:" + Shirt1.getCollorSize() +" inch");	
		System.out.println("................................................");
		System.out.println("The Shirt Sleeve Length is:" +Shirt1.getSleeveLength() +"inch");
		System.out.println("................................................");
		System.out.println("The Shirt Material is:" +Shirt1.getMaterial() );
		System.out.println("................................................");
		System.out.println(Shirt2.toString());
		System.out.println("................................................");
		System.out.println(Shirt3.toString());
		System.out.println("................................................");
	}

	}


