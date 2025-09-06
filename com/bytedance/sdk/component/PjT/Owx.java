package com.bytedance.sdk.component.PjT;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;

class Owx {
    private PjT JQp;
    private final Set PjT;
    private final Sks ReZ;
    private final Set Zh;
    private final RD cr;

    Owx(RD rD0, Set set0, Set set1) {
        this.ReZ = ub.PjT;
        this.cr = rD0;
        this.PjT = set0 == null || set0.isEmpty() ? new LinkedHashSet() : new LinkedHashSet(set0);
        if(set1 != null && !set1.isEmpty()) {
            this.Zh = new LinkedHashSet(set1);
            return;
        }
        this.Zh = new LinkedHashSet();
    }

    private tT PjT(String s, Zh zh0, boolean z) {
        if(z && this.cr != null) {
            throw null;
        }
        return null;
    }

    final tT PjT(String s, Zh zh0) throws com.bytedance.sdk.component.PjT.RD.PjT {
        synchronized(this) {
            return this.PjT(s, zh0, true);
        }
    }

    final tT PjT(boolean z, String s, Zh zh0) throws com.bytedance.sdk.component.PjT.RD.PjT {
        synchronized(this) {
            Uri uri0 = Uri.parse(s);
            String s1 = uri0.getHost();
            if(s1 == null) {
                return null;
            }
            String s2 = zh0.PjT();
            tT tT0 = this.Zh.contains(s2) ? tT.PjT : null;
            for(Object object0: this.PjT) {
                if(uri0.getHost().equals(((String)object0)) || s1.endsWith("." + ((String)object0))) {
                    tT0 = tT.ReZ;
                    break;
                }
                if(false) {
                    break;
                }
            }
            if(tT0 == null && (this.JQp != null && this.JQp.PjT(s))) {
                if(this.JQp.PjT(s, zh0.PjT())) {
                    return null;
                }
                tT0 = tT.ReZ;
            }
            tT tT1 = z ? this.PjT(s, zh0) : this.Zh(s, zh0);
            return tT1 != null ? tT1 : tT0;
        }
    }

    void PjT(com.bytedance.sdk.component.PjT.Sks.PjT sks$PjT0) {
        if(this.ReZ != null) {
            throw null;
        }
    }

    void PjT(PjT qj$PjT0) {
        this.JQp = qj$PjT0;
    }

    final tT Zh(String s, Zh zh0) {
        synchronized(this) {
            return this.PjT(s, zh0, false);
        }
    }

    void Zh(com.bytedance.sdk.component.PjT.Sks.PjT sks$PjT0) {
        if(this.ReZ != null) {
            throw null;
        }
    }
}

