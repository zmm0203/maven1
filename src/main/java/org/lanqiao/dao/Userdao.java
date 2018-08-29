package org.lanqiao.dao;

import backstage.dao.BaseDao;
import org.lanqiao.entity.Userentity;

import java.util.List;

public class Userdao extends BaseDao<Userentity> {
    //插入留言
    public  int insert(Userentity u) {
        String ssss = u.getMsg();
        return executeUpdate("insert into message(username,msg) values(?,?)", new Object[]{u.getUsername(), u.getMsg()});
    }
  //查询留言
    public List<Userentity> showMsg(int pageNum,int pageSize) {
        return executeQuery("select * from message order by id desc limit ?,?",new Object[]{(pageNum-1)*pageSize, pageSize});
    }
    public int count(){
        return getRecordCount("select count(*) from message");
    }
}
