package gr.aueb.cf.testbed.ch14.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MainReflection {

    public static void main(String[] args) {
        try {
            Class<?> userClass = Class.forName("testbed.ch14.model.User");
            Class<?> userCredClass = Class.forName("testbed.ch14.model.UserCredentials");

            Constructor<?> userDefaultCtr = userClass.getConstructor();
            Constructor<?> userCredDefaultCtr = userCredClass.getConstructor();
            User user = (User) userDefaultCtr.newInstance();
            UserCredentials userCred = (UserCredentials) userCredDefaultCtr.newInstance();

            Method getUserId = userClass.getMethod("getUserId");

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
