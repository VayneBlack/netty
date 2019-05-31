package com.example.demo.chat;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

/**
 * FileName: ChatServer
 * Description: 服务端
 *
 * @Author: bi
 * Date:     2019/5/30 10:53
 */
@ServerEndpoint("/chat")
public class ChatServer {

    @OnOpen
    public void onOpen(Session session){
        System.out.println("连接已建立,sessionId:"+session.getId());
    }

    @OnMessage
    public void onMessage(String message){
        System.out.println("开始接收数据:"+message);
    }

    @OnClose
    public void onClose(){
        System.out.println("连接已经关闭");
    }

    @OnError
    public void onError(Session session,Throwable error){
        System.out.println("发生错误");
        error.printStackTrace();
    }
}
