package jp.co.tbbs.ng.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.tbbs.ng.entity.TblUser;
import jp.co.tbbs.ng.entity.repository.TblUserRepository;

@Service
public class UserInfoService {

	@Autowired
	TblUserRepository userRepo;

	public List<TblUser> listUsers(){
		return userRepo.findAll();
	}

	public TblUser userDetail(String userId) {
		return userRepo.findByUserIdAndDelFlg(userId, 0);
	}
}
