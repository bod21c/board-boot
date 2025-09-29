package net.musecom.board.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import net.musecom.board.dto.BoardPost;
import net.musecom.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Override
    public List<BoardPost> findAll() {
        return boardMapper.findAll();
    }

    @Override
    public BoardPost findById(Long id) {
        return boardMapper.findById(id);
    }

    @Override
    @Transactional
    public void create(BoardPost post) {
        boardMapper.insert(post);
    }

    @Override
    @Transactional
    public void update(BoardPost post) {
        boardMapper.update(post);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        boardMapper.delete(id);
    }
}
