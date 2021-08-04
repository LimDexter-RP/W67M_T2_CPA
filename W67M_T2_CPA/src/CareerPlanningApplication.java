import java.util.ArrayList;

public class CareerPlanningApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int option = 0;
		int appOption = 0;
		int actionOption = 0;
		
		ArrayList<AcademicClusters> clusterList = new ArrayList<AcademicClusters>();

		clusterList.add(new AcademicClusters(0, "Engineering"));
		clusterList.add(new AcademicClusters(1, "Education"));
		clusterList.add(new AcademicClusters(2, "Information Technology"));
		
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
			
			// Academic Clusters
			else if (option == 2) {
				appOption = 2;
				while (appOption == 2) {
					CareerPlanningApplication.academicClusterMenu();
					actionOption = Helper.readInt("Choose an action > ");
					
					// Add academic clusters
					if (actionOption == 1) {
						CareerPlanningApplication.academicClusterAdd(clusterList);
					}
					
					// View academic clusters
					else if (actionOption == 2) {
						CareerPlanningApplication.academicClusterView(clusterList);
					}
					
					// Delete academic clusters
					else if (actionOption == 3) {
						CareerPlanningApplication.academicClusterDelete(clusterList);
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
					if (actionOption == 1) {
						
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
	
	
	//=============================== ACADEMIC CLUSTER METHODS ==============================
	public static void academicClusterMenu() {
		CareerPlanningApplication.setHeader("CAREER PLANNING APP");
		System.out.println("1. Add academic clusters");
		System.out.println("2. View academic clusters");
		System.out.println("3. Delete an academic cluster");
		System.out.println("4. Return to Main Menu");
		Helper.line(80, "-");
	}
	
	public static void academicClusterAdd(ArrayList<AcademicClusters> clusterList) {
		CareerPlanningApplication.setHeader("ADD ACADEMIC CLUSTER");
		int id = Helper.readInt("Enter cluster id > ");
		String name = Helper.readString("Enter cluster name > ");
		boolean dupe = false;
		
		for (int i = 0; i<clusterList.size(); i++) {
			if (clusterList.get(i).getClusterId() == id || clusterList.get(i).getClusterName() == name) {
				dupe = true;
				break;
			} else {
				dupe = false;
			}
		}
		
		if (!dupe) {
			clusterList.add(new AcademicClusters(id, name));
			System.out.println("Cluster " + id + ". " + name + " has been added!");
		} else {
			System.out.println("Cluster ID or Name already exists!");
		}

	}
	
	public static String retrieveAllClusters(ArrayList<AcademicClusters> clusterList) {
		String output = "";

		for (int i = 0; i < clusterList.size(); i++) {

			output += String.format("%-10d %-30s\n", clusterList.get(i).getClusterId(),
					clusterList.get(i).getClusterName()); 
		}
		return output;
	}
	
	public static void academicClusterView(ArrayList<AcademicClusters> clusterList) {
		CareerPlanningApplication.setHeader("ACADEMIC CLUSTER LIST");
		String output = String.format("%-10s %-30s\n", "ID", "NAME");
		 output += retrieveAllClusters(clusterList);	
		System.out.println(output);
	}
	
	public static void academicClusterDelete(ArrayList<AcademicClusters> clusterList) {
		CareerPlanningApplication.setHeader("DELETE ACADEMIC CLUSTER");
		int id = Helper.readInt("Enter an existing ID > ");
		boolean found = false;
		
		for (int i = 0; i<clusterList.size(); i++) {
			if (clusterList.get(i).getClusterId() == id) {
				clusterList.remove(i);
				found = true;
			} else {
				found = false;
			}
		}
		if (!found) {
			System.out.println("Cluster ID " + id + " does not exist!");
		} else {
			System.out.println("Cluster ID " + id + " has been removed!");
		}
	}
	//end of academic cluster methods
	
}

