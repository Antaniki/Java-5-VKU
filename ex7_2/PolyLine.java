package ex7_2;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
	private List<Point> points;

	public PolyLine() {
		points = new ArrayList<Point>();
	}
	
	public PolyLine(List<Point> points) {
		super();
		this.points = points;
	}
	
	public void appendPoint(Point point) {
		points.add(point);
	}
	
	public void appendPoint(int x, int y) {
		Point point = new Point(x, y);
		points.add(point);
	}
	// Return {(x1,y1)(x2,y2)(x3,y3)....}
   public String toString() {
      // Use a StringBuilder to efficiently build the return String
      StringBuilder sb = new StringBuilder("{");
      for (Point aPoint : points) {
          sb.append(aPoint.toString());
      }
      sb.append("}");
      return sb.toString();
   }
   public double getLength() {
	   double result = 0;
	   
	   for (int i = 0; i < points.size(); i++) {
		   result += points.get(i).distance(points.get(i+1));
	}
	   return result;
   }
	   
}
