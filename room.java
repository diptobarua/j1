
public class Room {
private 
	String hallName;
	int roomNo;
	boolean status;
public Room(){}
public Room(String hall1,int r1)
{
    hallName = hall1;
    roomNo = r1;
    status = false;
}

public String getHallName()
{return hallName;}

public void setHallName(String hall)
{hallName=hall;}

public int getRoomNo()
{return roomNo;}

public void setRoomNo(int r)
{
    roomNo = r;
}

public boolean getStatus()
{
    return status;
}

public void setStatus(boolean b)
{
    status = b;
}

public void print()  {
    if (status == false )
	    System.out.println("Room No : "+getRoomNo()+ "  of  "+ getHallName() + " is currently available ");
	else
		System.out.println("Room No : "+getRoomNo()+ "  of  "+ getHallName() + " is allocated ");}

}
