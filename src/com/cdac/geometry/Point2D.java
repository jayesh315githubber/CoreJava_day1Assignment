package com.cdac.geometry;

public class Point2D {

	private int x;
	private int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "X : " + x + " " + " Y : " + y;
	}

	public boolean isEqual(Point2D anotherPoint) {

		if (anotherPoint.x == x && anotherPoint.y == y) {
			return true;
		} else {
			return false;
		}
	}

	public double calculateDistance(Point2D point2) {
		int diff1 = x - point2.x;
		int diff2 = y - point2.y;
		return Math.sqrt(diff1 * diff1 + diff2 * diff2);
	}

}
