package ru.gamingos.libraries;

public class CalcUtils {
	private static double x, y;
	public CalcUtils () {}
    public CalcUtils (final double x, final double y) {
		this.x = x;
		this.y = y;
	}
	public static final double plus (final double x, final double y) {
		return x + y;
	}
	public static final double mi (final double x, final double y) {
		return x - y;
	}
	public static final double ym (final double x, final double y) {
		return x * y;
	}
	public static final double ra (final double x, final double y) {
		return x / y;
	}
}
