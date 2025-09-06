package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzaqv implements zzaqw {
    final ThreadLocal zza;
    private static final Logger zzb;

    static {
        zzaqv.zzb = Logger.getLogger("com.google.android.gms.internal.ads.zzaqv");
    }

    public zzaqv() {
        this.zza = new zzaqu(this);
    }

    public abstract zzaqz zza(String arg1, byte[] arg2, String arg3);

    @Override  // com.google.android.gms.internal.ads.zzaqw
    public final zzaqz zzb(zzhed zzhed0, zzara zzara0) throws IOException {
        long v3;
        String s;
        long v = zzhed0.zzb();
        ((ByteBuffer)this.zza.get()).rewind().limit(8);
        int v1;
        while((v1 = zzhed0.zza(((ByteBuffer)this.zza.get()))) != 8) {
            if(v1 < 0) {
                zzhed0.zze(v);
                throw new EOFException();
            }
        }
        ((ByteBuffer)this.zza.get()).rewind();
        long v2 = zzaqy.zze(((ByteBuffer)this.zza.get()));
        byte[] arr_b = null;
        if(v2 < 8L && v2 > 1L) {
            zzaqv.zzb.logp(Level.SEVERE, "com.coremedia.iso.AbstractBoxParser", "parseBox", "Plausibility check failed: size < 8 (size = " + v2 + "). Stop parsing!");
            return null;
        }
        ByteBuffer byteBuffer0 = (ByteBuffer)this.zza.get();
        byte[] arr_b1 = new byte[4];
        byteBuffer0.get(arr_b1);
        try {
            s = new String(arr_b1, "ISO-8859-1");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }
        if(v2 == 1L) {
            ((ByteBuffer)this.zza.get()).limit(16);
            zzhed0.zza(((ByteBuffer)this.zza.get()));
            ((ByteBuffer)this.zza.get()).position(8);
            v3 = zzaqy.zzf(((ByteBuffer)this.zza.get())) - 16L;
        }
        else {
            v3 = v2 == 0L ? zzhed0.zzc() - zzhed0.zzb() : v2 - 8L;
        }
        if("uuid".equals(s)) {
            ((ByteBuffer)this.zza.get()).limit(((ByteBuffer)this.zza.get()).limit() + 16);
            zzhed0.zza(((ByteBuffer)this.zza.get()));
            arr_b = new byte[16];
            for(int v4 = ((ByteBuffer)this.zza.get()).position() - 16; v4 < ((ByteBuffer)this.zza.get()).position(); ++v4) {
                int v5 = ((ByteBuffer)this.zza.get()).position();
                arr_b[v4 - (v5 - 16)] = ((ByteBuffer)this.zza.get()).get(v4);
            }
            v3 += -16L;
        }
        zzaqz zzaqz0 = this.zza(s, arr_b, (zzara0 instanceof zzaqz ? ((zzaqz)zzara0).zza() : ""));
        ((ByteBuffer)this.zza.get()).rewind();
        zzaqz0.zzb(zzhed0, ((ByteBuffer)this.zza.get()), v3, this);
        return zzaqz0;
    }
}

