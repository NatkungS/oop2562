package Chap5.Test;

class Parent {

    private String parentName;
    private String address;
    private String telephoneNo;

    public Parent(String parentName, String address, String telephoneNo) {
        this.parentName = parentName;
        this.address = address;
        this.telephoneNo = telephoneNo;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

}
