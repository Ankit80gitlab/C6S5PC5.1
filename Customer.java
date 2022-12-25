public class Customer {
    int custId;
    String custFName;
    String custLName;
    String city;
    int rating;
    int salesId;

    public Customer(int custId, String custFName, String custLName, String city, int rating, int salesId) {
        this.custId = custId;
        this.custFName = custFName;
        this.custLName = custLName;
        this.city = city;
        this.rating = rating;
        this.salesId = salesId;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustFName() {
        return custFName;
    }

    public void setCustFName(String custFName) {
        this.custFName = custFName;
    }

    public String getCustLName() {
        return custLName;
    }

    public void setCustLName(String custLName) {
        this.custLName = custLName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    @Override
    public String toString()
    {
        return  "customer ID=" + custId +
                ", First name='" + custFName + '\'' +
                ", Last name='" + custLName + '\'' +
                ", City='" + city + '\'' +
                ", Ratings=" + rating +
                ", Sales ID=" + salesId +
                '}';
    }
}
