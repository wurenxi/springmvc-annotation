package com.atguigu.service;

import org.springframework.web.context.request.async.DeferredResult;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/8/29 21:49
 */
public class DeferredResultQueue {

    private static Queue<DeferredResult<Object>> queue = new ConcurrentLinkedQueue<>();

    public static void save(DeferredResult<Object> deferredResult){
        queue.add(deferredResult);
    }

    public static DeferredResult<Object> get(){
        return queue.poll();
    }
}
