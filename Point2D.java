package com.app.geometry;

public class Point2D{
	private int x;
	private int y;
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String getDetail(String x,String y) {
		return "("+x+","+y+")";
	}
	public boolean isEqual(Point2D other) {
		return this.x == other.x && this.y == other.y;
	}
	public double calculateDistances(Point2D otherpoint) {
		//^(x2-x1)+(y2-y1)
		double dx=this.x-otherpoint.x;
		double dy=this.y-otherpoint.y;
		return Math.sqrt(Math.pow(dx, 2)+Math.pow(dy,2));
	}
	

}
