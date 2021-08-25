class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null){
            this.firstName = firstName;
        }
        else {
            this.firstName = "";
        }
    }

    public void setLastName(String lastName) {

        if (lastName != null) {
            this.lastName = lastName;
        }
        else {
            this.lastName = "";
        }
    }

    public String getFullName() {
        if (this.firstName.equals("") && this.lastName.equals("")) {
            return "Unknown";
        }
        else if (this.firstName.equals("")) {
            return this.lastName;
        }
        else if (this.lastName.equals("")) {
            return this.firstName;
        }
        else {
            return this.firstName + " " + this.lastName; // write your code here
        }

    }
}