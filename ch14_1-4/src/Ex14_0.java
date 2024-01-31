public class Ex14_0 {
    public static void main(String[] args) {
//        Object obj = (a, b) -> a > b ? a: b; //람다식은 익명객체이므로

       Myfunction f1 = new Myfunction(){
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        //람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        Myfunction f2 = (a, b) -> a > b ? a: b;

        int value = f2.max(3, 5); // 불가하다 그래서 필요한 것이 함수형 인터페이스.
        System.out.println("value = " + value);


    }
}

@FunctionalInterface  //함수형 인터페이스는 단 하나의 추상메서드만 가져야 한다.
interface Myfunction{
    int max(int a, int b); //인터페이스의 메서드는 public abstract가 기본이므로 생략 가능
}