package me.liuyibao.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by liuyibao on 2017/10/11.
 */
public final class TaskRowMapper implements RowMapper<Task> {
    public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Task(
                rs.getLong("id"),
                rs.getLong("user_id"),
                rs.getLong("project_id"),
                rs.getString("title")
        );
    }
}
