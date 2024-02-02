package com.web.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.Data;
// 공지사항 게시판
@Entity
@Table(name = "BOARD_TAB")
@Data
@TableGenerator(name = "SUPPORT_SEQ_GENERATOR",	// 테이블 이름 
table = "ALL_SEQUENCE", 		// 시퀀스 생성
pkColumnValue = "BOARD_SEQ",	// 시퀀스 이름
initialValue = 0,				// 시퀀스 시작 값
allocationSize = 1)				// 시퀀스 증가 값
public class BoardEntity {
	//게시판 교유 번호
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE,generator = "BOARD_SEQ")
	private Long boardSeq;
	//게시판 제목
	@Column(name = "BOARD_TITLE",nullable = false)
	private String boardTitle;
	//게시판 내용
	@Column(name = "BOARD_COUNTENT",nullable = false)
	private String boardContent;
	//게시판 날짜
	@Column(name = "BOARD_DATE",insertable = false, updatable = false, columnDefinition = "date default sysdate")
	private Date boardDate;
	// 조회수
	@Column(name = "BOARD_VIEWS")
	private int boardViews;
	//작성자 admin  // 관리자 번호로 들어가야되서 Long 타입으로 변경해야됨 
	@Column(name = "ADMIN")
	private String admin;	
}
