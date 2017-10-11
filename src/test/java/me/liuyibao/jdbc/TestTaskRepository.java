package me.liuyibao.jdbc;

import me.liuyibao.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liuyibao on 2017/10/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class TestTaskRepository {

    @Autowired
    private TaskRepository taskRepository;

    @Test
    public void testFindOne() {
        Task task = taskRepository.findOne(192563L);
        System.out.println(task.getId());
        System.out.println(task.getProjectId());
        System.out.println(task.getUserId());
        System.out.println(task.getTitle());
    }
}
