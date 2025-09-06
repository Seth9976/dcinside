package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class LoadEvent {
    public static final class Completed extends LoadEvent {
        @l
        public static final Completed INSTANCE;

        static {
            Completed.INSTANCE = new Completed();
        }

        private Completed() {
            super(null);
        }
    }

    public static final class Error extends LoadEvent {
        private final int errorCode;
        @l
        private final String message;

        public Error(@l String s, int v) {
            L.p(s, "message");
            super(null);
            this.message = s;
            this.errorCode = v;
        }

        @l
        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        @l
        public final Error copy(@l String s, int v) {
            L.p(s, "message");
            return new Error(s, v);
        }

        public static Error copy$default(Error loadEvent$Error0, String s, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = loadEvent$Error0.message;
            }
            if((v1 & 2) != 0) {
                v = loadEvent$Error0.errorCode;
            }
            return loadEvent$Error0.copy(s, v);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Error)) {
                return false;
            }
            return L.g(this.message, ((Error)object0).message) ? this.errorCode == ((Error)object0).errorCode : false;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        @l
        public final String getMessage() {
            return this.message;
        }

        @Override
        public int hashCode() {
            return this.message.hashCode() * 0x1F + this.errorCode;
        }

        @Override
        @l
        public String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ')';
        }
    }

    private LoadEvent() {
    }

    public LoadEvent(w w0) {
    }
}

