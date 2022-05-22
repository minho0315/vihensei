package virtual_reality.vi_hansei.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import virtual_reality.vi_hansei.domain.Room;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class RoomRepository {

    private final EntityManager em;

    // room_name으로 조회
    public List<Room> findBuilding(String room_name) {
        return em.createQuery("select m from Room m where m.room_name =:room_name", Room.class)
                .setParameter("room_name", room_name)
                .getResultList();
    }
}
