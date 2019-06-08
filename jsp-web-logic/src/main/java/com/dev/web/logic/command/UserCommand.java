package com.dev.web.logic.command;

import com.dev.core.dto.UserDTO;
import com.dev.web.core.command.AbstractCommand;

public class UserCommand extends AbstractCommand<UserDTO> {
    public UserCommand(){
        this.pojo = new UserDTO();
    }
}