package com.zbq.practicedemo.proxy;

/**
 * @author zhangboqing
 * @date 2018/7/1
 */
public class VideoImpl implements Video {

    private String content;


    public VideoImpl() throws InterruptedException {
        Thread.sleep(1000);
        content = "加载视频资源";
    }

    @Override
    public void play() {
        System.out.println("播放视频。。。。");
    }


}
