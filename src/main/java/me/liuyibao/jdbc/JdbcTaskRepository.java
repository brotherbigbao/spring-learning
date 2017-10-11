package me.liuyibao.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

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
}
