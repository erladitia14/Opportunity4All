package Entity;

public class JobSeeker {
    private int id;
    private String username;
    private String password;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private Education education;
    private Work work;
    
    public JobSeeker(int id, String username, String password, String name, String email, String address, String phoneNumber, Education education, Work work) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.education = education;
        this.work = work;
    }

    public JobSeeker(int id, String username, String password, String name, String email, String address, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public JobSeeker(){   
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public Education getEducation(int id) {
        return education;
    }
    
    public void setEducation(Education education) {
        this.education = education;
    }
    
    public Work getWork(int id) {
        return work;
    }
    
    public void setWork(Work work) {
        this.work = work;
    }
    
    @Override
    public String toString() {
        return "JobSeeker{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", education=" + education +
                ", work=" + work +
                '}';
    }
}