package at.codersbay.datastructures;

/**
 * A Fractional is a class that consists of a numerator and a denominator
 * e.g.: 1/2, 1/3, 24/37, ..
 */
public class Fractional {

    public Integer numerator;
    public Integer denominator;

    public Fractional(Integer numerator, Integer denominator) {
        // TODO implement to fix tests in FractionalTest1
        if (numerator == null || denominator == null) {
            throw new IllegalArgumentException("Null can´t pass");
        } else if (denominator == 0) {
            throw new IllegalArgumentException("You can´t divide trough zero");
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public Integer getNumerator() {
        // TODO implement to fix tests in FractionalTest1
        return numerator;
    }

    public Integer getDenominator() {
        // TODO implement to fix tests in FractionalTest1
        return denominator;
    }

    public Float asFloat() {
        // TODO implement to fix tests in FractionalTest2
        return (float)numerator / (float)denominator;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO implement to fix tests in FractionalTest3
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        }
        if (obj instanceof Fractional) {
            Fractional temp = (Fractional) obj;
            // If 0 Fehler behoben && If gleiche Zahl
            if (this.numerator == 0 && temp.getNumerator() == 0) {
                return true;
            } else if (this.numerator.equals(temp.getNumerator()) && this.denominator.equals(temp.getDenominator())) {
                return true;
            } else return this.numerator * temp.getDenominator() == this.denominator * temp.getNumerator();
        }
        return false;
    }

    public Fractional multiply(Fractional other) {
        // TODO implement to fix tests in FractionalTest4
        return new Fractional(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public Fractional multiply(Integer other) {
        // TODO implement to fix tests in FractionalTest4
        return new Fractional(this.numerator * other, this.denominator);
    }

    public Fractional divide(Fractional other) {
        // TODO implement to fix tests in FractionalTest5
        return new Fractional(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    public Fractional divide(Integer other) {
        // TODO implement to fix tests in FractionalTest5
        return new Fractional(this.numerator * 1, this.denominator * other);
    }

    public Fractional add(Fractional other) {
        // TODO implement to fix tests in FractionalTest6
        return new Fractional((this.numerator * other.denominator) + (this.denominator * other.numerator), this.denominator * other.denominator);
    }

    public Fractional add(Integer other) {
        // TODO implement to fix tests in FractionalTest6
        return new Fractional((this.numerator) + (this.denominator * other), denominator);
    }

    public Fractional subtract(Fractional other) {
        // TODO implement to fix tests in FractionalTest7
        return new Fractional((this.numerator * other.denominator) - (this.denominator * other.numerator), this.denominator * other.denominator);
    }

    public Fractional subtract(Integer other) {
        // TODO implement to fix tests in FractionalTest7
        return new Fractional((this.numerator) - (this.denominator * other), denominator);
    }

}