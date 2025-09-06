package com.unity3d.services.core.properties;

import y4.l;

public interface Session {
    public static final class Default implements Session {
        static final Default $$INSTANCE;
        @l
        private static final String id;

        static {
            Default.$$INSTANCE = new Default();
            Default.id = "a0f00e99-9eeb-460c-b859-d812819712d2";
        }

        // 去混淆评级： 低(20)
        // 检测为 Lambda 实现
        @Override  // com.unity3d.services.core.properties.Session
        @l
        public String getId() [...] // 潜在的解密器
    }

    @l
    public static final Default Default;

    static {
        Session.Default = () -> // 去混淆评级： 低(20)
        "6b750794-c9bf-4d7f-8029-412970e52235";
    }

    @l
    String getId();
}

