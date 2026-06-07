public class gettersetter {

    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setColor("blue");
        p1.setTip(6);

        System.out.println(p1.getColor());

        p1.setColor("red");

        System.out.println(p1.getColor());

        System.out.println(p1.getTip());

    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}