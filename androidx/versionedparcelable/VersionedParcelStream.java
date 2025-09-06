package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

@RestrictTo({Scope.a})
class VersionedParcelStream extends VersionedParcel {
    static class FieldBuffer {
        final ByteArrayOutputStream a;
        final DataOutputStream b;
        private final int c;
        private final DataOutputStream d;

        FieldBuffer(int v, DataOutputStream dataOutputStream0) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            this.a = byteArrayOutputStream0;
            this.b = new DataOutputStream(byteArrayOutputStream0);
            this.c = v;
            this.d = dataOutputStream0;
        }

        void a() throws IOException {
            this.b.flush();
            int v = this.a.size();
            this.d.writeInt(this.c << 16 | (v < 0xFFFF ? v : 0xFFFF));
            if(v >= 0xFFFF) {
                this.d.writeInt(v);
            }
            this.a.writeTo(this.d);
        }
    }

    private int A;
    int B;
    private static final Charset C = null;
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 2;
    private static final int G = 3;
    private static final int H = 4;
    private static final int I = 5;
    private static final int J = 6;
    private static final int K = 7;
    private static final int L = 8;
    private static final int M = 9;
    private static final int N = 10;
    private static final int O = 11;
    private static final int P = 12;
    private static final int Q = 13;
    private static final int R = 14;
    private final DataInputStream t;
    private final DataOutputStream u;
    private DataInputStream v;
    private DataOutputStream w;
    private FieldBuffer x;
    private boolean y;
    int z;

    static {
        VersionedParcelStream.C = Charset.forName("UTF-16");
    }

    public VersionedParcelStream(InputStream inputStream0, OutputStream outputStream0) {
        this(inputStream0, outputStream0, new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    private VersionedParcelStream(InputStream inputStream0, OutputStream outputStream0, ArrayMap arrayMap0, ArrayMap arrayMap1, ArrayMap arrayMap2) {
        super(arrayMap0, arrayMap1, arrayMap2);
        this.z = 0;
        this.A = -1;
        this.B = -1;
        DataOutputStream dataOutputStream0 = null;
        DataInputStream dataInputStream0 = inputStream0 == null ? null : new DataInputStream(new FilterInputStream(inputStream0) {
            final VersionedParcelStream a;

            @Override
            public int read() throws IOException {
                int v = VersionedParcelStream.this.B;
                if(v != -1 && VersionedParcelStream.this.z >= v) {
                    throw new IOException();
                }
                int v1 = super.read();
                ++VersionedParcelStream.this.z;
                return v1;
            }

            @Override
            public int read(byte[] arr_b, int v, int v1) throws IOException {
                int v2 = VersionedParcelStream.this.B;
                if(v2 != -1 && VersionedParcelStream.this.z >= v2) {
                    throw new IOException();
                }
                int v3 = super.read(arr_b, v, v1);
                if(v3 > 0) {
                    VersionedParcelStream.this.z += v3;
                }
                return v3;
            }

            @Override
            public long skip(long v) throws IOException {
                int v1 = VersionedParcelStream.this.B;
                if(v1 != -1 && VersionedParcelStream.this.z >= v1) {
                    throw new IOException();
                }
                long v2 = super.skip(v);
                if(v2 > 0L) {
                    VersionedParcelStream.this.z += (int)v2;
                }
                return v2;
            }
        });
        this.t = dataInputStream0;
        if(outputStream0 != null) {
            dataOutputStream0 = new DataOutputStream(outputStream0);
        }
        this.u = dataOutputStream0;
        this.v = dataInputStream0;
        this.w = dataOutputStream0;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void C0(double f) {
        try {
            this.w.writeDouble(f);
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public boolean F(int v) {
        try {
            while(true) {
                int v1 = this.A;
                if(v1 == v) {
                    return true;
                }
                if(String.valueOf(v1).compareTo(String.valueOf(v)) > 0) {
                    return false;
                }
                int v2 = this.z;
                int v3 = this.B;
                if(v2 < v3) {
                    this.t.skip(((long)(v3 - v2)));
                }
                this.B = -1;
                int v4 = this.t.readInt();
                this.z = 0;
                int v5 = (v4 & 0xFFFF) == 0xFFFF ? this.t.readInt() : v4 & 0xFFFF;
                this.A = v4 >> 16 & 0xFFFF;
                this.B = v5;
            }
        }
        catch(IOException unused_ex) {
            return false;
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public float G() {
        try {
            return this.v.readFloat();
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void H0(float f) {
        try {
            this.w.writeFloat(f);
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public int L() {
        try {
            return this.v.readInt();
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void L0(int v) {
        try {
            this.w.writeInt(v);
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public long Q() {
        try {
            return this.v.readLong();
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void Q0(long v) {
        try {
            this.w.writeLong(v);
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public Parcelable V() {
        return null;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void W0(Parcelable parcelable0) {
        if(!this.y) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void a() {
        FieldBuffer versionedParcelStream$FieldBuffer0 = this.x;
        if(versionedParcelStream$FieldBuffer0 != null) {
            try {
                if(versionedParcelStream$FieldBuffer0.a.size() != 0) {
                    this.x.a();
                }
                this.x = null;
            }
            catch(IOException iOException0) {
                throw new ParcelException(iOException0);
            }
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel c() {
        return new VersionedParcelStream(this.v, this.w, this.a, this.b, this.c);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public String c0() {
        try {
            int v = this.v.readInt();
            if(v > 0) {
                byte[] arr_b = new byte[v];
                this.v.readFully(arr_b);
                return new String(arr_b, VersionedParcelStream.C);
            }
            return null;
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public IBinder e0() {
        return null;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void e1(String s) {
        try {
            if(s != null) {
                byte[] arr_b = s.getBytes(VersionedParcelStream.C);
                this.w.writeInt(arr_b.length);
                this.w.write(arr_b);
                return;
            }
            this.w.writeInt(-1);
            return;
        }
        catch(IOException iOException0) {
        }
        throw new ParcelException(iOException0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void g1(IBinder iBinder0) {
        if(!this.y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public boolean i() {
        return true;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void i0(int v) {
        this.a();
        FieldBuffer versionedParcelStream$FieldBuffer0 = new FieldBuffer(v, this.u);
        this.x = versionedParcelStream$FieldBuffer0;
        this.w = versionedParcelStream$FieldBuffer0.b;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void i1(IInterface iInterface0) {
        if(!this.y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void j0(boolean z, boolean z1) {
        if(!z) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.y = z1;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public boolean l() {
        try {
            return this.v.readBoolean();
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void m0(boolean z) {
        try {
            this.w.writeBoolean(z);
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    private void o1(int v, String s, Bundle bundle0) {
        switch(v) {
            case 0: {
                bundle0.putParcelable(s, null);
                return;
            }
            case 1: {
                bundle0.putBundle(s, this.p());
                return;
            }
            case 2: {
                bundle0.putBundle(s, this.p());
                return;
            }
            case 3: {
                bundle0.putString(s, this.c0());
                return;
            }
            case 4: {
                bundle0.putStringArray(s, ((String[])this.j(new String[0])));
                return;
            }
            case 5: {
                bundle0.putBoolean(s, this.l());
                return;
            }
            case 6: {
                bundle0.putBooleanArray(s, this.n());
                return;
            }
            case 7: {
                bundle0.putDouble(s, this.y());
                return;
            }
            case 8: {
                bundle0.putDoubleArray(s, this.A());
                return;
            }
            case 9: {
                bundle0.putInt(s, this.L());
                return;
            }
            case 10: {
                bundle0.putIntArray(s, this.N());
                return;
            }
            case 11: {
                bundle0.putLong(s, this.Q());
                return;
            }
            case 12: {
                bundle0.putLongArray(s, this.S());
                return;
            }
            case 13: {
                bundle0.putFloat(s, this.G());
                return;
            }
            case 14: {
                bundle0.putFloatArray(s, this.I());
                return;
            }
            default: {
                throw new RuntimeException("Unknown type " + v);
            }
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public Bundle p() {
        int v = this.L();
        if(v < 0) {
            return null;
        }
        Bundle bundle0 = new Bundle();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = this.c0();
            this.o1(this.L(), s, bundle0);
        }
        return bundle0;
    }

    private void p1(Object object0) {
        if(object0 == null) {
            this.L0(0);
            return;
        }
        if(object0 instanceof Bundle) {
            this.L0(1);
            this.q0(((Bundle)object0));
            return;
        }
        if(object0 instanceof String) {
            this.L0(3);
            this.e1(((String)object0));
            return;
        }
        if(object0 instanceof String[]) {
            this.L0(4);
            this.k0(((String[])object0));
            return;
        }
        if(object0 instanceof Boolean) {
            this.L0(5);
            this.m0(((Boolean)object0).booleanValue());
            return;
        }
        if(object0 instanceof boolean[]) {
            this.L0(6);
            this.o0(((boolean[])object0));
            return;
        }
        if(object0 instanceof Double) {
            this.L0(7);
            this.C0(((double)(((Double)object0))));
            return;
        }
        if(object0 instanceof double[]) {
            this.L0(8);
            this.E0(((double[])object0));
            return;
        }
        if(object0 instanceof Integer) {
            this.L0(9);
            this.L0(((int)(((Integer)object0))));
            return;
        }
        if(object0 instanceof int[]) {
            this.L0(10);
            this.N0(((int[])object0));
            return;
        }
        if(object0 instanceof Long) {
            this.L0(11);
            this.Q0(((long)(((Long)object0))));
            return;
        }
        if(object0 instanceof long[]) {
            this.L0(12);
            this.S0(((long[])object0));
            return;
        }
        if(object0 instanceof Float) {
            this.L0(13);
            this.H0(((float)(((Float)object0))));
            return;
        }
        if(!(object0 instanceof float[])) {
            throw new IllegalArgumentException("Unsupported type " + object0.getClass());
        }
        this.L0(14);
        this.J0(((float[])object0));
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void q0(Bundle bundle0) {
        try {
            if(bundle0 == null) {
                this.w.writeInt(-1);
                return;
            }
            Set set0 = bundle0.keySet();
            this.w.writeInt(set0.size());
            Iterator iterator0 = set0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return;
                }
                Object object0 = iterator0.next();
                this.e1(((String)object0));
                this.p1(bundle0.get(((String)object0)));
            }
        }
        catch(IOException iOException0) {
        }
        throw new ParcelException(iOException0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public byte[] s() {
        try {
            int v = this.v.readInt();
            if(v > 0) {
                byte[] arr_b = new byte[v];
                this.v.readFully(arr_b);
                return arr_b;
            }
            return null;
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void t0(byte[] arr_b) {
        try {
            if(arr_b != null) {
                this.w.writeInt(arr_b.length);
                this.w.write(arr_b);
                return;
            }
            this.w.writeInt(-1);
            return;
        }
        catch(IOException iOException0) {
        }
        throw new ParcelException(iOException0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    protected CharSequence v() {
        return null;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void v0(byte[] arr_b, int v, int v1) {
        try {
            if(arr_b != null) {
                this.w.writeInt(v1);
                this.w.write(arr_b, v, v1);
                return;
            }
            this.w.writeInt(-1);
            return;
        }
        catch(IOException iOException0) {
        }
        throw new ParcelException(iOException0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public double y() {
        try {
            return this.v.readDouble();
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    protected void y0(CharSequence charSequence0) {
        if(!this.y) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }
}

