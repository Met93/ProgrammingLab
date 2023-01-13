package Day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        /*
        ++: increase the value by 1.
	-- : decreases the value by 1.

	Post vs Pre:
		Pre : changes the value immediately
				++ a
				-- a

		post: changes the value in the second step.
				a ++
				a --


int x = 100;

	x = 200

String str = "Java";

	str += " Programming";

int a = 400;

a += 300;

Operators:
	+, -, *, /, %
	++, --
	=, +=, -=
	>, <, >=, <=, ==, !=
         */
        int x=100;
        x=200;
        System.out.println(x);
        String str="Java";
        str +=" Programming";
        int a=400;
        a+=300;
        System.out.println(str);
        System.out.println(a);
    }
}
