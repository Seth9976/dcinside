package com.vungle.ads.internal.task;

import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import s3.a;
import s3.e;
import y4.l;

public interface c {
    @Retention(RetentionPolicy.SOURCE)
    @e(a.a)
    public @interface com.vungle.ads.internal.task.c.a {
        public static final class com.vungle.ads.internal.task.c.a.a {
            static final com.vungle.ads.internal.task.c.a.a $$INSTANCE = null;
            public static final int FAILURE = 1;
            public static final int RESCHEDULE = 2;
            public static final int SUCCESS;

            static {
                com.vungle.ads.internal.task.c.a.a.$$INSTANCE = new com.vungle.ads.internal.task.c.a.a();
            }
        }

        @l
        public static final com.vungle.ads.internal.task.c.a.a Companion = null;
        public static final int FAILURE = 1;
        public static final int RESCHEDULE = 2;
        public static final int SUCCESS;

        static {
            com.vungle.ads.internal.task.c.a.Companion = com.vungle.ads.internal.task.c.a.a.$$INSTANCE;
        }
    }

    int onRunJob(@l Bundle arg1, @l g arg2);
}

