package com.zbq.practicedemo.proxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * @author zhangboqing
 * @date 2018/7/1
 */
public class LoadVideoClient {

    private static Video video;

    public static Video getVideo() {

        return (Video) Proxy.newProxyInstance(
                Video.class.getClassLoader(),
                Video.class.getInterfaces(),
                (Object proxy, Method method, Object[] args) -> {

                    if (Objects.isNull(video)) {
                        video = new VideoImpl();
                    }

                    video.play();
                    return null;
                });
    }
}
