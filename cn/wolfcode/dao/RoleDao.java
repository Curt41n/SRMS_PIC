package cn.wolfcode.dao;

import cn.wolfcode.entity.T_Role;
import cn.wolfcode.entity.T_User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDao {
    void save(T_Role t_role);
    void updateRole(T_Role t_role);
    List<T_Role> selectAll();
    T_Role selectByname(String rname);
    void deleteRole(String rname);
    List<T_Role> selectBysname(@Param("rname")String rname);
    T_User selectUserInfo(String str);
}
