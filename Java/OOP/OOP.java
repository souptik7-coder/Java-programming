class OOP {
    public static void main (String args[]){
        Pen p1 = new Pen();
        p1.setColor("red");
        System.out.println(p1.color);
        p1.setName("Alberto Caeiro");
        System.out.println(p1.name);
        p1.setNumber(5);
        System.out.println(p1.number);
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