import java.util.Date;

public class Orders {
    int orderId;
    int amount;
    Date ordDate;
    int custId;

    public Orders(int orderId, int amount, Date ordDate, int custId) {
        this.orderId = orderId;
        this.amount = amount;
        this.ordDate = ordDate;
        this.custId = custId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(Date ordDate) {
        this.ordDate = ordDate;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    @Override
    public String toString() {
        return  "Order ID=" + orderId +
                ", Amount=" + amount +
                ", Date=" + ordDate +
                ", Customer ID=" + custId +
                '}';
    }
}
