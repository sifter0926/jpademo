package org.pgm.japdemo.service;

import org.pgm.japdemo.dto.PageRequestDTO;
import org.pgm.japdemo.dto.PageResponseDTO;
import org.pgm.japdemo.dto.ReplyDTO;

public interface ReplyService {
    Long register(ReplyDTO replyDTO);
    ReplyDTO findById(Long rno);
    void modify(ReplyDTO replyDTO);
    void remove(Long rno);
    PageResponseDTO<ReplyDTO> getListOfBoard(Long rno, PageRequestDTO pageRequestDTO);
}
