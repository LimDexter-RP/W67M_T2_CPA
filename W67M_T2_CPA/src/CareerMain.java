import java.util.ArrayList;

public class CareerMain {

    static ArrayList<Prerequisite> prereList;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // ArrayList (Might have more ArrayList if needed)
//        ArrayList<User> userList = new ArrayList<User>();
        ArrayList<Prerequisite> requisiteList = new ArrayList<Prerequisite>();

        int option = 0;

        CareerMain.menu();
        option = Helper.readInt("Enter an option > ");

        while (option != 0) {

            if (option == 1) {
//                CareerMain.addUserAccount(userList);

            } else if (option == 2) {

            } else if (option == 3) {

            } else if (option == 4) {

            } else if (option == 5) {
                CareerMain.prerequisiteList(requisiteList);

            } else if (option == 0) {
                System.out.println("Thank you for your time!");
                break;

            } else {
                System.out.println("Invalid input, please try again.");

            }

        }

    }

    public static void menu() {
        Helper.line(80, "-");
        System.out.println("Welcome to Career Planning Application!");
        Helper.line(80, "-");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. Pre-requisite List");
        System.out.println("0. Exit");

        Helper.line(80, "=");

    }

//    public static void addUserAccount(ArrayList<User> userList) {
//
//    }

    // Pre-requisites (Elson)
    public static void prerequisiteList(ArrayList<Prerequisite> requisiteList) {
        prereList = new ArrayList<Prerequisite>();

//        String role = User.getRole(); //Actual code
        String role = "admin";
        int option = 0;
        prerequisiteUserMenu();
        if (role.equalsIgnoreCase("admin")) {
            System.out.println("3. Add a Pre-requisite");
            System.out.println("4. Delete a Pre-requisite");
        }
        System.out.println("0. Exit");
        Helper.line(80, "-");
        option = Helper.readInt("Enter an option > ");
        
        while (option != 0) {
            if (option == 1) {
                if (!prereList.isEmpty()) {
                    Helper.line(80, "-");
                    int i = 0;
                    while (i < prereList.size()) {
                        System.out.println(
                                "("+prereList.get(i).getPre_id() + ")"
                                +"\n Subject ID: "+ prereList.get(i).getSubj_id()
                                +"\n Description: "+ prereList.get(i).getDescription()
                                );
                        i++;
                    }
                    Helper.line(80, "-");
                } else {
                    System.out.println("\nPre-requisite List is empty\n");
                }
            } else if (option == 2) {

            } else if (option == 3) {
                Helper.line(80, "-");
                String desc = Helper.readString("Enter the description of the Pre-requisite > ");
                int subjId = Helper.readInt("Enter the subject id of the Pre-requisite > ");

                Prerequisite item = new Prerequisite(prereList.size() + 1, subjId, desc);
                prereList.add(item);
                Helper.line(80, "-");
                System.out.println("\nSuccessfuly added the item!\n");
            } else if (option == 4) {

            } else if (option == 0) {
                break;
            } else {
                System.out.println("Invalid option!");
            }
            prerequisiteUserMenu();
            if (role.equalsIgnoreCase("admin")) {
                System.out.println("3. Add a Pre-requisite");
                System.out.println("4. Delete a Pre-requisite");
            }
            System.out.println("0. Exit");
            Helper.line(80, "-");
            option = Helper.readInt("Enter an option > ");
        }
    }

    static void prerequisiteUserMenu() {
        Helper.line(80, "-");
        System.out.println("Pre-requisite List: What will you do?");
        Helper.line(80, "-");
        System.out.println("1. View List of Pre-requisites");
        System.out.println("2. Search for a Pre-requisite");
    }

}