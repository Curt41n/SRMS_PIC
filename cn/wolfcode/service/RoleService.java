package cn.wolfcode.service;

import cn.wolfcode.entity.T_Role;
import cn.wolfcode.entity.T_User;

import java.util.List;

public interface RoleService {
    void addRole(T_Role t_role);
    void updateRole(T_Role t_role);
    List<T_Role> selectAll();
    T_Role selectByname(String rname);
    void deleteRole(String rname);
    List<T_Role> selectBysname(String str);
    T_User selUserInfo(String ucode);
}
