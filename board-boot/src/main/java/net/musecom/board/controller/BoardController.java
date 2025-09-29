package net.musecom.board.controller;

import lombok.RequiredArgsConstructor;
import net.musecom.board.dto.BoardPost;
import net.musecom.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("posts", boardService.findAll());
        return "board/list";
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable Long id, Model model) {
        model.addAttribute("post", boardService.findById(id));
        return "board/detail";
    }

    @GetMapping("/write")
    public String writeForm(Model model) {
        model.addAttribute("post", new BoardPost());
        model.addAttribute("mode", "create");
        return "board/form";
    }

    @PostMapping
    public String create(@ModelAttribute BoardPost post) {
        boardService.create(post);
        return "redirect:/board";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("post", boardService.findById(id));
        model.addAttribute("mode", "edit");
        return "board/form";
    }

    @PostMapping("/{id}")
    public String update(@PathVariable Long id, @ModelAttribute BoardPost post) {
        post.setId(id);
        boardService.update(post);
        return "redirect:/board/" + id;
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        boardService.delete(id);
        return "redirect:/board";
    }
}
