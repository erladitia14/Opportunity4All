package Entity;

import java.sql.Date;

public class Education {
    private int id;
    private String institusi;
    private String deskripsi;
    private Date lulus;
    private String studi;
    private int nilai;
    private int idSeeker;
    
    public Education(int id, String institusi, String deskripsi, Date lulus, String studi, int nilai, int idSeeker) {
        this.id = id;
        this.institusi = institusi;
        this.deskripsi = deskripsi;
        this.lulus = lulus;
        this.studi = studi;
        this.nilai = nilai;
        this.idSeeker = idSeeker;
    }

    public Education(){
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getInstitusi() {
        return institusi;
    }
    
    public void setInstitusi(String institusi) {
        this.institusi = institusi;
    }
    
    public String getDeskripsi() {
        return deskripsi;
    }
    
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    public Date getLulus() {
        return lulus;
    }
    
    public void setLulus(Date lulus) {
        this.lulus = lulus;
    }
    
    public String getStudi() {
        return studi;
    }
    
    public void setStudi(String studi) {
        this.studi = studi;
    }
    
    public int getNilai() {
        return nilai;
    }
    
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    
    public int getIdSeeker() {
        return idSeeker;
    }
    
    public void setIdSeeker(int idSeeker) {
        this.idSeeker = idSeeker;
    }
    
    @Override
    public String toString() {
        return "Education{" +
                "id=" + id +
                ", institusi='" + institusi + '\'' +
                ", deskripsi='" + deskripsi + '\'' +
                ", lulus=" + lulus +
                ", studi='" + studi + '\'' +
                ", nilai=" + nilai +
                '}';
    }
}