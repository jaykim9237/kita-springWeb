[ blog_member 프로젝트 테이블 구조 ]

--회원 정보 테이블
create table blog_member (
	id			varchar2(20) primary key,	--회원ID
	password	varchar2(20) not null,		--비밀번호
	name		varchar2(20) not null,		--이름
	photo		number	default 1,			--사진번호
);

--게시판 본문 글 테이블
create table blog_board (
	boardnum	number primary key,			--글번호
	id			varchar2(20) not null, 		--작성자ID
	title		varchar2(200) not null,		--제목
	contents	varchar2(2000) not null, 	--내용
	inputdate	date default sysdate, 		--작성일
	likecnt		number	dafault 0,			--좋아요 수 
);

--게시판 글 번호에 사용할 시퀀스
create sequence blog_board_seq;

insert into blog_member values 
	('aaa', 'aaa', '홍길동', '1');
	
insert into blog_board (boardnum, id, title, contents, inputdate, likecnt) 
	values (web5_board_seq.nextval, 'aaa', '글제목', '글내용', sysdate, 1);