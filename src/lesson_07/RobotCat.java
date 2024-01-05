package lesson_07;

// Parent class, super class
public class RobotCat {
    private String name;
    private String productionDate;

    public RobotCat(String name, String productionDate) {
        this.name = name;
        this.productionDate = productionDate;
    }

    public String charge() {
        return "Charging";
    }

    public String getName() {
        return name;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "RobotCat{" +
                "name='" + name + '\'' +
                ", productionDate='" + productionDate + '\'' +
                '}';
    }
}
