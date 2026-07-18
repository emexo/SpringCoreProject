package com.springcore.dao;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Log4j2
@Repository
public class StationDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Station station) {
        log.info("Inside the StationDAO save method, station:{}", station);
        String sql = "INSERT INTO station(station_name, station_code, location) VALUES (?, ?, ?)";
        int result = jdbcTemplate.update(sql, station.stationName(), station.stationCode(), station.location());
        log.info("Station saved successfully: {}", result);
    }
}
