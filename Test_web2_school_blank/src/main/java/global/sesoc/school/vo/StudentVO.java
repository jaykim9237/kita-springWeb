package global.sesoc.school.vo;

//학생 정보
public class StudentVO {
	String stnum;				//학생 구분번호
	String stclass;				//반
	String name;				//이름
		
	public StudentVO() {
	}

	public String getStnum() {
		return stnum;
	}

	public void setStnum(String stnum) {
		this.stnum = stnum;
	}

	public String getStclass() {
		return stclass;
	}

	public void setStclass(String stclass) {
		this.stclass = stclass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentVO [stnum=" + stnum + ", stclass=" + stclass + ", name=" + name + "]";
	}
}
