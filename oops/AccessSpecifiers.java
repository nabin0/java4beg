class P {
    private int Pa = 55;
    public int Pb = 45;
    protected int Pc = 121;
    int Pd = 78;
}

class D extends P {
    private int Da = 555;
    public int Db = 666;
    protected int Dc = 777;
    int Dd = 888;

    void print() {
        System.out.println(this.Pb); // Can access all except (Pa)
    }
}

public class AccessSpecifiers {
    public static void main(String[] args) {
        D obj = new D();
        System.out.println(obj.Pb); // can access Pb,Pc,pd,db,dc,dd
    }
}
