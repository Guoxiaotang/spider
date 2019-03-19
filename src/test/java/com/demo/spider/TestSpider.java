package com.demo.spider;

import com.demo.spider.entity.Chapter;
import com.demo.spider.service.impl.IChapterInterImpl;
import org.junit.Test;

import java.util.List;

/**
 * @author guowei
 * @ProjectName ams-svc-mall
 * @Description: TODO
 * @date 2019/3/14 14:30
 */
public class TestSpider {
    @Test
    public void test1(){
        IChapterInterImpl ChapterInterImpl = new IChapterInterImpl();
        List<Chapter> chapterList = ChapterInterImpl.getChapter("http://www.biquge.tw/0_5/");
        for (Chapter chapter : chapterList) {
            System.out.println(chapter);
        }
    }
}
