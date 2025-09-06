package com.unity3d.ads.network.model;

import kotlin.jvm.internal.L;
import y4.l;

public interface HttpBody {
    public static final class ByteArrayBody implements HttpBody {
        @l
        private final byte[] content;

        public ByteArrayBody(@l byte[] arr_b) {
            L.p(arr_b, "content");
            super();
            this.content = arr_b;
        }

        @l
        public final byte[] getContent() {
            return this.content;
        }
    }

    public static final class EmptyBody implements HttpBody {
        @l
        public static final EmptyBody INSTANCE;

        static {
            EmptyBody.INSTANCE = new EmptyBody();
        }
    }

    public static final class StringBody implements HttpBody {
        @l
        private final String content;

        public StringBody(@l String s) {
            L.p(s, "content");
            super();
            this.content = s;
        }

        @l
        public final String getContent() {
            return this.content;
        }
    }

}

