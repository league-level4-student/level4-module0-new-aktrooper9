package _04_Data_Type_Option_Pane;

import javax.swing.JOptionPane;

public class DataTypeOptionPane {
	 
    public static void main(String[] args) {
int choice=JOptionPane.showOptionDialog(null, "Choose a simple datatype", "Data Type",JOptionPane.CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,DataType.values(),null);
DataType[] dataTypes=DataType.values();
    }
}
