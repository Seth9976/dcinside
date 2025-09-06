package com.bytedance.sdk.component.Zh.PjT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class xs {
    public static class PjT {
        String Au;
        Object JQp;
        com.bytedance.sdk.component.Zh.PjT.PjT PjT;
        XX ReZ;
        int XX;
        Map Zh;
        String cr;
        fDm cz;

        public PjT() {
            this.Zh = new HashMap();
        }

        PjT(xs xs0) {
            this.ReZ = xs0.Zh();
            this.cr = xs0.ReZ();
            this.Zh = xs0.cr();
            this.JQp = xs0.PjT();
            this.cz = xs0.Au();
            this.PjT = xs0.JQp();
            this.XX = xs0.XX();
            this.Au = xs0.cz();
        }

        private PjT PjT(String s, fDm fDm0) {
            this.cr = s;
            this.cz = fDm0;
            return this;
        }

        public PjT PjT() {
            return this.PjT("GET", null);
        }

        public PjT PjT(int v) {
            this.XX = v;
            return this;
        }

        public PjT PjT(com.bytedance.sdk.component.Zh.PjT.PjT pjT0) {
            this.PjT = pjT0;
            return this;
        }

        public PjT PjT(XX xX0) {
            this.ReZ = xX0;
            return this;
        }

        public PjT PjT(fDm fDm0) {
            return this.PjT("POST", fDm0);
        }

        public PjT PjT(Object object0) {
            this.JQp = object0;
            return this;
        }

        public PjT PjT(String s) {
            this.Au = s;
            return this;
        }

        public PjT PjT(String s, String s1) {
            return this.Zh(s, s1);
        }

        public PjT Zh(String s) {
            return this.PjT(XX.ReZ(s));
        }

        public PjT Zh(String s, String s1) {
            if(!this.Zh.containsKey(s)) {
                this.Zh.put(s, new ArrayList());
            }
            ((List)this.Zh.get(s)).add(s1);
            return this;
        }

        public xs Zh() {
            return new xs() {
                final PjT ReZ;

                @Override  // com.bytedance.sdk.component.Zh.PjT.xs
                public fDm Au() {
                    return PjT.this.cz;
                }

                @Override  // com.bytedance.sdk.component.Zh.PjT.xs
                public com.bytedance.sdk.component.Zh.PjT.PjT JQp() {
                    return PjT.this.PjT;
                }

                @Override  // com.bytedance.sdk.component.Zh.PjT.xs
                public Object PjT() {
                    return PjT.this.JQp;
                }

                @Override  // com.bytedance.sdk.component.Zh.PjT.xs
                public String ReZ() {
                    return PjT.this.cr;
                }

                @Override  // com.bytedance.sdk.component.Zh.PjT.xs
                public int XX() {
                    return PjT.this.XX;
                }

                @Override  // com.bytedance.sdk.component.Zh.PjT.xs
                public XX Zh() {
                    return PjT.this.ReZ;
                }

                @Override  // com.bytedance.sdk.component.Zh.PjT.xs
                public Map cr() {
                    return PjT.this.Zh;
                }

                @Override  // com.bytedance.sdk.component.Zh.PjT.xs
                public String cz() {
                    return PjT.this.Au;
                }

                @Override
                public String toString() {
                    return "";
                }
            };
        }
    }

    public qj PjT;
    public com.bytedance.sdk.component.ReZ.PjT.PjT Zh;

    public xs() {
        this.Zh = new com.bytedance.sdk.component.ReZ.PjT.PjT();
    }

    public fDm Au() {
        return null;
    }

    public abstract com.bytedance.sdk.component.Zh.PjT.PjT JQp();

    public abstract Object PjT();

    public void PjT(qj qj0) {
        this.PjT = qj0;
    }

    public abstract String ReZ();

    public PjT SM() {
        return new PjT(this);
    }

    public abstract int XX();

    public abstract XX Zh();

    public abstract Map cr();

    public abstract String cz();
}

