package net.musecom.board.mapper;

import java.util.List;
import net.musecom.board.dto.BoardPost;

public interface BoardMapper {
    List<BoardPost> findAll();
    BoardPost findById(Long id);
    int insert(BoardPost post);
    int update(BoardPost post);
    int delete(Long id);
}
