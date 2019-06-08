package com.dev.web.logic.command;

import com.dev.core.dto.RoleDTO;
import com.dev.web.core.command.AbstractCommand;

public class RoleCommand extends AbstractCommand<RoleDTO> {
    public RoleCommand(){
        this.pojo = new RoleDTO();
    }
}
