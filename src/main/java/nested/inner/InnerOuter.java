package nested.inner;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outINstatnceValue = 2;

    class Inner {
        private int innerInstatnceValue = 1;

        public void print() {
            // 자기 자신에 접근
            System.out.println(innerInstatnceValue);

            // 외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outINstatnceValue);

            // 외부 클래스의 클래스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outClassValue);
        }
    }
}
