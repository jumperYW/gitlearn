package com.wayne.netty.demo1;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;


public class ChildChannelHandler extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        socketChannel.pipeline().addLast(new TimeServerHandler());
    }
}
