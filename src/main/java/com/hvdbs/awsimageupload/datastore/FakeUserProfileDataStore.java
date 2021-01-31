package com.hvdbs.awsimageupload.datastore;

import com.hvdbs.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("9ed91728-640a-4500-bf6f-f1e977bccb24"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("806cc818-ff2c-491a-b150-5c2b12b65170"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
