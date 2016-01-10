package xmlBased;


//@Entity
//@Table(name = "account")
public class Account implements java.io.Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String accountNumber;
    int money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
