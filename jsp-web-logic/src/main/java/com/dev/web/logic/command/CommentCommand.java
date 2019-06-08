package com.dev.web.logic.command;

import com.dev.core.dto.CommentDTO;
import com.dev.web.core.command.AbstractCommand;

public class CommentCommand extends AbstractCommand<CommentDTO> {
    public CommentCommand(){
        this.pojo = new CommentDTO();
    }
}