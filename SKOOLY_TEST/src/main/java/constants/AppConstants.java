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
    }

}
