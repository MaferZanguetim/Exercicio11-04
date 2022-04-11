public class Soma {
    private int num1;
    private int num2;
    private int num3;
    private double num4;
    private double num5;
    public Soma(){

    }
    public Soma(int num1, int num2, int num3, double num4, double num5){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
        this.num4=num4;
        this.num5=num5;
    }
    
    public void x(){
        System.out.println(this.num1+this.num2);
        System.out.println(this.num1+this.num2+this.num3);
        System.out.println(this.num4+this.num5);
    }
}
