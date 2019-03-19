package com.demo.spider.entity;

import java.io.Serializable;

/**
 * @author guowei
 * @ProjectName ams-svc-mall
 * @Description: TODO
 * @date 2019/3/14 14:24
 */
public class Chapter implements Serializable {
    private static final long serialVersionUID = 1L;
    private String title;//小说章节
    private String url;//章节链接
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    @Override
    public String toString() {
        return "Chapter [title=" + title + ", url=" + url + "]";
    }
}