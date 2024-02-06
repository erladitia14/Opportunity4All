package Entity;

import java.sql.Date;

public class Work {
    private int id;
    private String jabatan;
    private Date mulai;
    private Date selesai;
    private String company;
    private String deskripsi;
    private int idSeeker;
    
    public Work(int id, String jabatan, Date mulai, Date selesai, String company, String deskripsi, int idSeeker) {
        this.id = id;
        this.jabatan = jabatan;
        this.mulai = mulai;
        this.selesai = selesai;
        this.company = company;
        this.deskripsi = deskripsi;
        this.idSeeker = idSeeker;
    }
    public Work() {
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getJabatan() {
        return jabatan;
    }
    
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    public Date getMulai() {
        return mulai;
    }
    
    public void setMulai(Date mulai) {
        this.mulai = mulai;
    }
    
    public Date getSelesai() {
        return selesai;
    }
    
    public void setSelesai(Date selesai) {
        this.selesai = selesai;
    }
    
    public String getCompany() {
        return company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }
    
    public String getDeskripsi() {
        return deskripsi;
    }
    
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    public int getIdSeeker(){
        return idSeeker;
    }
    
    public void setIdSeeker(int idSeeker){
        this.idSeeker = idSeeker;
    }
    
    @Override
    public String toString() {
        return 
                ", company='" + company + '\'' +
                ", jabatan='" + jabatan + '\'' +
                ", mulai=" + mulai +
                ", selesai=" + selesai +
                ", deskripsi='" + deskripsi + '\'' 
                ;
    }
}