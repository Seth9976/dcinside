package com.bytedance.adsdk.Zh.PjT.Zh;

import java.util.ArrayList;
import java.util.List;

public abstract class PjT {
    static final class JQp implements ReZ {
        private final com.bytedance.adsdk.Zh.XX.PjT PjT;
        private float Zh;

        JQp(List list0) {
            this.Zh = -1.0f;
            this.PjT = (com.bytedance.adsdk.Zh.XX.PjT)list0.get(0);
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public boolean PjT() {
            return false;
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public boolean PjT(float f) {
            return !this.PjT.JQp();
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public float ReZ() {
            return this.PjT.ReZ();
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public com.bytedance.adsdk.Zh.XX.PjT Zh() {
            return this.PjT;
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public boolean Zh(float f) {
            if(this.Zh == f) {
                return true;
            }
            this.Zh = f;
            return false;
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public float cr() {
            return this.PjT.cr();
        }
    }

    public interface com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT {
        void PjT();
    }

    interface ReZ {
        boolean PjT();

        boolean PjT(float arg1);

        float ReZ();

        com.bytedance.adsdk.Zh.XX.PjT Zh();

        boolean Zh(float arg1);

        float cr();
    }

    static final class Zh implements ReZ {
        private Zh() {
        }

        Zh(com.bytedance.adsdk.Zh.PjT.Zh.PjT.1 pjT$10) {
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public boolean PjT() {
            return true;
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public boolean PjT(float f) {
            return false;
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public float ReZ() {
            return 0.0f;
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public com.bytedance.adsdk.Zh.XX.PjT Zh() {
            throw new IllegalStateException("not implemented");
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public boolean Zh(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public float cr() {
            return 1.0f;
        }
    }

    static final class cr implements ReZ {
        private final List PjT;
        private com.bytedance.adsdk.Zh.XX.PjT ReZ;
        private com.bytedance.adsdk.Zh.XX.PjT Zh;
        private float cr;

        cr(List list0) {
            this.ReZ = null;
            this.cr = -1.0f;
            this.PjT = list0;
            this.Zh = this.ReZ(0.0f);
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public boolean PjT() {
            return false;
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public boolean PjT(float f) {
            if(this.Zh.PjT(f)) {
                return !this.Zh.JQp();
            }
            this.Zh = this.ReZ(f);
            return true;
        }

        private com.bytedance.adsdk.Zh.XX.PjT ReZ(float f) {
            com.bytedance.adsdk.Zh.XX.PjT pjT0 = (com.bytedance.adsdk.Zh.XX.PjT)this.PjT.get(this.PjT.size() - 1);
            if(f >= pjT0.ReZ()) {
                return pjT0;
            }
            for(int v = this.PjT.size() - 2; v > 0; --v) {
                com.bytedance.adsdk.Zh.XX.PjT pjT1 = (com.bytedance.adsdk.Zh.XX.PjT)this.PjT.get(v);
                if(this.Zh != pjT1 && pjT1.PjT(f)) {
                    return pjT1;
                }
            }
            return (com.bytedance.adsdk.Zh.XX.PjT)this.PjT.get(0);
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public float ReZ() {
            return ((com.bytedance.adsdk.Zh.XX.PjT)this.PjT.get(0)).ReZ();
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public com.bytedance.adsdk.Zh.XX.PjT Zh() {
            return this.Zh;
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public boolean Zh(float f) {
            com.bytedance.adsdk.Zh.XX.PjT pjT0 = this.Zh;
            if(this.ReZ == pjT0 && this.cr == f) {
                return true;
            }
            this.ReZ = pjT0;
            this.cr = f;
            return false;
        }

        @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$ReZ
        public float cr() {
            return ((com.bytedance.adsdk.Zh.XX.PjT)this.PjT.get(this.PjT.size() - 1)).cr();
        }
    }

    private float Au;
    private final ReZ JQp;
    final List PjT;
    protected com.bytedance.adsdk.Zh.XX.Zh ReZ;
    private float XX;
    protected float Zh;
    private boolean cr;
    private Object cz;

    PjT(List list0) {
        this.PjT = new ArrayList(1);
        this.cr = false;
        this.Zh = 0.0f;
        this.cz = null;
        this.XX = -1.0f;
        this.Au = -1.0f;
        this.JQp = PjT.PjT(list0);
    }

    public float Au() {
        return this.Zh;
    }

    protected float JQp() {
        com.bytedance.adsdk.Zh.XX.PjT pjT0 = this.ReZ();
        if(pjT0 != null && !pjT0.JQp()) {
            float f = this.cr();
            return pjT0.ReZ.getInterpolation(f);
        }
        return 0.0f;
    }

    private static ReZ PjT(List list0) {
        if(list0.isEmpty()) {
            return new Zh(null);
        }
        return list0.size() == 1 ? new JQp(list0) : new cr(list0);
    }

    abstract Object PjT(com.bytedance.adsdk.Zh.XX.PjT arg1, float arg2);

    protected Object PjT(com.bytedance.adsdk.Zh.XX.PjT pjT0, float f, float f1, float f2) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void PjT() {
        this.cr = true;
    }

    public void PjT(float f) {
        if(this.JQp.PjT()) {
            return;
        }
        if(f < this.SM()) {
            f = this.SM();
        }
        else if(f > this.cz()) {
            f = this.cz();
        }
        if(f == this.Zh) {
            return;
        }
        this.Zh = f;
        if(this.JQp.PjT(f)) {
            this.Zh();
        }
    }

    public void PjT(com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT pjT$PjT0) {
        this.PjT.add(pjT$PjT0);
    }

    protected com.bytedance.adsdk.Zh.XX.PjT ReZ() {
        com.bytedance.adsdk.Zh.JQp.PjT("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.Zh.XX.PjT pjT0 = this.JQp.Zh();
        com.bytedance.adsdk.Zh.JQp.Zh("BaseKeyframeAnimation#getCurrentKeyframe");
        return pjT0;
    }

    private float SM() {
        if(this.XX == -1.0f) {
            this.XX = this.JQp.ReZ();
        }
        return this.XX;
    }

    public Object XX() {
        float f = this.cr();
        if(this.ReZ == null && this.JQp.Zh(f)) {
            return this.cz;
        }
        com.bytedance.adsdk.Zh.XX.PjT pjT0 = this.ReZ();
        Object object0 = pjT0.cr == null || pjT0.JQp == null ? this.PjT(pjT0, this.JQp()) : this.PjT(pjT0, f, pjT0.cr.getInterpolation(f), pjT0.JQp.getInterpolation(f));
        this.cz = object0;
        return object0;
    }

    public void Zh() {
        for(int v = 0; v < this.PjT.size(); ++v) {
            ((com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT)this.PjT.get(v)).PjT();
        }
    }

    float cr() {
        if(this.cr) {
            return 0.0f;
        }
        com.bytedance.adsdk.Zh.XX.PjT pjT0 = this.ReZ();
        return pjT0.JQp() ? 0.0f : (this.Zh - pjT0.ReZ()) / (pjT0.cr() - pjT0.ReZ());
    }

    float cz() {
        if(this.Au == -1.0f) {
            this.Au = this.JQp.cr();
        }
        return this.Au;
    }

    class com.bytedance.adsdk.Zh.PjT.Zh.PjT.1 {
    }

}

