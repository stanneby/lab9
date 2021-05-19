package LabaTags;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import LabaPacks.ActiveUsersList;
import LabaPacks.User;
import LabaPacks.UserList;

public class Logout extends SimpleTagSupport {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void doTag() throws JspException, IOException {
        ActiveUsersList userActiveList = new ActiveUsersList();
        userActiveList.removeActiveUser(name);
    }
}
