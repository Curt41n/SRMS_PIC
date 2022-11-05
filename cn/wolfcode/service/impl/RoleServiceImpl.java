package cn.wolfcode.service.impl;

import cn.wolfcode.dao.RoleDao;
import cn.wolfcode.entity.T_Role;
import cn.wolfcode.entity.T_User;
import cn.wolfcode.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleDao roleMapper;
    @Override
    public void addRole(T_Role t_role) {
        roleMapper.save(t_role);
    }
    @Override
    public void updateRole(T_Role t_role){roleMapper.updateRole(t_role);}
    @Override
    public List<T_Role> selectAll() {
        return roleMapper.selectAll();
    }
    @Override
    public T_Role selectByname(String rname){
        return roleMapper.selectByname(rname);
    }

    @Override
    public void deleteRole(String rname){
        roleMapper.deleteRole(rname);
    }
    @Override
    public List<T_Role> selectBysname(String str){
        return roleMapper.selectBysname(str);
    }

    @Override
    public T_User selUserInfo(String ucode) {

        return roleMapper.selectUserInfo(ucode);
    }
}
