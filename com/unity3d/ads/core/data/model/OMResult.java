package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class OMResult {
    public static final class Failure extends OMResult {
        @l
        private final String reason;
        @m
        private final String reasonDebug;

        public Failure(@l String s, @m String s1) {
            L.p(s, "reason");
            super(null);
            this.reason = s;
            this.reasonDebug = s1;
        }

        public Failure(String s, String s1, int v, w w0) {
            if((v & 2) != 0) {
                s1 = null;
            }
            this(s, s1);
        }

        @l
        public final String component1() {
            return this.reason;
        }

        @m
        public final String component2() {
            return this.reasonDebug;
        }

        @l
        public final Failure copy(@l String s, @m String s1) {
            L.p(s, "reason");
            return new Failure(s, s1);
        }

        public static Failure copy$default(Failure oMResult$Failure0, String s, String s1, int v, Object object0) {
            if((v & 1) != 0) {
                s = oMResult$Failure0.reason;
            }
            if((v & 2) != 0) {
                s1 = oMResult$Failure0.reasonDebug;
            }
            return oMResult$Failure0.copy(s, s1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Failure)) {
                return false;
            }
            return L.g(this.reason, ((Failure)object0).reason) ? L.g(this.reasonDebug, ((Failure)object0).reasonDebug) : false;
        }

        @l
        public final String getReason() {
            return this.reason;
        }

        @m
        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        @Override
        public int hashCode() {
            int v = this.reason.hashCode();
            return this.reasonDebug == null ? v * 0x1F : v * 0x1F + this.reasonDebug.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Failure(reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
        }
    }

    public static final class Success extends OMResult {
        @l
        public static final Success INSTANCE;

        static {
            Success.INSTANCE = new Success();
        }

        private Success() {
            super(null);
        }
    }

    private OMResult() {
    }

    public OMResult(w w0) {
    }
}

