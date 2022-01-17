package arrmod.rest.entity;

public class Company {
    private int id;
    private String companyName;
    private String directorName;
    private String directorSurname;
    private int amountOfWorkers;
    private int numberOfDepartment;
    private String alternateName;
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
                '}' + '\n';
    }
}


