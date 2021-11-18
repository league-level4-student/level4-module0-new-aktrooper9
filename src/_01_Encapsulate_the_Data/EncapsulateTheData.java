package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

    /*
     * itemsReceived cannot negative. All negative parameters should set
     * itemsReceived to 0.
     */

   private int itemsReceived;

    /*
     * degreesTurned must be locked between 0.0 and 360.0 inclusive. All
     * parameters outside this range should set degreesTurned to the nearest
     * bound.
     */

    private double degreesTurned;

    /*
     * nomenclature must not contain an empty String. An empty String parameter
     * should set nomenclature to a String with a single space.
     */

    private String nomenclature;

    /*
     * memberObj must not be a String. A String parameter should set memberObj
     * to a new Object(); Hint: Use the instanceof operator.
     */

    private Object memberObj;

	public void setItemsReceived(int randomPositiveNum) {
		// TODO Auto-generated method stub
		if(0>=randomPositiveNum) {
			randomPositiveNum=0;
		}
		itemsReceived=randomPositiveNum;
	}

	public Integer getItemsReceived() {
		// TODO Auto-generated method stub
		return itemsReceived;
	}

	public void setDegreesTurned(double randomPositiveNum) {
		// TODO Auto-generated method stub
		if(randomPositiveNum>360) {
			randomPositiveNum= randomPositiveNum-360;
		}
		else if(randomPositiveNum<0) {
			randomPositiveNum= randomPositiveNum+360;
		}
		degreesTurned=randomPositiveNum;
		}
	

	public Double getDegreesTurned() {
		// TODO Auto-generated method stub
		return degreesTurned;
	}

	public void setNomenclature(String randomString) {
		// TODO Auto-generated method stub
		if(randomString=="") {
			randomString=" ";
		}
		nomenclature=randomString;
	}

	public Object getNomenclature() {
		// TODO Auto-generated method stub
		return nomenclature;
	}

	public void setMemberObj(Object randomObject) {
		// TODO Auto-generated method stub
		if(randomObject instanceof String) {
			randomObject=new Object();
		}
		
		memberObj=randomObject;
	}

	public Object getMemberObj() {
		// TODO Auto-generated method stub
		return memberObj;
	}

}
