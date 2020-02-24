package Chap4;

public class SaleMan {

    private String id, name, surname;
    private int saleClass;
    private double saleTotal;
    private double commission;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSaleClass() {
        return saleClass;
    }

    public double getSaleTotal() {
        return saleTotal;
    }

    public double getCommission() {
        return commission;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSaleClass(int saleClass) {
        this.saleClass = saleClass;
    }

    public void setSaleTotal(double saleTotal) {
        this.saleTotal = saleTotal;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
