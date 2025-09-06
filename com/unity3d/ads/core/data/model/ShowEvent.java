package com.unity3d.ads.core.data.model;

import com.unity3d.ads.adplayer.model.ShowStatus;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class ShowEvent {
    public static final class CancelTimeout extends ShowEvent {
        @l
        public static final CancelTimeout INSTANCE;

        static {
            CancelTimeout.INSTANCE = new CancelTimeout();
        }

        private CancelTimeout() {
            super(null);
        }
    }

    public static final class Clicked extends ShowEvent {
        @l
        public static final Clicked INSTANCE;

        static {
            Clicked.INSTANCE = new Clicked();
        }

        private Clicked() {
            super(null);
        }
    }

    public static final class Completed extends ShowEvent {
        @l
        private final ShowStatus status;

        public Completed(@l ShowStatus showStatus0) {
            L.p(showStatus0, "status");
            super(null);
            this.status = showStatus0;
        }

        @l
        public final ShowStatus component1() {
            return this.status;
        }

        @l
        public final Completed copy(@l ShowStatus showStatus0) {
            L.p(showStatus0, "status");
            return new Completed(showStatus0);
        }

        public static Completed copy$default(Completed showEvent$Completed0, ShowStatus showStatus0, int v, Object object0) {
            if((v & 1) != 0) {
                showStatus0 = showEvent$Completed0.status;
            }
            return showEvent$Completed0.copy(showStatus0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Completed ? this.status == ((Completed)object0).status : false;
        }

        @l
        public final ShowStatus getStatus() {
            return this.status;
        }

        @Override
        public int hashCode() {
            return this.status.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Completed(status=" + this.status + ')';
        }
    }

    public static final class Error extends ShowEvent {
        private final int errorCode;
        @l
        private final String message;
        @l
        private final String reason;

        public Error(@l String s, int v, @l String s1) {
            L.p(s, "message");
            L.p(s1, "reason");
            super(null);
            this.message = s;
            this.errorCode = v;
            this.reason = s1;
        }

        @l
        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        @l
        public final String component3() {
            return this.reason;
        }

        @l
        public final Error copy(@l String s, int v, @l String s1) {
            L.p(s, "message");
            L.p(s1, "reason");
            return new Error(s, v, s1);
        }

        public static Error copy$default(Error showEvent$Error0, String s, int v, String s1, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = showEvent$Error0.message;
            }
            if((v1 & 2) != 0) {
                v = showEvent$Error0.errorCode;
            }
            if((v1 & 4) != 0) {
                s1 = showEvent$Error0.reason;
            }
            return showEvent$Error0.copy(s, v, s1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Error)) {
                return false;
            }
            if(!L.g(this.message, ((Error)object0).message)) {
                return false;
            }
            return this.errorCode == ((Error)object0).errorCode ? L.g(this.reason, ((Error)object0).reason) : false;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        @l
        public final String getMessage() {
            return this.message;
        }

        @l
        public final String getReason() {
            return this.reason;
        }

        @Override
        public int hashCode() {
            return (this.message.hashCode() * 0x1F + this.errorCode) * 0x1F + this.reason.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ", reason=" + this.reason + ')';
        }
    }

    public static final class LeftApplication extends ShowEvent {
        @l
        public static final LeftApplication INSTANCE;

        static {
            LeftApplication.INSTANCE = new LeftApplication();
        }

        private LeftApplication() {
            super(null);
        }
    }

    public static final class Started extends ShowEvent {
        @l
        public static final Started INSTANCE;

        static {
            Started.INSTANCE = new Started();
        }

        private Started() {
            super(null);
        }
    }

    private ShowEvent() {
    }

    public ShowEvent(w w0) {
    }
}

