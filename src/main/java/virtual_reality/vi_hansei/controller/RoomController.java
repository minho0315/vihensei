package virtual_reality.vi_hansei.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import virtual_reality.vi_hansei.domain.Room;
import virtual_reality.vi_hansei.repository.RoomSearch;
import virtual_reality.vi_hansei.service.RoomService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @GetMapping("/roadView")
    public String roadView(){
        return "/roadView";
    }

    @GetMapping("/")
    public String search(@ModelAttribute("roomSearch") RoomSearch roomSearch, Model model) {
        List<Room> rooms = roomService.searchBuildings(roomSearch);
        model.addAttribute("rooms", rooms);
        return "/home";
    }
}
