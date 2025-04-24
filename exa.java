class BankAccount<T extends Number> {
    public void display(T[] t){
        for(T i : t){
            System.out.println(i);
        }
    }
}
public class exa {
    public static void main(String[] args) {
        BankAccount<Number> b = new BankAccount<>();
        Integer[] i = {1,2,3,4,5};
        Double[] j={2.3,4.5,9.0,4.2};
        b.display(i);
        b.display(j);
    }
}
