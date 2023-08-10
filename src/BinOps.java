public class BinOps {
    public String sum(String a, String b) {
        int opsA = Integer.parseInt(a);
        int opsB = Integer.parseInt(b);
        int sum = opsA + opsB;
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        int opsA = Integer.parseInt(a);
        int opsB = Integer.parseInt(b);
        int sum = opsA * opsB;
        return Integer.toBinaryString(sum);
    }
}