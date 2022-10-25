public class RunBloodDatapart1 {

    public static void main(String[] args){
    	String input1, input2;
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter blood type of a patient: " );
    	input1 = sc.nextLine();
    	System.out.println("Enter the Rhesus Factor (+ or -): " );
    	input2 = sc.nextLine();
    	
    	if (input1.isEmpty() && input2.isEmpty()){
    		BloodData bd = new BloodData();
    		bd.display();
    	}
    	else if (input1.equals ("A")){
    		BloodData bd = new BloodData(input1,input2);
    		bd.display();	
    	}
    	else if (input1.equals ("B")){
    		BloodData bd = new BloodData(input1,input2);
    		bd.display();
    	}
    	else if (input1.equals ("O")){
    		BloodData bd = new BloodData(input1,input2);
    		bd.display();
    	}
    	else if (input1.equals ("AB")){
    		BloodData bd = new BloodData(input1,input2);
    		bd.display();	
    	}
    	else if (input2.equals ("+")){
    		BloodData bd = new BloodData(input1,input2);
    		bd.display();
    	}
    	else if (input2.equals ("-")){
    		BloodData bd = new BloodData(input1,input2);
    		bd.display();	
    	}
    	else {
    		System.out.print("Invalid Input!");	
    	}
    	sc.close();
    	}	
    	}