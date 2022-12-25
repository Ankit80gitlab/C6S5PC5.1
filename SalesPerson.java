public class SalesPerson {

    int salesId;
    String firstName;
    String city;
    int commissionRate;

    public SalesPerson(int salesId, String firstName, String city, int commissionRate) {
        this.salesId = salesId;
        this.firstName = firstName;
        this.city = city;
        this.commissionRate = commissionRate;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return  "Sales ID=" + salesId +
                ", First name='" + firstName + '\'' +
                ", City='" + city + '\'' +
                ", Commission Rate=" + commissionRate +
                '}';
    }
}
