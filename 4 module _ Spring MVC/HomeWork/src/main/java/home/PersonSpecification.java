package home;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

public class PersonSpecification extends Person {
    @NotBlank(message = "Please, write you job")
    @Size(min = 2, message = "Job must be min 2 symbols")
    private String job;
    @Min(value = 0, message = "0<?<120")
    @Max(value = 120, message = "0<?<120")
    private int age;
    private String[] car;
    private Map<String, String> cars;
    private String apartment;
    private Map<String, String> apartments;
    private String pet;
    private Map<String, String> pets;
    private String[] language;
    private Map<String, String> languages;
    private int salary;

    public PersonSpecification() {
        cars = new HashMap<>();
        cars.put("Lamborghini", "Lambo");
        cars.put("Volkswagen", "VW");
        cars.put("Opel", "Opel");
        cars.put("Audi", "Audi");
        cars.put("Bugatti", "Bugatti");
        cars.put("None", "None");
        apartments = new HashMap<>();
        apartments.put("No", "N");
        apartments.put("Yes", "Y");
        pets = new HashMap<>();
        pets.put("Yes", "Y");
        pets.put("No", "N");
        languages = new HashMap<>();
        languages.put("English", "EN");
        languages.put("Russian", "RU");
        languages.put("Franch", "FR");
        languages.put("Belarusian", "BE");
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getCar() {
        return car;
    }

    public void setCar(String[] car) {
        this.car = car;
    }

    public Map<String, String> getCars() {
        return cars;
    }

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public Map<String, String> getApartments() {
        return apartments;
    }

    public void setApartments(Map<String, String> apartments) {
        this.apartments = apartments;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public Map<String, String> getPets() {
        return pets;
    }

    public void setPets(Map<String, String> pets) {
        this.pets = pets;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }

    public Map<String, String> getLanguages() {
        return languages;
    }

    public void setLanguages(Map<String, String> languages) {
        this.languages = languages;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "PersonSpecification{" +
                "job='" + job + '\'' +
                ", age='" + age + '\'' +
                ", car='" + car + '\'' +
                ", cars=" + cars +
                ", apartment='" + apartment + '\'' +
                ", apartments=" + apartments +
                ", pet='" + pet + '\'' +
                ", pets=" + pets +
                ", language='" + language + '\'' +
                ", languages=" + languages +
                ", salary=" + salary +
                '}';
    }
}
