package global.sesoc.blog.vo;

/**
 * 회원 정보 VO
 */
public class MemberVO {
	String id;					//회원 ID
	String password;			//비밀번호
	String name;				//회원 이름
	int photo;					//선택한 프로필 사진 (1~4중에서 선택)
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoto() {
		return photo;
	}
	public void setPhoto(int photo) {
		this.photo = photo;
	}
	public MemberVO() {
		
	}
	
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", name=" + name + ", photo=" + photo + "]";
	}
	
	
	//이하 생성자, 메소드들 정의해서 사용

	
}
