import java.util.Scanner;

public class MensurationSolution {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\t--Mensuration System Project--");
		Scanner sc = new Scanner(System.in);
		int num, nums, x, a, b, c, l, w, be, h, s, d, r, k, circle, square, rectangle, parallelogram, sphere, cylinder,
				cuboid, cube;
		char v;
		double result;
		System.out.println("1. Circle\n2. Square\n3. Rectangle\n4. Pallelogram");
		System.out.print("Enter your choice: ");
		int main_choice = sc.nextInt();
		switch (main_choice) {
			case 1: {
				System.out.println("==========");
				System.out.println("\n1.Enter the Area of Circle:\n\n2.Enter the Perimter of circle:\n\n3.Exit\n");
				System.out.print("Enter your choice: ");
				int main_circle = sc.nextInt();
				switch (main_circle) {
					case 1:
						Scanner circles = new Scanner(System.in);
						System.out.println("Circle Calculation");
						System.out.println("---------------------");
						System.out.print("Enter radius: ");
						int c_radius = circles.nextInt();
						num = c_radius;
						result = 3.14 * num * num;
						System.out.println("Area of circle = " + result);
						break;

					case 2:
						Scanner p_radius_number = new Scanner(System.in);
						System.out.println("Perimeter Calculation");
						System.out.println("---------------------");
						System.out.print("Enter radius: ");
						int p_radius = p_radius_number.nextInt();
						num = p_radius;
						result = 2 * 3.14 * num;
						System.out.println("Perimeter of circle = " + result);
						break;
				}
				break;
			}

			case 2: {
				System.out.println("==========");
				System.out.println("\n1.Enter the Area of Square\n2.Enter the Perimter of Square:\n3. Exit");
				System.out.print("Enter your choice: ");
				int main_square = sc.nextInt();
				switch (main_square) {
					case 1:
						Scanner squares = new Scanner(System.in);
						System.out.println("Area of square Calculation");
						System.out.println("---------------------");
						System.out.print("Enter sides in cm: ");
						int s_sides = squares.nextInt();
						a = s_sides;
						result = a * a;
						System.out.println("Area of Square = " + result);
						break;

					case 2:
						Scanner p_squares = new Scanner(System.in);
						System.out.println("Area of square Calculation");
						System.out.println("---------------------");
						System.out.print("Enter sides in cm: ");
						int sp_sides = p_squares.nextInt();
						c = sp_sides;
						result = 4 * c;
						System.out.println("Area of Square = " + result);
						break;
				}
				break;
			}

			case 3: {
				System.out.println("=============");
				System.out.println("\n1.Enter the Area of Rectangle\n2.Enter the Perimter of Rectangle\n3.Exit");
				System.out.print("Enter your choice: ");
				int main_rectangle = sc.nextInt();
				switch (main_rectangle) {
					case 1:
						Scanner rectangles = new Scanner(System.in);
						System.out.println("Area of Reactangle Calculation");
						System.out.println("---------------------");
						System.out.print("Length = ");
						int r_length = rectangles.nextInt();
						System.out.print("Width =");
						int r_width = rectangles.nextInt();
						l = r_length;
						b = r_width;
						result = l * b;
						System.out.println("Area of Reactangle = " + result);
						break;

					case 2:
						Scanner p_perimeters = new Scanner(System.in);
						System.out.println("Perimeter of Rectangle Calculation");
						System.out.println("---------------------");
						System.out.print("Length = ");
						int p_length = p_perimeters.nextInt();
						System.out.print("Width = ");
						int p_width = p_perimeters.nextInt();
						l = p_length;
						b = p_width;
						result = 2 * (l + b);
						System.out.println("Perimeter Of Rectangle = " + result);
						break;
				}
				break;
			}	
			case 4:{
				System.out.println("=============");
				System.out.println("Parallelogram Calculation");
				System.out.println("\n1.Enter the Area of Parallelogram\n2.Enter the Perimter of Parallelogram\n3.Exit\n");
				System.out.print("Enter your choice: ");
				int main_parallelogram = sc.nextInt();
				switch (main_parallelogram) {
					case 1:
						Scanner parallelograms = new Scanner(System.in);
						System.out.println("Area of Parallelogram Calculation");
						System.out.println("---------------------");
						System.out.print("Base = ");
						int p_base = parallelograms.nextInt();
						System.out.print("Height =");
						int p_height = parallelograms.nextInt();
						be = p_base;
						h = p_height;
						result = be * h;
						System.out.println("Area of Parallelogram = " + result);
						break;

					case 2:
						Scanner p_pallelograms = new Scanner(System.in);
						System.out.println("Perimeter of Parallelogram Calculation");
						System.out.println("---------------------");
						System.out.print("Base = ");
						int pp_base = p_pallelograms.nextInt();
						System.out.print("Side = ");
						int pp_side = p_pallelograms.nextInt();
						be = pp_base;
						s = pp_side;
						result = 2 * (be + s);
						System.out.println("erimeter of Parallelogram = " + result);
						break;
					case 3:
						System.exit(0);
						//break;
						return;
				}
				break;

			}

		}
	}
}