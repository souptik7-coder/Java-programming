class OOP {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("red");
        System.out.println(p1.color);
        p1.setName("Alberto Caeiro");
        System.out.println(p1.name);
        p1.setNumber(5);
        System.out.println(p1.number);

        // concept of access modifiers

        BankAccount acc = new BankAccount();
        acc.setUsername("souptik_00");
        System.out.println(acc.username);
        acc.setPassword("souptik12345@");
        // System.out.println(acc.setPassword);  -- gives error because password is private

    }
}

class Pen {
    String name;
    int number;
    String color;
    void setName(String newName){
        name = newName;
    }
    void setColor(String newColor){
        color = newColor;
    } 
    void setNumber(int newNumber){
        number = newNumber;
    }

}

// concept of Access Modifiers

class BankAccount {
    public String username; 
    private String password;
    public void setUsername (String newUsername){
        username = newUsername;
    }
    public void setPassword ( String newPassword){
        password = newPassword;
    }
}