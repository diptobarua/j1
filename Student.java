
public class Student {
	private
	    String studentName;
	    String studentNo;
	    Room room;
	public

	    Student() {}
	    Student(String s, String n , Room r)
	    {
	        studentName = s ;
	        studentNo = n ;
	        room = r;
	    }

	    //class Room;
	    Room getRoom()
	    {
	        return room;
	    }

	    void setRoom(Room r)
	    {
	        room = r;
	    }

	    String getStudentName(){
	        return studentName ;
	    }
	    void  setStudentName(String s){
	        studentName = s ;
	    }

	    String  getStudentNo(){
	        return studentNo ;
	    }

	    void  setStudentNo(String n){
	        studentNo = n ;

	    }

	    void  print() {
	    	System.out.println("Student No : "+ getStudentNo() + "  "+ getStudentName()+ "  resides on "+ room.getHallName() + " Room No : " + room.getRoomNo() + " .");
	    }
}
