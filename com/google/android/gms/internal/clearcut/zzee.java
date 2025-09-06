package com.google.android.gms.internal.clearcut;

final class zzee {
    private final String info;
    private int position;

    zzee(String s) {
        this.info = s;
        this.position = 0;
    }

    final boolean hasNext() {
        return this.position < this.info.length();
    }

    final int next() {
        int v5;
        int v = this.position;
        this.position = v + 1;
        int v1 = this.info.charAt(v);
        if(v1 < 0xD800) {
            return v1;
        }
        int v2 = v1 & 0x1FFF;
        int v3;
        for(v3 = 13; true; v3 += 13) {
            int v4 = this.position;
            this.position = v4 + 1;
            v5 = this.info.charAt(v4);
            if(v5 < 0xD800) {
                break;
            }
            v2 |= (v5 & 0x1FFF) << v3;
        }
        return v2 | v5 << v3;
    }
}

