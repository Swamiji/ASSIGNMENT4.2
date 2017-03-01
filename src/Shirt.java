
public class Shirt {
private int ShirtCollorSize;
private int ShirtSleeveLength;
private String ShirtMaterial;
Shirt()
{
	
}
Shirt(int CollorSize,int SleeveLength,String Material)
{
	ShirtCollorSize=CollorSize;
	ShirtSleeveLength=SleeveLength;
	Material=ShirtMaterial;
}
public int getCollorSize()
{
	return ShirtCollorSize;
}
public int getSleeveLength()
{
	return ShirtSleeveLength;
}
public String getMaterial()
{
	return ShirtMaterial;
}
public void setCollorSize(int newvalue)
{
	ShirtCollorSize=newvalue;
}
public void setSleeveLength(int newvalue)
{
	ShirtSleeveLength=newvalue;
}
public void setMaterial(String newvalue)
{
	ShirtMaterial=newvalue;
}
public String toString()
{
	return "Shirt Collor Size is:" +getCollorSize()+"inch"+"Shirt Sleeve Length is:" +getSleeveLength() +"inch"+"Shirt Material is :"+getMaterial();
}


		

}
