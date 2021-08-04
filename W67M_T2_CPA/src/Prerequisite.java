
public class Prerequisite {
	
	private int pre_id = 0;
	private int subj_id = 0;
	private String description = "";
	
	
	public Prerequisite(int pre_id, int subj_id, String description) {
		super();
		this.pre_id = pre_id;
		this.subj_id = subj_id;
		this.description = description;
	}


	public int getPre_id() {
		return pre_id;
	}


	public void setPre_id(int pre_id) {
		this.pre_id = pre_id;
	}


	public int getSubj_id() {
		return subj_id;
	}


	public void setSubj_id(int subj_id) {
		this.subj_id = subj_id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Prerequisite [pre_id=" + pre_id + ", subj_id=" + subj_id + ", description=" + description + "]";
	}
	

}
