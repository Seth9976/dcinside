package com.vungle.ads.internal.downloader;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import y4.l;
import y4.m;

public interface e {
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        public static final class com.vungle.ads.internal.downloader.e.a.a {
            static final com.vungle.ads.internal.downloader.e.a.a $$INSTANCE;
            private static int ANY;
            private static int CELLULAR;
            private static int WIFI;

            static {
                com.vungle.ads.internal.downloader.e.a.a.$$INSTANCE = new com.vungle.ads.internal.downloader.e.a.a();
                com.vungle.ads.internal.downloader.e.a.a.CELLULAR = 1;
                com.vungle.ads.internal.downloader.e.a.a.WIFI = 2;
                com.vungle.ads.internal.downloader.e.a.a.ANY = 3;
            }

            public final int getANY() {
                return com.vungle.ads.internal.downloader.e.a.a.ANY;
            }

            public final int getCELLULAR() {
                return com.vungle.ads.internal.downloader.e.a.a.CELLULAR;
            }

            public final int getWIFI() {
                return com.vungle.ads.internal.downloader.e.a.a.WIFI;
            }

            public final void setANY(int v) {
                com.vungle.ads.internal.downloader.e.a.a.ANY = v;
            }

            public final void setCELLULAR(int v) {
                com.vungle.ads.internal.downloader.e.a.a.CELLULAR = v;
            }

            public final void setWIFI(int v) {
                com.vungle.ads.internal.downloader.e.a.a.WIFI = v;
            }
        }

        @l
        public static final com.vungle.ads.internal.downloader.e.a.a Companion;

        static {
            a.Companion = com.vungle.ads.internal.downloader.e.a.a.$$INSTANCE;
        }
    }

    public static final class b extends Exception {
        public b(@m String s) {
            super(s);
        }
    }

    void cancel(@m d arg1);

    void cancelAll();

    void download(@m d arg1, @m com.vungle.ads.internal.downloader.a arg2);
}

