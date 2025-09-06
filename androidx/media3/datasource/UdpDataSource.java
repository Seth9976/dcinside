package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

@UnstableApi
public final class UdpDataSource extends BaseDataSource {
    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable throwable0, int v) {
            super(throwable0, v);
        }
    }

    private final int f;
    private final byte[] g;
    private final DatagramPacket h;
    @Nullable
    private Uri i;
    @Nullable
    private DatagramSocket j;
    @Nullable
    private MulticastSocket k;
    @Nullable
    private InetAddress l;
    private boolean m;
    private int n;
    public static final int o = 2000;
    public static final int p = 8000;
    public static final int q = -1;

    public UdpDataSource() {
        this(2000);
    }

    public UdpDataSource(int v) {
        this(v, 8000);
    }

    public UdpDataSource(int v, int v1) {
        super(true);
        this.f = v1;
        byte[] arr_b = new byte[v];
        this.g = arr_b;
        this.h = new DatagramPacket(arr_b, 0, v);
    }

    @Override  // androidx.media3.datasource.DataSource
    public long a(DataSpec dataSpec0) throws UdpDataSourceException {
        this.i = dataSpec0.a;
        String s = (String)Assertions.g(dataSpec0.a.getHost());
        int v = this.i.getPort();
        this.w(dataSpec0);
        try {
            this.l = InetAddress.getByName(s);
            InetSocketAddress inetSocketAddress0 = new InetSocketAddress(this.l, v);
            if(this.l.isMulticastAddress()) {
                MulticastSocket multicastSocket0 = new MulticastSocket(inetSocketAddress0);
                this.k = multicastSocket0;
                multicastSocket0.joinGroup(this.l);
                this.j = this.k;
            }
            else {
                this.j = new DatagramSocket(inetSocketAddress0);
            }
            this.j.setSoTimeout(this.f);
            goto label_20;
        }
        catch(SecurityException securityException0) {
        }
        catch(IOException iOException0) {
            throw new UdpDataSourceException(iOException0, 2001);
        }
        throw new UdpDataSourceException(securityException0, 2006);
    label_20:
        this.m = true;
        this.x(dataSpec0);
        return -1L;
    }

    @Override  // androidx.media3.datasource.DataSource
    @Nullable
    public Uri c() {
        return this.i;
    }

    @Override  // androidx.media3.datasource.DataSource
    public void close() {
        this.i = null;
        MulticastSocket multicastSocket0 = this.k;
        if(multicastSocket0 != null) {
            try {
                multicastSocket0.leaveGroup(((InetAddress)Assertions.g(this.l)));
            }
            catch(IOException unused_ex) {
            }
            this.k = null;
        }
        DatagramSocket datagramSocket0 = this.j;
        if(datagramSocket0 != null) {
            datagramSocket0.close();
            this.j = null;
        }
        this.l = null;
        this.n = 0;
        if(this.m) {
            this.m = false;
            this.v();
        }
    }

    @Override  // androidx.media3.common.DataReader
    public int read(byte[] arr_b, int v, int v1) throws UdpDataSourceException {
        if(v1 == 0) {
            return 0;
        }
        if(this.n == 0) {
            try {
                ((DatagramSocket)Assertions.g(this.j)).receive(this.h);
            }
            catch(SocketTimeoutException socketTimeoutException0) {
                throw new UdpDataSourceException(socketTimeoutException0, 2002);
            }
            catch(IOException iOException0) {
                throw new UdpDataSourceException(iOException0, 2001);
            }
            int v2 = this.h.getLength();
            this.n = v2;
            this.u(v2);
        }
        int v3 = this.h.getLength();
        int v4 = Math.min(this.n, v1);
        System.arraycopy(this.g, v3 - this.n, arr_b, v, v4);
        this.n -= v4;
        return v4;
    }

    public int y() {
        return this.j == null ? -1 : this.j.getLocalPort();
    }
}

