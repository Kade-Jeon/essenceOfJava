package pkg1;

public class MyParent{
    private int prv;    // 같은 클래스
    int dft;            // 같은 패키지
    protected int prt;  // 같은 패키지 + 자손(다른 패키지)
    public int pub;     // 접근제한 없음.

    public void printMembers(){
        System.out.println("prv = " + prv);
        System.out.println("dft = " + dft);
        System.out.println("prt = " + prt);
        System.out.println("pub = " + pub);
    }

}

class MyParentTest1 {
    public static void main(String[] args) {

        MyParent p = new MyParent();
//    System.out.println("prv = " + p.prv); // private은 같은 클래스 내에서만 가능하므로, 다른 클래스에서는 접근 불가능하다.
        System.out.println("dft = " + p.dft);
        System.out.println("prt = " + p.prt);
        System.out.println("pub = " + p.pub);


    }
}