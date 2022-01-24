package global.sesoc.web5.vo;

public class Board {
	int boardnum;			//글번호
	String id;				//작성자ID
	String title;			//제목
	String  contents;		//내용
	String inputdate;		//작성일
	int hits;				//조회수 
	
	
	public Board() {
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


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}


	public String getInputdate() {
		return inputdate;
	}


	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}


	public int getHits() {
		return hits;
	}


	public void setHits(int hits) {
		this.hits = hits;
	}


	@Override
	public String toString() {
		return "Board [boardnum=" + boardnum + ", id=" + id + ", title=" + title + ", contents=" + contents
				+ ", inputdate=" + inputdate + ", hits=" + hits + "]";
	}
	
	
	
}
