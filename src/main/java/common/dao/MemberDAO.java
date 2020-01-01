package common.dao;

public class MemberDAO extends AbstractDAO {

    public String test() {
        return (String) selectOne("any.test");
    }
}
