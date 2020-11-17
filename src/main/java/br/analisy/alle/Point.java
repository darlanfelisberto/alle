package br.analisy.alle;

public class Point {
	int x;
	int y;
	public Point(String[] point) {
		super();
		this.x = Integer.parseInt(point[0]);
		this.y = Integer.parseInt(point[1]);
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
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

}
