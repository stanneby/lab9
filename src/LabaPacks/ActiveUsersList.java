package LabaPacks;

import java.util.ArrayList;

public class ActiveUsersList {
    private static ArrayList<String> activeUsers = new ArrayList<String>();

    public synchronized void addActiveUser(String user){
        activeUsers.add(user);
    }

    public synchronized ArrayList<String> getActiveUser(){
        return activeUsers;
    }

    public synchronized void removeActiveUser(String user){
        activeUsers.remove(user);
    }
}
