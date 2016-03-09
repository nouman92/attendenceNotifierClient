package studentmanagementsystem.models;

import java.util.List;

public class DataService {

    DataSource source ;
    public DataService(){
        source = new DataSource();
    }
    public List<classRoom> getClassRoomList() {
        return source.classRooms;
    }

    public List<student> getStudentList() {
        return source.students;
    }

    public SystemUser getuser() {
        return source.adminUser;
    }

    public String getLicense() {
        return source.licenseKey;
    }

    public String getSecurityToken() {
        return source.securityToken;
    }
    
    public liveStatus getstats() {
        return source.liveStatus;
    }
}
