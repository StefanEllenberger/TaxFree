public class Program {
    public static void main(String[] args) {
        Quota q = new Quota();
        q.add(Product.HALFSPIRIT);
        q.add(Product.HALFSNUS);
        q.add(Product.SMALLBOXWINE);
        System.out.println(q);
    }
}
