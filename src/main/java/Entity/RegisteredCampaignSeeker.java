
package Entity;

/**
 *
 * @author anisa
 */
public class RegisteredCampaignSeeker {
    private int id;
    private int idCamp;
    private int idSeeker;

    public RegisteredCampaignSeeker(int id, int idCamp, int idSeeker) {
        this.id = id;
        this.idCamp = idCamp;
        this.idSeeker = idSeeker;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCamp() {
        return idCamp;
    }

    public void setIdCamp(int idCamp) {
        this.idCamp = idCamp;
    }

    public int getIdSeeker() {
        return idSeeker;
    }

    public void setIdSeeker(int idSeeker) {
        this.idSeeker = idSeeker;
    }
}
