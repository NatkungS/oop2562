package Chap5.Test;

class Counsellor {

    private String consellorId;
    private String consellorName;
    private String telephoneNo;

    public Counsellor(String consellorId, String consellorName, String telephoneNo) {
        this.consellorId = consellorId;
        this.consellorName = consellorName;
        this.telephoneNo = telephoneNo;
    }

    public String getConsellorId() {
        return consellorId;
    }

    public void setConsellorId(String consellorId) {
        this.consellorId = consellorId;
    }

    public String getConsellorName() {
        return consellorName;
    }

    public void setConsellorName(String consellorName) {
        this.consellorName = consellorName;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

}
