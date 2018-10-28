package service;

import entity.user.UserRole;

public interface PermissionService {

    boolean haveEnoughRights(UserRole have, UserRole need);
}
