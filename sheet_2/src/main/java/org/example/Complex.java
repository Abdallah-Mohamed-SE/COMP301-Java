package org.example;

public class Complex {
    private double real;
    private double imaginary;
    public Complex(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public Complex(){
        this.real=0;
        this.imaginary=0;
    }
    public void setReal (double real){
        this.real = real;
    }
    public double getReal(){
        return real;
    }
    public void setImaginary(double imaginary){
        this.imaginary=imaginary;
    }
    public double getImaginary(){
        return imaginary;
    }
    public  boolean isReal(){
        return imaginary==0;
    }
    public  boolean isImaginary(){
        return real==0 && imaginary!=0;

    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o instanceof Complex){
            Complex c = (Complex)o;
            return this.real==c.real && this.imaginary == c.imaginary;
        }
        else
            return false;
    }
    public Complex addTo(Complex c){
        return new Complex(this.real+c.real,this.imaginary+c.imaginary);
    }
    public Complex multiplyTo(Complex c){
        return new Complex(this.real*c.real,this.imaginary*c.imaginary);
    }

    public Complex conjugate(){
        return new Complex(this.real,this.imaginary*-1);
    }
    public double magnitude(){
        return Math.sqrt((real*real+ imaginary*imaginary));
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + " i";
    }
}
