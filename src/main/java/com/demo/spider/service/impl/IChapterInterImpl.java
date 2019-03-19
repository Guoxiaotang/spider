package com.demo.spider.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.demo.spider.entity.Chapter;
import com.demo.spider.service.IChapterInter;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * 小说url接口实现类
 *
 * @author lilonghua
 * @date: 2017年6月22日
 */
public class IChapterInterImpl implements IChapterInter {

    protected String crawl(String url) throws Exception {
        //采用HttpClient技术
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build();
             CloseableHttpResponse httpResponse = httpClient.execute(new HttpGet(url))) {
            String result = EntityUtils.toString(httpResponse.getEntity());
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public List<Chapter> getChapter(String url) {
        try {
            String result = crawl(url);
            Document doc = Jsoup.parse(result);
            Elements as = doc.select("#list dd a");
            List<Chapter> chapters = new ArrayList<>();
            for (Element a : as) {
                Chapter chapter = new Chapter();
                chapter.setTitle(a.text());
                chapter.setUrl("http://www.bxwx8.org" + a.attr("href"));
                chapters.add(chapter);
            }
            return chapters;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}