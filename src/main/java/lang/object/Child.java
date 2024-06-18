package lang.object;

// Parent를 상속받았기 때문에 Object를 상속받지 않는다. >> 명시적 상속
public class Child extends Parent{

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
