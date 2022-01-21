--방명록 글 저장 테이블
create table web4_guestbook(
	num			number(11) primary key,     	--글번호
	name   		varchar2(50) not null,			--작성자 이름
	password  	varchar2(30) not null,  		--삭제시 사용할 비밀번호
	content		varchar2(2000) not null.		--글 내용
	inputdate	date default sysdate			--글 작성날짜/시간
);

--글 번호에 사용할 시퀀스
create sequence web4_guestbook_seq;

--글 저장 예
insert into web4_guestbook (num, name, password, content)
values (web4_guestbook_seq.nextval, '홍길동', '1234', '글내용';