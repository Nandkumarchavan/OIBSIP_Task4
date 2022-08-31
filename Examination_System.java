//Nandkumar Sambhaji Chavan
//Task-4 Online Examination System
//Java Development





package EXAM;

import java.util.*;
public class Examination_System {
Scanner input=new Scanner(System.in);
HashMap<String,Integer> data=new HashMap<String,Integer>();
	
	public void login() {
		data.put("Nandkumar",12345);
		data.put("Nandu",54331);
		System.out.println("\n\n-----Welcome to online exam portal-----");
		String userid;
		int pwd;
		System.out.println("Login to continue.....");
		System.out.print("Enter user id : ");
		userid=input.next();
		System.out.print("Enter password : ");
		pwd=input.nextInt();
		if(data.containsKey(userid) && data.get(userid)==pwd) {
			System.out.println("Login sucessful");
				option_menu();
		}
		else {
			System.out.println("SORRY!!! Invalid Login");
			System.out.println("Try again");
				login();
		}
	}
	public void option_menu() {
		int select;
		System.out.println("Enter the option you want to perform");
		System.out.println("1.Start The Exam");
		System.out.println("2.Update profile and password");
		System.out.println("3.Logout");
		select=input.nextInt();
		switch(select) {
		case 1:
			exam_que();
			option_menu();
			break;
		case 2:
			data=update();
			option_menu();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid entry");
		}
	}
	
	
	public HashMap<String,Integer> update(){
		String uuser;
		int upwd;
		System.out.println("Welcome to Update profile");
		System.out.println("Enter user name");
		uuser=input.next();
		if(data.containsKey(uuser)) {
		System.out.println("Enter new password you to want to update to your profile");
		upwd = input.nextInt();
		data.replace(uuser, upwd);
		}
		else {
			System.out.println("User doesn't exist");
		}
		return data;
	}
public void exam_que() {
	long examtime=System.currentTimeMillis();
	long endtime=examtime+30;
	int ans_count=0;
	int ans,score;
	System.out.println("Start the exam");
	
	//Questions Start Here
	
	
	while(System.currentTimeMillis()<endtime) {
		System.out.println("You have 30 seconds to answer 5 questions");
		System.out.println("Each question carries 10 marks"+" "+"-5 for wrong answer");
		System.out.println("\n\nQ1.QuickSort can be categorized into which of the following?");
		System.out.println("\n1)Brute Force technique"+"\t"+"2)Divide and conquer"+"\t"+"3) Greedy algorithm"+"\t"+"4)Dynamic programming");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Locked...");
		if(ans==2) {
			ans_count++;
		}
		System.out.println("\n\nWhat is the worst case complexity of QuickSort?");
		System.out.println("1)O(nlogn)"+"\t"+"2)O(logn)"+"\t"+"3)O(n)"+"\t"+"4)O(n2)");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Locked...");
		if(ans==4) {
			ans_count++;
		}
		System.out.println("\n\nWhat is the disadvantage of selection sort?");
		System.out.println("1) It requires auxiliary memory"+"\t"+"2)It is not scalable"+"\t"+"3)It can be used for small keys"+"\t"+"4)It takes linear time to sort the elements");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Locked...");
		if(ans==2) {
			ans_count++;
		}
		System.out.println("\n\nThe descending heap property is ___________");
		System.out.println("1) A[Parent(i)] = A[i]"+"\t"+"2) A[Parent(i)] <= A[i]"+"\t"+"3) A[Parent(i)] >= A[i]"+"\t"+"4)  A[Parent(i)] > 2 * A[i]");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Locked...");
		if(ans==3) {
			ans_count++;
		}
		System.out.println("\n\n What is its wort case time complexity of Heap sort?");
		System.out.println("1) O(nlogn)"+"\t"+"2) O(n2logn)"+"\t"+"3) O(n2)"+"\t"+"4)  O(n3)");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Locked...");
		if(ans==1) {
			ans_count++;
		}
		break;
	}
	System.out.println("You have finished the exam");
	score=ans_count*10-((5-ans_count)*5);
	System.out.println("Your score is..."+" "+score+"/50");	
}

public static void main (String[] args)
{
	Examination_System log =new Examination_System();
		log.login(); 
}
}
