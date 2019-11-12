package jp.co.tbbs.ng.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TblUserPrimaryKey implements Serializable{

	@Column(name="user_no", nullable = false)
	private int userNo = -1;
}
