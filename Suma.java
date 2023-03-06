public class Suma{
    private int a;
    private int b;
    
    public Suma(int a, int b){

        this.a = a;
        this.b = b;
    }

    public int sumar(){

        int suma = a+b;
        return suma;
    }
    public static void main(String[] args) {
        Suma s = new Suma(3, 2);
        System.out.println(s.sumar());
    }
}