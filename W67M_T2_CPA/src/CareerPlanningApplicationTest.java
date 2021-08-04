import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//For Junit Tests
public class CareerPlanningApplicationTest {
	
	private AcademicClusters ac1;
	private AcademicClusters ac2;

	
	private ArrayList<AcademicClusters> clusterList;
	
	public CareerPlanningApplicationTest() {
		super();
	}
	
	public void setUp() throws Exception {
		// prepare test data
		ac1 = new AcademicClusters(1, "Engineering");
		ac2 = new AcademicClusters(2, "Information Technology");

		clusterList= new ArrayList<AcademicClusters>();
	}
	
	public void testAcademicClusterDelete() {
		// Test that the list is not null
		assertNotNull("Test if there is a valid Academic Clusters arraylist to retrieve from", clusterList);
		// Test that the correct ID is being deleted
		
	}

}
