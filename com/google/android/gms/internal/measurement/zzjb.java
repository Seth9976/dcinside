package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

final class zzjb implements zzlr {
    private final zziw zza;
    private int zzb;
    private int zzc;
    private int zzd;

    private zzjb(zziw zziw0) {
        this.zzd = 0;
        zziw zziw1 = (zziw)zzjv.zza(zziw0, "input");
        this.zza = zziw1;
        zziw1.zzc = this;
    }

    public static zzjb zza(zziw zziw0) {
        zzjb zzjb0 = zziw0.zzc;
        return zzjb0 == null ? new zzjb(zziw0) : zzjb0;
    }

    private final Object zza(zzlu zzlu0, zzjg zzjg0) throws IOException {
        Object object0 = zzlu0.zza();
        this.zzc(object0, zzlu0, zzjg0);
        zzlu0.zzd(object0);
        return object0;
    }

    private final Object zza(zzms zzms0, Class class0, zzjg zzjg0) throws IOException {
        switch(zzja.zza[zzms0.ordinal()]) {
            case 1: {
                return Boolean.valueOf(this.zzs());
            }
            case 2: {
                return this.zzp();
            }
            case 3: {
                return this.zza();
            }
            case 4: {
                return this.zze();
            }
            case 5: {
                return this.zzf();
            }
            case 6: {
                return this.zzk();
            }
            case 7: {
                return this.zzb();
            }
            case 8: {
                return this.zzg();
            }
            case 9: {
                return this.zzl();
            }
            case 10: {
                this.zzb(2);
                return this.zzb(zzlq.zza().zza(class0), zzjg0);
            }
            case 11: {
                return this.zzh();
            }
            case 12: {
                return this.zzm();
            }
            case 13: {
                return this.zzi();
            }
            case 14: {
                return this.zzn();
            }
            case 15: {
                return this.zzr();
            }
            case 16: {
                return this.zzj();
            }
            case 17: {
                return this.zzo();
            }
            default: {
                throw new IllegalArgumentException("unsupported field type.");
            }
        }
    }

    private final void zza(int v) throws IOException {
        if(this.zza.zzc() != v) {
            throw zzkb.zzi();
        }
    }

    private final void zza(List list0, boolean z) throws IOException {
        int v1;
        int v;
        if((this.zzb & 7) != 2) {
            throw zzkb.zza();
        }
        if(list0 instanceof zzkj && !z) {
            do {
                ((zzkj)list0).zza(this.zzp());
                if(this.zza.zzt()) {
                    return;
                }
                v = this.zza.zzi();
            }
            while(v == this.zzb);
            this.zzd = v;
            return;
        }
        do {
            list0.add((z ? this.zzr() : this.zzq()));
            if(this.zza.zzt()) {
                return;
            }
            v1 = this.zza.zzi();
        }
        while(v1 == this.zzb);
        this.zzd = v1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final double zza() throws IOException {
        this.zzb(1);
        return this.zza.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zza(Object object0, zzlu zzlu0, zzjg zzjg0) throws IOException {
        this.zzb(3);
        this.zzc(object0, zzlu0, zzjg0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zza(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzii) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzii)list0).zza(this.zza.zzu());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    int v2 = this.zza.zzc() + v1;
                    do {
                        ((zzii)list0).zza(this.zza.zzu());
                    }
                    while(this.zza.zzc() < v2);
                    this.zza(v2);
                    return;
                }
                default: {
                    throw zzkb.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(Boolean.valueOf(this.zza.zzu()));
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                int v5 = this.zza.zzc() + v4;
                do {
                    list0.add(Boolean.valueOf(this.zza.zzu()));
                }
                while(this.zza.zzc() < v5);
                this.zza(v5);
                return;
            }
            default: {
                throw zzkb.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    @Deprecated
    public final void zza(List list0, zzlu zzlu0, zzjg zzjg0) throws IOException {
        int v = this.zzb;
        if((v & 7) != 3) {
            throw zzkb.zza();
        }
        while(true) {
            list0.add(this.zza(zzlu0, zzjg0));
            if(this.zza.zzt() || this.zzd != 0) {
                break;
            }
            int v1 = this.zza.zzi();
            if(v1 != v) {
                this.zzd = v1;
                return;
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zza(Map map0, zzkt zzkt0, zzjg zzjg0) throws IOException {
        this.zzb(2);
        int v = this.zza.zzj();
        int v1 = this.zza.zzb(v);
        Object object0 = zzkt0.zzb;
        Object object1 = zzkt0.zzd;
        try {
        alab1:
            while(true) {
                while(true) {
                    int v3 = this.zzc();
                    if(v3 == 0x7FFFFFFF || this.zza.zzt()) {
                        break alab1;
                    }
                    try {
                        switch(v3) {
                            case 1: {
                                object0 = this.zza(zzkt0.zza, null, null);
                                continue;
                            }
                            case 2: {
                                goto label_14;
                            }
                            default: {
                                if(this.zzt()) {
                                    continue;
                                }
                            }
                        }
                        throw new zzkb("Unable to parse map entry.");
                    label_14:
                        Class class0 = zzkt0.zzd.getClass();
                        object1 = this.zza(zzkt0.zzc, class0, zzjg0);
                        continue;
                    }
                    catch(zzke unused_ex) {
                    }
                    break;
                }
                if(!this.zzt()) {
                    throw new zzkb("Unable to parse map entry.");
                }
            }
            map0.put(object0, object1);
        }
        finally {
            this.zza.zzd(v1);
        }
    }

    private final Object zzb(zzlu zzlu0, zzjg zzjg0) throws IOException {
        Object object0 = zzlu0.zza();
        this.zzd(object0, zzlu0, zzjg0);
        zzlu0.zzd(object0);
        return object0;
    }

    private final void zzb(int v) throws IOException {
        if((this.zzb & 7) != v) {
            throw zzkb.zza();
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final float zzb() throws IOException {
        this.zzb(5);
        return this.zza.zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzb(Object object0, zzlu zzlu0, zzjg zzjg0) throws IOException {
        this.zzb(2);
        this.zzd(object0, zzlu0, zzjg0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzb(List list0) throws IOException {
        int v;
        if((this.zzb & 7) != 2) {
            throw zzkb.zza();
        }
        do {
            list0.add(this.zzp());
            if(this.zza.zzt()) {
                return;
            }
            v = this.zza.zzi();
        }
        while(v == this.zzb);
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzb(List list0, zzlu zzlu0, zzjg zzjg0) throws IOException {
        int v = this.zzb;
        if((v & 7) != 2) {
            throw zzkb.zza();
        }
        while(true) {
            list0.add(this.zzb(zzlu0, zzjg0));
            if(this.zza.zzt() || this.zzd != 0) {
                break;
            }
            int v1 = this.zza.zzi();
            if(v1 != v) {
                this.zzd = v1;
                return;
            }
        }
    }

    private static void zzc(int v) throws IOException {
        if((v & 3) != 0) {
            throw zzkb.zzg();
        }
    }

    private final void zzc(Object object0, zzlu zzlu0, zzjg zzjg0) throws IOException {
        int v1;
        try {
            v1 = this.zzc;
            this.zzc = this.zzb >>> 3 << 3 | 4;
            zzlu0.zza(object0, this, zzjg0);
            if(this.zzb == this.zzc) {
                return;
            }
        }
        finally {
            this.zzc = v1;
        }
        throw zzkb.zzg();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final int zzc() throws IOException {
        int v = this.zzd;
        if(v != 0) {
            this.zzb = v;
            this.zzd = 0;
            return this.zzb == 0 || this.zzb == this.zzc ? 0x7FFFFFFF : this.zzb >>> 3;
        }
        this.zzb = this.zza.zzi();
        return this.zzb == 0 || this.zzb == this.zzc ? 0x7FFFFFFF : this.zzb >>> 3;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzc(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzje) {
            switch(this.zzb & 7) {
                case 1: {
                    do {
                        ((zzje)list0).zza(this.zza.zza());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    zzjb.zzd(v1);
                    int v2 = this.zza.zzc();
                    do {
                        ((zzje)list0).zza(this.zza.zza());
                    }
                    while(this.zza.zzc() < v2 + v1);
                    return;
                }
                default: {
                    throw zzkb.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 1: {
                do {
                    list0.add(this.zza.zza());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                zzjb.zzd(v4);
                int v5 = this.zza.zzc();
                do {
                    list0.add(this.zza.zza());
                }
                while(this.zza.zzc() < v5 + v4);
                return;
            }
            default: {
                throw zzkb.zza();
            }
        }
    }

    private static void zzd(int v) throws IOException {
        if((v & 7) != 0) {
            throw zzkb.zzg();
        }
    }

    private final void zzd(Object object0, zzlu zzlu0, zzjg zzjg0) throws IOException {
        int v = this.zza.zzj();
        zziw zziw0 = this.zza;
        if(zziw0.zza >= zziw0.zzb) {
            throw zzkb.zzh();
        }
        int v1 = zziw0.zzb(v);
        ++this.zza.zza;
        zzlu0.zza(object0, this, zzjg0);
        this.zza.zzc(0);
        --this.zza.zza;
        this.zza.zzd(v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final int zzd() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzd(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzjw) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzjw)list0).zzd(this.zza.zzd());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    int v2 = this.zza.zzc() + v1;
                    do {
                        ((zzjw)list0).zzd(this.zza.zzd());
                    }
                    while(this.zza.zzc() < v2);
                    this.zza(v2);
                    return;
                }
                default: {
                    throw zzkb.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzd());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                int v5 = this.zza.zzc() + v4;
                do {
                    list0.add(this.zza.zzd());
                }
                while(this.zza.zzc() < v5);
                this.zza(v5);
                return;
            }
            default: {
                throw zzkb.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final int zze() throws IOException {
        this.zzb(0);
        return this.zza.zzd();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zze(List list0) throws IOException {
        int v5;
        int v2;
        if(list0 instanceof zzjw) {
            switch(this.zzb & 7) {
                case 2: {
                    int v = this.zza.zzj();
                    zzjb.zzc(v);
                    int v1 = this.zza.zzc();
                    do {
                        ((zzjw)list0).zzd(this.zza.zze());
                    }
                    while(this.zza.zzc() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw zzkb.zza();
                }
            }
            do {
                ((zzjw)list0).zzd(this.zza.zze());
                if(this.zza.zzt()) {
                    return;
                }
                v2 = this.zza.zzi();
            }
            while(v2 == this.zzb);
            this.zzd = v2;
            return;
        }
        switch(this.zzb & 7) {
            case 2: {
                int v3 = this.zza.zzj();
                zzjb.zzc(v3);
                int v4 = this.zza.zzc();
                do {
                    list0.add(this.zza.zze());
                }
                while(this.zza.zzc() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw zzkb.zza();
            }
        }
        do {
            list0.add(this.zza.zze());
            if(this.zza.zzt()) {
                return;
            }
            v5 = this.zza.zzi();
        }
        while(v5 == this.zzb);
        this.zzd = v5;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final int zzf() throws IOException {
        this.zzb(5);
        return this.zza.zze();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzf(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzkn) {
            switch(this.zzb & 7) {
                case 1: {
                    do {
                        ((zzkn)list0).zza(this.zza.zzk());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    zzjb.zzd(v1);
                    int v2 = this.zza.zzc();
                    do {
                        ((zzkn)list0).zza(this.zza.zzk());
                    }
                    while(this.zza.zzc() < v2 + v1);
                    return;
                }
                default: {
                    throw zzkb.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 1: {
                do {
                    list0.add(this.zza.zzk());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                zzjb.zzd(v4);
                int v5 = this.zza.zzc();
                do {
                    list0.add(this.zza.zzk());
                }
                while(this.zza.zzc() < v5 + v4);
                return;
            }
            default: {
                throw zzkb.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final int zzg() throws IOException {
        this.zzb(0);
        return this.zza.zzf();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzg(List list0) throws IOException {
        int v5;
        int v2;
        if(list0 instanceof zzjs) {
            switch(this.zzb & 7) {
                case 2: {
                    int v = this.zza.zzj();
                    zzjb.zzc(v);
                    int v1 = this.zza.zzc();
                    do {
                        ((zzjs)list0).zza(this.zza.zzb());
                    }
                    while(this.zza.zzc() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw zzkb.zza();
                }
            }
            do {
                ((zzjs)list0).zza(this.zza.zzb());
                if(this.zza.zzt()) {
                    return;
                }
                v2 = this.zza.zzi();
            }
            while(v2 == this.zzb);
            this.zzd = v2;
            return;
        }
        switch(this.zzb & 7) {
            case 2: {
                int v3 = this.zza.zzj();
                zzjb.zzc(v3);
                int v4 = this.zza.zzc();
                do {
                    list0.add(this.zza.zzb());
                }
                while(this.zza.zzc() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw zzkb.zza();
            }
        }
        do {
            list0.add(this.zza.zzb());
            if(this.zza.zzt()) {
                return;
            }
            v5 = this.zza.zzi();
        }
        while(v5 == this.zzb);
        this.zzd = v5;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final int zzh() throws IOException {
        this.zzb(5);
        return this.zza.zzg();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzh(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzjw) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzjw)list0).zzd(this.zza.zzf());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    int v2 = this.zza.zzc() + v1;
                    do {
                        ((zzjw)list0).zzd(this.zza.zzf());
                    }
                    while(this.zza.zzc() < v2);
                    this.zza(v2);
                    return;
                }
                default: {
                    throw zzkb.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzf());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                int v5 = this.zza.zzc() + v4;
                do {
                    list0.add(this.zza.zzf());
                }
                while(this.zza.zzc() < v5);
                this.zza(v5);
                return;
            }
            default: {
                throw zzkb.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final int zzi() throws IOException {
        this.zzb(0);
        return this.zza.zzh();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzi(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzkn) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzkn)list0).zza(this.zza.zzl());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    int v2 = this.zza.zzc() + v1;
                    do {
                        ((zzkn)list0).zza(this.zza.zzl());
                    }
                    while(this.zza.zzc() < v2);
                    this.zza(v2);
                    return;
                }
                default: {
                    throw zzkb.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzl());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                int v5 = this.zza.zzc() + v4;
                do {
                    list0.add(this.zza.zzl());
                }
                while(this.zza.zzc() < v5);
                this.zza(v5);
                return;
            }
            default: {
                throw zzkb.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final int zzj() throws IOException {
        this.zzb(0);
        return this.zza.zzj();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzj(List list0) throws IOException {
        int v5;
        int v2;
        if(list0 instanceof zzjw) {
            switch(this.zzb & 7) {
                case 2: {
                    int v = this.zza.zzj();
                    zzjb.zzc(v);
                    int v1 = this.zza.zzc();
                    do {
                        ((zzjw)list0).zzd(this.zza.zzg());
                    }
                    while(this.zza.zzc() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw zzkb.zza();
                }
            }
            do {
                ((zzjw)list0).zzd(this.zza.zzg());
                if(this.zza.zzt()) {
                    return;
                }
                v2 = this.zza.zzi();
            }
            while(v2 == this.zzb);
            this.zzd = v2;
            return;
        }
        switch(this.zzb & 7) {
            case 2: {
                int v3 = this.zza.zzj();
                zzjb.zzc(v3);
                int v4 = this.zza.zzc();
                do {
                    list0.add(this.zza.zzg());
                }
                while(this.zza.zzc() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw zzkb.zza();
            }
        }
        do {
            list0.add(this.zza.zzg());
            if(this.zza.zzt()) {
                return;
            }
            v5 = this.zza.zzi();
        }
        while(v5 == this.zzb);
        this.zzd = v5;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final long zzk() throws IOException {
        this.zzb(1);
        return this.zza.zzk();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzk(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzkn) {
            switch(this.zzb & 7) {
                case 1: {
                    do {
                        ((zzkn)list0).zza(this.zza.zzn());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    zzjb.zzd(v1);
                    int v2 = this.zza.zzc();
                    do {
                        ((zzkn)list0).zza(this.zza.zzn());
                    }
                    while(this.zza.zzc() < v2 + v1);
                    return;
                }
                default: {
                    throw zzkb.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 1: {
                do {
                    list0.add(this.zza.zzn());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                zzjb.zzd(v4);
                int v5 = this.zza.zzc();
                do {
                    list0.add(this.zza.zzn());
                }
                while(this.zza.zzc() < v5 + v4);
                return;
            }
            default: {
                throw zzkb.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final long zzl() throws IOException {
        this.zzb(0);
        return this.zza.zzl();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzl(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzjw) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzjw)list0).zzd(this.zza.zzh());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    int v2 = this.zza.zzc() + v1;
                    do {
                        ((zzjw)list0).zzd(this.zza.zzh());
                    }
                    while(this.zza.zzc() < v2);
                    this.zza(v2);
                    return;
                }
                default: {
                    throw zzkb.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzh());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                int v5 = this.zza.zzc() + v4;
                do {
                    list0.add(this.zza.zzh());
                }
                while(this.zza.zzc() < v5);
                this.zza(v5);
                return;
            }
            default: {
                throw zzkb.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final long zzm() throws IOException {
        this.zzb(1);
        return this.zza.zzn();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzm(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzkn) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzkn)list0).zza(this.zza.zzo());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    int v2 = this.zza.zzc() + v1;
                    do {
                        ((zzkn)list0).zza(this.zza.zzo());
                    }
                    while(this.zza.zzc() < v2);
                    this.zza(v2);
                    return;
                }
                default: {
                    throw zzkb.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzo());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                int v5 = this.zza.zzc() + v4;
                do {
                    list0.add(this.zza.zzo());
                }
                while(this.zza.zzc() < v5);
                this.zza(v5);
                return;
            }
            default: {
                throw zzkb.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final long zzn() throws IOException {
        this.zzb(0);
        return this.zza.zzo();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzn(List list0) throws IOException {
        this.zza(list0, false);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final long zzo() throws IOException {
        this.zzb(0);
        return this.zza.zzp();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzo(List list0) throws IOException {
        this.zza(list0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final zzik zzp() throws IOException {
        this.zzb(2);
        return this.zza.zzq();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzp(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzjw) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzjw)list0).zzd(this.zza.zzj());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    int v2 = this.zza.zzc() + v1;
                    do {
                        ((zzjw)list0).zzd(this.zza.zzj());
                    }
                    while(this.zza.zzc() < v2);
                    this.zza(v2);
                    return;
                }
                default: {
                    throw zzkb.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzj());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                int v5 = this.zza.zzc() + v4;
                do {
                    list0.add(this.zza.zzj());
                }
                while(this.zza.zzc() < v5);
                this.zza(v5);
                return;
            }
            default: {
                throw zzkb.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final String zzq() throws IOException {
        this.zzb(2);
        return this.zza.zzr();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final void zzq(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzkn) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzkn)list0).zza(this.zza.zzp());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    int v2 = this.zza.zzc() + v1;
                    do {
                        ((zzkn)list0).zza(this.zza.zzp());
                    }
                    while(this.zza.zzc() < v2);
                    this.zza(v2);
                    return;
                }
                default: {
                    throw zzkb.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzp());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                int v5 = this.zza.zzc() + v4;
                do {
                    list0.add(this.zza.zzp());
                }
                while(this.zza.zzc() < v5);
                this.zza(v5);
                return;
            }
            default: {
                throw zzkb.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final String zzr() throws IOException {
        this.zzb(2);
        return this.zza.zzs();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final boolean zzs() throws IOException {
        this.zzb(0);
        return this.zza.zzu();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlr
    public final boolean zzt() throws IOException {
        if(!this.zza.zzt()) {
            return this.zzb == this.zzc ? false : this.zza.zze(this.zzb);
        }
        return false;
    }
}

