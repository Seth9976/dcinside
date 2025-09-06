package com.bykv.vk.openvk.preload.geckox.net;

import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import java.util.List;

public interface INetWork {
    Response doGet(String arg1) throws Exception;

    Response doPost(String arg1, String arg2) throws Exception;

    Response doPost(String arg1, List arg2) throws Exception;

    void downloadFile(String arg1, long arg2, BufferOutputStream arg3) throws Exception;

    void syncDoGet(String arg1);
}

