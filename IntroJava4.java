

package hw5_isik_d.ceren;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HW5_Isik_DCeren {

    public static void main(String[] args) throws IOException{
        
        
       readHotel("C:\\Users\\MONSTERPC\\Desktop\\hotel.TXT");
       
        
    }
    
    
    private static Hotel readHotel(String fileName) throws IOException {
         
            Hotel hotel =new Hotel();
      
            Scanner s = new Scanner( new File(fileName)).useDelimiter("\\s*''\\s*");
            String line = s.nextLine();
            String delims = ";";
            StringTokenizer tokenizer=new StringTokenizer(line,delims);
            
                   String token=tokenizer.nextToken();
                   hotel.name = token; 
                   String token2=tokenizer.nextToken();
                   hotel.country= token2; 
                   String token3=tokenizer.nextToken();
                   hotel.location = token3; 
              
                   while(s.hasNext()){
                      String line2= s.nextLine();
                      String[] line3 = line2.split(";");
                      int sayac=0;
                      String num=null;
                      int cap=0;
                      for (String arrSplit1 : line3)
                      {
                        if(sayac%2==0)
                        {
                             num = arrSplit1;
                        }else{
                          cap= Integer.valueOf(arrSplit1);
                        }
                        sayac++;
                      }
                        hotel.addRoom(num, cap);
                   }
              System.out.println(hotel.toString());
              Scanner input = new Scanner(System.in);
              System.out.println("Please enter a Room Number: ");
              String number = input.nextLine();
              hotel.getRoomCapacity(number);
              
        return hotel;    
    }
    
    

public static class Hotel{
    
    private String name,country, location;
    private int numberOfRooms, hotelCapacity;
    ArrayList<Room> rooms;

        public Hotel() {
         rooms=new ArrayList<>();

        }

       
     
    public Hotel(String name, String country, String location) {
        this.name = name;
        this.country = country;
        this.location = location;

    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getLocation() {
        return location;
    }
    
    
    private int findRoom(String roomNumber){
        
        for(Room room: rooms){
            
            if(room.getRoomNumber().equals(roomNumber))
            {
                return rooms.indexOf(room);
            }else
            {
              return -1;
            }
        }
       return -1;
    }
    
    
    public void addRoom(String roomNumber, int roomCapacity){
       if(findRoom(roomNumber)==-1)
       {
          Room room = new Room(roomNumber,roomCapacity);
            rooms.add(room);
       }else
       {
           
       }
       numberOfRooms=0;
       hotelCapacity=0;
       for(Room room:rooms){
           numberOfRooms ++;
           hotelCapacity += room.roomCapacity;
       }
    }
    
    public int getRoomCapacity(String roomNumber){
        
        int a = findRoom(roomNumber);
        
        if(a!=-1)
        {
            int deger =  rooms.get(a).roomCapacity;
            System.out.println("The capacity of the room " + roomNumber + " is " + deger + "persons.");
           return deger;

        }else
        {
           System.out.println("The capacity of the room " + roomNumber + " does not exist ");

          return -1;

        }

    }

   
    public String toString() {
        String str= "Hotel " +name+ ", Country: " + country + ", Location: " + location + "\n"+
                "Number of Rooms: " + numberOfRooms+ ", Hotel Capacity: " +hotelCapacity+ "\n";
        
        System.out.println(str);
             for(Room room:rooms)
                {
                    System.out.println(room.toString());
                }
        return "";
        
    }

}
public static class Room {
    
     private String roomNumber;
     private int roomCapacity;

      
     
    public Room(String roomNumber, int roomCapacity) {
        this.roomNumber = roomNumber;
        this.roomCapacity = roomCapacity;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    
    public String toString() {
        if(roomCapacity>1){
          return  "Room No: " + roomNumber +",  Capacity: "+roomCapacity  + " persons.";
        }else{
          return  "Room No: " + roomNumber +",  Capacity: "+roomCapacity + " person.";

        }
      }

}


}