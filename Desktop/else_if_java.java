
/* 
import java.util.Scanner;
class else_if{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks ");
		int marks=sc.nextInt();
		if(marks>=90 && marks <= 100){
			System.out.println("Grade O");
		}
		else if(marks>=80 && marks <90){
			System.out.println("Grade A+");
		}
		else if(marks>=70 && marks<80){
			System.out.println("Grade A");
		}
		else if(marks >= 60){
			System.out.println("grade B");
		}
		else{
			System.out.println("Grade C");
		}
	}
}
*/

/*
import java.util.Scanner;
class switch_case{
	public static void main(String[] args){
		String dayname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day number");
		int day=sc.nextInt();
		switch(day){
		case 1:
			dayname="Sunday";
			break;
		case 2:
			dayname="Monday";
			break;
		case 3:
			dayname="Tuesday";
			break;
		case 4:
			dayname="Wednesday";
			break;

		case 5:
			dayname="Thursday";
			break;
		case 6:
			dayname="Friday";
			break;
		case 7:
			dayname="Saturday";

			break;

		default:
			System.out.println("Invalid");
		}
	System.out.println(dayname);
}
}
import java.util.Scanner;
class leap{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Year");
		int year=sc.nextInt();

		if(year%4==0){
			if(year%100==0 && year%400==0){
				System.out.println("Leap Year");
			}
			else
			{
				System.out.println("leap year");
			}
		}
		else
		{
			System.out.println("not leap year");
		}

}
}

import java.util.Scanner;
class prime_list{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(i%j==0){
					c++;
				}
			}
			if(c==2){
				System.out.println(i);
			}
			c=0;
		}
}
}

//inverse pair
import java.util.Scanner;
class inverse_pair{
	public static void main(String[] args){
		int c=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements of an array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(i<j && arr[i]>arr[j]){
					c++;
				}
			}
		}
	System.out.println("No of Inversion pairs in the array are"+c);
	}
}

import java.util.Scanner;
class sum_elements{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		System.out.println("Enter size of the array ");
		int n=sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter elements of an array ");
		for (int i=0;i<n;i++){
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum of the elements in an array is "+sum);
	}
}

// finding second largest value 
import java.util.Scanner;
class second_large {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array ");
		int n=sc.nextInt();
		int max=0;
		int s_max=0;
		System.out.println("Enter elements of an array ");
		int[] a = new int[n];

		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			if(a[i]>max){
				s_max=max;
				max=a[i];
			}
			else if(a[i]>s_max && a[i]!=max){
				s_max=a[i];
			}
		}

		System.out.println(s_max);
	}
}

//finding the target value
import java.util.Scanner;
class search {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array ");
		int n=sc.nextInt();
		System.out.println("Enter elements ");
		int[] a=new int[n];
		int result=-1;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter target element ");
		int target=sc.nextInt();
		for(int i=0;i<n;i++){
			if(a[i]==target){
				result=i;
			}
		}
		if(result!=-1){
			System.out.println("Target element found at index "+result);
		}
		else{
			System.out.println("Target element not found ");
		}

	}
}


*/
/* 


// to store and return more no of call recieved by customer
import java.util.Scanner;
class cust {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of customers ");
		int n= sc.nextInt();
		int m=0;
		
		System.out.println("Enter no of calls from customers ");
		int[] a=new int[n];
		int j=-1;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			if(a[i]>m){
				m=a[i];
				j=i;
			}
		}
		System.out.println("Enter target element ");
		int target=sc.nextInt();
		System.out.println("More calls recieved is "+m+" from customer"+(j+1));
		for(int i=0;i<n;i++){
			if(a[i]>=target){
				System.out.println("Customer"+(i+1)+" "+a[i]+" target reached");
			}
		}
		
	}
}
*/

// designing a parking lot system
/*

import java.util.Scanner;
class parking{
	public static void main(String[] args){

	
	Scanner sc= new Scanner(System.in);
	int slots=5;
	int[] a=new int[slots];
	int n=0;
	while (n!=5) {

	
	System.out.println("Parking lot system \n 1.Park a car \n 2.Remove a car \n 3.Check is slot is full \n 4. Show status \n 5.Exit \n Enter your choice ");
	n=sc.nextInt();
	
	switch(n){
		case 1:
		System.out.println("Enter slot to park the car ");
		int s=sc.nextInt();
		if(a[s]!=1){
			System.out.println("Car is parked");
			a[s]=1;
		}
		else{
			System.out.println("Slot is full");
		}
		break;
	
		case 2:
		System.out.println("Enter the slot of car to be removed ");
		int r=sc.nextInt();
		a[r]=0;
		System.out.println("Car is removed ");
		break;
		
		case 3:
		System.out.println("Enter slot to be checked ");
		int i=sc.nextInt();
		if(a[i]==0){
			System.out.println("slot is not full");

		}
		else{
			System.out.println("Slot is full");
		}
		break;
        case 4:
		for(i=0;i<n;i++){
			if(a[i]==1){
				System.out.println("slot "+i+" Occupied");
			}
			else{
				System.out.println("slot "+i+" Available");
			}
		}
		break;

		case 5:
		System.out.println("Exiting..");
		break;
        default:
		System.out.println("Enter a valid choice ");

	}
}

}
}


// write a java prog that shows the syncronized keyword or syncronized block

class MultiplicationTable {

    public synchronized void printTable(int number) {
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

// anagram checker with strings

import java.util.Scanner;
import java.util.Arrays;

class anagramstring{
	public static void main(String[] args){
		int c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string1 ");
		String s1=sc.nextLine();
		System.out.println("Enter string2 ");
		String s2 = sc.nextLine();
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
        
		if(s1.length()==s2.length()){
			for(int i=0;i<a1.length;i++){
				if(a1[i]==a2[i]){
					c=1;
				}
				else{
					c=0;
				}
			}

		}
		if(c==1){
			System.out.println("It is anagram");
		}
		else{
			System.out.println("Not an anagram");
		}

	}
}
*/


// appending two strings  time O(len(s1)) space O(len(s1+s2))
/*
import java.util.Scanner;
class stringappender{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1 ");
		String s1 = sc.nextLine();
		System.out.println("Enter String2 ");
		String s2 = sc.nextLine();
		String a=new String();
		System.out.println("Enter index ");
		int index=sc.nextInt();
		int i=0;
		while(i!=-1){
			if(i<index){
				a=a+s1.charAt(i);
				i++;
			}
			else {
				a=a+s2;
				while(i<s1.length()){
					a=a+s1.charAt(i);
					i++;
				}
				i=-1;
			}
			
		}
		System.out.println(a);
	}
}
*/

//to check palidrome of two strings
/* 
import  java.util.Scanner;
import java.util.*;
class palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input=sc.nextLine().toLowerCase();
		String rev = new StringBuilder(input).reverse().toString();
	
		if(rev.equals(input)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
	}
}
*/

// to count no of vowels and consonants in a string
/* 
import java.util.Scanner;
class vowelCounter{
	public static void main(String args[]){
	int v=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter string ");
	String s = sc.nextLine().toLowerCase();
	
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
			v++;
		}
	}
	System.out.println("No of vowels in string is "+v);
	System.out.println("No of consonants in string is "+(s.length()-v));
}
}
*/

