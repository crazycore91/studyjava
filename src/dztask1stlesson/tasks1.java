package dztask1stlesson;
import java.util.Scanner;
public class tasks1 {

	public static void main(String[] args) {

		/*int A= 5;
		int B= 7;
		int C = A;
		A=B;
		B=C;
		A = 7;
		B = 5;
		System.out.println(A);
		System.out.println(B);*/

		//7tsk
		/*		int A= 4;
				int B= 6;
				int C= 8;
				int Q = A;
				Q=A;
				A=C;
				C=B;
				B=Q;
				System.out.println(A);
				System.out.println(B);
				System.out.println(C);*/


		//task4.1.1
		//1st

			/*int A = -4;
			boolean a1 = A >= 0;
			System.out.println(a1);*/

		//2st

				/*int A = 4;
				boolean a1 = (A%2)!=0;
				System.out.println(a1);*/

		//3st
		//Даны три целых числа: A, B, C. Проверить истинность высказывания: «Справедливо двойное неравенство A < B < C».
		/*int A= 21;
		int B= 22;
		int C= 30;
		boolean a1 = (A < B) && (B < C);
		System.out.println(a1);*/


		//4d
		/*int A= 13;
		int B= -5;
		int C= 8;
		boolean a1 = (A > 0) || (B > 0 )|| (C > 0) ;
		System.out.println(a1);*/


		//5
		/*int A= 3;
		int B= -7;
		int C= 8;
		boolean a1 =((A > 0) && (B < 0 ) && (C < 0)) ||
		((A < 0) && (B > 0 ) && (C < 0)) ||
		((A < 0) && (B < 0 ) && (C > 0));
		System.out.println(a1);*/

		//6

		/* int A= 13;
		boolean a1 = ((A>99) && (A<1000)) && (A%2)!=0;
		System.out.println(a1);
		*/

		//7 проверить -Даны числа x, y, x1, y1, x2, y2. Проверить истинность высказывания:«Точка с координатами (x, y) лежит внутри прямоугольника, левая верхняя вершина которого имеет координаты (x1, y1), правая нижняя — (x2, y2), а стороны параллельны координатным осям».


	/*	int x = 20;
	    int y = 5;
		int x1 = 18;
		int x2 = 16;
		int y1 = 8;
		int y2 = 10;
		boolean z = (x1>x)&&(x2>x)&&(y1>y)&&(y2>y);
		System.out.println(z); */

		//8 - проверить Даны целые числа a, b, c. Проверить истинность высказывания: «Существует треугольник со сторонами a, b, c».

     /*	int A= 13;
		int B= 5;
		int C= 8;
		boolean z = ((A+B-C)>0) && ((B+C-A)>0) &&((C+A-B)>0);
		System.out.println(z);*/

		//9 - проверить Даны координаты поля шахматной доски x, y (целые числа, лежащие в диапазоне 1–8).
		//Учитывая, что левое нижнее поле доски (1, 1) является черным, проверить истинность высказывания: «Данное поле является белым»

		/*	int x = 4;
		int y = 3;
		boolean c = ((x%3)!=0) && ((y%3)!=0);
		System.out.println(c); */

		//10 проверить Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 (целые числа, лежащие в диапазоне 1–8).
		//Проверить истинность высказывания: «Ферзь за один ход может перейти с одного поля на другое».

	/*	int x1 = 3;
		int y1 = 4;
		int x2 = 5;
		int y2 = 6;
		boolean c = ((x1*y1)>64)&&((x2*y2)>64);
		System.out.println(c); */


		//11
		// Даны два числа А и В. Поменяйте их местами не используя дополнительную переменную и арифметические операции
		/*int A = 5;
		int B = 7;
		A=A+B-(B=A);
		System.out.println(A);
		System.out.println(B);*/

		//lesson 4.2
		//1

		/* int L = 15000;
		int C = L/100;
		System.out.println(C);*/

		// 2  Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.

		/*int x = 47;
		int x1 = x/10;
		int x2 = x%10;
		System.out.println(x2+ ""+ x1);*/


		// 3 Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево.
		/*int x = 367;
		int x1 = x/100;
		int x2 = x%100/10;
		int x3 = x%10;
		System.out.println(x3+""+x2+""+x1);*/


		// 4.2.4 Даны целые положительные числа A, B, C. На прямоугольнике раз мера  A × B размещено максимально возможное количество квадратов со стороной C (без наложений).
		// Найти количество квадратов, размещенных на прямоугольнике, а также площадь незанятой части прямоугольника.
		// (необходимо пояснение)
		/*int a = 9;
		int b = 8;
		int c = 22;
		int Q = (a/c)*(b/c);
		int Z = a*(b%c)+b*(a%c)-(b%c)+(a%c);
		System.out.println("количество = " + Q);
		System.out.println("ploscghad' = "+Z);*/


		//lesson 5
		//tasks

		//1
/*
		Scanner in = new Scanner(System.in);
		System.out.println("Введите положительное число");
		int n = in.nextInt();
		if (n>0) {
		System.out.println(n+1);
		}
		else{
		System.out.println("Введено не положительное число");
		}
*/


		//3st
		/*Scanner in = new Scanner(System.in);
		System.out.println("Введите первое число:");
		int a = in.nextInt();
		System.out.println("Введите второе число:");
		int b = in.nextInt();
		System.out.println("Введите третье число:");
		int c = in.nextInt();
		int x = 0;
		if (a>0) {
		++x;
		}
		if (b>0) {
		++x;
		}
		if (c>0) {
		++x;
		}
		System.out.println("Колличество положительных чисел = " +x);*/

		//2nd
		/*Scanner in = new Scanner(System.in);
		System.out.println("Введите целое число:");
		int x = in.nextInt();
		if (x>0) {
		System.out.println(x+1);
		}
		if (x<0) {
		System.out.println(x-2);
		}
		if (x==0) {
		System.out.println(10);
		}
		System.out.println("Программа закончила свое выполнение");*/


		//4th
		/*Scanner in = new Scanner(System.in);
		System.out.println("Введите первое число:");
		int a = in.nextInt();
		System.out.println("Введите второе число:");
		int b = in.nextInt();
		System.out.println("Введите третье число:");
		int c = in.nextInt();
		int x = 0;
		int y = 0;
		if (a>0) {
		++x;
		}
		else{
			++y;
			}
		if (b>0) {
		++x;
		}
		else{
			++y;
		}
		if (c>0) {
		++x;
		}
		else{
			++y;
		}
		System.out.println("Колличество положительных чисел = " +x);
		System.out.println("Колличество отрицательныз чисел = " +y);*/

		//5 task
/*		Scanner in = new Scanner(System.in);
		System.out.println("Введите первое число:");
		int a = in.nextInt();
		System.out.println("Введите второе число:");
		int b = in.nextInt();
		System.out.println("Введите третье число:");
		int c = in.nextInt();
		int x = a;
		if (x>b){
			x=b;
		}
		if (x>c){
			x=c;
		}
		if (x>a){
			x=a;
		}
		System.out.println("Наименьшее число = " +x);*/

		//6 task 1st method
		/*Scanner in = new Scanner(System.in);
		System.out.println("Введите номер года:");
		int a = in.nextInt();
		int d = 0;
		if ((a%4==0)&&(a%100==0)&&(a%400!=0)){
			d=365;
		}
		if ((a%4==0)&&(a%400==0)){
			d=366;
		}
		else
		{
			d=365;
		}
		System.out.println("Номер года "+a+" имеет "+ d + " дней в году" );*/

		//1st method
/*			Scanner in = new Scanner(System.in);
			System.out.println("Введите номер года:");
			int a = in.nextInt();
			if ((a%4==0)&&(a%100==0)&&(a%400!=0)){
				System.out.println("Номер года "+a+" имеет "+ 365 + " дней в году" );
			}
			if ((a%4==0)&&(a%400==0)){
				System.out.println("Номер года "+a+" имеет "+ 366 + " дней в году" );
			}
			if(a%4!=0){
				System.out.println("Номер года "+a+" имеет "+ 365 + " дней в году" );
			}*/

        // 7task
/*		Scanner in = new Scanner(System.in);
		System.out.println("Введите любое целое число от 1 до 999:");
		int a = in.nextInt();
		if ((a<99)&&(a>9)&&(a%2!=0)){
		System.out.println(a+" - данное число, является нечетным, двухзначным");
		}
		if ((a<99)&&(a>9)&&(a%2==0)){
			System.out.println(a+" - данное число, является четным, двухзначным");
			}
		if ((a<=999)&&(a>99)&&(a%2!=0)){
			System.out.println(a+" - данное число, является нечетным, трехзначным");
			}
		if ((a<=999)&&(a>99)&&(a%2==0)){
			System.out.println(a+" - данное число, является четным, трехзначным");
			}*/

		// 8task
		/*Scanner in = new Scanner(System.in);
		System.out.println("Введите день недели, используя число от 1 до 7:");
		int a = in.nextInt();
		switch (a) {
		case 1: System.out.println(a+" - понедельник"); break;
		case 2: System.out.println(a+" - вторник"); break;
		case 3: System.out.println(a+" - среда"); break;
		case 4: System.out.println(a+" - четверг"); break;
		case 5: System.out.println(a+" - пятница"); break;
		case 6: System.out.println(a+" - суббота"); break;
		case 7: System.out.println(a+" - воскресенье"); break;
		default:System.out.println("Введено число не принадлежащее диапазону от 1 до 7"); break;
		}*/

		// 9task
	/*	Scanner in = new Scanner(System.in);
		System.out.println("Введите число от 1 до 5:");
		int K = in.nextInt();
		switch (K) {
			case 1: System.out.println(K+" - плохо"); break;
			case 2: System.out.println(K+" - неудовлетворительно"); break;
			case 3: System.out.println(K+" - удовлетворительно"); break;
			case 4: System.out.println(K+" - хорошо"); break;
			case 5: System.out.println(K+" - отлично"); break;
			default:System.out.println("Введено число не принадлежащее диапазону от 1 до 5"); break;
		}*/

       // 10 task

/*		Scanner in = new Scanner(System.in);
		System.out.println("Введите число от 1 до 5:");
		int a = in.nextInt();
		System.out.println("Введите длинну отрезка:");
		int b = in.nextInt();
		switch (a) {
			case 1:
				System.out.println("Ваша единица измерения - дециметр, длинна отрезка "+0.1*b +" м");
				break;
			case 2:
				System.out.println("Ваша единица измерения - киллометр, длинна отрезка "+b*1000 +" м");
				break;
			case 3:
				System.out.println("Ваша единица измерения - метр, длинна отрезка "+1*b +" м");
				break;
			case 4:
				System.out.println("Ваша единица измерения - миллиметр, длинна отрезка "+b/1000.000 +" м");
				break;
			case 5:
				System.out.println("Ваша единица измерения - сантиметр, длинна отрезка "+b/100.00 +" м");
				break;
			default:
				System.out.println("Введеное число не соответствует корректным параметрам ");
				break;
		}*/
		
		//less 5.02 1st task
		int A = 33;
		int B = 54;
		int N = 0;
        for(int s =A;s<=B;s++){
        	if(s==B) break;
        	System.out.println(s);
        }
	}

}