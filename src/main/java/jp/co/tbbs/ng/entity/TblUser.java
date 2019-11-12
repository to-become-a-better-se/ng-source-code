package jp.co.tbbs.ng.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@IdClass(TblUserPrimaryKey.class)
@Table(name = "tbl_user")
public class TblUser extends AbstractEntity{

	@Id
	@Column(name="user_no", nullable = false)
	private int userNo = -1;

	@Column(name="user_id", nullable = false)
	@Size(max = 255)
	private String userId = null;

	@Column(name="user_name", nullable = false)
	@Size(max = 255)
	private String userName = null;

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
