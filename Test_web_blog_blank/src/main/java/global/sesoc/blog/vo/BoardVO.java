package global.sesoc.blog.vo;

/**
 * 블로그 게시글 정보 VO
 */
public class BoardVO {
	int boardnum;				//글 일련번호
	String id;					//작성자 ID
	String title;				//글 제목
	String content;				//글 내용
	String inputdate;			//작성 날짜
	int likecnt;				//추천수
	
	@Override
	public String toString() {
		return "BoardVO [boardnum=" + boardnum + ", id=" + id + ", title=" + title + ", content=" + content
				+ ", inputdate=" + inputdate + ", likecnt=" + likecnt + "]";
	}
	public BoardVO() {
	}
	public int getBoardnum() {
		return boardnum;
	}
	public void setBoardnum(int boardnum) {
		this.boardnum = boardnum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public int getLikecnt() {
		return likecnt;
	}
	public void setLikecnt(int likecnt) {
		this.likecnt = likecnt;
	}
	

	//이하 생성자, 메소드들 정의해서 사용
	
}
