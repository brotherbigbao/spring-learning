package me.liuyibao.jdbc;

import org.springframework.cache.annotation.Cacheable;

/**
 * Created by liuyibao on 2017/10/11.
 */
public interface TaskRepository {
    public Task findOne(long id);
}
