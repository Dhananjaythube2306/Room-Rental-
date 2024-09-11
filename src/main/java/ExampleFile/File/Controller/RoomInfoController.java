package ExampleFile.File.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import ExampleFile.File.Model.RoomInfo;
import ExampleFile.File.Repository.RoomInfoRepository;
import ExampleFile.File.Service.RoomInfoService;

@Controller
public class RoomInfoController {

    @Autowired
    private RoomInfoRepository roomInfoRepository;

    @Autowired
    private RoomInfoService roomInfoService;

    // Room Information - Save RoomInfo
    @PostMapping("/SendRoomInfo")
    public RedirectView sendRoomInfo(@ModelAttribute RoomInfo roomInfo) {
        roomInfoRepository.save(roomInfo);
        System.out.println("Data Saved");
        return new RedirectView("/");
    }

    @GetMapping("/roomList")
    public String getRoomInfo(Model model) {
        List<RoomInfo> roomInfoList = roomInfoService.getAllRoomInfo();
        System.out.println("Fetched Room Info: " + roomInfoList); // Debugging Line
        model.addAttribute("roomsList", roomInfoList);
        return "roomList";
    }
}
