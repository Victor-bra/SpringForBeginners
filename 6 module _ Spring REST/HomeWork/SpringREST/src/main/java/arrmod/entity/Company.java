package arrmod.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "company_name")
    @Size(min = 2, message = "Company name must be min 2 symbols")
    private String companyName;
    @Column(name = "director_name")
    private String directorName;
    @Column(name = "director_surname")
    private String directorSurname;
    @Column(name = "amountOfWorkers")
    private int amountOfWorkers;
    @Column(name = "numberOfDepartment")
    private int numberOfDepartment;
    @Column(name = "alternateName")
    private String alternateName;
    @Column(name = "notes")
    private String notes;

    public Company() {
    }

    public Company(String companyName, String directorName, String directorSurname,
                   int amountOfWorkers, int numberOfDepartment, String alternateName, String notes) {
        this.companyName = companyName;
        this.directorName = directorName;
        this.directorSurname = directorSurname;
        this.amountOfWorkers = amountOfWorkers;
        this.numberOfDepartment = numberOfDepartment;
        this.alternateName = alternateName;
        this.notes = notes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getDirectorSurname() {
        return directorSurname;
    }

    public void setDirectorSurname(String directorSurname) {
        this.directorSurname = directorSurname;
    }

    public int getAmountOfWorkers() {
        return amountOfWorkers;
    }

    public void setAmountOfWorkers(int amountOfWorkers) {
        this.amountOfWorkers = amountOfWorkers;
    }

    public int getNumberOfDepartment() {
        return numberOfDepartment;
    }

    public void setNumberOfDepartment(int numberOfDepartment) {
        this.numberOfDepartment = numberOfDepartment;
    }

    public String getAlternateName() {
        return alternateName;
    }

    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", directorName='" + directorName + '\'' +
                ", directorSurname='" + directorSurname + '\'' +
                ", amountOfWorkers=" + amountOfWorkers +
                ", numberOfDepartment=" + numberOfDepartment +
                ", alternateName='" + alternateName + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}


