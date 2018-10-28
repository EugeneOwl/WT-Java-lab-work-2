package service.impl;

import entity.user.UserRole;
import service.PermissionService;

import static entity.user.UserRole.ADMIN;
import static entity.user.UserRole.ANONYMOUS;
import static entity.user.UserRole.USER;

public class PermissionServiceImpl implements PermissionService {

    @Override
    public boolean haveEnoughRights(UserRole have, UserRole need) {
        if (need == null) {
            return true;
        }
        if (have == need) {
            return true;
        }
        if (have == ADMIN) {
            return true;
        }
        if (have == USER && need == ANONYMOUS) {
            return true;
        }
        return false;
    }
}
