/** Student Name : Ye Yun Hei
 * Student ID: 20011806
 * Date/Time Created: 1/12/2020
 */

/**
 * @author yeyun
 *
 */
public class AcademicClusters {
	
	private int clusterId;
	private String clusterName;
	/**
	 * @param clusterId
	 * @param clusterName
	 */
	public AcademicClusters(int clusterId, String clusterName) {
		super();
		this.clusterId = clusterId;
		this.clusterName = clusterName;
	}
	/**
	 * @return the clusterId
	 */
	public int getClusterId() {
		return clusterId;
	}
	/**
	 * @param clusterId the clusterId to set
	 */
	public void setClusterId(int clusterId) {
		this.clusterId = clusterId;
	}
	/**
	 * @return the clusterName
	 */
	public String getClusterName() {
		return clusterName;
	}
	/**
	 * @param clusterName the clusterName to set
	 */
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	
	

}
