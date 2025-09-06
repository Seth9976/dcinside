package com.apm.insight.l;

import android.annotation.TargetApi;
import android.os.Debug.MemoryInfo;
import java.util.Map;

public final class c {
    static class a {
        private a() {
        }

        a(byte b) {
        }

        public int a(Debug.MemoryInfo debug$MemoryInfo0) {
            return -1;
        }

        public int b(Debug.MemoryInfo debug$MemoryInfo0) {
            return -1;
        }

        public int c(Debug.MemoryInfo debug$MemoryInfo0) {
            return -1;
        }
    }

    @TargetApi(19)
    static final class b extends a {
        private b() {
            super(0);
        }

        b(byte b) {
        }

        @Override  // com.apm.insight.l.c$a
        public final int a(Debug.MemoryInfo debug$MemoryInfo0) {
            return debug$MemoryInfo0.getTotalPrivateClean();
        }

        @Override  // com.apm.insight.l.c$a
        public final int b(Debug.MemoryInfo debug$MemoryInfo0) {
            return debug$MemoryInfo0.getTotalSharedClean();
        }

        @Override  // com.apm.insight.l.c$a
        public final int c(Debug.MemoryInfo debug$MemoryInfo0) {
            return debug$MemoryInfo0.getTotalSwappablePss();
        }
    }

    private static a a;

    static {
        c.a = new b(0);
    }

    public static int a(Debug.MemoryInfo debug$MemoryInfo0) {
        return c.a.a(debug$MemoryInfo0);
    }

    public static int b(Debug.MemoryInfo debug$MemoryInfo0) {
        return c.a.b(debug$MemoryInfo0);
    }

    public static int c(Debug.MemoryInfo debug$MemoryInfo0) {
        return c.a.c(debug$MemoryInfo0);
    }

    public final class com.apm.insight.l.c.1 {
        public static int a(Object object0, int v) {
            if(object0 == null) {
                return v;
            }
            if(object0 instanceof Integer) {
                return (int)(((Integer)object0));
            }
            if(object0 instanceof String) {
                try {
                    return Integer.parseInt(String.valueOf(object0));
                }
                catch(Throwable unused_ex) {
                }
            }
            return v;
        }

        public static Float a(Map map0) {
            float f = 0.0f;
            for(Object object0: map0.values()) {
                Float float0 = (Float)object0;
                if(float0 != null) {
                    f += (float)float0;
                }
            }
            return f;
        }

        public static Long a(Map map0, String s, Long long0) {
            if(s != null && map0 != null) {
                Long long1 = (Long)map0.get(s);
                if(long1 != null) {
                    long0 = (long)(((long)long1) + ((long)long0));
                }
                map0.put(s, long0);
                return long0;
            }
            return -1L;
        }
    }

}

