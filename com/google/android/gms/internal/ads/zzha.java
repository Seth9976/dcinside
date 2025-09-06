package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public final class zzha extends zzfr {
    private final byte[] zza;
    private final DatagramPacket zzb;
    @Nullable
    private Uri zzc;
    @Nullable
    private DatagramSocket zzd;
    @Nullable
    private MulticastSocket zze;
    @Nullable
    private InetAddress zzf;
    private boolean zzg;
    private int zzh;

    public zzha() {
        throw null;
    }

    public zzha(int v) {
        super(true);
        byte[] arr_b = new byte[2000];
        this.zza = arr_b;
        this.zzb = new DatagramPacket(arr_b, 0, 2000);
    }

    @Override  // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] arr_b, int v, int v1) throws zzgz {
        if(v1 == 0) {
            return 0;
        }
        if(this.zzh == 0) {
            try {
                DatagramSocket datagramSocket0 = this.zzd;
                if(datagramSocket0 == null) {
                    throw null;
                }
                datagramSocket0.receive(this.zzb);
            }
            catch(SocketTimeoutException socketTimeoutException0) {
                throw new zzgz(socketTimeoutException0, 2002);
            }
            catch(IOException iOException0) {
                throw new zzgz(iOException0, 2001);
            }
            int v2 = this.zzb.getLength();
            this.zzh = v2;
            this.zzg(v2);
        }
        int v3 = this.zzb.getLength();
        int v4 = Math.min(this.zzh, v1);
        System.arraycopy(this.zza, v3 - this.zzh, arr_b, v, v4);
        this.zzh -= v4;
        return v4;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgd0) throws zzgz {
        this.zzc = zzgd0.zza;
        String s = zzgd0.zza.getHost();
        s.getClass();
        int v = this.zzc.getPort();
        this.zzi(zzgd0);
        try {
            this.zzf = InetAddress.getByName(s);
            InetSocketAddress inetSocketAddress0 = new InetSocketAddress(this.zzf, v);
            if(this.zzf.isMulticastAddress()) {
                MulticastSocket multicastSocket0 = new MulticastSocket(inetSocketAddress0);
                this.zze = multicastSocket0;
                multicastSocket0.joinGroup(this.zzf);
                this.zzd = this.zze;
            }
            else {
                this.zzd = new DatagramSocket(inetSocketAddress0);
            }
            this.zzd.setSoTimeout(8000);
            goto label_21;
        }
        catch(SecurityException securityException0) {
        }
        catch(IOException iOException0) {
            throw new zzgz(iOException0, 2001);
        }
        throw new zzgz(securityException0, 2006);
    label_21:
        this.zzg = true;
        this.zzj(zzgd0);
        return -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzd() {
        this.zzc = null;
        MulticastSocket multicastSocket0 = this.zze;
        if(multicastSocket0 != null) {
            try {
                InetAddress inetAddress0 = this.zzf;
                if(inetAddress0 == null) {
                    throw null;
                }
                multicastSocket0.leaveGroup(inetAddress0);
            }
            catch(IOException unused_ex) {
            }
            this.zze = null;
        }
        DatagramSocket datagramSocket0 = this.zzd;
        if(datagramSocket0 != null) {
            datagramSocket0.close();
            this.zzd = null;
        }
        this.zzf = null;
        this.zzh = 0;
        if(this.zzg) {
            this.zzg = false;
            this.zzh();
        }
    }
}

