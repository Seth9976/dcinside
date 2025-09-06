package com.bykv.vk.openvk.preload.geckox.model;

import com.bykv.vk.openvk.preload.a.a.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckRequestBodyModel {
    public static class Channel {
        @b(a = "c")
        String channelName;
        @b(a = "l_v")
        public String localVersion;

        public Channel(String s) {
            this.channelName = s;
        }
    }

    public static class ChannelInfo {
        @b(a = "channel")
        private String channel;
        @b(a = "local_version")
        private long localVersion;

        public ChannelInfo(String s, long v) {
            this.channel = s;
            this.localVersion = v;
        }
    }

    public static class Channels {
        @b(a = "channels")
        public List channels;

        public Channels() {
            this.channels = new ArrayList();
        }
    }

    public static class Group {
        @b(a = "group_name")
        public String groupName;
        @b(a = "target_channels")
        public List targetChannels;

    }

    public static enum GroupType {
        NORMAL("normal"),
        HIGHPRIORITY("high_priority");

        private String value;

        private GroupType(String s1) {
            this.value = s1;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public static class LocalChannel {
        @b(a = "l_v")
        public Long localVersion;

    }

    public static class ProcessorParams {
        @b(a = "domain")
        public String domain;

    }

    public static class TargetChannel {
        @b(a = "c")
        public String channelName;
        @b(a = "t_v")
        public Long targetVersion;

        public TargetChannel() {
        }

        public TargetChannel(String s) {
            this.channelName = s;
        }

        public TargetChannel(String s, Long long0) {
            this.channelName = s;
            this.targetVersion = long0;
        }
    }

    @b(a = "common")
    private Common common;
    @b(a = "custom")
    private Map custom;
    @b(a = "deployment")
    private Map deployment;
    @b(a = "deployments")
    private Map deployments;
    @b(a = "local")
    private Map local;

    public void putChannelInfo(String s, List list0) {
        if(this.deployment == null) {
            this.deployment = new HashMap();
        }
        this.deployment.put(s, list0);
    }

    public void setCommon(Common common0) {
        this.common = common0;
    }

    public void setCustom(Map map0) {
        this.custom = map0;
    }

    public void setDeployments(Map map0) {
        this.deployments = map0;
    }

    public void setLocal(Map map0) {
        this.local = map0;
    }
}

