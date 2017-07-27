public class NumericLiteralsUnderscores {
	double notAtStart = _1000.00; // DOES NOT COMPILE
	double notAtEnd = 1000.00_; // DOES NOT COMPILE
	double notByDecimal = 1000_.00; // DOES NOT COMPILE
	NumericLiteralsUnderscores; // DOES NOT COMPILE
	double annoyingButLegal = 1_00_0.0_0; // this one compiles
}