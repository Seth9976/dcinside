package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.util.Arrays;

final class zzed {
    private final int flags;
    private final Object[] zzmj;
    private final int zzmk;
    private final int zzml;
    private final int zzmm;
    private final int[] zzms;
    private final zzee zznh;
    private Class zzni;
    private final int zznj;
    private final int zznk;
    private final int zznl;
    private final int zznm;
    private final int zznn;
    private final int zzno;
    private int zznp;
    private int zznq;
    private int zznr;
    private int zzns;
    private int zznt;
    private int zznu;
    private int zznv;
    private int zznw;
    private int zznx;
    private int zzny;
    private int zznz;
    private int zzoa;
    private int zzob;
    private int zzoc;
    private Field zzod;
    private Object zzoe;
    private Object zzof;
    private Object zzog;

    zzed(Class class0, String s, Object[] arr_object) {
        this.zznr = 0x7FFFFFFF;
        this.zzns = 0x80000000;
        this.zznt = 0;
        this.zznu = 0;
        this.zznv = 0;
        this.zznw = 0;
        this.zznx = 0;
        this.zzni = class0;
        zzee zzee0 = new zzee(s);
        this.zznh = zzee0;
        this.zzmj = arr_object;
        this.flags = zzee0.next();
        int v = zzee0.next();
        this.zznj = v;
        int[] arr_v = null;
        if(v == 0) {
            this.zznk = 0;
            this.zznl = 0;
            this.zzmk = 0;
            this.zzml = 0;
            this.zznm = 0;
            this.zznn = 0;
            this.zzmm = 0;
            this.zzno = 0;
            this.zzms = null;
            return;
        }
        int v1 = zzee0.next();
        this.zznk = v1;
        int v2 = zzee0.next();
        this.zznl = v2;
        this.zzmk = zzee0.next();
        this.zzml = zzee0.next();
        this.zznn = zzee0.next();
        this.zzmm = zzee0.next();
        this.zznm = zzee0.next();
        this.zzno = zzee0.next();
        int v3 = zzee0.next();
        if(v3 != 0) {
            arr_v = new int[v3];
        }
        this.zzms = arr_v;
        this.zznp = (v1 << 1) + v2;
    }

    final boolean next() {
        Class class0;
        int v3;
        if(!this.zznh.hasNext()) {
            return false;
        }
        this.zzny = this.zznh.next();
        int v = this.zznh.next();
        this.zznz = v;
        this.zzoa = v & 0xFF;
        int v1 = this.zzny;
        if(v1 < this.zznr) {
            this.zznr = v1;
        }
        if(v1 > this.zzns) {
            this.zzns = v1;
        }
        zzcb zzcb0 = zzcb.zziw;
        if((v & 0xFF) == zzcb0.id()) {
            ++this.zznt;
        }
        else if(this.zzoa >= zzcb.zzhq.id() && this.zzoa <= zzcb.zziv.id()) {
            ++this.zznu;
        }
        int v2 = this.zznx + 1;
        this.zznx = v2;
        if(zzeh.zzc(this.zznr, this.zzny, v2)) {
            this.zznw = this.zzny + 1;
            v3 = this.zzny + 1 - this.zznr;
        }
        else {
            v3 = this.zznv + 1;
        }
        this.zznv = v3;
        if((this.zznz & 0x400) != 0) {
            int v4 = this.zznq;
            this.zznq = v4 + 1;
            this.zzms[v4] = this.zzny;
        }
        this.zzoe = null;
        this.zzof = null;
        this.zzog = null;
        if(this.zzda()) {
            this.zzob = this.zznh.next();
            if(this.zzoa == zzcb.zzhh.id() + 51 || this.zzoa == zzcb.zzhp.id() + 51) {
                class0 = this.zzcw();
                this.zzoe = class0;
                return true;
            }
            if(this.zzoa != zzcb.zzhk.id() + 51 || !this.zzcz()) {
                return true;
            }
            this.zzof = this.zzcw();
            return true;
        }
        else {
            this.zzod = zzed.zza(this.zzni, ((String)this.zzcw()));
            if(this.zzde()) {
                this.zzoc = this.zznh.next();
            }
            if(this.zzoa == zzcb.zzhh.id() || this.zzoa == zzcb.zzhp.id()) {
                class0 = this.zzod.getType();
            }
            else {
                if(this.zzoa != zzcb.zzhz.id() && this.zzoa != zzcb.zziv.id()) {
                    if(this.zzoa == zzcb.zzhk.id() || this.zzoa == zzcb.zzic.id() || this.zzoa == zzcb.zziq.id()) {
                        if(this.zzcz()) {
                            this.zzof = this.zzcw();
                            return true;
                        }
                    }
                    else if(this.zzoa == zzcb0.id()) {
                        this.zzog = this.zzcw();
                        if((this.zznz & 0x800) != 0) {
                            this.zzof = this.zzcw();
                            return true;
                        }
                    }
                    return true;
                }
                class0 = this.zzcw();
            }
        }
        this.zzoe = class0;
        return true;
    }

    private static Field zza(Class class0, String s) {
        try {
            return class0.getDeclaredField(s);
        }
        catch(NoSuchFieldException unused_ex) {
            Field[] arr_field = class0.getDeclaredFields();
            for(int v = 0; v < arr_field.length; ++v) {
                Field field0 = arr_field[v];
                if(s.equals(field0.getName())) {
                    return field0;
                }
            }
            throw new RuntimeException("Field " + s + " for " + class0.getName() + " not found. Known fields are " + Arrays.toString(arr_field));
        }
    }

    private final Object zzcw() {
        int v = this.zznp;
        this.zznp = v + 1;
        return this.zzmj[v];
    }

    final int zzcx() {
        return this.zzny;
    }

    final int zzcy() {
        return this.zzoa;
    }

    private final boolean zzcz() {
        return (this.flags & 1) == 1;
    }

    final boolean zzda() {
        return this.zzoa > zzcb.zziw.id();
    }

    final Field zzdb() {
        int v = this.zzob << 1;
        Object object0 = this.zzmj[v];
        if(object0 instanceof Field) {
            return (Field)object0;
        }
        Field field0 = zzed.zza(this.zzni, ((String)object0));
        this.zzmj[v] = field0;
        return field0;
    }

    final Field zzdc() {
        int v = (this.zzob << 1) + 1;
        Object object0 = this.zzmj[v];
        if(object0 instanceof Field) {
            return (Field)object0;
        }
        Field field0 = zzed.zza(this.zzni, ((String)object0));
        this.zzmj[v] = field0;
        return field0;
    }

    final Field zzdd() {
        return this.zzod;
    }

    final boolean zzde() {
        return this.zzcz() && this.zzoa <= zzcb.zzhp.id();
    }

    final Field zzdf() {
        int v = (this.zznk << 1) + this.zzoc / 0x20;
        Object object0 = this.zzmj[v];
        if(object0 instanceof Field) {
            return (Field)object0;
        }
        Field field0 = zzed.zza(this.zzni, ((String)object0));
        this.zzmj[v] = field0;
        return field0;
    }

    final int zzdg() {
        return this.zzoc % 0x20;
    }

    final boolean zzdh() {
        return (this.zznz & 0x100) != 0;
    }

    final boolean zzdi() {
        return (this.zznz & 0x200) != 0;
    }

    final Object zzdj() {
        return this.zzoe;
    }

    final Object zzdk() {
        return this.zzof;
    }

    final Object zzdl() {
        return this.zzog;
    }
}

