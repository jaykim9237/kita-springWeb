package global.sesoc.school.vo;

//관리자정보
public class AdminVO {

	private String adminid;
	private String adminpwd;
	
	public AdminVO() {}

	public String getAdminid() {
		return adminid;
	}

	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}

	public String getAdminpwd() {
		return adminpwd;
	}

	public void setAdminpwd(String adminpwd) {
		this.adminpwd = adminpwd;
	}

	@Override
	public String toString() {
		return "AdminVO [adminid=" + adminid + ", adminpwd=" + adminpwd + "]";
	}
	
}
