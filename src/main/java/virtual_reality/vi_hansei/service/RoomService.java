package virtual_reality.vi_hansei.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import virtual_reality.vi_hansei.domain.Room;
import virtual_reality.vi_hansei.repository.RoomRepository;
import virtual_reality.vi_hansei.repository.RoomSearch;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    public List<Room> searchBuildings(RoomSearch roomSearch) {
        return roomRepository.findBuilding(roomSearch.getRoom_name());
    }
}
