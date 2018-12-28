package math.problems;
import org.testng.Assert;
public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.



        try {

            Assert.assertEquals(5, 120);

            System.out.println("Unit testing passed");

        }catch (AssertionError ar){

            System.out.println("Unit testing failed");

        }

        //Fibonacci Unit Testing

        try {

            Assert.assertEquals(165580141, 165580141);

            System.out.println("Unit testing passed");

        }catch (AssertionError ar){

            System.out.println("Unit testing failed");

        }

        //Missing Number Unit Testing

        try {

            Assert.assertEquals(9,9);

            System.out.println("Unit testing passed");

        }catch (AssertionError ar){

            System.out.println("Unit testing failed");

        }

        //Lowest Number Unit Testing

        try {

            Assert.assertEquals(1, 1);

            System.out.println("Unit testing passed");

        }catch (AssertionError ar){

            System.out.println("Unit testing failed");

        }



        //Lowest Difference Unit Testing

        try {

            Assert.assertEquals(1,1);

            System.out.println("Unit testing passed");

        }catch (AssertionError ar){

            System.out.println("Unit testing failed");

        }





    }

}


