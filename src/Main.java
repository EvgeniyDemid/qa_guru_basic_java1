public class Main {
	public static void main(String[] args) {
		countingUpFive(1);
		countingUpFive(2);
		countingUpFive(3);
		countingUpFive(4);
		countingUpFive(5);
		countingUpFive(6);
		countingUpFive(0);
		System.out.println("Сумма чисел 5 и 10 равна " + intSum(5, 10));
		System.out.println("Произведение  чисел 5 и 10 равно " + intMultiplication(5, 10));
		System.out.println("Результат деления числа 10 на 5 равно " + intDivision(10, 5));
		System.out.println("Результат деления числа 5 на 10 равно " + intDivision(5, 10) + " так как это тип переменных int");
		System.out.println("Если из 5 вычесть 10 то получиться " + intDifferencen(5, 10));
		System.out.println("Остаток при делении числа 5 на число 3 равен " + remainder(5, 3));
		System.out.println("Инкремент числа " + increment(5));
		System.out.println("Декримент числа " + decrement(5));
		System.out.println("Если сложить две строки то получиться  " + sumString("Hellow", "peace"));
		System.out.println("Если сложить строку и число то получиться   " + sumStringAndInt("Hellow", 2));

		System.out.println("Сумма чисел 5 и 10.5 равна " + intSum(5, 10.5));
		System.out.println("Произведение  чисел 5 и 10.5 равно " + intMultiplication(5, 10.5));
		System.out.println("Результат деления числа 10 на 5.5 равно " + intDivision(10, 5.5));
		System.out.println("Остаток при делении числа 5 на число 3.6 равен " + remainder(5, 3.6));
		System.out.println("Произведение числа 5 и 6.67 результат double " + intMultiplicationDouble(5, 6.67));
		System.out.println("Произведение  чисел с выходом за пределы " + intMultiplication(2147483647, 2147483647));
		System.out.println("Сумма  чисел с выходом за пределы " + intSum(Integer.MAX_VALUE, Integer.MAX_VALUE));
		System.out.println("Сумма чисел 5.56 и 10.5 равна " + doubleSum(5.56, 10.50));
		System.out.println("Произведение чисел 5.5 и 10.5 равна " + doubleMultiplication(5.5, 10.5));
	}

	public static int intMultiplication(int a, int b) {
		return a * b;
	}

	public static double doubleMultiplication(double a, double b) {
		return a * b;
	}

	public static int intMultiplication(int a, double b) {
		return (int) (a * b);
	}

	public static double intMultiplicationDouble(int a, double b) {
		return (a * b);
	}

	public static int intSum(int a, int b) {
		return a + b;
	}

	public static double doubleSum(double a, double b) {
		return a + b;
	}

	public static int intSum(int a, double b) {
		return (int) (a + b);
	}

	public static int intDivision(int a, int b) {
		return a / b;
	}

	public static int intDivision(int a, double b) {
		return (int) (a / b);
	}

	public static int intDifferencen(int a, int b) {
		return a - b;
	}

	public static int intDifferencen(int a, double b) {
		return (int) (a - b);
	}

	public static int remainder(int a, int b) {
		return a % b;
	}

	public static int remainder(int a, double b) {
		return (int) (a % b);
	}

	public static int increment(int a) {
		return ++a;
	}

	public static int decrement(int a) {
		return --a;
	}

	public static String sumString(String a, String b) {
		return a + b;
	}

	public static String sumStringAndInt(String a, int b) {
		return a + b;
	}

	public static void countingUpFive(int a) {
		if (a > 5 || a < 1) {
			System.out.println("Число должно быть в пределах от 1 до 5");
		} else {
			if (a == 3) {
				System.out.println("Число равно 3");
			} else if (a < 3) {
				System.out.println("Число меньше 3");
				if (a == 1) {
					System.out.println("Число рано 1");
				} else {
					System.out.println("Число равно 2");
				}
			} else if (a > 3) {
				System.out.println("Число больше 3");
				if (a == 5) {
					System.out.println("Число равно 5");
				} else {
					System.out.println("Число равно 4");
				}
			}
		}

	}

}