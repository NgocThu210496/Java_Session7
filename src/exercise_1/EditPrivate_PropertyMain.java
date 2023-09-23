package exercise_1;

public class EditPrivate_PropertyMain {
    public static void main(String[] args) {
        EditPrivate_Property myClass= new EditPrivate_Property();
        // Hiển thị giá trị ban đầu
        System.out.println("Giá trị ban đầu của myString " + myClass.getMyString());
        //thay doi gia tri cua myString
        myClass.setMyString("Thuộc tính đã được thay dổi");
        //gia trị mới của my string
        System.out.println("Giá trị mới  của myString " + myClass.getMyString());

    }
}
