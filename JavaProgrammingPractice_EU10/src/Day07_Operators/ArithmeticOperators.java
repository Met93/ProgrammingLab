package Day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        /*
        20 / 6 = 3
		20.0 / 6 = 3.333....

		10/2 = 5
		10/3 = 3.3333...

		remainder = numerator -(denominator * integer result)
				     10      - (3 * 3) = 1

				     1/3 = 0.3333....

	     10 % 3 ==> 1

	     45 / 8 = 5.625

	     		45 - (8 * 5 ) =5


		 45 % 8 ===> 5


		 100 % 15 ==> 10

		 100 / 15 = 6.66.....
		 100 - (15 * 6) = 10
         */
        System.out.println(20/6);
        System.out.println(20.0/6);
        System.out.println(10/2);
        System.out.println(10/3);
        System.out.println(10%3);
        System.out.println(45d/8);
        System.out.println((45-5)/8);
        System.out.println(45%8);
        System.out.println(100%15);
        System.out.println(100D/15);
        System.out.println(100-(15*6));

    }
}
