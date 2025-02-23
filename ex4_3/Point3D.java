package ex4_3;

public class Point3D extends Point2D {
	private float z;

	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}
	public Point3D() {
		super();
		this.z = 0.0f;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	public void setXYZ(float x, float y, float z) {
		super.setXY(x, y);
		this.z = z;
	}
	
	public float[] getXYZ() {
		float[] xyz = super.getXY();
		xyz[2] = z;
		return xyz;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+super.getX()+", "+super.getY()+", "+z+")";
	}
	
}
