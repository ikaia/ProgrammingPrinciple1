package homework;

class Test {
private double i;

public Test(double i) {
this.t();
this.i = i;
}
public Test() {
System.out.println("Default constructor");
this(1);
}

public void t() {
System.out.println("Invoking t");
}
}