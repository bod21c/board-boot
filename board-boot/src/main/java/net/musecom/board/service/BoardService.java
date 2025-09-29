package net.musecom.board.service;

import java.util.List;
import net.musecom.board.dto.BoardPost;

public interface BoardService {
    List<BoardPost> findAll();
    BoardPost findById(Long id);
    void create(BoardPost post);
    void update(BoardPost post);
    void delete(Long id);
}
