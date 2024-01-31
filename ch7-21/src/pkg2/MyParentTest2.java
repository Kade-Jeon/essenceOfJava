package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent {
    //MyParent는 default라 다른 패키지에서는 접근이 불가능하다.
    //MyParent를 public으로 바꾸면 가능해진다.
    public void printMembers() {
//        System.out.println("prv = " + prv); 다른 클래스라서 사용 불가능
//        System.out.println("dft = " + dft); 다른 패키지라서 사용이 불가능
        System.out.println("prt = " + prt); // 자손 클래스라 사용 가능
        System.out.println("pub = " + pub);
    }
}

public class MyParentTest2 {
    public static void main(String[] args) {
        MyParent p = new MyParent();
//        System.out.println("prv = " + p.prv); 다른 클래스라서 사용 불가능
//        System.out.println("dft = " + p.dft); 다른 패키지라서 사용이 불가능
//        System.out.println("prt = " + p.prt);  자손 클래스라가 아니라 사용 불가능 (상속받지 않음)
        System.out.println("pub = " + p.pub);
    }
}
