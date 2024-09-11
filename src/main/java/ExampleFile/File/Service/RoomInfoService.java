package ExampleFile.File.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ExampleFile.File.Model.RoomInfo;
import ExampleFile.File.Repository.RoomInfoRepository;

@Service
public class RoomInfoService {
  
    public RoomInfo saveRoomInfo(RoomInfo roomInfo) {
        return roomInfoRepository.save(roomInfo);
    }
    @Autowired
    private RoomInfoRepository roomInfoRepository;

    public List<RoomInfo> getAllRoomInfo() {
        return roomInfoRepository.findAll();
    }
    public List<RoomInfo> getAllRooms() {
        return roomInfoRepository.findAll();
    }
    
//    public List<RoomInfo> getAllRoomInfo() {
//        List<RoomInfo> roomInfoList = roomInfoRepository.findAll();
//        System.out.println("Fetched Rooms: " + roomInfoList); // Debugging line
//        return roomInfoList;
//    }

}
