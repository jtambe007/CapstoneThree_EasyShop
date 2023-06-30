package org.yearup.data;


import org.yearup.models.Profile;

import java.util.List;

public interface ProfileDao
{
    Profile create(Profile profile);
    Profile getByUserId(int userId);
    Profile update(Profile profile);
    void delete(Long userId);

}
