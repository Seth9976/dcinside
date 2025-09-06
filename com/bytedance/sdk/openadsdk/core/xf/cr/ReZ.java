package com.bytedance.sdk.openadsdk.core.xf.cr;

import com.bykv.vk.openvk.PjT.PjT.Zh.cr.h;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import s.a.a;

public class ReZ extends h {
    class PjT implements a {
        final ReZ PjT;

        private PjT() {
        }

        PjT(com.bytedance.sdk.openadsdk.core.xf.cr.ReZ.1 reZ$10) {
        }

        @Override  // s.a$a
        public void JQp(s.a a0) {
            for(Object object0: ReZ.this.PjT) {
                ((Zh)object0).JQp(a0);
            }
        }

        @Override  // s.a$a
        public void PjT(s.a a0) {
            ReZ.PjT(ReZ.this);
            if(ReZ.this.ReZ <= ReZ.this.Zh) {
                for(Object object0: ReZ.this.PjT) {
                    ((Zh)object0).PjT(ReZ.this.ReZ, ReZ.this.Zh);
                }
                ReZ.this.SM();
                return;
            }
            for(Object object1: ReZ.this.PjT) {
                ((Zh)object1).PjT(a0);
            }
        }

        @Override  // s.a$a
        public void PjT(s.a a0, int v) {
            for(Object object0: ReZ.this.PjT) {
                ((Zh)object0).PjT(a0, v);
            }
        }

        @Override  // s.a$a
        public void PjT(s.a a0, int v, int v1) {
            for(Object object0: ReZ.this.PjT) {
                ((Zh)object0).PjT(a0, v, v1);
            }
        }

        @Override  // s.a$a
        public void PjT(s.a a0, int v, int v1, int v2) {
            for(Object object0: ReZ.this.PjT) {
                ((Zh)object0).PjT(a0, v, v1, v2);
            }
        }

        @Override  // s.a$a
        public void PjT(s.a a0, long v) {
            for(Object object0: ReZ.this.PjT) {
                ((Zh)object0).PjT(a0, v);
            }
        }

        @Override  // s.a$a
        public void PjT(s.a a0, long v, long v1) {
            for(Object object0: ReZ.this.PjT) {
                ((Zh)object0).PjT(a0, v, v1);
            }
        }

        @Override  // s.a$a
        public void PjT(s.a a0, v.a a1) {
            for(Object object0: ReZ.this.PjT) {
                ((Zh)object0).PjT(a0, a1);
            }
        }

        @Override  // s.a$a
        public void PjT(s.a a0, boolean z) {
            for(Object object0: ReZ.this.PjT) {
                ((Zh)object0).PjT(a0, z);
            }
        }

        @Override  // s.a$a
        public void ReZ(s.a a0) {
            for(Object object0: ReZ.this.PjT) {
                ((Zh)object0).ReZ(a0);
            }
        }

        @Override  // s.a$a
        public void Zh(s.a a0) {
            for(Object object0: ReZ.this.PjT) {
                ((Zh)object0).Zh(a0);
            }
        }

        @Override  // s.a$a
        public void Zh(s.a a0, int v) {
            for(Object object0: ReZ.this.PjT) {
                ((Zh)object0).Zh(a0, v);
            }
        }

        @Override  // s.a$a
        public void cr(s.a a0) {
            for(Object object0: ReZ.this.PjT) {
                ((Zh)object0).cr(a0);
            }
        }
    }

    public interface Zh extends a {
        void PjT(int arg1, int arg2);
    }

    private final List PjT;
    private int ReZ;
    private int Zh;
    private final PjT cr;

    public ReZ() {
        this.PjT = DesugarCollections.synchronizedList(new ArrayList());
        this.Zh = 1;
        this.ReZ = 1;
        PjT reZ$PjT0 = new PjT(this, null);
        this.cr = reZ$PjT0;
        super.PjT(reZ$PjT0);
        this.PjT(500);
    }

    public int Owx() {
        return this.ReZ;
    }

    static int PjT(ReZ reZ0) {
        int v = reZ0.ReZ;
        reZ0.ReZ = v + 1;
        return v;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.h
    public void PjT(a a$a0) {
        if(a$a0 instanceof Zh) {
            if(this.PjT.contains(a$a0)) {
                return;
            }
            this.PjT.add(((Zh)a$a0));
            return;
        }
        super.PjT(a$a0);
    }

    public void ReZ(int v) {
        this.Zh = Math.max(1, v);
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.h
    public long ub() {
        return super.ub() + ((long)(this.ReZ - 1)) * super.xE();
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.h
    public long xE() {
        return super.xE() * ((long)this.Zh);
    }

    class com.bytedance.sdk.openadsdk.core.xf.cr.ReZ.1 {
    }

}

