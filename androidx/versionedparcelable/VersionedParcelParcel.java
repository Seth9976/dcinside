package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;

@RestrictTo({Scope.a})
class VersionedParcelParcel extends VersionedParcel {
    private int A;
    private static final boolean B = false;
    private static final String C = "VersionedParcelParcel";
    private final SparseIntArray t;
    private final Parcel u;
    private final int v;
    private final int w;
    private final String x;
    private int y;
    private int z;

    VersionedParcelParcel(Parcel parcel0) {
        this(parcel0, parcel0.dataPosition(), parcel0.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    private VersionedParcelParcel(Parcel parcel0, int v, int v1, String s, ArrayMap arrayMap0, ArrayMap arrayMap1, ArrayMap arrayMap2) {
        super(arrayMap0, arrayMap1, arrayMap2);
        this.t = new SparseIntArray();
        this.y = -1;
        this.A = -1;
        this.u = parcel0;
        this.v = v;
        this.w = v1;
        this.z = v;
        this.x = s;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void C0(double f) {
        this.u.writeDouble(f);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public boolean F(int v) {
        boolean z;
        while(this.z < this.w) {
            int v1 = this.A;
            if(v1 == v) {
                return true;
            }
            if(String.valueOf(v1).compareTo(String.valueOf(v)) > 0) {
                return false;
            }
            z = false;
            this.u.setDataPosition(this.z);
            int v2 = this.u.readInt();
            this.A = this.u.readInt();
            this.z += v2;
        }
        return this.A == v ? true : z;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public float G() {
        return this.u.readFloat();
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void H0(float f) {
        this.u.writeFloat(f);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public int L() {
        return this.u.readInt();
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void L0(int v) {
        this.u.writeInt(v);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public long Q() {
        return this.u.readLong();
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void Q0(long v) {
        this.u.writeLong(v);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public Parcelable V() {
        ClassLoader classLoader0 = this.getClass().getClassLoader();
        return this.u.readParcelable(classLoader0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void W0(Parcelable parcelable0) {
        this.u.writeParcelable(parcelable0, 0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int v = this.y;
        if(v >= 0) {
            int v1 = this.t.get(v);
            int v2 = this.u.dataPosition();
            this.u.setDataPosition(v1);
            this.u.writeInt(v2 - v1);
            this.u.setDataPosition(v2);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel c() {
        int v = this.u.dataPosition();
        return new VersionedParcelParcel(this.u, v, (this.z == this.v ? this.w : this.z), this.x + "  ", this.a, this.b, this.c);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public String c0() {
        return this.u.readString();
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public IBinder e0() {
        return this.u.readStrongBinder();
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void e1(String s) {
        this.u.writeString(s);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void g1(IBinder iBinder0) {
        this.u.writeStrongBinder(iBinder0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void i0(int v) {
        this.a();
        this.y = v;
        int v1 = this.u.dataPosition();
        this.t.put(v, v1);
        this.L0(0);
        this.L0(v);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void i1(IInterface iInterface0) {
        this.u.writeStrongInterface(iInterface0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public boolean l() {
        return this.u.readInt() != 0;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void m0(boolean z) {
        this.u.writeInt(((int)z));
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public Bundle p() {
        ClassLoader classLoader0 = this.getClass().getClassLoader();
        return this.u.readBundle(classLoader0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void q0(Bundle bundle0) {
        this.u.writeBundle(bundle0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public byte[] s() {
        int v = this.u.readInt();
        if(v < 0) {
            return null;
        }
        byte[] arr_b = new byte[v];
        this.u.readByteArray(arr_b);
        return arr_b;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void t0(byte[] arr_b) {
        if(arr_b != null) {
            this.u.writeInt(arr_b.length);
            this.u.writeByteArray(arr_b);
            return;
        }
        this.u.writeInt(-1);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    protected CharSequence v() {
        return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.u);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void v0(byte[] arr_b, int v, int v1) {
        if(arr_b != null) {
            this.u.writeInt(arr_b.length);
            this.u.writeByteArray(arr_b, v, v1);
            return;
        }
        this.u.writeInt(-1);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public double y() {
        return this.u.readDouble();
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    protected void y0(CharSequence charSequence0) {
        TextUtils.writeToParcel(charSequence0, this.u, 0);
    }
}

