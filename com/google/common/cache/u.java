package com.google.common.cache;

import J1.b;

@b
@i
public abstract enum u {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class a extends u {
        a(String s, int v) {
            super(null);
        }

        @Override  // com.google.common.cache.u
        boolean b() {
            return false;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class com.google.common.cache.u.b extends u {
        com.google.common.cache.u.b(String s, int v) {
            super(null);
        }

        @Override  // com.google.common.cache.u
        boolean b() {
            return false;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class c extends u {
        c(String s, int v) {
            super(null);
        }

        @Override  // com.google.common.cache.u
        boolean b() {
            return true;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class d extends u {
        d(String s, int v) {
            super(null);
        }

        @Override  // com.google.common.cache.u
        boolean b() {
            return true;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class e extends u {
        e(String s, int v) {
            super(null);
        }

        @Override  // com.google.common.cache.u
        boolean b() {
            return true;
        }
    }

    EXPLICIT /* 警告！未生成枚举子类：com.google.common.cache.u$a */,
    REPLACED /* 警告！未生成枚举子类：com.google.common.cache.u$b */,
    COLLECTED /* 警告！未生成枚举子类：com.google.common.cache.u$c */,
    EXPIRED /* 警告！未生成枚举子类：com.google.common.cache.u$d */,
    SIZE /* 警告！未生成枚举子类：com.google.common.cache.u$e */;

    private u() {
    }

    private static u[] a() [...] // Inlined contents

    abstract boolean b();
}

