package harsh.rane.model;

public class ElementJson {

	String ELEMENT_NAME;
	String DESCRIPTION;
	String LAST_MODIFIED_BY;
	String LAST_MODIFIED;
	String SEARCH_NAME;
	public String getELEMENT_NAME() {
		return ELEMENT_NAME;
	}
	public void setELEMENT_NAME(String eLEMENT_NAME) {
		ELEMENT_NAME = eLEMENT_NAME;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	public String getLAST_MODIFIED_BY() {
		return LAST_MODIFIED_BY;
	}
	public void setLAST_MODIFIED_BY(String lAST_MODIFIED_BY) {
		LAST_MODIFIED_BY = lAST_MODIFIED_BY;
	}
	public String getLAST_MODIFIED() {
		return LAST_MODIFIED;
	}
	public void setLAST_MODIFIED(String lAST_MODIFIED) {
		LAST_MODIFIED = lAST_MODIFIED;
	}
	public String getSEARCH_NAME() {
		return SEARCH_NAME;
	}
	public void setSEARCH_NAME(String sEARCH_NAME) {
		SEARCH_NAME = sEARCH_NAME;
	}
	@Override
	public String toString() {
		return "ElementJson [ELEMENT_NAME=" + ELEMENT_NAME + ", DESCRIPTION=" + DESCRIPTION + ", LAST_MODIFIED_BY="
				+ LAST_MODIFIED_BY + ", LAST_MODIFIED=" + LAST_MODIFIED + ", SEARCH_NAME=" + SEARCH_NAME + "]";
	}
	
}
