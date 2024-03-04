package com.example.bookingbreezebackend.repository;

import com.example.bookingbreezebackend.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
