package serenityCucumber.firstProject;

public enum Users {
    STANDARD_USER("Marcoz","Marcoz","default user");


    private final String username;
    private final String password;
    private final String description;

    Users(String username, String password, String description) {
        this.username = username;
        this.password = password;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return description;
    }
}
