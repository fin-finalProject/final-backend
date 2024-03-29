package com.web.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "COMMENT_TAB")
@Data
@TableGenerator(name = "COMMENT_SEQ",	// 테이블 이름  
table = "ALL_SEQUENCE", 		// 시퀀스 생성
pkColumnValue = "COMMENTID",	// 시퀀스 이름
initialValue = 0,				// 시퀀스 시작 값
allocationSize = 1)				// 시퀀스 증가 값
public class CommentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE,generator = "COMMENT_SEQ")
	@Column(name = "COMMENTID")
	private Long commentId; 		// 댓글 고유 번호
	@Column(name = "COMMENT_CONTENT")
	private String commentContent;  // 댓글 내용
	@Column(name = "COMMENT_DATE" ,insertable = false, updatable = false, columnDefinition = "date default sysdate")
	private Date commentDate;  		// 댓글날짜
	@Column(name = "ISBN") // 책정보
	private String isbn;
	@Column(name = "STAR_RATING") // 별점
	private int starRating;
	@Column(name = "MEMBER_NAME")
	private String memberName;
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn(name = "MEMBER_NUM") //FK
	@JsonIgnore
	private Member member; 		//댓글작성회원번호
	
	public void UpdateContent(String editedContent){
		this.commentContent = editedContent;
	}
}
