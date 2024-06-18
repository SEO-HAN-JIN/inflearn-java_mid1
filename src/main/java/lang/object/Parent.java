package lang.object;

// 부모가 없으면 묵시적으로 Object 클래스를 상속받는다. >> 묵시적 상속
public class Parent {
    // extends Object << 아무것도 상속을 받지 않으면 무조건 자동으로 Object를 상속함.

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
