package studentmanagementsystem.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataSource {

    public static List<classRoom> classRooms;
    public static List<student> students;
    public static SystemUser adminUser;
    public static String licenseKey;
    public static String securityToken;
    public static liveStatus liveStatus;

    public DataSource(){
        classRooms = new ArrayList<>();
        classRooms.add(new classRoom("1", "class1"));
        classRooms.add(new classRoom("2", "class2"));
        classRooms.add(new classRoom("3", "class3"));
        classRooms.add(new classRoom("4", "class4"));
        classRooms.add(new classRoom("5", "class5"));
        classRooms.add(new classRoom("6", "class6"));
        classRooms.add(new classRoom("7", "class7"));
        classRooms.add(new classRoom("8", "class8"));
        classRooms.add(new classRoom("9", "class9"));
        classRooms.add(new classRoom("10", "class10"));

        students = new ArrayList<>();
        students.add(new student("1", "nouman", "10", false, new Date()));
        students.add(new student("2", "anjum", "10", false, new Date()));
        students.add(new student("3", "rehman", "10", false, new Date()));
        students.add(new student("4", "sakib", "10", false, new Date()));
        
        adminUser = new SystemUser("nouman","nouman92",true);
        licenseKey = "qwertyAllowed";
        securityToken = "secretToken";
        liveStatus = new liveStatus("23","34","57",new Date());
    }
}
