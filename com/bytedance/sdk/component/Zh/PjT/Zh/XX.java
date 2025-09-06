package com.bytedance.sdk.component.Zh.PjT.Zh;

import java.util.Arrays;

final class XX extends cr {
    final transient int[] Au;
    final transient byte[][] XX;

    XX(PjT pjT0, int v) {
        super(null);
        SM.PjT(pjT0.Zh, 0L, v);
        JQp jQp0 = pjT0.PjT;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(v2 < v) {
            int v4 = jQp0.ReZ;
            int v5 = jQp0.Zh;
            if(v4 == v5) {
                throw new AssertionError("s.limit == s.pos");
            }
            v2 += v4 - v5;
            ++v3;
            jQp0 = jQp0.cz;
        }
        this.XX = new byte[v3][];
        this.Au = new int[v3 * 2];
        JQp jQp1 = pjT0.PjT;
        int v6 = 0;
        while(v1 < v) {
            this.XX[v6] = jQp1.PjT;
            int v7 = jQp1.Zh;
            v1 += jQp1.ReZ - v7;
            v1 = v1 <= v ? v1 + (jQp1.ReZ - v7) : v;
            this.Au[v6] = v1;
            this.Au[this.XX.length + v6] = v7;
            jQp1.cr = true;
            ++v6;
            jQp1 = jQp1.cz;
        }
    }

    private cr JQp() {
        return new cr(this.cr());
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.Zh.cr
    public byte PjT(int v) {
        SM.PjT(this.Au[this.XX.length - 1], v, 1L);
        int v1 = this.Zh(v);
        return v1 == 0 ? this.XX[0][v + this.Au[this.XX.length]] : this.XX[v1][v - this.Au[v1 - 1] + this.Au[this.XX.length + v1]];
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.Zh.cr
    public cr PjT(int v, int v1) {
        return this.JQp().PjT(v, v1);
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.Zh.cr
    public String PjT() {
        return this.JQp().PjT();
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.Zh.cr
    public boolean PjT(int v, cr cr0, int v1, int v2) {
        if(v >= 0 && v <= this.ReZ() - v2) {
            for(int v3 = this.Zh(v); v2 > 0; ++v3) {
                int v4 = v3 == 0 ? 0 : this.Au[v3 - 1];
                int v5 = Math.min(v2, this.Au[v3] - v);
                if(!cr0.PjT(v1, this.XX[v3], v - v4 + this.Au[this.XX.length + v3], v5)) {
                    return false;
                }
                v += v5;
                v1 += v5;
                v2 -= v5;
            }
            return true;
        }
        return false;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.Zh.cr
    public boolean PjT(int v, byte[] arr_b, int v1, int v2) {
        if(v >= 0 && v <= this.ReZ() - v2 && v1 >= 0 && v1 <= arr_b.length - v2) {
            for(int v3 = this.Zh(v); v2 > 0; ++v3) {
                int v4 = v3 == 0 ? 0 : this.Au[v3 - 1];
                int v5 = Math.min(v2, this.Au[v3] - v);
                if(!SM.PjT(this.XX[v3], v - v4 + this.Au[this.XX.length + v3], arr_b, v1, v5)) {
                    return false;
                }
                v += v5;
                v1 += v5;
                v2 -= v5;
            }
            return true;
        }
        return false;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.Zh.cr
    public int ReZ() {
        return this.Au[this.XX.length - 1];
    }

    private int Zh(int v) {
        int v1 = Arrays.binarySearch(this.Au, 0, this.XX.length, v + 1);
        return v1 < 0 ? ~v1 : v1;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.Zh.cr
    public String Zh() {
        return this.JQp().Zh();
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.Zh.cr
    public byte[] cr() {
        byte[] arr_b = new byte[this.Au[this.XX.length - 1]];
        int v = 0;
        for(int v1 = 0; v < this.XX.length; v1 = v3) {
            int v2 = this.Au[this.XX.length + v];
            int v3 = this.Au[v];
            System.arraycopy(this.XX[v], v2, arr_b, v1, v3 - v1);
            ++v;
        }
        return arr_b;
    }

    // 去混淆评级： 低(30)
    @Override  // com.bytedance.sdk.component.Zh.PjT.Zh.cr
    public boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof cr && ((cr)object0).ReZ() == this.ReZ() && this.PjT(0, ((cr)object0), 0, this.ReZ());
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.Zh.cr
    public int hashCode() {
        int v = this.JQp;
        if(v != 0) {
            return v;
        }
        int v1 = 0;
        int v3 = 1;
        for(int v2 = 0; v1 < this.XX.length; v2 = v5) {
            byte[] arr_b = this.XX[v1];
            int v4 = this.Au[this.XX.length + v1];
            int v5 = this.Au[v1];
            int v6 = v5 - v2 + v4;
            while(v4 < v6) {
                v3 = v3 * 0x1F + arr_b[v4];
                ++v4;
            }
            ++v1;
        }
        this.JQp = v3;
        return v3;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.Zh.cr
    public String toString() {
        return this.JQp().toString();
    }
}

