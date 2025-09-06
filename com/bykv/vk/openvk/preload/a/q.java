package com.bykv.vk.openvk.preload.a;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public abstract class q extends Enum {
    public static final enum q a;
    private static enum q b;

    static {
        q.a = new q("DEFAULT") {
        };
        q.b = new q("STRING") {
        };
    }

    private q(String s, int v) {
        super(s, v);
    }

    q(String s, int v, byte b) {
        this(s, v);
    }
}

