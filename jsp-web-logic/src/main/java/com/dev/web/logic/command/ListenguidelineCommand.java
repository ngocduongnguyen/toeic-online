package com.dev.web.logic.command;

import com.dev.core.dto.ListenguidelineDTO;
import com.dev.web.core.command.AbstractCommand;

public class ListenguidelineCommand extends AbstractCommand<ListenguidelineDTO> {
    public ListenguidelineCommand(){
        this.pojo = new ListenguidelineDTO();
    }
}
