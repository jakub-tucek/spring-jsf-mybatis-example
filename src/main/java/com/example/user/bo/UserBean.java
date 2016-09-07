package com.example.user.bo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by jtucek on 07.09.2016.
 */
@Component
@Scope("session")
public class UserBean implements Serializable {

    private final static Logger logger = Logger.getLogger(UserBean.class);

    private final UserBo userBo;

    @Autowired
    public UserBean(UserBo userBo) {
        this.userBo = userBo;
    }

    public String printMsgFromSpring() {
        logger.info("printMsgFromString");
        return userBo.getMessage();
    }


}