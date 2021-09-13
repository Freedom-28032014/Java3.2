package ru.netology.domain;

public class FollowersInfo {
    private int id;
    private String firstName;
    private String lastName;
    private String deactivated;
    private boolean isClosed;
    private boolean canAccessClosed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDeactivated() {
        return deactivated;
    }

    public void setDeactivated(String deactivated) {
        this.deactivated = deactivated;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public boolean isCanAccessClosed() {
        return canAccessClosed;
    }

    public void setCanAccessClosed(boolean canAccessClosed) {
        this.canAccessClosed = canAccessClosed;
    }
}



