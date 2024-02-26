package com.example.demo.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    private final ProfileRepository profileRepository;

    @Autowired
    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public List<Profile> getProfiles()
    {
        return this.profileRepository.findAll();
    }

    public Profile addProfile(Profile profile)
    {
        return this.profileRepository.save(profile);
    }
}
