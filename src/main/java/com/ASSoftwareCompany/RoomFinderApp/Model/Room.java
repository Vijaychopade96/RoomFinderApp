package com.ASSoftwareCompany.RoomFinderApp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private String description;

    // Assuming there is an owner or similar property
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private RoomOwner owner;


}
