/**
 * 
 */
package session5;

/**
 * @author Ramya
 *
 */
class Rectangle 
{ 
    int l,b; 
    Rectangle(int x,int y) 
      { 
         l=x; 
         b=y; 
      } 
         int getRectangle() 
          { 
             return l*b; //calculating area of rectangle= Length * Breadth
          } 
} 
//single inheritance: Triangle inherits Rectangle properties
        class Triangle extends Rectangle 
           { 
               float a; 
               Triangle(int v,int u) 
                  { 
                      super(u,v); 
                  } 
                      float getTriangle() 
                         { 
                             a=(float)(0.5)*l*b; //calculate area of triangle = 1/2 * l*b 
                             return (a); 
                         } 
          } 
public class RectangleandTriangleAreas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Triangle obj=new Triangle(500,80); 
         System.out.println("Area of Rectangle is : " +obj.getRectangle());
         System.out.println("Area of Triangle is : "+obj.getTriangle()); 
	}

}
