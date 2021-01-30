class APLine {
	//variables
	private float a, b, c;

	//constructor
	APLine(int a, int b, int c) {
		assert a == 0 && b == 0;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/*
		calculates and returns the slope of the equation using standard form.
	*/
	public float getSlope() {
		return ((a - (a * 2)) / b);
	}

	/*
		using a point, multiply to determine whether or not the point lines up with the given equation.
	*/
	public boolean isOnLine(int x, int y) {
		return (((a*x) + (b*y) + c) == 0) ? true:false;
	}
}