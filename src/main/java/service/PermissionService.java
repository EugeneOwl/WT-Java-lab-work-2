package service;

import entity.user.UserRole;

public interface PermissionService {

    /**
     * Checks up whether the firsts permission equal or bigger then the second one.
     *
     * @param have - first permission
     * @param need - second permission
     * @return true if first permission is bigger or equal and false if smaller
     */
    boolean haveEnoughRights(UserRole have, UserRole need);
}
