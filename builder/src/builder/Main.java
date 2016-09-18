package builder;

public class Main {

    public static void main(String[] args) {

       try {
           // satisfies all conditions
           Target target1 = new Target.Builder("FieldA is set :")
                   .fieldB("fieldB is set ")
                   .fieldC("fieldC is set ")
                   .fieldD(15)
                   .fieldE(12)
                   .build();

           System.out.println("Target : " + target1.getfieldA() + target1.getfieldB() + target1.getfieldC() + target1.getfieldD() + target1.getfieldE());

           // does not satisfy all conditions
           Target target2 = new Target.Builder("FieldA is set :")
                   .fieldB("fieldB is set ")
                   .fieldC("fieldC is set ")
                   .fieldD(12)
                   .fieldE(15)
                   .build();

           System.out.println("Target : " + target2.getfieldA() + target2.getfieldB() + target2.getfieldC() + target2.getfieldD() + target2.getfieldE());
       }

       catch (CustomException message)
       {
           System.out.println(message);
       }

    }
}
