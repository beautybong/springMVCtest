package service;

import common.dao.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private MemberDAO memberDAO;

    @Override
    public HashMap<String, Object> login(HashMap<String, Object> map) {
        return memberDAO.selectOne("any.login", map);
    }
}
