package com.bumptech.glide.request.transition;

public class e implements f {
    public static class a implements g {
        @Override  // com.bumptech.glide.request.transition.g
        public f a(com.bumptech.glide.load.a a0, boolean z) {
            return (Object object0, com.bumptech.glide.request.transition.f.a f$a0) -> false;
        }
    }

    static final e a;
    private static final g b;

    static {
        e.a = new e();
        e.b = new a();
    }

    // 检测为 Lambda 实现
    @Override  // com.bumptech.glide.request.transition.f
    public boolean a(Object object0, com.bumptech.glide.request.transition.f.a f$a0) [...]

    public static f b() {
        return e.a;
    }

    public static g c() {
        return e.b;
    }
}

