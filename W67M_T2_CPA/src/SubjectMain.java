import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Lim Dexter
 * Student ID: 20039529
 * Class: C208
 * Date/Time created: Wednesday 04-08-2021 12:49
 */

public class SubjectMain {
private static final AtomicInteger count = new AtomicInteger(0);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			// TODO Auto-generated method stub
			ArrayList<Subject> subjectList = new ArrayList<Subject>();

			int option = -1;
			{

				while (option != 4) {
					SubjectMain.menu();
					option = Helper.readInt("Enter Option > ");

					if (option == 1) {

						SubjectMain.viewAllSubjects(subjectList);

					} else if (option == 2) {
						SubjectMain.addSubjects(subjectList);

					} else if (option == 3) {
						SubjectMain.deleteSubject(subjectList);

					} else {

						System.out.println("Good Bye!");

					}
				}
			}

		}

		//Menu method for printing later
		public static void menu() {
			Helper.line(30, "=");
			System.out.println("SUBJECT MANAGEMENT");
			Helper.line(30, "=");
			System.out.println("1. View All Subjects");
			System.out.println("2. Add A Subject");
			System.out.println("3. Delete A Subject");
			System.out.println("4. Quit The Program");
		}
		//View All Subject For Option 1
		public static void viewAllSubjects(ArrayList<Subject> subjectList) {
			Helper.line(40, "-");
			System.out.println("VIEW ALL SUBJECTS");
			Helper.line(40, "-");
				System.out.printf("%-10s %-10s\n", "ID", "SUBJECT");
			for (int i = 0; i < subjectList.size(); i++)
				System.out.printf("%-10d %-10s\n", subjectList.get(i).getSubjectID(), subjectList.get(i).getSubjectName());
		}
		//Add Subject For Option 2
		public static void addSubjects(ArrayList<Subject> subjectList) {
			int id = count.incrementAndGet();
			String subject = Helper.readString("Enter Subject To Add > ");
			boolean count = false;
			for (int i = 0; i < subjectList.size(); i ++) {
				if (subjectList.get(i).getSubjectName() == subject ) {
					System.out.println("Subject Already Exists!");
					count = true;
				}
			}
			if (count == false) {
				Subject addSubject = new Subject(id, subject);
				subjectList.add(0, addSubject);
				System.out.println(subject + " Has Been Added!");
			}
		}
		//Delete A Subject For Option 3
		public static boolean deleteSubject(ArrayList<Subject> subjectList) {
			String subject = Helper.readString("Enter Subject Name To Delete > ");
			
			for(int i = 0; i < subjectList.size(); i ++) {
				if(!subjectList.isEmpty() && subjectList.get(i).getSubjectName().equalsIgnoreCase(subject)) {
					subjectList.remove(i);
					System.out.println(subject + " Has Been Deleted From The List!");
					return true;
				}
			}if (subjectList.isEmpty()) {
			System.out.println("The List Is Empty!");
			return false;
			}
			return false;
			
		}
	}


