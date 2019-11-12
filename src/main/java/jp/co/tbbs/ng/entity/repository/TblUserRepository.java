package jp.co.tbbs.ng.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jp.co.tbbs.ng.entity.TblUser;
import jp.co.tbbs.ng.entity.TblUserPrimaryKey;

public interface TblUserRepository extends JpaRepository<TblUser, TblUserPrimaryKey>{

	public TblUser findByUserIdAndDelFlg(@Param("user_id") String userId, @Param("del_flg") int delFlg);

	@Query(value = "select max(user_no) + 1 from m_user",nativeQuery = true)
	public Number findByMaxUserNo();

}
