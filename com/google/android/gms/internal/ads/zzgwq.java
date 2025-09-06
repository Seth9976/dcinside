package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

final class zzgwq implements zzgzp {
    private final zzgwp zza;
    private int zzb;
    private int zzc;
    private int zzd;

    private zzgwq(zzgwp zzgwp0) {
        this.zzd = 0;
        zzgye.zzc(zzgwp0, "input");
        this.zza = zzgwp0;
        zzgwp0.zzc = this;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzA(List list0) throws IOException {
        int v6;
        int v3;
        int v2;
        if(list0 instanceof zzgyr) {
            switch(this.zzb & 7) {
                case 1: {
                    break;
                }
                case 2: {
                    int v = this.zza.zzm();
                    zzgwq.zzT(v);
                    int v1 = this.zza.zzc();
                    do {
                        ((zzgyr)list0).zzg(this.zza.zzn());
                    }
                    while(this.zza.zzc() < v + v1);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                ((zzgyr)list0).zzg(this.zza.zzn());
                if(this.zza.zzA()) {
                    return;
                }
                v2 = this.zza.zzl();
            }
            while(v2 == this.zzb);
            v3 = v2;
        }
        else {
            switch(this.zzb & 7) {
                case 1: {
                    break;
                }
                case 2: {
                    int v4 = this.zza.zzm();
                    zzgwq.zzT(v4);
                    int v5 = this.zza.zzc();
                    do {
                        list0.add(this.zza.zzn());
                    }
                    while(this.zza.zzc() < v4 + v5);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                list0.add(this.zza.zzn());
                if(this.zza.zzA()) {
                    return;
                }
                v6 = this.zza.zzl();
            }
            while(v6 == this.zzb);
            v3 = v6;
        }
        this.zzd = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzB(List list0) throws IOException {
        int v6;
        int v3;
        int v2;
        if(list0 instanceof zzgxi) {
            switch(this.zzb & 7) {
                case 2: {
                    int v = this.zza.zzm();
                    zzgwq.zzS(v);
                    int v1 = this.zza.zzc();
                    do {
                        ((zzgxi)list0).zzh(this.zza.zzb());
                    }
                    while(this.zza.zzc() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                ((zzgxi)list0).zzh(this.zza.zzb());
                if(this.zza.zzA()) {
                    return;
                }
                v2 = this.zza.zzl();
            }
            while(v2 == this.zzb);
            v3 = v2;
        }
        else {
            switch(this.zzb & 7) {
                case 2: {
                    int v4 = this.zza.zzm();
                    zzgwq.zzS(v4);
                    int v5 = this.zza.zzc();
                    do {
                        list0.add(this.zza.zzb());
                    }
                    while(this.zza.zzc() < v5 + v4);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                list0.add(this.zza.zzb());
                if(this.zza.zzA()) {
                    return;
                }
                v6 = this.zza.zzl();
            }
            while(v6 == this.zzb);
            v3 = v6;
        }
        this.zzd = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    @Deprecated
    public final void zzC(List list0, zzgzv zzgzv0, zzgxb zzgxb0) throws IOException {
        int v = this.zzb;
        if((v & 7) != 3) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        while(true) {
            Object object0 = zzgzv0.zze();
            this.zzO(object0, zzgzv0, zzgxb0);
            zzgzv0.zzf(object0);
            list0.add(object0);
            if(this.zza.zzA() || this.zzd != 0) {
                break;
            }
            int v1 = this.zza.zzl();
            if(v1 != v) {
                this.zzd = v1;
                return;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzD(List list0) throws IOException {
        int v6;
        int v3;
        int v2;
        if(list0 instanceof zzgxs) {
            switch(this.zzb & 7) {
                case 0: {
                    break;
                }
                case 2: {
                    int v = this.zza.zzm();
                    int v1 = this.zza.zzc() + v;
                    do {
                        ((zzgxs)list0).zzi(this.zza.zzg());
                    }
                    while(this.zza.zzc() < v1);
                    this.zzQ(v1);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                ((zzgxs)list0).zzi(this.zza.zzg());
                if(this.zza.zzA()) {
                    return;
                }
                v2 = this.zza.zzl();
            }
            while(v2 == this.zzb);
            v3 = v2;
        }
        else {
            switch(this.zzb & 7) {
                case 0: {
                    break;
                }
                case 2: {
                    int v4 = this.zza.zzm();
                    int v5 = this.zza.zzc() + v4;
                    do {
                        list0.add(this.zza.zzg());
                    }
                    while(this.zza.zzc() < v5);
                    this.zzQ(v5);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                list0.add(this.zza.zzg());
                if(this.zza.zzA()) {
                    return;
                }
                v6 = this.zza.zzl();
            }
            while(v6 == this.zzb);
            v3 = v6;
        }
        this.zzd = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzE(List list0) throws IOException {
        int v6;
        int v3;
        int v2;
        if(list0 instanceof zzgyr) {
            switch(this.zzb & 7) {
                case 0: {
                    break;
                }
                case 2: {
                    int v = this.zza.zzm();
                    int v1 = this.zza.zzc() + v;
                    do {
                        ((zzgyr)list0).zzg(this.zza.zzo());
                    }
                    while(this.zza.zzc() < v1);
                    this.zzQ(v1);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                ((zzgyr)list0).zzg(this.zza.zzo());
                if(this.zza.zzA()) {
                    return;
                }
                v2 = this.zza.zzl();
            }
            while(v2 == this.zzb);
            v3 = v2;
        }
        else {
            switch(this.zzb & 7) {
                case 0: {
                    break;
                }
                case 2: {
                    int v4 = this.zza.zzm();
                    int v5 = this.zza.zzc() + v4;
                    do {
                        list0.add(this.zza.zzo());
                    }
                    while(this.zza.zzc() < v5);
                    this.zzQ(v5);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                list0.add(this.zza.zzo());
                if(this.zza.zzA()) {
                    return;
                }
                v6 = this.zza.zzl();
            }
            while(v6 == this.zzb);
            v3 = v6;
        }
        this.zzd = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzF(List list0, zzgzv zzgzv0, zzgxb zzgxb0) throws IOException {
        int v = this.zzb;
        if((v & 7) != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        while(true) {
            Object object0 = zzgzv0.zze();
            this.zzP(object0, zzgzv0, zzgxb0);
            zzgzv0.zzf(object0);
            list0.add(object0);
            if(this.zza.zzA() || this.zzd != 0) {
                break;
            }
            int v1 = this.zza.zzl();
            if(v1 != v) {
                this.zzd = v1;
                return;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzG(List list0) throws IOException {
        int v6;
        int v3;
        int v2;
        if(list0 instanceof zzgxs) {
            switch(this.zzb & 7) {
                case 2: {
                    int v = this.zza.zzm();
                    zzgwq.zzS(v);
                    int v1 = this.zza.zzc();
                    do {
                        ((zzgxs)list0).zzi(this.zza.zzj());
                    }
                    while(this.zza.zzc() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                ((zzgxs)list0).zzi(this.zza.zzj());
                if(this.zza.zzA()) {
                    return;
                }
                v2 = this.zza.zzl();
            }
            while(v2 == this.zzb);
            v3 = v2;
        }
        else {
            switch(this.zzb & 7) {
                case 2: {
                    int v4 = this.zza.zzm();
                    zzgwq.zzS(v4);
                    int v5 = this.zza.zzc();
                    do {
                        list0.add(this.zza.zzj());
                    }
                    while(this.zza.zzc() < v5 + v4);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                list0.add(this.zza.zzj());
                if(this.zza.zzA()) {
                    return;
                }
                v6 = this.zza.zzl();
            }
            while(v6 == this.zzb);
            v3 = v6;
        }
        this.zzd = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzH(List list0) throws IOException {
        int v6;
        int v3;
        int v2;
        if(list0 instanceof zzgyr) {
            switch(this.zzb & 7) {
                case 1: {
                    break;
                }
                case 2: {
                    int v = this.zza.zzm();
                    zzgwq.zzT(v);
                    int v1 = this.zza.zzc();
                    do {
                        ((zzgyr)list0).zzg(this.zza.zzs());
                    }
                    while(this.zza.zzc() < v + v1);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                ((zzgyr)list0).zzg(this.zza.zzs());
                if(this.zza.zzA()) {
                    return;
                }
                v2 = this.zza.zzl();
            }
            while(v2 == this.zzb);
            v3 = v2;
        }
        else {
            switch(this.zzb & 7) {
                case 1: {
                    break;
                }
                case 2: {
                    int v4 = this.zza.zzm();
                    zzgwq.zzT(v4);
                    int v5 = this.zza.zzc();
                    do {
                        list0.add(this.zza.zzs());
                    }
                    while(this.zza.zzc() < v4 + v5);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                list0.add(this.zza.zzs());
                if(this.zza.zzA()) {
                    return;
                }
                v6 = this.zza.zzl();
            }
            while(v6 == this.zzb);
            v3 = v6;
        }
        this.zzd = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzI(List list0) throws IOException {
        int v6;
        int v3;
        int v2;
        if(list0 instanceof zzgxs) {
            switch(this.zzb & 7) {
                case 0: {
                    break;
                }
                case 2: {
                    int v = this.zza.zzm();
                    int v1 = this.zza.zzc() + v;
                    do {
                        ((zzgxs)list0).zzi(this.zza.zzk());
                    }
                    while(this.zza.zzc() < v1);
                    this.zzQ(v1);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                ((zzgxs)list0).zzi(this.zza.zzk());
                if(this.zza.zzA()) {
                    return;
                }
                v2 = this.zza.zzl();
            }
            while(v2 == this.zzb);
            v3 = v2;
        }
        else {
            switch(this.zzb & 7) {
                case 0: {
                    break;
                }
                case 2: {
                    int v4 = this.zza.zzm();
                    int v5 = this.zza.zzc() + v4;
                    do {
                        list0.add(this.zza.zzk());
                    }
                    while(this.zza.zzc() < v5);
                    this.zzQ(v5);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                list0.add(this.zza.zzk());
                if(this.zza.zzA()) {
                    return;
                }
                v6 = this.zza.zzl();
            }
            while(v6 == this.zzb);
            v3 = v6;
        }
        this.zzd = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzJ(List list0) throws IOException {
        int v6;
        int v3;
        int v2;
        if(list0 instanceof zzgyr) {
            switch(this.zzb & 7) {
                case 0: {
                    break;
                }
                case 2: {
                    int v = this.zza.zzm();
                    int v1 = this.zza.zzc() + v;
                    do {
                        ((zzgyr)list0).zzg(this.zza.zzt());
                    }
                    while(this.zza.zzc() < v1);
                    this.zzQ(v1);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                ((zzgyr)list0).zzg(this.zza.zzt());
                if(this.zza.zzA()) {
                    return;
                }
                v2 = this.zza.zzl();
            }
            while(v2 == this.zzb);
            v3 = v2;
        }
        else {
            switch(this.zzb & 7) {
                case 0: {
                    break;
                }
                case 2: {
                    int v4 = this.zza.zzm();
                    int v5 = this.zza.zzc() + v4;
                    do {
                        list0.add(this.zza.zzt());
                    }
                    while(this.zza.zzc() < v5);
                    this.zzQ(v5);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                list0.add(this.zza.zzt());
                if(this.zza.zzA()) {
                    return;
                }
                v6 = this.zza.zzl();
            }
            while(v6 == this.zzb);
            v3 = v6;
        }
        this.zzd = v3;
    }

    public final void zzK(List list0, boolean z) throws IOException {
        int v1;
        int v;
        int v2;
        if((this.zzb & 7) != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        if(!(list0 instanceof zzgyo) || z) {
            do {
                list0.add((z ? this.zzs() : this.zzr()));
                if(this.zza.zzA()) {
                    return;
                }
                v2 = this.zza.zzl();
            }
            while(v2 == this.zzb);
            v1 = v2;
        }
        else {
            do {
                this.zzp();
                ((zzgyo)list0).zzb();
                if(this.zza.zzA()) {
                    return;
                }
                v = this.zza.zzl();
            }
            while(v == this.zzb);
            v1 = v;
        }
        this.zzd = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzL(List list0) throws IOException {
        int v6;
        int v3;
        int v2;
        if(list0 instanceof zzgxs) {
            switch(this.zzb & 7) {
                case 0: {
                    break;
                }
                case 2: {
                    int v = this.zza.zzm();
                    int v1 = this.zza.zzc() + v;
                    do {
                        ((zzgxs)list0).zzi(this.zza.zzm());
                    }
                    while(this.zza.zzc() < v1);
                    this.zzQ(v1);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                ((zzgxs)list0).zzi(this.zza.zzm());
                if(this.zza.zzA()) {
                    return;
                }
                v2 = this.zza.zzl();
            }
            while(v2 == this.zzb);
            v3 = v2;
        }
        else {
            switch(this.zzb & 7) {
                case 0: {
                    break;
                }
                case 2: {
                    int v4 = this.zza.zzm();
                    int v5 = this.zza.zzc() + v4;
                    do {
                        list0.add(this.zza.zzm());
                    }
                    while(this.zza.zzc() < v5);
                    this.zzQ(v5);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                list0.add(this.zza.zzm());
                if(this.zza.zzA()) {
                    return;
                }
                v6 = this.zza.zzl();
            }
            while(v6 == this.zzb);
            v3 = v6;
        }
        this.zzd = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzM(List list0) throws IOException {
        int v6;
        int v3;
        int v2;
        if(list0 instanceof zzgyr) {
            switch(this.zzb & 7) {
                case 0: {
                    break;
                }
                case 2: {
                    int v = this.zza.zzm();
                    int v1 = this.zza.zzc() + v;
                    do {
                        ((zzgyr)list0).zzg(this.zza.zzu());
                    }
                    while(this.zza.zzc() < v1);
                    this.zzQ(v1);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                ((zzgyr)list0).zzg(this.zza.zzu());
                if(this.zza.zzA()) {
                    return;
                }
                v2 = this.zza.zzl();
            }
            while(v2 == this.zzb);
            v3 = v2;
        }
        else {
            switch(this.zzb & 7) {
                case 0: {
                    break;
                }
                case 2: {
                    int v4 = this.zza.zzm();
                    int v5 = this.zza.zzc() + v4;
                    do {
                        list0.add(this.zza.zzu());
                    }
                    while(this.zza.zzc() < v5);
                    this.zzQ(v5);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                list0.add(this.zza.zzu());
                if(this.zza.zzA()) {
                    return;
                }
                v6 = this.zza.zzl();
            }
            while(v6 == this.zzb);
            v3 = v6;
        }
        this.zzd = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final boolean zzN() throws IOException {
        this.zzR(0);
        return this.zza.zzB();
    }

    private final void zzO(Object object0, zzgzv zzgzv0, zzgxb zzgxb0) throws IOException {
        int v1;
        try {
            v1 = this.zzc;
            this.zzc = this.zzb >>> 3 << 3 | 4;
            zzgzv0.zzh(object0, this, zzgxb0);
            if(this.zzb == this.zzc) {
                return;
            }
        }
        finally {
            this.zzc = v1;
        }
        throw new zzgyg("Failed to parse the message.");
    }

    private final void zzP(Object object0, zzgzv zzgzv0, zzgxb zzgxb0) throws IOException {
        zzgwp zzgwp0 = this.zza;
        int v = zzgwp0.zzm();
        if(zzgwp0.zza >= zzgwp0.zzb) {
            throw new zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int v1 = zzgwp0.zzd(v);
        ++this.zza.zza;
        zzgzv0.zzh(object0, this, zzgxb0);
        this.zza.zzy(0);
        --this.zza.zza;
        this.zza.zzz(v1);
    }

    private final void zzQ(int v) throws IOException {
        if(this.zza.zzc() != v) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzR(int v) throws IOException {
        if((this.zzb & 7) != v) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzS(int v) throws IOException {
        if((v & 3) != 0) {
            throw new zzgyg("Failed to parse the message.");
        }
    }

    private static final void zzT(int v) throws IOException {
        if((v & 7) != 0) {
            throw new zzgyg("Failed to parse the message.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final double zza() throws IOException {
        this.zzR(1);
        return this.zza.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final float zzb() throws IOException {
        this.zzR(5);
        return this.zza.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final int zzc() throws IOException {
        int v = this.zzd;
        if(v != 0) {
            this.zzb = v;
            this.zzd = 0;
            return v == 0 || v == this.zzc ? 0x7FFFFFFF : v >>> 3;
        }
        v = this.zza.zzl();
        this.zzb = v;
        return v == 0 || v == this.zzc ? 0x7FFFFFFF : v >>> 3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final int zzd() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final int zze() throws IOException {
        this.zzR(0);
        return this.zza.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final int zzf() throws IOException {
        this.zzR(5);
        return this.zza.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final int zzg() throws IOException {
        this.zzR(0);
        return this.zza.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final int zzh() throws IOException {
        this.zzR(5);
        return this.zza.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final int zzi() throws IOException {
        this.zzR(0);
        return this.zza.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final int zzj() throws IOException {
        this.zzR(0);
        return this.zza.zzm();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final long zzk() throws IOException {
        this.zzR(1);
        return this.zza.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final long zzl() throws IOException {
        this.zzR(0);
        return this.zza.zzo();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final long zzm() throws IOException {
        this.zzR(1);
        return this.zza.zzs();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final long zzn() throws IOException {
        this.zzR(0);
        return this.zza.zzt();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final long zzo() throws IOException {
        this.zzR(0);
        return this.zza.zzu();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final zzgwj zzp() throws IOException {
        this.zzR(2);
        return this.zza.zzv();
    }

    public static zzgwq zzq(zzgwp zzgwp0) {
        zzgwq zzgwq0 = zzgwp0.zzc;
        return zzgwq0 == null ? new zzgwq(zzgwp0) : zzgwq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final String zzr() throws IOException {
        this.zzR(2);
        return this.zza.zzw();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final String zzs() throws IOException {
        this.zzR(2);
        return this.zza.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzt(Object object0, zzgzv zzgzv0, zzgxb zzgxb0) throws IOException {
        this.zzR(3);
        this.zzO(object0, zzgzv0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzu(Object object0, zzgzv zzgzv0, zzgxb zzgxb0) throws IOException {
        this.zzR(2);
        this.zzP(object0, zzgzv0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzv(List list0) throws IOException {
        int v6;
        int v3;
        int v2;
        if(list0 instanceof zzgvz) {
            switch(this.zzb & 7) {
                case 0: {
                    break;
                }
                case 2: {
                    int v = this.zza.zzm();
                    int v1 = this.zza.zzc() + v;
                    do {
                        ((zzgvz)list0).zzg(this.zza.zzB());
                    }
                    while(this.zza.zzc() < v1);
                    this.zzQ(v1);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                ((zzgvz)list0).zzg(this.zza.zzB());
                if(this.zza.zzA()) {
                    return;
                }
                v2 = this.zza.zzl();
            }
            while(v2 == this.zzb);
            v3 = v2;
        }
        else {
            switch(this.zzb & 7) {
                case 0: {
                    break;
                }
                case 2: {
                    int v4 = this.zza.zzm();
                    int v5 = this.zza.zzc() + v4;
                    do {
                        list0.add(Boolean.valueOf(this.zza.zzB()));
                    }
                    while(this.zza.zzc() < v5);
                    this.zzQ(v5);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                list0.add(Boolean.valueOf(this.zza.zzB()));
                if(this.zza.zzA()) {
                    return;
                }
                v6 = this.zza.zzl();
            }
            while(v6 == this.zzb);
            v3 = v6;
        }
        this.zzd = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzw(List list0) throws IOException {
        int v;
        if((this.zzb & 7) != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            list0.add(this.zzp());
            if(this.zza.zzA()) {
                return;
            }
            v = this.zza.zzl();
        }
        while(v == this.zzb);
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzx(List list0) throws IOException {
        int v6;
        int v3;
        int v2;
        if(list0 instanceof zzgwy) {
            switch(this.zzb & 7) {
                case 1: {
                    break;
                }
                case 2: {
                    int v = this.zza.zzm();
                    zzgwq.zzT(v);
                    int v1 = this.zza.zzc();
                    do {
                        ((zzgwy)list0).zzh(this.zza.zza());
                    }
                    while(this.zza.zzc() < v + v1);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                ((zzgwy)list0).zzh(this.zza.zza());
                if(this.zza.zzA()) {
                    return;
                }
                v2 = this.zza.zzl();
            }
            while(v2 == this.zzb);
            v3 = v2;
        }
        else {
            switch(this.zzb & 7) {
                case 1: {
                    break;
                }
                case 2: {
                    int v4 = this.zza.zzm();
                    zzgwq.zzT(v4);
                    int v5 = this.zza.zzc();
                    do {
                        list0.add(this.zza.zza());
                    }
                    while(this.zza.zzc() < v4 + v5);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                list0.add(this.zza.zza());
                if(this.zza.zzA()) {
                    return;
                }
                v6 = this.zza.zzl();
            }
            while(v6 == this.zzb);
            v3 = v6;
        }
        this.zzd = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzy(List list0) throws IOException {
        int v6;
        int v3;
        int v2;
        if(list0 instanceof zzgxs) {
            switch(this.zzb & 7) {
                case 0: {
                    break;
                }
                case 2: {
                    int v = this.zza.zzm();
                    int v1 = this.zza.zzc() + v;
                    do {
                        ((zzgxs)list0).zzi(this.zza.zze());
                    }
                    while(this.zza.zzc() < v1);
                    this.zzQ(v1);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                ((zzgxs)list0).zzi(this.zza.zze());
                if(this.zza.zzA()) {
                    return;
                }
                v2 = this.zza.zzl();
            }
            while(v2 == this.zzb);
            v3 = v2;
        }
        else {
            switch(this.zzb & 7) {
                case 0: {
                    break;
                }
                case 2: {
                    int v4 = this.zza.zzm();
                    int v5 = this.zza.zzc() + v4;
                    do {
                        list0.add(this.zza.zze());
                    }
                    while(this.zza.zzc() < v5);
                    this.zzQ(v5);
                    return;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                list0.add(this.zza.zze());
                if(this.zza.zzA()) {
                    return;
                }
                v6 = this.zza.zzl();
            }
            while(v6 == this.zzb);
            v3 = v6;
        }
        this.zzd = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzp
    public final void zzz(List list0) throws IOException {
        int v6;
        int v3;
        int v2;
        if(list0 instanceof zzgxs) {
            switch(this.zzb & 7) {
                case 2: {
                    int v = this.zza.zzm();
                    zzgwq.zzS(v);
                    int v1 = this.zza.zzc();
                    do {
                        ((zzgxs)list0).zzi(this.zza.zzf());
                    }
                    while(this.zza.zzc() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                ((zzgxs)list0).zzi(this.zza.zzf());
                if(this.zza.zzA()) {
                    return;
                }
                v2 = this.zza.zzl();
            }
            while(v2 == this.zzb);
            v3 = v2;
        }
        else {
            switch(this.zzb & 7) {
                case 2: {
                    int v4 = this.zza.zzm();
                    zzgwq.zzS(v4);
                    int v5 = this.zza.zzc();
                    do {
                        list0.add(this.zza.zzf());
                    }
                    while(this.zza.zzc() < v5 + v4);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            }
            do {
                list0.add(this.zza.zzf());
                if(this.zza.zzA()) {
                    return;
                }
                v6 = this.zza.zzl();
            }
            while(v6 == this.zzb);
            v3 = v6;
        }
        this.zzd = v3;
    }
}

