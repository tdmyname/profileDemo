package com.tandong.example.demo.controll;

import com.tandong.example.demo.model.ProfileDomain;
import com.tandong.example.demo.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @Autowired
    private ProfileDomain profileDomain;
    @Autowired
    private ProfileService profileService;

    @RequestMapping("testProfile")
    public ProfileDomain testProfile() {

        return profileDomain;
    }

    @RequestMapping("testProfile2")
    public String testProfile2() {

        return profileService.getProfileDomain();
    }
}
