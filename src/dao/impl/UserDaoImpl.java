package dao.impl;

import dao.UserDao;
import model.UserModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDaoImpl extends BaseDaoImpl<UserModel> implements UserDao {
}
