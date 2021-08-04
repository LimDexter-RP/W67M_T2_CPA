import java.util.ArrayList;

/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Daw Rong
 * Student ID: 20014009
 * Class: E73E
 * Date/Time created: Monday 02-08-2021 17:05
 */

public class CareerPlanningApplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;
		int appOption = 0;
		int actionOption = 0;
		
		ArrayList<User> userList = new ArrayList<User>();

		userList.add(new User(0, "Ali","Student","abcd.gmail.com","1234564"));
		userList.add(new User(1, "Ahmad","Admin","abce.gmail.com","1234561"));
		userList.add(new User(2, "Mei","Teacher","abcf.gmail.com","1234562"));
		
		while (option != 6) {
		
			CareerPlanningApplication.menu();
			option = Helper.readInt("Enter an option > ");
			
			// User Accounts
			if (option == 1) {
				appOption = 1;
				while (appOption == 1) {
					CareerPlanningApplication.academicClusterMenu();
					actionOption = Helper.readInt("Choose an action > ");
					
					// Add
					if (actionOption == 1 ) {
						CareerPlanningApplication.userAddAccount(userList);
					}
					
					// View
					else if (actionOption == 2) {
						CareerPlanningApplication.userView(userList);
					}
					
					// Delete
					else if (actionOption == 3) {
						CareerPlanningApplication.userDelete(userList);
					}
					
					//Return to Main Menu
					else if (actionOption == 4) {
						
					} else {
						System.out.println("Invalid option!");
					}
				}
				
			}
			
			// Academic Clusters
			else if (option == 2) {
				appOption = 2;
				while (appOption == 2) {
					CareerPlanningApplication.academicClusterMenu();
					actionOption = Helper.readInt("Choose an action > ");
					
					// Add academic clusters
					if (actionOption == 1) {
						
					}
					
					// View academic clusters
					else if (actionOption == 2) {
						
					}
					
					// Delete academic clusters
					else if (actionOption == 3) {
					
					}
					
					// Return to main menu
					else if (actionOption == 4) {
						appOption = 0;
					} else {
						System.out.println("Invalid option");
					}
				}
			}
			
			// Career Information
			else if (option == 3) {
				appOption = 1;
				while (appOption == 1) {
					CareerPlanningApplication.academicClusterMenu();
					actionOption = Helper.readInt("Choose an action > ");
					
					// Add
					if (actionOption == 1 ) {
						
					}
					
					// View
					else if (actionOption == 2) {
						
					}
					
					// Delete
					else if (actionOption == 3) {
						
					}
					
					//Return to Main Menu
					else if (actionOption == 4) {
						
					} else {
						System.out.println("Invalid option!");
					}
				}
			}
			
			// Subjects
			else if (option == 4) {
				appOption = 1;
				while (appOption == 1) {
					CareerPlanningApplication.academicClusterMenu();
					actionOption = Helper.readInt("Choose an action > ");
					
					// Add
					if (actionOption == 1 ) {
						
					}
					
					// View
					else if (actionOption == 2) {
						
					}
					
					// Delete
					else if (actionOption == 3) {
						
					}
					
					//Return to Main Menu
					else if (actionOption == 4) {
						
					} else {
						System.out.println("Invalid option!");
					}
				}
			}
			
			//Prerequisites
			else if (option == 5) {
				appOption = 1;
				while (appOption == 1) {
					CareerPlanningApplication.academicClusterMenu();
					actionOption = Helper.readInt("Choose an action > ");
					
					// Add
					if (actionOption == 1 ) {
						
					}
					
					// View
					else if (actionOption == 2) {
						
					}
					
					// Delete
					else if (actionOption == 3) {
						
					}
					
					//Return to Main Menu
					else if (actionOption == 4) {
						
					} else {
						System.out.println("Invalid option!");
					}
				}
			}
			
			//Quit
			else if (option == 6) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}
		}
		
		
		
		
		
	}
	
	public static void menu() {
		CareerPlanningApplication.setHeader("CAREER PLANNING APP");
		System.out.println("1. User Accounts");
		System.out.println("2. Academic Clusters");
		System.out.println("3. Career Information");
		System.out.println("4. Subject");
		System.out.println("5. Prerequisites");
		System.out.println("6. Quit");
		Helper.line(80, "-");
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	
	//=============================== USER METHODS ==============================
	public static void academicClusterMenu() {
		CareerPlanningApplication.setHeader("CAREER PLANNING APP");
		System.out.println("1. Register user account");
		System.out.println("2. View user");
		System.out.println("3. Delete a user");
		System.out.println("4. Return to Main Menu");
		Helper.line(80, "-");
	}
	
	
	
	
	
	public static void userAddAccount(ArrayList<User>userList) {
		CareerPlanningApplication.setHeader("ADD USER ACCOUNT");
		int id=Helper.readInt("Enter user id > ");
		String name=Helper.readString("Enter the user's name > ");
		String role=Helper.readString("Enter the role of the user > ");
		String email=Helper.readString("Enter the user's email > ");
		String password=Helper.readString("Enter the user's password > ");
		
		boolean check=false;
		
		for(int i=0; i<userList.size();i++) {
			if(userList.get(i).getUserid()==id || userList.get(i).getName()==name) {
				check=true;
				break;
			}else {
				check=false;
			}
		}
		
		if(!check) {
			userList.add(new User(id,name,role,email,password));
			System.out.println("User "+id+" has been added!");
		}else {
			System.out.println("User ID or name has already exists!");
		}
		
	}
	
	
	public static String retrieveAllUsers (ArrayList<User>userList) {
		String output="";
		
		for(int i=0;i<userList.size();i++) {
			output +=String.format("%-10d %-30s %-30s %-30s %-30s\n",userList.get(i).getUserid(),userList.get(i).getName(),userList.get(i).getRole(),userList.get(i).getEmail(),userList.get(i).getPassword());
		}
		return output;
	}
	
	public static void userView(ArrayList<User>userList) {
		CareerPlanningApplication.setHeader("USER DETAIL LIST");
		String output=String.format("%-10s %-30s %-30s %-30s %-30s\n", "ID","NAME","ROLE","EMAIL","PASSWORD");
		output+=retrieveAllUsers(userList);
		System.out.println(output);
	}
	
	public static void userDelete(ArrayList<User>userList) {
		CareerPlanningApplication.setHeader("DELETE USER");
		int id=Helper.readInt("Enter an existing ID for user > ");
		boolean found=false;
		
		for(int i=0;i<userList.size();i++) {
			if(userList.get(i).getUserid()==id) {
				userList.remove(i);
				found=true;
			}else {
				found=false;
			}
		}
		if (!found) {
			System.out.println("USER ID "+id+" does not exists!");
		}else {
			System.out.println("USER ID "+id+" has been removed!");
		}
	}
	
	
	
	

}
