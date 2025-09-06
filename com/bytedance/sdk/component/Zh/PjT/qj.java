package com.bytedance.sdk.component.Zh.PjT;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class qj implements Cloneable {
    public static final class PjT {
        public TimeUnit JQp;
        public final List PjT;
        public TimeUnit ReZ;
        public TimeUnit XX;
        public long Zh;
        public long cr;
        public long cz;

        public PjT() {
            this.PjT = new ArrayList();
            this.Zh = 10000L;
            this.ReZ = TimeUnit.MILLISECONDS;
            this.cr = 10000L;
            this.JQp = TimeUnit.MILLISECONDS;
            this.cz = 10000L;
            this.XX = TimeUnit.MILLISECONDS;
        }

        public PjT(qj qj0) {
            this.PjT = new ArrayList();
            this.Zh = qj0.Zh;
            this.ReZ = qj0.ReZ;
            this.cr = qj0.cr;
            this.JQp = qj0.JQp;
            this.cz = qj0.cz;
            this.XX = qj0.XX;
        }

        public PjT(String s) {
            this.PjT = new ArrayList();
            this.Zh = 10000L;
            this.ReZ = TimeUnit.MILLISECONDS;
            this.cr = 10000L;
            this.JQp = TimeUnit.MILLISECONDS;
            this.cz = 10000L;
            this.XX = TimeUnit.MILLISECONDS;
        }

        public PjT PjT(long v, TimeUnit timeUnit0) {
            this.Zh = v;
            this.ReZ = timeUnit0;
            return this;
        }

        public PjT PjT(Au au0) {
            this.PjT.add(au0);
            return this;
        }

        public qj PjT() {
            return com.bytedance.sdk.component.Zh.PjT.PjT.PjT.PjT(this);
        }

        public PjT ReZ(long v, TimeUnit timeUnit0) {
            this.cz = v;
            this.XX = timeUnit0;
            return this;
        }

        public PjT Zh(long v, TimeUnit timeUnit0) {
            this.cr = v;
            this.JQp = timeUnit0;
            return this;
        }
    }

    public TimeUnit JQp;
    public List PjT;
    public TimeUnit ReZ;
    public TimeUnit XX;
    public long Zh;
    public long cr;
    public long cz;

    public qj(PjT qj$PjT0) {
        this.Zh = qj$PjT0.Zh;
        this.cr = qj$PjT0.cr;
        this.cz = qj$PjT0.cz;
        this.ReZ = qj$PjT0.ReZ;
        this.JQp = qj$PjT0.JQp;
        this.XX = qj$PjT0.XX;
        this.PjT = qj$PjT0.PjT;
    }

    public abstract Zh PjT(xs arg1);

    public abstract cr PjT();

    public PjT Zh() {
        return new PjT(this);
    }
}

