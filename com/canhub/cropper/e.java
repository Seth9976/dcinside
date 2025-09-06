package com.canhub.cropper;

import android.net.Uri;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class e extends Exception {
    public static final class a extends e {
        public static final class com.canhub.cropper.e.a.a {
            private com.canhub.cropper.e.a.a() {
            }

            public com.canhub.cropper.e.a.a(w w0) {
            }
        }

        @l
        public static final com.canhub.cropper.e.a.a d = null;
        private static final long e = 0xA04B87C29A1FCD7AL;

        static {
            a.d = new com.canhub.cropper.e.a.a(null);
        }

        public a() {
            super("crop: cropping has been cancelled by the user", null);
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }
    }

    public static final class c extends e {
        public static final class com.canhub.cropper.e.c.a {
            private com.canhub.cropper.e.c.a() {
            }

            public com.canhub.cropper.e.c.a(w w0) {
            }
        }

        @l
        public static final com.canhub.cropper.e.c.a d = null;
        private static final long e = 0x30CBE3C946ABE96BL;

        static {
            c.d = new com.canhub.cropper.e.c.a(null);
        }

        public c(@l Uri uri0) {
            L.p(uri0, "uri");
            super("crop: Failed to decode image: " + uri0, null);
        }
    }

    public static final class d extends e {
        public static final class com.canhub.cropper.e.d.a {
            private com.canhub.cropper.e.d.a() {
            }

            public com.canhub.cropper.e.d.a(w w0) {
            }
        }

        @l
        public static final com.canhub.cropper.e.d.a d = null;
        private static final long e = 0x6C1FB337E16E5E64L;

        static {
            d.d = new com.canhub.cropper.e.d.a(null);
        }

        public d(@l Uri uri0, @m String s) {
            L.p(uri0, "uri");
            super("crop: Failed to load sampled bitmap: " + uri0 + "\r\n" + s, null);
        }
    }

    @l
    public static final b a = null;
    private static final long b = 0x4478B39BA58A0F0DL;
    @l
    public static final String c = "crop:";

    static {
        e.a = new b(null);
    }

    private e(String s) {
        super(s);
    }

    public e(String s, w w0) {
        this(s);
    }
}

