package virtual_reality.vi_hansei.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Room {
    @Id
    @GeneratedValue
    @Column(name = "room_id")
    private Long room_id;

    private String room_name;

    private String building_name;
}
