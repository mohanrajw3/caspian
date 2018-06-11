package constants;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConstants {

    public static String userEmail;
    public static String password;
    public static String phoneNo;
    public static String otp;
    public static String schoolType;
    public static String title;
    public static String userName;
    public static String classRoomName;
    public static String teacherName;
    public static String teacherEmail;
    public static String teacherPhoneNo;
    public static String schoolName;
    public static String motherEmail;
    public static String studentid;
    public static String baseUrl;
    public static String studentName;
    public static String signUpUrl;
    public static String programmeName;
    public static String classRoomName1;
    public static String classRoomName2;
    public static String classRoomName3;
    public static String classRoomName4;
    public static String teacherId1;
    public static String teacherId2;
    public static String teacherId3;
    public static String teacherId4;


    public static void readValuesFromPropertyFiles(Properties prop, InputStream input) throws IOException {

        prop.load(input);
        userEmail = prop.getProperty("userEmail");
        password = prop.getProperty("password");
        phoneNo = prop.getProperty("phoneNo");
        schoolType = prop.getProperty("schoolType");
        title = prop.getProperty("title");
        userName = prop.getProperty("userName");
        otp = prop.getProperty("otp");
        schoolName = prop.getProperty("schoolName");
        classRoomName = prop.getProperty("classRoomName");
        teacherName = prop.getProperty("teacherName");
        teacherEmail = prop.getProperty("teacherEmail");
        teacherPhoneNo = prop.getProperty("teacherPhoneNo");
        motherEmail = prop.getProperty("motherEmail");
        studentid = prop.getProperty("studentid");
        baseUrl = prop.getProperty("baseUrl");
        studentName = prop.getProperty("studentName");
        signUpUrl = prop.getProperty("signUpUrl");
        programmeName = prop.getProperty("programmeName");
        classRoomName1 = prop.getProperty("classRoomName1");
        classRoomName2 = prop.getProperty("classRoomName2");
        classRoomName3 = prop.getProperty("classRoomName3");
        classRoomName4 = prop.getProperty("classRoomName4");
        teacherId1 = prop.getProperty("teacherId1");
        teacherId2 = prop.getProperty("teacherId2");
        teacherId3 = prop.getProperty("teacherId3");
        teacherId4 = prop.getProperty("teacherId4");
    }

}
