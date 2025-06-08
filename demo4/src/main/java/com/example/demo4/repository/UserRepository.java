package com.example.demo4.repository;

import com.example.demo4.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    private final JdbcTemplate jdbc;

    public UserRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    private final RowMapper<User> rowMapper = (rs, rowNum) -> {
        User u = new User();
        u.setId(rs.getInt("id"));
        u.setName(rs.getString("name"));
        u.setEmail(rs.getString("email"));
        return u;
    };

    public List<User> findAll() {
        return jdbc.query("SELECT * FROM users", rowMapper);
    }

    public int save(User user) {
        return jdbc.update("INSERT INTO users (name, email) VALUES (?, ?)",
                user.getName(), user.getEmail());
    }
}

