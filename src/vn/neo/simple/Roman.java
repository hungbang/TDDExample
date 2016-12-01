package vn.neo.simple;

public class Roman {

	private String roman;

	public Roman(String roman) {
		this.roman = roman;
	}

	public int getArabic() {
		return RomanDigit.valueOf(roman).arabic;
	}
	
	enum RomanDigit{
		I(1), II(2), III(3), IV(4), X(10);
		private final int arabic;

		private RomanDigit(int arabic) {
			this.arabic = arabic;
		}
		
		
	}

}
