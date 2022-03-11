package global.sesoc.school.vo;

//성적 정보
public class ScoreVO {
	String stnum;			//학생 구분번호
	int java;				//java과목 점수
	int sql;				//sql과목 점수
	int spring;				//spring과목 점수
	int total;				//총점
	double avg;				//평균

	public ScoreVO() {
	}

	public String getStnum() {
		return stnum;
	}

	public void setStnum(String stnum) {
		this.stnum = stnum;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getSql() {
		return sql;
	}

	public void setSql(int sql) {
		this.sql = sql;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "ScoreVO [stnum=" + stnum + ", java=" + java + ", sql=" + sql + ", spring=" + spring
				+ ", total=" + total + ", avg=" + avg + "]";
	}
}
