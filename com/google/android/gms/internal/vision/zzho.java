package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

final class zzho extends zzhm {
    private final boolean zza;
    private final byte[] zzb;
    private int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public zzho(ByteBuffer byteBuffer0, boolean z) {
        super(null);
        this.zza = true;
        this.zzb = byteBuffer0.array();
        int v = byteBuffer0.arrayOffset() + byteBuffer0.position();
        this.zzc = v;
        this.zzd = v;
        this.zze = byteBuffer0.arrayOffset() + byteBuffer0.limit();
    }

    private final Object zza(zzml zzml0, Class class0, zzio zzio0) throws IOException {
        switch(zzml0) {
            case 1: {
                return Boolean.valueOf(this.zzk());
            }
            case 2: {
                return this.zzn();
            }
            case 3: {
                return this.zzd();
            }
            case 4: {
                return this.zzp();
            }
            case 5: {
                return this.zzj();
            }
            case 6: {
                return this.zzi();
            }
            case 7: {
                return this.zze();
            }
            case 8: {
                return this.zzh();
            }
            case 9: {
                return this.zzg();
            }
            case 10: {
                return this.zza(class0, zzio0);
            }
            case 11: {
                return this.zzq();
            }
            case 12: {
                return this.zzr();
            }
            case 13: {
                return this.zzs();
            }
            case 14: {
                return this.zzt();
            }
            case 15: {
                return this.zza(true);
            }
            case 16: {
                return this.zzo();
            }
            case 17: {
                return this.zzf();
            }
            default: {
                throw new RuntimeException("unsupported field type.");
            }
        }
    }

    private final String zza(boolean z) throws IOException {
        this.zzc(2);
        int v = this.zzv();
        if(v == 0) {
            return "";
        }
        this.zzb(v);
        if(z && !zzmd.zza(this.zzb, this.zzc, this.zzc + v)) {
            throw zzjk.zzh();
        }
        String s = new String(this.zzb, this.zzc, v, zzjf.zza);
        this.zzc += v;
        return s;
    }

    private final void zza(int v) throws IOException {
        this.zzb(v);
        this.zzc += v;
    }

    private final void zza(List list0, boolean z) throws IOException {
        int v1;
        int v;
        if((this.zzf & 7) != 2) {
            throw zzjk.zzf();
        }
        if(list0 instanceof zzjv && !z) {
            do {
                ((zzjv)list0).zza(this.zzn());
                if(this.zzu()) {
                    return;
                }
                v = this.zzc;
            }
            while(this.zzv() == this.zzf);
            this.zzc = v;
            return;
        }
        do {
            list0.add(this.zza(z));
            if(this.zzu()) {
                return;
            }
            v1 = this.zzc;
        }
        while(this.zzv() == this.zzf);
        this.zzc = v1;
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final int zza() throws IOException {
        if(this.zzu()) {
            return 0x7FFFFFFF;
        }
        int v = this.zzv();
        this.zzf = v;
        return v == this.zzg ? 0x7FFFFFFF : v >>> 3;
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final Object zza(zzlc zzlc0, zzio zzio0) throws IOException {
        this.zzc(2);
        return this.zzc(zzlc0, zzio0);
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final Object zza(Class class0, zzio zzio0) throws IOException {
        this.zzc(2);
        return this.zzc(zzky.zza().zza(class0), zzio0);
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zza(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzin) {
            switch(this.zzf & 7) {
                case 1: {
                    do {
                        ((zzin)list0).zza(this.zzd());
                        if(this.zzu()) {
                            return;
                        }
                        v = this.zzc;
                    }
                    while(this.zzv() == this.zzf);
                    this.zzc = v;
                    return;
                }
                case 2: {
                    int v1 = this.zzv();
                    this.zzd(v1);
                    int v2 = this.zzc + v1;
                    while(this.zzc < v2) {
                        ((zzin)list0).zza(Double.longBitsToDouble(this.zzac()));
                    }
                    return;
                }
                default: {
                    throw zzjk.zzf();
                }
            }
        }
        switch(this.zzf & 7) {
            case 1: {
                do {
                    list0.add(this.zzd());
                    if(this.zzu()) {
                        return;
                    }
                    v3 = this.zzc;
                }
                while(this.zzv() == this.zzf);
                this.zzc = v3;
                return;
            }
            case 2: {
                int v4 = this.zzv();
                this.zzd(v4);
                int v5 = this.zzc + v4;
                while(this.zzc < v5) {
                    list0.add(Double.longBitsToDouble(this.zzac()));
                }
                return;
            }
            default: {
                throw zzjk.zzf();
            }
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zza(List list0, zzlc zzlc0, zzio zzio0) throws IOException {
        int v1;
        int v = this.zzf;
        if((v & 7) != 2) {
            throw zzjk.zzf();
        }
        do {
            list0.add(this.zzc(zzlc0, zzio0));
            if(this.zzu()) {
                return;
            }
            v1 = this.zzc;
        }
        while(this.zzv() == v);
        this.zzc = v1;
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zza(Map map0, zzkf zzkf0, zzio zzio0) throws IOException {
        this.zzc(2);
        int v = this.zzv();
        this.zzb(v);
        int v1 = this.zze;
        this.zze = this.zzc + v;
        try {
            Object object0 = zzkf0.zzb;
            Object object1 = zzkf0.zzd;
        alab1:
            while(true) {
                while(true) {
                label_7:
                    int v2 = this.zza();
                    if(v2 == 0x7FFFFFFF) {
                        map0.put(object0, object1);
                        this.zze = v1;
                        return;
                    }
                    try {
                        switch(v2) {
                            case 1: {
                                object0 = this.zza(zzkf0.zza, null, null);
                                break alab1;
                            }
                            case 2: {
                                goto label_17;
                            }
                            default: {
                                if(this.zzc()) {
                                    break alab1;
                                }
                            }
                        }
                        throw new zzjk("Unable to parse map entry.");
                    label_17:
                        Class class0 = zzkf0.zzd.getClass();
                        object1 = this.zza(zzkf0.zzc, class0, zzio0);
                        break alab1;
                    }
                    catch(zzjn unused_ex) {
                    }
                    break;
                }
                if(!this.zzc()) {
                    throw new zzjk("Unable to parse map entry.");
                }
            }
        }
        catch(Throwable throwable0) {
            this.zze = v1;
            throw throwable0;
        }
        goto label_7;
    }

    private final long zzaa() throws IOException {
        this.zzb(8);
        return this.zzac();
    }

    private final int zzab() {
        int v = this.zzc;
        this.zzc = v + 4;
        return (this.zzb[v + 3] & 0xFF) << 24 | (this.zzb[v] & 0xFF | (this.zzb[v + 1] & 0xFF) << 8 | (this.zzb[v + 2] & 0xFF) << 16);
    }

    private final long zzac() {
        int v = this.zzc;
        this.zzc = v + 8;
        return (((long)this.zzb[v + 7]) & 0xFFL) << 56 | (((long)this.zzb[v]) & 0xFFL | (((long)this.zzb[v + 1]) & 0xFFL) << 8 | (((long)this.zzb[v + 2]) & 0xFFL) << 16 | (((long)this.zzb[v + 3]) & 0xFFL) << 24 | (((long)this.zzb[v + 4]) & 0xFFL) << 0x20 | (((long)this.zzb[v + 5]) & 0xFFL) << 40 | (((long)this.zzb[v + 6]) & 0xFFL) << 0x30);
    }

    private final void zzb(int v) throws IOException {
        if(v < 0 || v > this.zze - this.zzc) {
            throw zzjk.zza();
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final int zzb() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final Object zzb(zzlc zzlc0, zzio zzio0) throws IOException {
        this.zzc(3);
        return this.zzd(zzlc0, zzio0);
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final Object zzb(Class class0, zzio zzio0) throws IOException {
        this.zzc(3);
        return this.zzd(zzky.zza().zza(class0), zzio0);
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zzb(List list0) throws IOException {
        int v5;
        int v2;
        if(list0 instanceof zzja) {
            switch(this.zzf & 7) {
                case 2: {
                    int v = this.zzv();
                    this.zze(v);
                    int v1 = this.zzc + v;
                    while(this.zzc < v1) {
                        ((zzja)list0).zza(Float.intBitsToFloat(this.zzab()));
                    }
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw zzjk.zzf();
                }
            }
            do {
                ((zzja)list0).zza(this.zze());
                if(this.zzu()) {
                    return;
                }
                v2 = this.zzc;
            }
            while(this.zzv() == this.zzf);
            this.zzc = v2;
            return;
        }
        switch(this.zzf & 7) {
            case 2: {
                int v3 = this.zzv();
                this.zze(v3);
                int v4 = this.zzc + v3;
                while(this.zzc < v4) {
                    list0.add(Float.intBitsToFloat(this.zzab()));
                }
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw zzjk.zzf();
            }
        }
        do {
            list0.add(this.zze());
            if(this.zzu()) {
                return;
            }
            v5 = this.zzc;
        }
        while(this.zzv() == this.zzf);
        this.zzc = v5;
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zzb(List list0, zzlc zzlc0, zzio zzio0) throws IOException {
        int v1;
        int v = this.zzf;
        if((v & 7) != 3) {
            throw zzjk.zzf();
        }
        do {
            list0.add(this.zzd(zzlc0, zzio0));
            if(this.zzu()) {
                return;
            }
            v1 = this.zzc;
        }
        while(this.zzv() == v);
        this.zzc = v1;
    }

    private final Object zzc(zzlc zzlc0, zzio zzio0) throws IOException {
        int v = this.zzv();
        this.zzb(v);
        int v1 = this.zze;
        int v2 = this.zzc + v;
        this.zze = v2;
        try {
            Object object0 = zzlc0.zza();
            zzlc0.zza(object0, this, zzio0);
            zzlc0.zzc(object0);
            if(this.zzc == v2) {
                return object0;
            }
        }
        finally {
            this.zze = v1;
        }
        throw zzjk.zzg();
    }

    private final void zzc(int v) throws IOException {
        if((this.zzf & 7) != v) {
            throw zzjk.zzf();
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zzc(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzjy) {
            switch(this.zzf & 7) {
                case 0: {
                    do {
                        ((zzjy)list0).zza(this.zzf());
                        if(this.zzu()) {
                            return;
                        }
                        v = this.zzc;
                    }
                    while(this.zzv() == this.zzf);
                    this.zzc = v;
                    return;
                }
                case 2: {
                    int v1 = this.zzv();
                    int v2 = this.zzc + v1;
                    while(this.zzc < v2) {
                        ((zzjy)list0).zza(this.zzw());
                    }
                    this.zzf(v2);
                    return;
                }
                default: {
                    throw zzjk.zzf();
                }
            }
        }
        switch(this.zzf & 7) {
            case 0: {
                do {
                    list0.add(this.zzf());
                    if(this.zzu()) {
                        return;
                    }
                    v3 = this.zzc;
                }
                while(this.zzv() == this.zzf);
                this.zzc = v3;
                return;
            }
            case 2: {
                int v4 = this.zzv();
                int v5 = this.zzc + v4;
                while(this.zzc < v5) {
                    list0.add(this.zzw());
                }
                this.zzf(v5);
                return;
            }
            default: {
                throw zzjk.zzf();
            }
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final boolean zzc() throws IOException {
        int v = 0;
        if(!this.zzu()) {
            int v1 = this.zzf;
            int v2 = this.zzg;
            if(v1 != v2) {
                switch(v1 & 7) {
                    case 0: {
                        int v3 = this.zzc;
                        if(this.zze - v3 >= 10) {
                            byte[] arr_b = this.zzb;
                            int v4 = 0;
                            while(v4 < 10) {
                                if(arr_b[v3] >= 0) {
                                    this.zzc = v3 + 1;
                                    return true;
                                }
                                ++v4;
                                ++v3;
                            }
                        }
                        while(v < 10) {
                            if(this.zzy() < 0) {
                                ++v;
                                continue;
                            }
                            return true;
                        }
                        throw zzjk.zzc();
                    }
                    case 1: {
                        this.zza(8);
                        return true;
                    }
                    default: {
                        switch(v1 & 7) {
                            case 2: {
                                this.zza(this.zzv());
                                return true;
                            }
                            case 3: {
                                this.zzg = v1 >>> 3 << 3 | 4;
                                while(this.zza() != 0x7FFFFFFF && this.zzc()) {
                                }
                                if(this.zzf != this.zzg) {
                                    throw zzjk.zzg();
                                }
                                this.zzg = v2;
                                return true;
                            }
                            case 5: {
                                this.zza(4);
                                return true;
                            }
                            default: {
                                throw zzjk.zzf();
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final Object zzd(zzlc zzlc0, zzio zzio0) throws IOException {
        int v1;
        try {
            v1 = this.zzg;
            this.zzg = this.zzf >>> 3 << 3 | 4;
            Object object0 = zzlc0.zza();
            zzlc0.zza(object0, this, zzio0);
            zzlc0.zzc(object0);
            if(this.zzf == this.zzg) {
                return object0;
            }
        }
        finally {
            this.zzg = v1;
        }
        throw zzjk.zzg();
    }

    private final void zzd(int v) throws IOException {
        this.zzb(v);
        if((v & 7) != 0) {
            throw zzjk.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final double zzd() throws IOException {
        this.zzc(1);
        return Double.longBitsToDouble(this.zzaa());
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zzd(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzjy) {
            switch(this.zzf & 7) {
                case 0: {
                    do {
                        ((zzjy)list0).zza(this.zzg());
                        if(this.zzu()) {
                            return;
                        }
                        v = this.zzc;
                    }
                    while(this.zzv() == this.zzf);
                    this.zzc = v;
                    return;
                }
                case 2: {
                    int v1 = this.zzv();
                    int v2 = this.zzc + v1;
                    while(this.zzc < v2) {
                        ((zzjy)list0).zza(this.zzw());
                    }
                    this.zzf(v2);
                    return;
                }
                default: {
                    throw zzjk.zzf();
                }
            }
        }
        switch(this.zzf & 7) {
            case 0: {
                do {
                    list0.add(this.zzg());
                    if(this.zzu()) {
                        return;
                    }
                    v3 = this.zzc;
                }
                while(this.zzv() == this.zzf);
                this.zzc = v3;
                return;
            }
            case 2: {
                int v4 = this.zzv();
                int v5 = this.zzc + v4;
                while(this.zzc < v5) {
                    list0.add(this.zzw());
                }
                this.zzf(v5);
                return;
            }
            default: {
                throw zzjk.zzf();
            }
        }
    }

    private final void zze(int v) throws IOException {
        this.zzb(v);
        if((v & 3) != 0) {
            throw zzjk.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final float zze() throws IOException {
        this.zzc(5);
        return Float.intBitsToFloat(this.zzz());
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zze(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzjd) {
            switch(this.zzf & 7) {
                case 0: {
                    do {
                        ((zzjd)list0).zzc(this.zzh());
                        if(this.zzu()) {
                            return;
                        }
                        v = this.zzc;
                    }
                    while(this.zzv() == this.zzf);
                    this.zzc = v;
                    return;
                }
                case 2: {
                    int v1 = this.zzv();
                    int v2 = this.zzc + v1;
                    while(this.zzc < v2) {
                        ((zzjd)list0).zzc(this.zzv());
                    }
                    this.zzf(v2);
                    return;
                }
                default: {
                    throw zzjk.zzf();
                }
            }
        }
        switch(this.zzf & 7) {
            case 0: {
                do {
                    list0.add(this.zzh());
                    if(this.zzu()) {
                        return;
                    }
                    v3 = this.zzc;
                }
                while(this.zzv() == this.zzf);
                this.zzc = v3;
                return;
            }
            case 2: {
                int v4 = this.zzv();
                int v5 = this.zzc + v4;
                while(this.zzc < v5) {
                    list0.add(this.zzv());
                }
                this.zzf(v5);
                return;
            }
            default: {
                throw zzjk.zzf();
            }
        }
    }

    private final void zzf(int v) throws IOException {
        if(this.zzc != v) {
            throw zzjk.zza();
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final long zzf() throws IOException {
        this.zzc(0);
        return this.zzw();
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zzf(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzjy) {
            switch(this.zzf & 7) {
                case 1: {
                    do {
                        ((zzjy)list0).zza(this.zzi());
                        if(this.zzu()) {
                            return;
                        }
                        v = this.zzc;
                    }
                    while(this.zzv() == this.zzf);
                    this.zzc = v;
                    return;
                }
                case 2: {
                    int v1 = this.zzv();
                    this.zzd(v1);
                    int v2 = this.zzc + v1;
                    while(this.zzc < v2) {
                        ((zzjy)list0).zza(this.zzac());
                    }
                    return;
                }
                default: {
                    throw zzjk.zzf();
                }
            }
        }
        switch(this.zzf & 7) {
            case 1: {
                do {
                    list0.add(this.zzi());
                    if(this.zzu()) {
                        return;
                    }
                    v3 = this.zzc;
                }
                while(this.zzv() == this.zzf);
                this.zzc = v3;
                return;
            }
            case 2: {
                int v4 = this.zzv();
                this.zzd(v4);
                int v5 = this.zzc + v4;
                while(this.zzc < v5) {
                    list0.add(this.zzac());
                }
                return;
            }
            default: {
                throw zzjk.zzf();
            }
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final long zzg() throws IOException {
        this.zzc(0);
        return this.zzw();
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zzg(List list0) throws IOException {
        int v5;
        int v2;
        if(list0 instanceof zzjd) {
            switch(this.zzf & 7) {
                case 2: {
                    int v = this.zzv();
                    this.zze(v);
                    int v1 = this.zzc + v;
                    while(this.zzc < v1) {
                        ((zzjd)list0).zzc(this.zzab());
                    }
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw zzjk.zzf();
                }
            }
            do {
                ((zzjd)list0).zzc(this.zzj());
                if(this.zzu()) {
                    return;
                }
                v2 = this.zzc;
            }
            while(this.zzv() == this.zzf);
            this.zzc = v2;
            return;
        }
        switch(this.zzf & 7) {
            case 2: {
                int v3 = this.zzv();
                this.zze(v3);
                int v4 = this.zzc + v3;
                while(this.zzc < v4) {
                    list0.add(this.zzab());
                }
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw zzjk.zzf();
            }
        }
        do {
            list0.add(this.zzj());
            if(this.zzu()) {
                return;
            }
            v5 = this.zzc;
        }
        while(this.zzv() == this.zzf);
        this.zzc = v5;
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final int zzh() throws IOException {
        this.zzc(0);
        return this.zzv();
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zzh(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzhr) {
            switch(this.zzf & 7) {
                case 0: {
                    do {
                        ((zzhr)list0).zza(this.zzk());
                        if(this.zzu()) {
                            return;
                        }
                        v = this.zzc;
                    }
                    while(this.zzv() == this.zzf);
                    this.zzc = v;
                    return;
                }
                case 2: {
                    int v1 = this.zzv();
                    int v2 = this.zzc + v1;
                    while(this.zzc < v2) {
                        ((zzhr)list0).zza(this.zzv() != 0);
                    }
                    this.zzf(v2);
                    return;
                }
                default: {
                    throw zzjk.zzf();
                }
            }
        }
        switch(this.zzf & 7) {
            case 0: {
                do {
                    list0.add(Boolean.valueOf(this.zzk()));
                    if(this.zzu()) {
                        return;
                    }
                    v3 = this.zzc;
                }
                while(this.zzv() == this.zzf);
                this.zzc = v3;
                return;
            }
            case 2: {
                int v4 = this.zzv();
                int v5 = this.zzc + v4;
                while(this.zzc < v5) {
                    list0.add(Boolean.valueOf(this.zzv() != 0));
                }
                this.zzf(v5);
                return;
            }
            default: {
                throw zzjk.zzf();
            }
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final long zzi() throws IOException {
        this.zzc(1);
        return this.zzaa();
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zzi(List list0) throws IOException {
        this.zza(list0, false);
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final int zzj() throws IOException {
        this.zzc(5);
        return this.zzz();
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zzj(List list0) throws IOException {
        this.zza(list0, true);
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zzk(List list0) throws IOException {
        int v;
        if((this.zzf & 7) != 2) {
            throw zzjk.zzf();
        }
        do {
            list0.add(this.zzn());
            if(this.zzu()) {
                return;
            }
            v = this.zzc;
        }
        while(this.zzv() == this.zzf);
        this.zzc = v;
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final boolean zzk() throws IOException {
        this.zzc(0);
        return this.zzv() != 0;
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final String zzl() throws IOException {
        return this.zza(false);
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zzl(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzjd) {
            switch(this.zzf & 7) {
                case 0: {
                    do {
                        ((zzjd)list0).zzc(this.zzo());
                        if(this.zzu()) {
                            return;
                        }
                        v = this.zzc;
                    }
                    while(this.zzv() == this.zzf);
                    this.zzc = v;
                    return;
                }
                case 2: {
                    int v1 = this.zzv();
                    int v2 = this.zzc + v1;
                    while(this.zzc < v2) {
                        ((zzjd)list0).zzc(this.zzv());
                    }
                    return;
                }
                default: {
                    throw zzjk.zzf();
                }
            }
        }
        switch(this.zzf & 7) {
            case 0: {
                do {
                    list0.add(this.zzo());
                    if(this.zzu()) {
                        return;
                    }
                    v3 = this.zzc;
                }
                while(this.zzv() == this.zzf);
                this.zzc = v3;
                return;
            }
            case 2: {
                int v4 = this.zzv();
                int v5 = this.zzc + v4;
                while(this.zzc < v5) {
                    list0.add(this.zzv());
                }
                return;
            }
            default: {
                throw zzjk.zzf();
            }
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final String zzm() throws IOException {
        return this.zza(true);
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zzm(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzjd) {
            switch(this.zzf & 7) {
                case 0: {
                    do {
                        ((zzjd)list0).zzc(this.zzp());
                        if(this.zzu()) {
                            return;
                        }
                        v = this.zzc;
                    }
                    while(this.zzv() == this.zzf);
                    this.zzc = v;
                    return;
                }
                case 2: {
                    int v1 = this.zzv();
                    int v2 = this.zzc + v1;
                    while(this.zzc < v2) {
                        ((zzjd)list0).zzc(this.zzv());
                    }
                    return;
                }
                default: {
                    throw zzjk.zzf();
                }
            }
        }
        switch(this.zzf & 7) {
            case 0: {
                do {
                    list0.add(this.zzp());
                    if(this.zzu()) {
                        return;
                    }
                    v3 = this.zzc;
                }
                while(this.zzv() == this.zzf);
                this.zzc = v3;
                return;
            }
            case 2: {
                int v4 = this.zzv();
                int v5 = this.zzc + v4;
                while(this.zzc < v5) {
                    list0.add(this.zzv());
                }
                return;
            }
            default: {
                throw zzjk.zzf();
            }
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final zzht zzn() throws IOException {
        this.zzc(2);
        int v = this.zzv();
        if(v == 0) {
            return zzht.zza;
        }
        this.zzb(v);
        zzht zzht0 = this.zza ? zzht.zzb(this.zzb, this.zzc, v) : zzht.zza(this.zzb, this.zzc, v);
        this.zzc += v;
        return zzht0;
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zzn(List list0) throws IOException {
        int v5;
        int v2;
        if(list0 instanceof zzjd) {
            switch(this.zzf & 7) {
                case 2: {
                    int v = this.zzv();
                    this.zze(v);
                    int v1 = this.zzc + v;
                    while(this.zzc < v1) {
                        ((zzjd)list0).zzc(this.zzab());
                    }
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw zzjk.zzf();
                }
            }
            do {
                ((zzjd)list0).zzc(this.zzq());
                if(this.zzu()) {
                    return;
                }
                v2 = this.zzc;
            }
            while(this.zzv() == this.zzf);
            this.zzc = v2;
            return;
        }
        switch(this.zzf & 7) {
            case 2: {
                int v3 = this.zzv();
                this.zze(v3);
                int v4 = this.zzc + v3;
                while(this.zzc < v4) {
                    list0.add(this.zzab());
                }
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw zzjk.zzf();
            }
        }
        do {
            list0.add(this.zzq());
            if(this.zzu()) {
                return;
            }
            v5 = this.zzc;
        }
        while(this.zzv() == this.zzf);
        this.zzc = v5;
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final int zzo() throws IOException {
        this.zzc(0);
        return this.zzv();
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zzo(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzjy) {
            switch(this.zzf & 7) {
                case 1: {
                    do {
                        ((zzjy)list0).zza(this.zzr());
                        if(this.zzu()) {
                            return;
                        }
                        v = this.zzc;
                    }
                    while(this.zzv() == this.zzf);
                    this.zzc = v;
                    return;
                }
                case 2: {
                    int v1 = this.zzv();
                    this.zzd(v1);
                    int v2 = this.zzc + v1;
                    while(this.zzc < v2) {
                        ((zzjy)list0).zza(this.zzac());
                    }
                    return;
                }
                default: {
                    throw zzjk.zzf();
                }
            }
        }
        switch(this.zzf & 7) {
            case 1: {
                do {
                    list0.add(this.zzr());
                    if(this.zzu()) {
                        return;
                    }
                    v3 = this.zzc;
                }
                while(this.zzv() == this.zzf);
                this.zzc = v3;
                return;
            }
            case 2: {
                int v4 = this.zzv();
                this.zzd(v4);
                int v5 = this.zzc + v4;
                while(this.zzc < v5) {
                    list0.add(this.zzac());
                }
                return;
            }
            default: {
                throw zzjk.zzf();
            }
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final int zzp() throws IOException {
        this.zzc(0);
        return this.zzv();
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zzp(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzjd) {
            switch(this.zzf & 7) {
                case 0: {
                    do {
                        ((zzjd)list0).zzc(this.zzs());
                        if(this.zzu()) {
                            return;
                        }
                        v = this.zzc;
                    }
                    while(this.zzv() == this.zzf);
                    this.zzc = v;
                    return;
                }
                case 2: {
                    int v1 = this.zzv();
                    int v2 = this.zzc + v1;
                    while(this.zzc < v2) {
                        ((zzjd)list0).zzc(zzif.zze(this.zzv()));
                    }
                    return;
                }
                default: {
                    throw zzjk.zzf();
                }
            }
        }
        switch(this.zzf & 7) {
            case 0: {
                do {
                    list0.add(this.zzs());
                    if(this.zzu()) {
                        return;
                    }
                    v3 = this.zzc;
                }
                while(this.zzv() == this.zzf);
                this.zzc = v3;
                return;
            }
            case 2: {
                int v4 = this.zzv();
                int v5 = this.zzc + v4;
                while(this.zzc < v5) {
                    list0.add(zzif.zze(this.zzv()));
                }
                return;
            }
            default: {
                throw zzjk.zzf();
            }
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final int zzq() throws IOException {
        this.zzc(5);
        return this.zzz();
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final void zzq(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof zzjy) {
            switch(this.zzf & 7) {
                case 0: {
                    do {
                        ((zzjy)list0).zza(this.zzt());
                        if(this.zzu()) {
                            return;
                        }
                        v = this.zzc;
                    }
                    while(this.zzv() == this.zzf);
                    this.zzc = v;
                    return;
                }
                case 2: {
                    int v1 = this.zzv();
                    int v2 = this.zzc + v1;
                    while(this.zzc < v2) {
                        ((zzjy)list0).zza(zzif.zza(this.zzw()));
                    }
                    return;
                }
                default: {
                    throw zzjk.zzf();
                }
            }
        }
        switch(this.zzf & 7) {
            case 0: {
                do {
                    list0.add(this.zzt());
                    if(this.zzu()) {
                        return;
                    }
                    v3 = this.zzc;
                }
                while(this.zzv() == this.zzf);
                this.zzc = v3;
                return;
            }
            case 2: {
                int v4 = this.zzv();
                int v5 = this.zzc + v4;
                while(this.zzc < v5) {
                    list0.add(zzif.zza(this.zzw()));
                }
                return;
            }
            default: {
                throw zzjk.zzf();
            }
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final long zzr() throws IOException {
        this.zzc(1);
        return this.zzaa();
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final int zzs() throws IOException {
        this.zzc(0);
        return zzif.zze(this.zzv());
    }

    @Override  // com.google.android.gms.internal.vision.zzld
    public final long zzt() throws IOException {
        this.zzc(0);
        return zzif.zza(this.zzw());
    }

    private final boolean zzu() {
        return this.zzc == this.zze;
    }

    private final int zzv() throws IOException {
        int v5;
        int v = this.zzc;
        int v1 = this.zze;
        if(v1 == v) {
            throw zzjk.zza();
        }
        byte[] arr_b = this.zzb;
        int v2 = arr_b[v];
        if(v2 >= 0) {
            this.zzc = v + 1;
            return v2;
        }
        if(v1 - (v + 1) < 9) {
            return (int)this.zzx();
        }
        int v3 = v + 2;
        int v4 = arr_b[v + 1] << 7 ^ v2;
        if(v4 < 0) {
            v5 = v4 ^ 0xFFFFFF80;
        }
        else {
            int v6 = arr_b[v3] << 14 ^ v4;
            if(v6 >= 0) {
                v5 = v6 ^ 0x3F80;
                v3 = v + 3;
            }
            else {
                int v7 = v6 ^ arr_b[v + 3] << 21;
                if(v7 < 0) {
                    v5 = 0xFFE03F80 ^ v7;
                    v3 = v + 4;
                }
                else {
                    int v8 = arr_b[v + 4];
                    int v9 = v7 ^ v8 << 28 ^ 0xFE03F80;
                    if(v8 >= 0) {
                        v5 = v9;
                        v3 = v + 5;
                    }
                    else if(arr_b[v + 5] >= 0) {
                        v5 = v9;
                        v3 = v + 6;
                    }
                    else if(arr_b[v + 6] >= 0) {
                        v5 = v9;
                        v3 = v + 7;
                    }
                    else if(arr_b[v + 7] >= 0) {
                        v5 = v9;
                        v3 = v + 8;
                    }
                    else if(arr_b[v + 8] < 0) {
                        if(arr_b[v + 9] < 0) {
                            throw zzjk.zzc();
                        }
                        v3 = v + 10;
                        v5 = v9;
                    }
                    else {
                        v5 = v9;
                        v3 = v + 9;
                    }
                }
            }
        }
        this.zzc = v3;
        return v5;
    }

    private final long zzw() throws IOException {
        long v5;
        int v = this.zzc;
        int v1 = this.zze;
        if(v1 == v) {
            throw zzjk.zza();
        }
        byte[] arr_b = this.zzb;
        int v2 = arr_b[v];
        if(v2 >= 0) {
            this.zzc = v + 1;
            return (long)v2;
        }
        if(v1 - (v + 1) < 9) {
            return this.zzx();
        }
        int v3 = v + 2;
        int v4 = arr_b[v + 1] << 7 ^ v2;
        if(v4 < 0) {
            v5 = (long)(v4 ^ 0xFFFFFF80);
        }
        else {
            int v6 = arr_b[v3] << 14 ^ v4;
            if(v6 >= 0) {
                v5 = (long)(v6 ^ 0x3F80);
                v3 = v + 3;
            }
            else {
                int v7 = v6 ^ arr_b[v + 3] << 21;
                if(v7 < 0) {
                    v3 = v + 4;
                    v5 = (long)(0xFFE03F80 ^ v7);
                }
                else {
                    v3 = v + 5;
                    long v8 = ((long)v7) ^ ((long)arr_b[v + 4]) << 28;
                    if(v8 >= 0L) {
                        v5 = v8 ^ 0xFE03F80L;
                    }
                    else {
                        long v9 = v8 ^ ((long)arr_b[v3]) << 35;
                        if(v9 < 0L) {
                            v5 = v9 ^ 0xFFFFFFF80FE03F80L;
                            v3 = v + 6;
                        }
                        else {
                            v3 = v + 7;
                            v8 = v9 ^ ((long)arr_b[v + 6]) << 42;
                            if(v8 >= 0L) {
                                v5 = v8 ^ 0x3F80FE03F80L;
                            }
                            else {
                                v9 = v8 ^ ((long)arr_b[v3]) << 49;
                                if(v9 < 0L) {
                                    v5 = v9 ^ 0xFFFE03F80FE03F80L;
                                    v3 = v + 8;
                                }
                                else {
                                    v3 = v + 9;
                                    long v10 = v9 ^ ((long)arr_b[v + 8]) << 56 ^ 0xFE03F80FE03F80L;
                                    if(v10 < 0L) {
                                        if(((long)arr_b[v3]) < 0L) {
                                            throw zzjk.zzc();
                                        }
                                        v3 = v + 10;
                                    }
                                    v5 = v10;
                                }
                            }
                        }
                    }
                }
            }
        }
        this.zzc = v3;
        return v5;
    }

    private final long zzx() throws IOException {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            int v2 = this.zzy();
            v |= ((long)(v2 & 0x7F)) << v1;
            if((v2 & 0x80) == 0) {
                return v;
            }
        }
        throw zzjk.zzc();
    }

    private final byte zzy() throws IOException {
        int v = this.zzc;
        if(v == this.zze) {
            throw zzjk.zza();
        }
        this.zzc = v + 1;
        return this.zzb[v];
    }

    private final int zzz() throws IOException {
        this.zzb(4);
        return this.zzab();
    }
}

