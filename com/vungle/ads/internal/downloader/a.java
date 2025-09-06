package com.vungle.ads.internal.downloader;

import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public interface a {
    public static final class com.vungle.ads.internal.downloader.a.a {
        public static final class com.vungle.ads.internal.downloader.a.a.a {
            private com.vungle.ads.internal.downloader.a.a.a() {
            }

            public com.vungle.ads.internal.downloader.a.a.a(w w0) {
            }
        }

        @Retention(RetentionPolicy.RUNTIME)
        public @interface b {
            public static final class com.vungle.ads.internal.downloader.a.a.b.a {
                static final com.vungle.ads.internal.downloader.a.a.b.a $$INSTANCE;
                private static int CONNECTION_ERROR;
                private static int DISK_ERROR;
                private static int FILE_NOT_FOUND_ERROR;
                private static int INTERNAL_ERROR;
                private static int REQUEST_ERROR;

                static {
                    com.vungle.ads.internal.downloader.a.a.b.a.$$INSTANCE = new com.vungle.ads.internal.downloader.a.a.b.a();
                    com.vungle.ads.internal.downloader.a.a.b.a.REQUEST_ERROR = 1;
                    com.vungle.ads.internal.downloader.a.a.b.a.DISK_ERROR = 2;
                    com.vungle.ads.internal.downloader.a.a.b.a.FILE_NOT_FOUND_ERROR = 3;
                    com.vungle.ads.internal.downloader.a.a.b.a.INTERNAL_ERROR = 4;
                }

                public final int getCONNECTION_ERROR() {
                    return com.vungle.ads.internal.downloader.a.a.b.a.CONNECTION_ERROR;
                }

                public final int getDISK_ERROR() [...] // 潜在的解密器

                public final int getFILE_NOT_FOUND_ERROR() [...] // 潜在的解密器

                public final int getINTERNAL_ERROR() [...] // 潜在的解密器

                public final int getREQUEST_ERROR() [...] // 潜在的解密器

                public final void setCONNECTION_ERROR(int v) {
                    com.vungle.ads.internal.downloader.a.a.b.a.CONNECTION_ERROR = v;
                }

                public final void setDISK_ERROR(int v) {
                    com.vungle.ads.internal.downloader.a.a.b.a.DISK_ERROR = v;
                }

                public final void setFILE_NOT_FOUND_ERROR(int v) {
                    com.vungle.ads.internal.downloader.a.a.b.a.FILE_NOT_FOUND_ERROR = v;
                }

                public final void setINTERNAL_ERROR(int v) {
                    com.vungle.ads.internal.downloader.a.a.b.a.INTERNAL_ERROR = v;
                }

                public final void setREQUEST_ERROR(int v) {
                    com.vungle.ads.internal.downloader.a.a.b.a.REQUEST_ERROR = v;
                }
            }

            @l
            public static final com.vungle.ads.internal.downloader.a.a.b.a Companion;

            static {
                b.Companion = com.vungle.ads.internal.downloader.a.a.b.a.$$INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.downloader.a.a.a Companion = null;
        public static final int DEFAULT_SERVER_CODE = -1;
        @l
        private final Throwable cause;
        @b
        private final int reason;
        private final int serverCode;

        static {
            com.vungle.ads.internal.downloader.a.a.Companion = new com.vungle.ads.internal.downloader.a.a.a(null);
        }

        public com.vungle.ads.internal.downloader.a.a(int v, @l Throwable throwable0, int v1) {
            L.p(throwable0, "cause");
            super();
            this.serverCode = v;
            this.cause = throwable0;
            this.reason = v1;
        }

        @l
        public final Throwable getCause() {
            return this.cause;
        }

        public final int getReason() {
            return this.reason;
        }

        public final int getServerCode() {
            return this.serverCode;
        }
    }

    public static final class com.vungle.ads.internal.downloader.a.b {
        public static final class com.vungle.ads.internal.downloader.a.b.a {
            private com.vungle.ads.internal.downloader.a.b.a() {
            }

            public com.vungle.ads.internal.downloader.a.b.a(w w0) {
            }

            @l
            public final com.vungle.ads.internal.downloader.a.b copy(@l com.vungle.ads.internal.downloader.a.b a$b0) {
                L.p(a$b0, "progress");
                com.vungle.ads.internal.downloader.a.b a$b1 = new com.vungle.ads.internal.downloader.a.b();
                a$b1.setStatus(a$b0.getStatus());
                a$b1.setProgressPercent(a$b0.getProgressPercent());
                a$b1.setTimestampDownloadStart(a$b0.getTimestampDownloadStart());
                a$b1.setSizeBytes(a$b0.getSizeBytes());
                a$b1.setStartBytes(a$b0.getStartBytes());
                return a$b1;
            }
        }

        @Retention(RetentionPolicy.RUNTIME)
        public @interface com.vungle.ads.internal.downloader.a.b.b {
            public static final class com.vungle.ads.internal.downloader.a.b.b.a {
                static final com.vungle.ads.internal.downloader.a.b.b.a $$INSTANCE;
                private static int CANCELLED;
                private static int DONE;
                private static int ERROR;
                private static int IN_PROGRESS;
                private static int LOST_CONNECTION;
                private static int PAUSED;
                private static int STARTED;
                private static int STATE_CHANGED;

                static {
                    com.vungle.ads.internal.downloader.a.b.b.a.$$INSTANCE = new com.vungle.ads.internal.downloader.a.b.b.a();
                    com.vungle.ads.internal.downloader.a.b.b.a.IN_PROGRESS = 1;
                    com.vungle.ads.internal.downloader.a.b.b.a.PAUSED = 2;
                    com.vungle.ads.internal.downloader.a.b.b.a.CANCELLED = 3;
                    com.vungle.ads.internal.downloader.a.b.b.a.DONE = 4;
                    com.vungle.ads.internal.downloader.a.b.b.a.LOST_CONNECTION = 5;
                    com.vungle.ads.internal.downloader.a.b.b.a.STATE_CHANGED = 6;
                    com.vungle.ads.internal.downloader.a.b.b.a.ERROR = 7;
                }

                public final int getCANCELLED() [...] // 潜在的解密器

                public final int getDONE() [...] // 潜在的解密器

                public final int getERROR() [...] // 潜在的解密器

                public final int getIN_PROGRESS() [...] // 潜在的解密器

                public final int getLOST_CONNECTION() {
                    return com.vungle.ads.internal.downloader.a.b.b.a.LOST_CONNECTION;
                }

                public final int getPAUSED() {
                    return com.vungle.ads.internal.downloader.a.b.b.a.PAUSED;
                }

                public final int getSTARTED() [...] // 潜在的解密器

                public final int getSTATE_CHANGED() {
                    return com.vungle.ads.internal.downloader.a.b.b.a.STATE_CHANGED;
                }

                public final void setCANCELLED(int v) {
                    com.vungle.ads.internal.downloader.a.b.b.a.CANCELLED = v;
                }

                public final void setDONE(int v) {
                    com.vungle.ads.internal.downloader.a.b.b.a.DONE = v;
                }

                public final void setERROR(int v) {
                    com.vungle.ads.internal.downloader.a.b.b.a.ERROR = v;
                }

                public final void setIN_PROGRESS(int v) {
                    com.vungle.ads.internal.downloader.a.b.b.a.IN_PROGRESS = v;
                }

                public final void setLOST_CONNECTION(int v) {
                    com.vungle.ads.internal.downloader.a.b.b.a.LOST_CONNECTION = v;
                }

                public final void setPAUSED(int v) {
                    com.vungle.ads.internal.downloader.a.b.b.a.PAUSED = v;
                }

                public final void setSTARTED(int v) {
                    com.vungle.ads.internal.downloader.a.b.b.a.STARTED = v;
                }

                public final void setSTATE_CHANGED(int v) {
                    com.vungle.ads.internal.downloader.a.b.b.a.STATE_CHANGED = v;
                }
            }

            @l
            public static final com.vungle.ads.internal.downloader.a.b.b.a Companion;

            static {
                com.vungle.ads.internal.downloader.a.b.b.Companion = com.vungle.ads.internal.downloader.a.b.b.a.$$INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.downloader.a.b.a Companion;
        private int progressPercent;
        private long sizeBytes;
        private long startBytes;
        private int status;
        private long timestampDownloadStart;

        static {
            com.vungle.ads.internal.downloader.a.b.Companion = new com.vungle.ads.internal.downloader.a.b.a(null);
        }

        public final int getProgressPercent() {
            return this.progressPercent;
        }

        public final long getSizeBytes() {
            return this.sizeBytes;
        }

        public final long getStartBytes() {
            return this.startBytes;
        }

        public final int getStatus() {
            return this.status;
        }

        @com.vungle.ads.internal.downloader.a.b.b
        public static void getStatus$annotations() {
        }

        public final long getTimestampDownloadStart() {
            return this.timestampDownloadStart;
        }

        public final void setProgressPercent(int v) {
            this.progressPercent = v;
        }

        public final void setSizeBytes(long v) {
            this.sizeBytes = v;
        }

        public final void setStartBytes(long v) {
            this.startBytes = v;
        }

        public final void setStatus(int v) {
            this.status = v;
        }

        public final void setTimestampDownloadStart(long v) {
            this.timestampDownloadStart = v;
        }
    }

    void onError(@m com.vungle.ads.internal.downloader.a.a arg1, @l d arg2);

    void onSuccess(@l File arg1, @l d arg2);
}

