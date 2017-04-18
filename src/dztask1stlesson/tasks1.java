package dztask1stlesson;
import java.util.Random;
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

	      /*  int x1 = 3;
	        int y1 = 4;
	        int x2 = 5;
	        int y2 = 6;
	        boolean c = ((x1 + y1) > 8) && ((x2 + y2) > 8);
	        System.out.println(c);*/


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

        // 2 Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.

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


        // 4.2.4 Даны целые положительные числа A, B, C. На прямоугольнике раз мера A × B размещено максимально возможное количество квадратов со стороной C (без наложений).
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
			/* Scanner in = new Scanner(System.in);
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
			/* Scanner in = new Scanner(System.in);
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
			}
			if(a%4==0){
			System.out.println("Номер года "+a+" имеет "+ 366 + " дней в году" );
			}
			*/
        // 7task
			/* Scanner in = new Scanner(System.in);
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
			/* Scanner in = new Scanner(System.in);
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

			/* Scanner in = new Scanner(System.in);
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


			/*int K = 15;
			int M = 4;
			int C = (M+K-1)/M;
			System.out.println(C);*/


        //less 6.02 1st task 1st method

			/*Scanner in = new Scanner(System.in);
			System.out.println("Введите число A:");
			int A = in.nextInt();
			System.out.println("Введите число B");
			int B = in.nextInt();
			for(int s =A;s<B;s++){
			System.out.println(s);
			}
			System.out.println("Колличество чисел = " + (B-A));*/

        //2st method
			/* Scanner in = new Scanner(System.in);
			System.out.println("Введите число A:");
			int A = in.nextInt();
			System.out.println("Введите число B");
			int B = in.nextInt();
			int s = A;
			do {
			System.out.println(s);s++;
			}
			while (s<B);
			System.out.println("Колличество чисел = " + (B-A));*/

        //2task
	/*		 Scanner in = new Scanner(System.in);
			System.out.println("Введите число A:");
			int A = in.nextInt();
			System.out.println("Введите число B");
			int B = in.nextInt();
			int s = B-1;
			while (s>A){
			System.out.println(s);s--;
			}
			System.out.println("Колличество чисел = " + (B-A));
	*/
        //3task на проверку
		/*	 Scanner in = new Scanner(System.in);
			System.out.println("Введите число A:");
			int A = in.nextInt();
			System.out.println("Введите число B");
			int B = in.nextInt();
			int s = A;
			while(s>B){
			System.out.println(A-s);s--;
			}
			System.out.println("Колличество чисел = " + (A-B));*/

        //4task на проверку
			/* Дано целое число N (> 3). Если оно является степенью числа 3, то вывести True, если не
	          является — вывести False. */

		/*	Scanner in = new Scanner(System.in);
			System.out.println("Введите число N:");
			int N = in.nextInt();
		    while((Math.pow(N, 3))%3!=0){
				System.out.println(false);
				if (((Math.pow(N, 3))%3!=0)) break;
			}
			while((Math.pow(N, 3))%3==0){
				System.out.println(true);
				if (((Math.pow(N, 3))%3==0)) break;
			}*/

/*			5.Начальный вклад в банке равен 1000 руб. Через каждый месяц размер вклада увеличивается на
			P процентов от имеющейся суммы (P — вещественное число, 0 < P < 25). По данному P
			определить, через сколько месяцев размер вклада превысит 1100 руб., и вывести найденное
			количество месяцев K (целое число) и итоговый размер вклада S (вещественное число). */
        // разобрать
/*			Scanner in = new Scanner(System.in);
			System.out.println("Введите число 0 < P < 25:");
			int P = in.nextInt();
			int a = 1000,K=0;
	        int S=a;
			 while(S<1100) {
	            int d = (a*P)/100;
	            S+=d;K++;
			 }
			 System.out.println(S);
			 System.out.println(K);*/

	       /* 6. Дано целое число N (> 0). Используя операции деления нацело и взятия остатка от деления,
	         найти число, полученное при прочтении числа N справа налево.*/
//1st
	 /*      Scanner in = new Scanner(System.in);
	        System.out.println("Введите число N(> 0):");
	        int N = in.nextInt();
	        int n = 0;
	        while(N>0){
	            n*=10;
	            n+=N%10;
	            N/=10;
	        }System.out.println(n);*/

        //2d
		/*	Scanner in = new Scanner(System.in);
	        System.out.println("Введите число N(> 0):");
	        int N = in.nextInt();
	        int n = 0;
	        do {
	            n*=10;
	            n+=N%10;
	            N/=10;
	        }while(N>0);
	            System.out.print(n);*/

        // 7. Найти число Фибоначчи под номером N.

     /*   Scanner in = new Scanner(System.in);
        System.out.println("Введите любое число:");
        int n = in.nextInt();
        int a = 1, b=1;
        int i =2;
        int fib = i;
        while(i<n) {
            fib = a + b;
            a = b;
            b = fib;
            i+=1;
        }System.out.println(fib);
*/

        //less 1_7 1st
			/*2. Дано целое число N (> 0). Найти произведение
			N! = 1·2·…·N
			(N–факториал). Чтобы избежать целочисленного переполнения, вычислять это произведение
			с помощью вещественной переменной и вывести его как вещественное число.*/

			/* Scanner in = new Scanner(System.in);
			System.out.println("Введите число N(N>0):");
			int N = in.nextInt();
			int x = 1;
			for(double i =2; i<=N; i++)
			x *= i;
			System.out.println(x);*/

			/* 1. Дано целое число N (> 0). Найти значение выражения
			1 – 2 + 3 – … (N слагаемых, знаки чередуются). Условный оператор не использовать.*/
        
    	// на проверку
		/*	Scanner in = new Scanner(System.in);
			System.out.println("Введите число N(N>0):");
			int N = in.nextInt();
			int x = 0;
			int y = 1;
			for(int i = 1;i<=N;i++){
			x +=y*i;
			y*= -1;
			}System.out.println(x);*/

			/*Даны целые числа A и B (A < B). Вывести все целые числа от A до B включительно; при этом
			число A должно выводиться 1 раз, число A + 1 должно выводиться 2 раза и т. д.*/
			
	/*		Scanner in = new Scanner(System.in);
			System.out.println("Введите число A");
			int A = in.nextInt();
			System.out.println("Введите число B:");
			int B = in.nextInt();
			for(int i = A;i<=B;i++){
				for(int j = A-1;j<i;j++){
					System.out.print(i + " ");
				}
			}*/
			
    	/*Дано целое число N (> 1). Если оно является простым, то есть не имеет положительных
    	делителей, кроме 1 и самого себя, то вывести True, иначе вывести False.*/
    	
			/*Scanner in = new Scanner(System.in);
			System.out.println("Введите число N>1:");
			int N = in.nextInt();*/

        // 8 lesson massive
        //Math.random()
        //Вести н - элементов из целых чисел в диапазоне от 20 до 50

			/* int list[] = {1,3,5,7,9,8,6,2,0};
			for(int i = 0; i<list.length; i++){
			System.out.println(list[i]);
			}*/
        //1. task
			/* Scanner in = new Scanner(System.in);
			System.out.println("Введите число n(колличество чисел):");
			int n = in.nextInt();
			int [] mas = new int[n]; // числа введенные с клавиатуры
			for(int i = 0; i<mas.length; i++){
			mas[i]=(int)(Math.random()*30)+20;// сложение перемещает, умножение расширить
			System.out.print(mas[i]+" ");
			}*/

			/* Дано целое число N (> 0). Сформировать и вывести целочисленный
			массив размера N, содержащий N первых положительных нечетных чисел:
			1, 3, 5, … .*/

			/* Scanner in = new Scanner(System.in);
			System.out.println("Введите число n(колличество чисел):");
			int N = in.nextInt();
			int [] mas = new int[N];// создали заполнили 0 нулями
			for(int i = 0; i<N; i++){
			mas[i]=2*i+1;
			System.out.print(mas[i]+" ");
			}*/

			/*2. Дан массив размера N. Вывести его элементы в обратном порядке. */
      // проверить
/*        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n(колличество чисел):");
        int N = in.nextInt();
        int [] mas = new int[N];
        for(int i = 0; i<N; i++){
        	mas[i]=i;
        }
        for(int i = N-1;i>=0;i--){
            System.out.print(mas[i]+" ");
        }*/
    	
    	//Дан массив размера N. Найти минимальный и максимальный элементы.
    	
    	 Scanner in = new Scanner(System.in);
         System.out.println("Введите число N(lenth.mas):");
         int N = in.nextInt();
         int [] mas = new int[N]; 
         for(int i = 0; i<N; i++){
         	mas[i]=i;
         }
         System.out.println("Min el.mas" +" " + mas[0]);
         for(int i = N-1;i>=0;i--){
    }     
         System.out.println("Max el.mas" +" " + mas[N-1]);
    }
}
