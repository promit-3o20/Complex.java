package com.CompanyProject;

class Imaginary {
    protected double image; //image = imaginary

    public void display_image () {
        System.out.format("%+gi", image);
    }
}

class Complex extends Imaginary {
    protected double real; 

    public Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }
    Complex add(Complex c) {
        Complex temp = new Complex(0, 0);
        temp.real = this.real + c.real;
        temp.image = this.image + c.image;
        return temp;
    }
    Complex mult(Complex c){
        Complex m = new Complex(0,0);
        m.real = ((this.real*c.real)-(this.image*c.image));
        m.image = ((this.real*c.image)+(this.image*c.real));
        return m;
    }
    public void display () {
        System.out.print(real);
        display_image();
        System.out.println(" ");
    }
}

class ComolexResult {
    public static void main(String[]s){
        Complex c1 = new Complex(3,1);
        Complex c2 = new Complex(2,4);
        Complex c3;
        c3 = c1.add(c2);        
        c3.display();
        c3 = c1.mult(c2);        
        c3.display();
    }
}
