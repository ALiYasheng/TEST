package com.unitedcoder.json;


import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonWriteDemo {
    public static void main(String[] args) {
        User user= new User();
        user.setUsername("Admin");
        user.setPassword("MaharaDemo");
        user.setAge("22");
        user.setUsertype("admin");
        user.setActive(true);

        String userInfo = null;
        ObjectMapper objectMapper= new ObjectMapper();
    //    userInfo = objectMapper.writeValueAsString(user);
    //    FileUtils.wr

    }

}
