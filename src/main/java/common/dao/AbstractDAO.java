package common.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class AbstractDAO {
    @Autowired
    private SqlSessionTemplate sqlSession;

    protected void printQueryID(String queryID) {
        //notthing
    }

    public Object insert(String queryID, Object params) {
        printQueryID(queryID);
        return sqlSession.insert(queryID, params);
    }
    public Object update(String queryID, Object params) {
        printQueryID(queryID);
        return sqlSession.delete(queryID, params);
    }
    public Object delete(String queryID, Object params){
        printQueryID(queryID);
        return sqlSession.delete(queryID, params);
    }
    public Object selectOne(String queryID) {
        printQueryID((queryID));
        return sqlSession.selectOne(queryID);
    }
    public HashMap<String, Object> selectOne(String queryID, Object params) {
        printQueryID(queryID);
        return sqlSession.selectOne(queryID, params);
    }
    public List<String> selectList(String queryID) {
        printQueryID(queryID);
        return sqlSession.selectOne(queryID);
    }
    public HashMap<String, Object> selectHashMap(String queryID) {
        HashMap<String, Object> hm = new HashMap<String, Object>();

        List<HashMap<String, Object>> list;
        list = sqlSession.selectList(queryID);
        hm.put("list", list);
        printQueryID(queryID);
        return hm;
    }

    public HashMap<String, Object> selectHashMap(String queryId, Object params) {
        HashMap<String, Object> hm = new HashMap<String, Object>();
        List<HashMap<String, Object>> list;
        //list = sqlSession.selectList(queryId, params);
        list = sqlSession.selectList(queryId, params);
        hm.put("list", list);
        hm.put("count", list.size());
        printQueryID(queryId);
        return hm;
    }
}
