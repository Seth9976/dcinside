package com.google.common.cache;

import J1.c;
import com.google.common.base.H;
import java.util.concurrent.Executor;

@c
@i
public final class y {
    public static v c(v v0, Executor executor0) {
        H.E(v0);
        H.E(executor0);
        return (z z0) -> executor0.execute(() -> v0.a(z0));
    }

    // 检测为 Lambda 实现
    private static void e(Executor executor0, v v0, z z0) [...]
}

