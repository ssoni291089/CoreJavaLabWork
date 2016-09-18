package builder;

/**
 * Created by shsoni on 9/17/2016.
 */
// Target class
public class Target {

    private final String fieldA;
    private final String fieldB;
    private final String fieldC;
    private final int fieldD;
    private final int fieldE;

    public String getfieldA() {
        return fieldA;
    }

    public String getfieldB() {
        return fieldB;
    }

    public String getfieldC() {
        return fieldC;
    }

    public int getfieldD() {
        return fieldD;
    }

    public int getfieldE() {
        return fieldE;
    }

    private Target(Builder builder) {
        this.fieldA = builder.fieldA;
        this.fieldB = builder.fieldB;
        this.fieldC = builder.fieldC;
        this.fieldD = builder.fieldD;
        this.fieldE = builder.fieldE;
    }



// nested Builder class
    public static class Builder
    {
        private final String fieldA;
        private String fieldB;
        private String fieldC;
        private int fieldD;
        private int fieldE;

        public Builder(String fieldA) {
            this.fieldA = fieldA;
        }

        public Builder fieldB(String fieldB)
        {
            this.fieldB = fieldB;
            return this;
        }

        public Builder fieldC(String fieldC)
        {
            this.fieldC = fieldC;
            return this;
        }

        public Builder fieldD(int fieldD)
        {
            this.fieldD = fieldD;
            return this;
        }

        public Builder fieldE(int fieldE)
        {
            this.fieldE = fieldE;
            return this;
        }

        public Target build() throws CustomException
        {
            Target target =  new Target(this);
            isValid(target);
            return target;
        }

        // the function that validates the rules
        private void isValid(Target target) throws CustomException {

             if (target.fieldA == null) {
                 throw new CustomException("fieldA is null! ");
             }

             if (target.fieldD <= fieldE) {
                 throw new CustomException("fieldD is less than or equal to fieldE! ");
             }

             if (target.fieldB == null || fieldC == null) {
                 throw new CustomException("Either fieldB or fieldC is missing! ");
             }
         }

    }

}
