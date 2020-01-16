package harsh.rane.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Element {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int ELEMENT_ID;
	String ELEMENT_SOURCE_NAME;
	String ELEMENT_CTGY_NAME;
	public int getELEMENT_ID() {
		return ELEMENT_ID;
	}
	public void setELEMENT_ID(int eLEMENT_ID) {
		ELEMENT_ID = eLEMENT_ID;
	}
	public String getELEMENT_SOURCE_NAME() {
		return ELEMENT_SOURCE_NAME;
	}
	public void setELEMENT_SOURCE_NAME(String eLEMENT_SOURCE_NAME) {
		ELEMENT_SOURCE_NAME = eLEMENT_SOURCE_NAME;
	}
	public String getELEMENT_CTGY_NAME() {
		return ELEMENT_CTGY_NAME;
	}
	public void setELEMENT_CTGY_NAME(String eLEMENT_CTGY_NAME) {
		ELEMENT_CTGY_NAME = eLEMENT_CTGY_NAME;
	}
	@Override
	public String toString() {
		return "Element [ELEMENT_ID=" + ELEMENT_ID + ", ELEMENT_SOURCE_NAME=" + ELEMENT_SOURCE_NAME
				+ ", ELEMENT_CTGY_NAME=" + ELEMENT_CTGY_NAME + "]";
	}
	
}
