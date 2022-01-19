package global.sesoc.web4.vo;

//글 1개의 정보를 저장할 VO 클래스
public class Guestbook {
	
	//.jsp에 있는 name 값들과 다 맞아야해
	int num;   //글번호
	String name;  //작성자 이름
	String password;  //삭제시 사용할 비밀번호
	String content;  //글 내용
	/*원래 자바에 시간을 나타내는 타입의 클래스인 date 클래스가 있어, 근데 우리가 지금 
	이거를 사용하려는 의도는 그냥 보여주시만 하려는 것이지, 뭐 시간을 계산하고 그런거를 하는게 아니고 
	그러니까 그냥 스트링으로 받아와도 좋아. 보여주는 모양은 전부 sql에서 해오는 것이지*/ 
	String inputdate; //글 작성날짜/시간
	
	public Guestbook() {
	
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getInputdate() {
		return inputdate;
	}
	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}
	
	@Override
	public String toString() {
		return "Guestbook [num=" + num + ", name=" + name + ", password=" + password + ", content=" + content
				+ ", inputdate=" + inputdate + "]";
	}
	
	
	
	 
	
}
