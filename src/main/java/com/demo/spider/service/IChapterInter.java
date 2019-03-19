package com.demo.spider.service;


import java.util.List;

import com.demo.spider.entity.Chapter;

/**
 * 小说url接口
 * @author lilonghua
 * @date: 2017年6月22日
 */
public interface IChapterInter {

    /**
     * 获取一个完整的url链接，显示所有章节列表
     * @param @param url
     * @param @return
     * @return
     * @throws
     */
    public List<Chapter> getChapter(String url);

}