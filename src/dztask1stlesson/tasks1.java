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
				boolean a1 = (A%1)==0;
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

		// 2 доделать Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.

		/*int x = 47;
		int x1 = x/10;
		int x2 = x%10;
		System.out.println(x2+ ""+ x1);*/


		//lesson 5
		//tasks
		//1

		/*Scanner in = new Scanner(System.in);
		System.out.println("Введите положительное число");
		int n = in.nextInt();
		if (n>0) {
		System.out.println(n+1);
		}
		else{
		System.out.println("Введено не положительное число");
		}
*/
		/*int x= 6;
		if (x>0) {
		System.out.println(x+1);
		}
		else{
		System.out.println(x);
		}*/

		//3st
		/* int a = 4;
		int b = -5;
		int c = 6;
		Scanner in = new Scanner(System.in);
		int x =0;
		if (a>0) {
		++x;
		}
		if (b>0) {
		++x;
		}
		if (c>0) {
		++x;
		}
		System.out.println(x);*/

		//2nd
		/* int x= 0;
		if (x>0) {
		System.out.println(x+1);
		if(x<0) {
		System.out.println(x-2);
		}
		}
		else{
		System.out.println(10);
		}*/

		//5th
		int a = 4;
		int b = -5;
		int c = 6;
		}
		}
