package Ch8ClassesAndObjects.BankAccount;

public class Dob {
    //fields
    private int day, month, year;

    //constructors
    public Dob(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //getters
    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public int getYear() {
        return this.year;
    }
    //setters

    //toString
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
