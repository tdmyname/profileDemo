package com.tandong.example.demo.serviceImp;

import com.tandong.example.demo.service.ProfileService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value="prod")
@Service
public class ProfileDevServiceImpl implements ProfileService {
    public ProfileDevServiceImpl() {
        System.out.println("测试环境。。。。。");
    }

    @Override
    public String getProfileDomain() {

        StringBuilder sb = new StringBuilder();
        sb.append("我在测试环境，").append("这是测试环境的实现");
        return sb.toString();
    }
}
