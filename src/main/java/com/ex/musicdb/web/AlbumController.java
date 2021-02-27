package com.ex.musicdb.web;

import com.ex.musicdb.model.binding.AlbumAddBindingModel;
import com.ex.musicdb.model.entities.AlbumEntity;
import com.ex.musicdb.model.service.AlbumServiceModel;
import com.ex.musicdb.repository.AlbumRepository;
import com.ex.musicdb.service.AlbumService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/albums")
public class AlbumController {

    private final AlbumRepository albumRepository;
    private final AlbumService albumService;
    private final ModelMapper modelMapper;

    public AlbumController(AlbumRepository albumRepository,
                           AlbumService albumService,
                           ModelMapper modelMapper) {
        this.albumRepository = albumRepository;
        this.albumService = albumService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/add")
    public String add(Model model, HttpSession httpSession) {
        if (httpSession.getAttribute("user") == null) {
            return "redirect:/users/login";
        }

        if (!model.containsAttribute("albumAddBindingModel")) {
            model.addAttribute("albumAddBindingModel", new AlbumAddBindingModel());
        }

        return "add-album";
    }

    @PostMapping("/add")
    public String addConfirm(@Valid AlbumAddBindingModel albumAddBindingModel,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("albumAddBindingModel", albumAddBindingModel);
            redirectAttributes.addFlashAttribute(
                    "org.springframework.validation.BindingResult.albumAddBindingModel", bindingResult);
            return "redirect:add";
        }

        albumService
                .add(modelMapper.map(albumAddBindingModel, AlbumServiceModel.class));
        return "redirect:/";
    }

    @GetMapping("{id}")
    public String deleteById(@PathVariable Long id) {
        albumRepository.deleteById(id);
        return "redirect:/";
    }
}
