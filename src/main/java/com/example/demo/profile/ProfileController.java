package com.example.demo.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("profiles")
public class ProfileController {
    private final ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping
    public List<Profile> getProfiles()
    {
        return this.profileService.getProfiles();
    }

    @PostMapping
    public Profile addProfile(@RequestBody Profile profile)
    {
        return this.profileService.addProfile(profile);
    }
}
