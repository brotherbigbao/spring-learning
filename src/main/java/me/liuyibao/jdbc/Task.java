package me.liuyibao.jdbc;

import java.io.Serializable;

/**
 * Created by liuyibao on 2017/10/11.
 */
public class Task implements Serializable{

    private Long id;

    private Long userId;

    private Long projectId;

    private String title;

    public Task(Long id, Long userId, Long projectId, String title) {
        this.id = id;
        this.userId = userId;
        this.projectId = projectId;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
