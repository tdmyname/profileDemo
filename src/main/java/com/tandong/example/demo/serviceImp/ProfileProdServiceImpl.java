package com.tandong.example.demo.serviceImp;

import com.tandong.example.demo.service.ProfileService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value="dev")
@Service
public class ProfileProdServiceImpl implements ProfileService {
    public ProfileProdServiceImpl() {
        System.out.println("生产环境。。。。。");
    }

    @Override
    public String getProfileDomain() {

        StringBuilder sb = new StringBuilder();
        sb.append("我在生产环境，").append("这是生产环境的实现");
        return sb.toString();
    }
}
