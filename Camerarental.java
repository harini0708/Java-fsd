package com.project;

import java.util.ArrayList;
import java.util.Scanner;


public class Camerarental {
	

	static  Scanner sc=new Scanner(System.in);
	 static ArrayList<Integer> CAMERAID = new ArrayList<>();
	    static ArrayList<String> BRAND = new ArrayList<>();
	    static ArrayList<String> MODEL = new ArrayList<>();
	    static ArrayList<Double> PRICE = new ArrayList<>();
	    static ArrayList<String> STATUS = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating welcome screen
		System.out.println("+-----------------------------------+");
		System.out.println("|   WELCOME TO CAMERA RENTAL APP    |");
		System.out.println("+-----------------------------------+");
		login();
		
	}
		static //Scanner reader;
		//getting input for login into account
		void login() {
		System.out.println("Please LOGIN to continue...");
		System.out.println("USERNAME-");
		String username=sc.nextLine();
	    System.out.println("password-");
		String password=sc.nextLine();
		if(password.equals("")) {
			System.out.println("successfully logged in to your account!!..");
		}
		else {
			System.err.println("please enter correct password or username");
			login();
		}
		
		initializeCameraData();}
	//	Camera.viewcamera();
		//options to be displayed
		private static void initializeCameraData() {		
		CAMERAID.add(1);
		CAMERAID.add(2);
		CAMERAID.add(4);
		CAMERAID.add(5);
	//	getinput2(CAMERAID);
		BRAND.add("Some");
		BRAND.add("nikon");
		BRAND.add("sony");
		BRAND.add("samsung");
	//	getinput2(BRAND);
		MODEL.add("some");
		MODEL.add("another");
		MODEL.add("DSLR-D7500");
		MODEL.add("SM123");
		
		PRICE.add(200.0);
		PRICE.add(100.0);
		PRICE.add(500.0);
		PRICE.add(200.0);
		
		STATUS.add("Rented");
		STATUS.add("Available");
		STATUS.add("Available");
		STATUS.add("Rented");
	mainmenu();}

static void mainmenu(){
		String[] arr= {"1. My camera",
				       "2. Rent a camera",
				       "3. View all camera",
				       "4. My wallet",
				       "5. Exit"};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		
		}
		int option=sc.nextInt();
		switch(option) {
		case 1:
		{
			//doubt.doublr();
			Camera.mycamera();
			mainmenu();
			break;
		}
		case 2:
		{
			Rentcamera.availablecamera();
			break;
			
		}
		case 3:
		{
			displayCameraValues() ;
			mainmenu();
			break;
		}
		case 4:
		{
			Mywallet.wallet();
			//mainmenu();
			break;
		}
		case 5:
		{
			System.out.println("thank you");
			break;
		}
		default:
		{
			System.out.println("invalit option");
			mainmenu();
			
		}
		
	}
	}
public static void displayCameraValues() {
    System.out.println("=============================================================================");
    System.out.printf("%-15s%10s%15s%15s%15s%n", "CAMERA ID", "BRAND", "MODEL", "PRICE(PER DAY)", "STATUS");
    System.out.println("=============================================================================");

    for (int i = 0; i < CAMERAID.size(); i++) {
        System.out.printf("%-15s%10s%15s%15f%15s%n",
             CAMERAID.get(i),
                BRAND.get(i),
                MODEL.get(i),
              PRICE.get(i),
               STATUS.get(i));
    }
}

public class Camera {
	public static ArrayList<Integer> CAMERAID= new ArrayList<>();
	 public static ArrayList<String> BRAND= new ArrayList<>();
	 public static ArrayList<String> MODEL= new ArrayList<>();
	 public static ArrayList<Double> PRICE= new ArrayList<>();
	 public static ArrayList<String> STATUS= new ArrayList<>();
	
	static void mycamera() {
		
	  String[] arr1= {"1. Add",
	          "2. Remove",
	          "3. View my cameras",
	          "4. Go to previous menu"};
    
for(int i=0;i<arr1.length;i++) {
	System.out.println(arr1[i]);

}
      
	int inputcamera=Camerarental.sc.nextInt();
	
	switch(inputcamera){
	case 1:
	{

		System.out.print("enter camera id");
		int id=Camerarental.sc.nextInt();
		addcameraid(id);
		
		System.out.print("enter camera name");
		String brand=Camerarental.sc.next();
		addbrand(brand) ;
		System.out.println("Enter the model-");
		String model=Camerarental.sc.next();		
		addmodel(model) ;
		System.out.println("Enter the per day price(INR)-");
		Double price=Camerarental.sc.nextDouble();
		addprice(price) ;
		System.out.print("enter camera status");
		String status=Camerarental.sc.next();
		addstatus(status) ;

		
		System.out.println("your camera has been added successfully added to the list");
		Camerarental.displayCameraValues();
		//Camera.viewcamera();
		Camera.mycamera();
	
		
	}
	case 2:{
		Camerarental.displayCameraValues();
		//Camera.viewcamera();
		System.out.println("enter camera id to remove");
		int id=Camerarental.sc.nextInt();
        removeByBrand(id);
        mycamera();
         break;
         
         
        // removeCAMERAID(remove);
         
         
	}
	case 3:{
		Camerarental.displayCameraValues();
		//Camera.viewcamera();
		  mycamera();
		
	}
		
	case 4:{
		Camerarental.mainmenu();
	}
	default :{
		System.err.println("oops please choose valid option");
		mycamera();
		
	}
	}
	}

	private static void removeByBrand(int brandToRemove) {
		//System.out.print("25");
			    for (int i = 0; i <Camerarental.BRAND.size(); i++) {
			    	//System.out.print(Camerarental.CAMERAID.get(i));
			    
			    	
			      if (Camerarental.CAMERAID.get(i).equals(brandToRemove)) 
			        {
			    	  Camerarental.CAMERAID.remove(i);
			    	  Camerarental.BRAND.remove(i);
			    	  Camerarental.MODEL.remove(i);
			    	  Camerarental. PRICE.remove(i);
			    	  Camerarental. STATUS.remove(i);
			            System.out.println("Cameras with brand " + BRAND + " removed successfully.");
			            return; // Assuming you want to remove only the first occurrence
			        }
			    }
			    System.out.println("No cameras found with brand " + BRAND + ".");
	}

	
			 public static void addcameraid(int id) {
		        if (CAMERAID == null) {
		        	Camerarental.  CAMERAID = new ArrayList<>();
		        }
		        Camerarental.CAMERAID.add(id);
		    }

		    public static void addbrand(String brand) {
		        if (BRAND == null) {
		        	Camerarental. BRAND = new ArrayList<>();
		        }
		        Camerarental. BRAND.add(brand);
		    }

		    public static void addprice(double price) {
		        if (PRICE == null) {
		          Camerarental.  PRICE = new ArrayList<>();
		        }
		        Camerarental. PRICE.add(price);
		    }

		    public static void addmodel(String model) {
		        if (MODEL == null) {
		        	Camerarental. MODEL = new ArrayList<>();
		        }
		        Camerarental.MODEL.add(model);
		    }

		    public static void addstatus(String status) {
		        if (STATUS == null) {
		        	Camerarental. STATUS = new ArrayList<>();
		        }
		        Camerarental. STATUS.add(status);
		    
    	 
 	}
    	 
 		// TODO Auto-generated method stub
 		
 	
     
 		// TODO Auto-geneethod stub
 	}
			
		
	
public class Rentcamera {
	static void availablecamera(){
		System.out.println("Following is the list of available camera");
		Camerarental.displayCameraValues();
		System.out.println("enter the camera id u want to rent");
		int rent=Camerarental.sc.nextInt();
		for(int i=0;i<Camerarental.BRAND.size();i++) {
			if(Camerarental.CAMERAID.get(i).equals(rent)) {
			 
				if(Camerarental.STATUS.get(i).equals("Available")) {
					Mywallet.payment(Camerarental.PRICE.get(i), i);
				}
				else {
					System.out.println("this camera is currently not available");
					 System.out.println("Do you want to rent another camera?(1.YES OR 2.NO");
					  int deposit=Camerarental.sc.nextInt();
					  if(deposit==1) {
						  availablecamera();
					  }
					  else{
						  Camerarental. mainmenu();

					  }
						  
						  
					  }
				System.out.println("invalid option");
				availablecamera();
				}
				
			
				//System.out.println("your transaction for camera-" +Camerarental.BRAND.get(i)+" with rent "+Camerarental.PRICE.get(i)+" has successfully completed ");
			}
			
				
			}
	}
	

	

	

public class Mywallet {
	//int payamount=Mywallet.wallet().SIZE;
	 static Double Walletbalance=200.00;

//private static final Double Walletbalance = null;

public static Double  wallet(){
	 
	  
	  System.out.println("Your current wallet balance is "+Walletbalance);
	  System.out.println("Do you want to deposit more amount to your wallet?(1.YES OR 2.NO");
	  int deposit=Camerarental.sc.nextInt();
	  if(deposit==1) {
		  System.out.println("Enter the amount in INR");
		  Double amount=Camerarental.sc.nextDouble();
		  Walletbalance+=amount;
		  System.out.println("Your wallet balance updataed successfully..current wallet balance " +Walletbalance);
		  Camerarental. mainmenu();
		  }
	  else if(deposit==2){
		 Camerarental. mainmenu();
	  }
	  else {
		  System.err.println("invalid option...!!");}
	return Walletbalance;
		  
}
	public static void  payment(Double pay,int i){
		
		if(pay>Walletbalance)
		{
			System.out.println("not availabalae balance");
			wallet();
			
		}
		else {
			Walletbalance-=pay;
			//for(int i=0;i<Camerarental.BRAND.size();i++) {

			System.out.println("your transaction for camera-" +Camerarental.BRAND.get(i)+" with rent "+Camerarental.PRICE.get(i)+" has successfully completed ");
			Camerarental.STATUS.get(i).replaceFirst("Available", "rented");
			Camerarental. mainmenu();
			}
			
		}

	  }
	  

  


}
