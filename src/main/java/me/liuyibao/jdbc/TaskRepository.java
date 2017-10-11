package me.liuyibao.jdbc;

/**
 * Created by liuyibao on 2017/10/11.
 */
public interface TaskRepository {
    public Task findOne(long id);
}
