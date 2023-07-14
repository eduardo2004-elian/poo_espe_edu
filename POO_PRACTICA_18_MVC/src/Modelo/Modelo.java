
package Modelo;

public class Modelo {
    private int v1;
    private int v2;
    private int total1;

    
    public Modelo(){
    }

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public int getTotal1() {
        return total1;
    }

    public void setTotal1(int total1) {
        this.total1 = total1;
    }

    
    public int sumar() {
       this.total1=this.v1+this.v2;
        return this.total1;
    }
    public int restar(){
        this.total1=this.v1-this.v2;
        return this.total1;
    }

    public int multi() {
        this.total1=this.v1*this.v2;
        return this.total1;
    }

    public int divi() {
        this.total1=this.v1/this.v2;
        return this.total1;
    }
    
    
}
