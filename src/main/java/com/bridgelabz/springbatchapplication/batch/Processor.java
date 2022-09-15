package com.bridgelabz.springbatchapplication.batch;

import com.bridgelabz.springbatchapplication.entity.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<User, User> {
    // Map to store department code with department name
    private static final Map<String, String> DEPT_NAME = new HashMap<>();

    public Processor(){
        DEPT_NAME.put("001", "Technology");
        DEPT_NAME.put("002", "Operations");
        DEPT_NAME.put("003", "Accounts");
    }

    @Override
    public User process(User user) throws Exception {
        // converting dept code to dept name
        String deptCode = user.getDept();
        String dept = DEPT_NAME.get(deptCode);
        user.setDept(dept);
        System.out.println(String.format("Converted from deptCode to deptname", deptCode, dept));
        return user;
    }

}
