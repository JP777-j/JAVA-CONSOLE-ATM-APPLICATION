import java.util.ArrayList;


public class ATM {  // atm pojo class handle the fields
    private static ArrayList<Userinfo> userlist = new ArrayList<Userinfo>();  // list to store all users.
    private static ArrayList<Admininfo> adminlist = new ArrayList<Admininfo>();  // list to store all admins.
    private static ArrayList<Notes> currencynotes = new ArrayList<Notes>();  // list to store available currency notes.
    private static ArrayList<Transaction> transaction = new ArrayList<Transaction>();  // list to store all transactions.

    private static double atmcash;  // variable to store the total cash available in the ATM.

    // returns the list of admins.
    public static ArrayList<Admininfo> getAdminlist() {
        return adminlist;
    }

    // returns the list of transactions.
    public static ArrayList<Transaction> getTransaction() {
        return transaction;
    }

    // this method initializes the currency notes in the ATM with 0 count for each denomination.
    public static void iniCurrencynotes() {
        Notes o1 = new Ru2000(0, "2000");  // create a note of 2000.
        Notes o2 = new Ru500(0, "500");  // create a note of 500.
        Notes o3 = new Ru200(0, "200");  // create a note of 200.
        Notes o4 = new Ru100(0, "100");  // create a note of 100.
        currencynotes.add(o1);  // add the 2000 note to the list.
        currencynotes.add(o2);  //similar to 2000
        currencynotes.add(o3);  //similar to 2000
        currencynotes.add(o4);  //similar to 2000
    }

    // allows you to update the currency notes list.
    public static void setCurrencynotes(ArrayList<Notes> upcurrencynotes) {
        ATM.currencynotes = upcurrencynotes;  // set the new currency notes list.
    }

    // returns the total ATM cash.
    public static double getatmcash() {
        return atmcash;
    }

    // sets the total ATM cash.
    public static void setatmcash(double d) {
        atmcash = d;  // update the total cash in the ATM.
    }

    // adds a new admin to the admin list.
    public static void setAdminlist(Admininfo ob) {
        adminlist.add(ob);  // add admin to the list.
    }

    // adds a new user to the user list.
    public static void setArr(Userinfo ob) {
        userlist.add(ob);  // add user to the list.
    }

    // returns the list of available currency notes in the ATM.
    public static ArrayList<Notes> getCurrencynotes() {
        return currencynotes;
    }

    // returns the list of users in the ATM system.
    public static ArrayList<Userinfo> getUserlist() {
        return userlist;
    }

    // this method returns a user's current object based on their username.
    public Userinfo getusercurrentOb(String name) {
        for (Userinfo cru : getUserlist()) {  // loop through all users.
            if (name.equals(cru.getUser())) {  // if the username matches.
                return cru;  // return the user object.
            }
        }
        return null;  // if user is not found, return null.
    }

}
