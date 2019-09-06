package edu.ilstu;

/**
 * Use this class for making multiple commits. For example,
 * fill in each function and make a commit
 * @author rsaripa
 *
 */

public class GitDemo {

	
	
	public double areaSquare(double a){
		double area= a*a;
		
		return area; 
	}
	
	public double areaTriangle(double a, double b){
		double areaTriangle= a*b*.5;
		return areaTriangle;
	}
	
	public double areaRectangle(double a, double b) {
		double areaRectangle= a*b;
		return areaRectangle;
	}
	
	public double areaTrapezoid(double a, double b, double h){
		double areaTrapezoid=(a+b)*.5*h;
		return areaTrapezoid;
	}
	
	public double areaRhombus(double p, double q){
		double areaRhombus=p*q*.5;
		return areaRhombus;
	}
	
	public double areaCircle(double r){
		double areaCircle=math.PI*(r*r);
		return areaCircle;
	}
	
	public double volumeCube(a){
		double volumeCube=a*a*a;
		return volumeCube;
	}
	
	public double volumeCone(double r, double h){
		double volumeCone=math.PI*(r*r)*h/3;
		return volumeCone;
	}
	
