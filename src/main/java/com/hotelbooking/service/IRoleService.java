package com.hotelbooking.service;

import com.hotelbooking.model.Role;
import com.hotelbooking.model.User;

import java.util.List;

/**
 * @author Simpson Alfred
 */

public interface IRoleService {

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);
}
