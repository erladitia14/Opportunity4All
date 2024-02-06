package Entity;

public class Campaign {
    private int id;
    private int id_comp;
    private String name;
    private String description;
    private String location;
    private String salary;
    private HourType hour;
    private String education;
    private String work;
    
    public Campaign(int id,int id_comp, String name, String description, String location, String salary, HourType hour, String education, String work) {
        this.id = id;
        this.id_comp = id_comp;
        this.name = name;
        this.description = description;
        this.location = location;
        this.salary = salary;
        this.hour = hour;
        this.education = education;
        this.work = work;
    }
    
    public Campaign(int id,int id_comp, String name, String description, String location, String salary, String hour, String education, String work) {
        this.id = id;
        this.id_comp = id_comp;
        this.name = name;
        this.description = description;
        this.location = location;
        this.salary = salary;
        switch (hour) {
            case "Half":
                this.hour = HourType.HALF;
                break;
            case "Internship":
                this.hour = HourType.INTERN;
                break;
            case "Full":
            default:
                this.hour = HourType.FULL;
                break;
        }
        this.education = education;
        this.work = work;
    }

    public Campaign(){   
    }

    public static enum HourType {
    HALF,
    FULL,
    INTERN}

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId_comp() {
        return id_comp;
    }
    public void setId_comp(int id_comp) {
        this.id_comp = id_comp;
    }
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getSalary() {
        return salary;
    }
    
    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    public HourType getHour() {
        return hour;
    }
    
    public void setHour(HourType hour) {
        this.hour = hour;
    }
    
    public String getEducation() {
        return education;
    }
    
    public void setEducation(String education) {
        this.education = education;
    }
    public String getWork() {
        return work;
    }
    
    public void setWork(String work) {
        this.work = work;
    }
    
    @Override
    public String toString() {
        return "Campaign{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", hour=" + hour +
                ", min education='" + education + '\'' +
                ", min work exp='" + work + '\'' +
                '}';
    }
}