package _04_Data_Type_Option_Pane;

public enum DataType {
BYTE(8),SHORT(16),INT(32),LONG(64),FLOAT(32),DOUBLE(64),CHAR(16),BOOLEAN(1);
private int bits;
DataType(int bits){
this.bits=bits; 	
}
int DataType(){
	return bits;
}
}

