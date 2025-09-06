package com.bytedance.sdk.component.XX;

import android.os.Bundle;
import com.bytedance.sdk.component.XX.ReZ.ReZ;
import com.bytedance.sdk.component.XX.Zh.Zh;
import com.bytedance.sdk.component.XX.Zh.cr;
import com.bytedance.sdk.component.Zh.PjT.Au;
import com.bytedance.sdk.component.Zh.PjT.qj;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PjT {
    public static final class com.bytedance.sdk.component.XX.PjT.PjT {
        private Set JQp;
        int PjT;
        int ReZ;
        int Zh;
        final List cr;
        private Bundle cz;

        public com.bytedance.sdk.component.XX.PjT.PjT() {
            this.cr = new ArrayList();
            this.PjT = 10000;
            this.Zh = 10000;
            this.ReZ = 10000;
        }

        private static int PjT(String s, long v, TimeUnit timeUnit0) {
            int v1 = Long.compare(v, 0L);
            if(v1 < 0) {
                throw new IllegalArgumentException(s + " < 0");
            }
            if(timeUnit0 == null) {
                throw new NullPointerException("unit == null");
            }
            long v2 = timeUnit0.toMillis(v);
            if(v2 > 0x7FFFFFFFL) {
                throw new IllegalArgumentException(s + " too large.");
            }
            if(v2 == 0L && v1 > 0) {
                throw new IllegalArgumentException(s + " too small.");
            }
            return (int)v2;
        }

        static Bundle PjT(com.bytedance.sdk.component.XX.PjT.PjT pjT$PjT0) {
            return pjT$PjT0.cz;
        }

        public com.bytedance.sdk.component.XX.PjT.PjT PjT(long v, TimeUnit timeUnit0) {
            this.PjT = com.bytedance.sdk.component.XX.PjT.PjT.PjT("timeout", v, timeUnit0);
            return this;
        }

        public com.bytedance.sdk.component.XX.PjT.PjT PjT(Au au0) {
            this.cr.add(au0);
            return this;
        }

        public com.bytedance.sdk.component.XX.PjT.PjT PjT(boolean z) {
            return this;
        }

        public PjT PjT() {
            return new PjT(this, null);
        }

        public com.bytedance.sdk.component.XX.PjT.PjT ReZ(long v, TimeUnit timeUnit0) {
            this.ReZ = com.bytedance.sdk.component.XX.PjT.PjT.PjT("timeout", v, timeUnit0);
            return this;
        }

        static Set Zh(com.bytedance.sdk.component.XX.PjT.PjT pjT$PjT0) {
            return pjT$PjT0.JQp;
        }

        public com.bytedance.sdk.component.XX.PjT.PjT Zh(long v, TimeUnit timeUnit0) {
            this.Zh = com.bytedance.sdk.component.XX.PjT.PjT.PjT("timeout", v, timeUnit0);
            return this;
        }
    }

    private qj PjT;

    private PjT(com.bytedance.sdk.component.XX.PjT.PjT pjT$PjT0) {
        com.bytedance.sdk.component.Zh.PjT.qj.PjT qj$PjT0 = new com.bytedance.sdk.component.Zh.PjT.qj.PjT();
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        com.bytedance.sdk.component.Zh.PjT.qj.PjT qj$PjT1 = qj$PjT0.PjT(((long)pjT$PjT0.PjT), timeUnit0).ReZ(((long)pjT$PjT0.ReZ), timeUnit0).Zh(((long)pjT$PjT0.Zh), timeUnit0);
        if(pjT$PjT0.cr != null && pjT$PjT0.cr.size() > 0) {
            for(Object object0: pjT$PjT0.cr) {
                qj$PjT1.PjT(((Au)object0));
            }
        }
        this.PjT = qj$PjT1.PjT();
    }

    PjT(com.bytedance.sdk.component.XX.PjT.PjT pjT$PjT0, com.bytedance.sdk.component.XX.PjT.1 pjT$10) {
        this(pjT$PjT0);
    }

    public qj JQp() {
        return this.PjT;
    }

    public static void PjT() {
        ReZ.PjT(com.bytedance.sdk.component.XX.ReZ.ReZ.PjT.PjT);
    }

    public Zh ReZ() {
        return new Zh(this.PjT);
    }

    public cr Zh() {
        return new cr(this.PjT);
    }

    public com.bytedance.sdk.component.XX.Zh.PjT cr() {
        return new com.bytedance.sdk.component.XX.Zh.PjT(this.PjT);
    }

    class com.bytedance.sdk.component.XX.PjT.1 {
    }

}

