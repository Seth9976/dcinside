package com.bykv.vk.openvk.preload.falconx.loader;

import java.io.InputStream;
import java.util.Map;

public interface ILoader {
    boolean exist(String arg1) throws Exception;

    Map getChannelVersion();

    InputStream getInputStream(String arg1) throws Exception;

    String getResRootDir();

    void release() throws Exception;
}

