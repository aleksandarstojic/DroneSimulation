package dron;

public class Dron {

	private int x;
	private int y;
	private int z;
	private int[] coordinates;
	private int[] boundaries;

	public Dron()
	{
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Dron(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//array that is passed is treated like [x,y,z]
	public Dron(int[] coordinates) //error when a larger/smaller array is passed
	{
		this.coordinates = coordinates;
	}
	
	public Dron(int x, int y, int z, int[] boundaries)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.boundaries = boundaries;
	}
	
	public Dron(int[] coordinates, int[] boundaries) //error when a larger/smaller array is passed and boundaries are less than coordinates
	{
		this.coordinates = coordinates;
		this.boundaries = boundaries;
	}
	
	public int[] getCoordinates()
	{
		return coordinates;		
	}
	
	public String moveUp(int up)
	{
		if(y + up <= boundaries[1])
		{
			y += up;			
		}
		return getFormatedCoordinates();
	}
	
	public String moveDown(int down)
	{
		if(y - down >= 0)
		{
			y -= down;
		}
		return getFormatedCoordinates();
	}
	
	public String getFormatedCoordinates()
	{
		return "My position is: (" + Integer.toString(getX()) + ","
				+ Integer.toString(getY()) + ","  
				+ Integer.toString(getZ()) + ")";
	}
	
	public void changeCoordinates(int[] coordinates)
	{
		setX(coordinates[1]);
		setY(coordinates[2]);
		setZ(coordinates[3]);
	}
	
	public String changeCoordinates(int x, int y, int z)
	{
		setX(x);
		setY(y);
		setZ(z);
		return getFormatedCoordinates();
	}
	
	//Getters and setters-------------------------------------
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void setCoordinates(int[] coordinates) {
		this.coordinates = coordinates;
	}
	
	public int[] getBoundaries() {
		return boundaries;
	}

	public void setBoundaries(int[] boundaries) {
		this.boundaries = boundaries;
	}
}
