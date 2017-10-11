package me.liuyibao.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by liuyibao on 2017/10/11.
 */
@Repository
public class JdbcTaskRepository implements TaskRepository {
    private JdbcOperations jdbcOperations;

    @Autowired
    public JdbcTaskRepository(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    public Task findOne(long id) {
        return jdbcOperations.queryForObject("SELECT * FROM task WHERE id = ?", new TaskRowMapper(), id);
    }

    private static final class TaskRowMapper implements RowMapper<Task> {
        public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Task(
                    rs.getLong("id"),
                    rs.getLong("user_id"),
                    rs.getLong("project_id"),
                    rs.getString("title")
            );
        }
    }
}
