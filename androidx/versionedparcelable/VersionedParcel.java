package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

@RestrictTo({Scope.c})
public abstract class VersionedParcel {
    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable throwable0) {
            super(throwable0);
        }
    }

    protected final ArrayMap a;
    protected final ArrayMap b;
    protected final ArrayMap c;
    private static final String d = "VersionedParcel";
    private static final int e = -1;
    private static final int f = -2;
    private static final int g = -3;
    private static final int h = -4;
    private static final int i = -5;
    private static final int j = -6;
    private static final int k = -7;
    private static final int l = -9;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 3;
    private static final int p = 4;
    private static final int q = 5;
    private static final int r = 7;
    private static final int s = 8;

    public VersionedParcel(ArrayMap arrayMap0, ArrayMap arrayMap1, ArrayMap arrayMap2) {
        this.a = arrayMap0;
        this.b = arrayMap1;
        this.c = arrayMap2;
    }

    protected double[] A() {
        int v = this.L();
        if(v < 0) {
            return null;
        }
        double[] arr_f = new double[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_f[v1] = this.y();
        }
        return arr_f;
    }

    private void A0(Collection collection0) {
        if(collection0 == null) {
            this.L0(-1);
            return;
        }
        int v = collection0.size();
        this.L0(v);
        if(v > 0) {
            Object object0 = collection0.iterator().next();
            int v1 = this.g(object0);
            this.L0(v1);
        alab1:
            switch(v1) {
                case 1: {
                    for(Object object1: collection0) {
                        this.l1(((VersionedParcelable)object1));
                    }
                    return;
                }
                case 2: {
                    for(Object object2: collection0) {
                        this.W0(((Parcelable)object2));
                    }
                    return;
                }
                case 3: {
                    for(Object object3: collection0) {
                        this.Y0(((Serializable)object3));
                    }
                    return;
                }
                case 4: {
                    for(Object object4: collection0) {
                        this.e1(((String)object4));
                    }
                    return;
                }
                case 5: {
                    for(Object object5: collection0) {
                        this.g1(((IBinder)object5));
                    }
                    return;
                }
                case 7: {
                    for(Object object6: collection0) {
                        this.L0(((int)(((Integer)object6))));
                    }
                    return;
                }
                case 8: {
                    Iterator iterator6 = collection0.iterator();
                    while(true) {
                        if(!iterator6.hasNext()) {
                            break alab1;
                        }
                        Object object7 = iterator6.next();
                        this.H0(((float)(((Float)object7))));
                    }
                }
            }
        }
    }

    public double[] B(double[] arr_f, int v) {
        return this.F(v) ? this.A() : arr_f;
    }

    private void B0(Collection collection0, int v) {
        this.i0(v);
        this.A0(collection0);
    }

    private Exception C(int v, String s) {
        return this.b(v, s);
    }

    protected abstract void C0(double arg1);

    public Exception D(Exception exception0, int v) {
        if(!this.F(v)) {
            return exception0;
        }
        int v1 = this.E();
        return v1 == 0 ? exception0 : this.C(v1, this.c0());
    }

    public void D0(double f, int v) {
        this.i0(v);
        this.C0(f);
    }

    private int E() {
        return this.L();
    }

    protected void E0(double[] arr_f) {
        if(arr_f != null) {
            this.L0(arr_f.length);
            for(int v = 0; v < arr_f.length; ++v) {
                this.C0(arr_f[v]);
            }
            return;
        }
        this.L0(-1);
    }

    protected abstract boolean F(int arg1);

    public void F0(double[] arr_f, int v) {
        this.i0(v);
        this.E0(arr_f);
    }

    protected abstract float G();

    public void G0(Exception exception0, int v) {
        int v1;
        this.i0(v);
        if(exception0 == null) {
            this.V0();
            return;
        }
        if(exception0 instanceof Parcelable && exception0.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            v1 = -9;
        }
        else if(exception0 instanceof SecurityException) {
            v1 = -1;
        }
        else if(exception0 instanceof BadParcelableException) {
            v1 = -2;
        }
        else if(exception0 instanceof IllegalArgumentException) {
            v1 = -3;
        }
        else if(exception0 instanceof NullPointerException) {
            v1 = -4;
        }
        else if(exception0 instanceof IllegalStateException) {
            v1 = -5;
        }
        else if(exception0 instanceof NetworkOnMainThreadException) {
            v1 = -6;
        }
        else {
            v1 = exception0 instanceof UnsupportedOperationException ? -7 : 0;
        }
        this.L0(v1);
        if(v1 == 0) {
            throw exception0 instanceof RuntimeException ? ((RuntimeException)exception0) : new RuntimeException(exception0);
        }
        this.e1(exception0.getMessage());
        if(v1 == -9) {
            this.W0(((Parcelable)exception0));
        }
    }

    public float H(float f, int v) {
        return this.F(v) ? this.G() : f;
    }

    protected abstract void H0(float arg1);

    protected float[] I() {
        int v = this.L();
        if(v < 0) {
            return null;
        }
        float[] arr_f = new float[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_f[v1] = this.G();
        }
        return arr_f;
    }

    public void I0(float f, int v) {
        this.i0(v);
        this.H0(f);
    }

    public float[] J(float[] arr_f, int v) {
        return this.F(v) ? this.I() : arr_f;
    }

    protected void J0(float[] arr_f) {
        if(arr_f != null) {
            this.L0(arr_f.length);
            for(int v = 0; v < arr_f.length; ++v) {
                this.H0(arr_f[v]);
            }
            return;
        }
        this.L0(-1);
    }

    protected VersionedParcelable K(String s, VersionedParcel versionedParcel0) {
        try {
            return (VersionedParcelable)this.e(s).invoke(null, versionedParcel0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw invocationTargetException0.getCause() instanceof RuntimeException ? ((RuntimeException)invocationTargetException0.getCause()) : new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException0);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException0);
        }
    }

    public void K0(float[] arr_f, int v) {
        this.i0(v);
        this.J0(arr_f);
    }

    protected abstract int L();

    protected abstract void L0(int arg1);

    public int M(int v, int v1) {
        return this.F(v1) ? this.L() : v;
    }

    public void M0(int v, int v1) {
        this.i0(v1);
        this.L0(v);
    }

    protected int[] N() {
        int v = this.L();
        if(v < 0) {
            return null;
        }
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = this.L();
        }
        return arr_v;
    }

    protected void N0(int[] arr_v) {
        if(arr_v != null) {
            this.L0(arr_v.length);
            for(int v = 0; v < arr_v.length; ++v) {
                this.L0(arr_v[v]);
            }
            return;
        }
        this.L0(-1);
    }

    public int[] O(int[] arr_v, int v) {
        return this.F(v) ? this.N() : arr_v;
    }

    public void O0(int[] arr_v, int v) {
        this.i0(v);
        this.N0(arr_v);
    }

    public List P(List list0, int v) {
        return this.F(v) ? ((List)this.x(new ArrayList())) : list0;
    }

    public void P0(List list0, int v) {
        this.B0(list0, v);
    }

    protected abstract long Q();

    protected abstract void Q0(long arg1);

    public long R(long v, int v1) {
        return this.F(v1) ? this.Q() : v;
    }

    public void R0(long v, int v1) {
        this.i0(v1);
        this.Q0(v);
    }

    protected long[] S() {
        int v = this.L();
        if(v < 0) {
            return null;
        }
        long[] arr_v = new long[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = this.Q();
        }
        return arr_v;
    }

    protected void S0(long[] arr_v) {
        if(arr_v != null) {
            this.L0(arr_v.length);
            for(int v = 0; v < arr_v.length; ++v) {
                this.Q0(arr_v[v]);
            }
            return;
        }
        this.L0(-1);
    }

    public long[] T(long[] arr_v, int v) {
        return this.F(v) ? this.S() : arr_v;
    }

    public void T0(long[] arr_v, int v) {
        this.i0(v);
        this.S0(arr_v);
    }

    public Map U(Map map0, int v) {
        if(!this.F(v)) {
            return map0;
        }
        int v1 = this.L();
        if(v1 < 0) {
            return null;
        }
        Map map1 = new ArrayMap();
        if(v1 == 0) {
            return map1;
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        this.x(arrayList0);
        this.x(arrayList1);
        for(int v2 = 0; v2 < v1; ++v2) {
            map1.put(arrayList0.get(v2), arrayList1.get(v2));
        }
        return map1;
    }

    public void U0(Map map0, int v) {
        this.i0(v);
        if(map0 == null) {
            this.L0(-1);
            return;
        }
        int v1 = map0.size();
        this.L0(v1);
        if(v1 == 0) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            arrayList0.add(((Map.Entry)object0).getKey());
            arrayList1.add(((Map.Entry)object0).getValue());
        }
        this.A0(arrayList0);
        this.A0(arrayList1);
    }

    protected abstract Parcelable V();

    protected void V0() {
        this.L0(0);
    }

    public Parcelable W(Parcelable parcelable0, int v) {
        return this.F(v) ? this.V() : parcelable0;
    }

    protected abstract void W0(Parcelable arg1);

    protected Serializable X() {
        String s = this.c0();
        if(s == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(this.s());
        try {
            return (Serializable)new ObjectInputStream(byteArrayInputStream0) {
                final VersionedParcel a;

                @Override
                protected Class resolveClass(ObjectStreamClass objectStreamClass0) throws IOException, ClassNotFoundException {
                    Class class0 = Class.forName(objectStreamClass0.getName(), false, this.getClass().getClassLoader());
                    return class0 == null ? super.resolveClass(objectStreamClass0) : class0;
                }
            }.readObject();
        }
        catch(IOException iOException0) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + s + ")", iOException0);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + s + ")", classNotFoundException0);
        }
    }

    public void X0(Parcelable parcelable0, int v) {
        this.i0(v);
        this.W0(parcelable0);
    }

    public Set Y(Set set0, int v) {
        return this.F(v) ? ((Set)this.x(new ArraySet())) : set0;
    }

    private void Y0(Serializable serializable0) {
        if(serializable0 == null) {
            this.e1(null);
            return;
        }
        String s = serializable0.getClass().getName();
        this.e1(s);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
            objectOutputStream0.writeObject(serializable0);
            objectOutputStream0.close();
            this.t0(byteArrayOutputStream0.toByteArray());
        }
        catch(IOException iOException0) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + s + ")", iOException0);
        }
    }

    @RequiresApi(api = 21)
    public Size Z(Size size0, int v) {
        if(!this.F(v)) {
            return size0;
        }
        return this.l() ? new Size(this.L(), this.L()) : null;
    }

    public void Z0(Serializable serializable0, int v) {
        this.i0(v);
        this.Y0(serializable0);
    }

    protected abstract void a();

    @RequiresApi(api = 21)
    public SizeF a0(SizeF sizeF0, int v) {
        if(!this.F(v)) {
            return sizeF0;
        }
        return this.l() ? new SizeF(this.G(), this.G()) : null;
    }

    public void a1(Set set0, int v) {
        this.B0(set0, v);
    }

    private Exception b(int v, String s) {
        switch(v) {
            case -9: {
                return (Exception)this.V();
            }
            case -7: {
                return new UnsupportedOperationException(s);
            }
            case -6: {
                return new NetworkOnMainThreadException();
            }
            case -5: {
                return new IllegalStateException(s);
            }
            case -4: {
                return new NullPointerException(s);
            }
            case -3: {
                return new IllegalArgumentException(s);
            }
            case -2: {
                return new BadParcelableException(s);
            }
            case -1: {
                return new SecurityException(s);
            }
            default: {
                return new RuntimeException("Unknown exception code: " + v + " msg " + s);
            }
        }
    }

    public SparseBooleanArray b0(SparseBooleanArray sparseBooleanArray0, int v) {
        if(!this.F(v)) {
            return sparseBooleanArray0;
        }
        int v1 = this.L();
        if(v1 < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray1 = new SparseBooleanArray(v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            sparseBooleanArray1.put(this.L(), this.l());
        }
        return sparseBooleanArray1;
    }

    @RequiresApi(api = 21)
    public void b1(Size size0, int v) {
        this.i0(v);
        this.m0(size0 != null);
        if(size0 != null) {
            this.L0(size0.getWidth());
            this.L0(size0.getHeight());
        }
    }

    protected abstract VersionedParcel c();

    protected abstract String c0();

    @RequiresApi(api = 21)
    public void c1(SizeF sizeF0, int v) {
        this.i0(v);
        this.m0(sizeF0 != null);
        if(sizeF0 != null) {
            this.H0(sizeF0.getWidth());
            this.H0(sizeF0.getHeight());
        }
    }

    private Class d(Class class0) throws ClassNotFoundException {
        Class class1 = (Class)this.c.get(class0.getName());
        if(class1 == null) {
            class1 = Class.forName(String.format("%s.%sParcelizer", class0.getPackage().getName(), class0.getSimpleName()), false, class0.getClassLoader());
            this.c.put(class0.getName(), class1);
        }
        return class1;
    }

    public String d0(String s, int v) {
        return this.F(v) ? this.c0() : s;
    }

    public void d1(SparseBooleanArray sparseBooleanArray0, int v) {
        this.i0(v);
        if(sparseBooleanArray0 == null) {
            this.L0(-1);
            return;
        }
        int v1 = sparseBooleanArray0.size();
        this.L0(v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            this.L0(sparseBooleanArray0.keyAt(v2));
            this.m0(sparseBooleanArray0.valueAt(v2));
        }
    }

    private Method e(String s) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method0 = (Method)this.a.get(s);
        if(method0 == null) {
            method0 = Class.forName(s, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
            this.a.put(s, method0);
        }
        return method0;
    }

    protected abstract IBinder e0();

    protected abstract void e1(String arg1);

    @NonNull
    protected static Throwable f(@NonNull Throwable throwable0) {
        while(throwable0.getCause() != null) {
            throwable0 = throwable0.getCause();
        }
        return throwable0;
    }

    public IBinder f0(IBinder iBinder0, int v) {
        return this.F(v) ? this.e0() : iBinder0;
    }

    public void f1(String s, int v) {
        this.i0(v);
        this.e1(s);
    }

    private int g(Object object0) {
        if(object0 instanceof String) {
            return 4;
        }
        if(object0 instanceof Parcelable) {
            return 2;
        }
        if(object0 instanceof VersionedParcelable) {
            return 1;
        }
        if(object0 instanceof Serializable) {
            return 3;
        }
        if(object0 instanceof IBinder) {
            return 5;
        }
        if(object0 instanceof Integer) {
            return 7;
        }
        if(!(object0 instanceof Float)) {
            throw new IllegalArgumentException(object0.getClass().getName() + " cannot be VersionedParcelled");
        }
        return 8;
    }

    protected VersionedParcelable g0() {
        String s = this.c0();
        return s == null ? null : this.K(s, this.c());
    }

    protected abstract void g1(IBinder arg1);

    private Method h(Class class0) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method0 = (Method)this.b.get(class0.getName());
        if(method0 == null) {
            method0 = this.d(class0).getDeclaredMethod("write", class0, VersionedParcel.class);
            this.b.put(class0.getName(), method0);
        }
        return method0;
    }

    public VersionedParcelable h0(VersionedParcelable versionedParcelable0, int v) {
        return this.F(v) ? this.g0() : versionedParcelable0;
    }

    public void h1(IBinder iBinder0, int v) {
        this.i0(v);
        this.g1(iBinder0);
    }

    public boolean i() {
        return false;
    }

    protected abstract void i0(int arg1);

    protected abstract void i1(IInterface arg1);

    protected Object[] j(Object[] arr_object) {
        int v = this.L();
        if(v < 0) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList(v);
        if(v != 0) {
            switch(this.L()) {
                case 1: {
                    break;
                }
                case 2: {
                    while(v > 0) {
                        arrayList0.add(this.V());
                        --v;
                    }
                    return arrayList0.toArray(arr_object);
                }
                case 3: {
                    while(v > 0) {
                        arrayList0.add(this.X());
                        --v;
                    }
                    return arrayList0.toArray(arr_object);
                }
                case 4: {
                    while(v > 0) {
                        arrayList0.add(this.c0());
                        --v;
                    }
                    return arrayList0.toArray(arr_object);
                }
                case 5: {
                    while(v > 0) {
                        arrayList0.add(this.e0());
                        --v;
                    }
                    return arrayList0.toArray(arr_object);
                }
                default: {
                    return arrayList0.toArray(arr_object);
                }
            }
            while(v > 0) {
                arrayList0.add(this.g0());
                --v;
            }
        }
        return arrayList0.toArray(arr_object);
    }

    public void j0(boolean z, boolean z1) {
    }

    public void j1(IInterface iInterface0, int v) {
        this.i0(v);
        this.i1(iInterface0);
    }

    public Object[] k(Object[] arr_object, int v) {
        return this.F(v) ? this.j(arr_object) : arr_object;
    }

    protected void k0(Object[] arr_object) {
        if(arr_object == null) {
            this.L0(-1);
            return;
        }
        this.L0(arr_object.length);
        if(arr_object.length > 0) {
            int v = 0;
            int v1 = this.g(arr_object[0]);
            this.L0(v1);
            switch(v1) {
                case 1: {
                    break;
                }
                case 2: {
                    while(v < arr_object.length) {
                        this.W0(((Parcelable)arr_object[v]));
                        ++v;
                    }
                    return;
                }
                case 3: {
                    while(v < arr_object.length) {
                        this.Y0(((Serializable)arr_object[v]));
                        ++v;
                    }
                    return;
                }
                case 4: {
                    while(v < arr_object.length) {
                        this.e1(((String)arr_object[v]));
                        ++v;
                    }
                    return;
                }
                case 5: {
                    while(v < arr_object.length) {
                        this.g1(((IBinder)arr_object[v]));
                        ++v;
                    }
                    return;
                }
                default: {
                    return;
                }
            }
            while(v < arr_object.length) {
                this.l1(((VersionedParcelable)arr_object[v]));
                ++v;
            }
        }
    }

    protected void k1(VersionedParcelable versionedParcelable0, VersionedParcel versionedParcel0) {
        try {
            this.h(versionedParcelable0.getClass()).invoke(null, versionedParcelable0, versionedParcel0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw invocationTargetException0.getCause() instanceof RuntimeException ? ((RuntimeException)invocationTargetException0.getCause()) : new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException0);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException0);
        }
    }

    protected abstract boolean l();

    public void l0(Object[] arr_object, int v) {
        this.i0(v);
        this.k0(arr_object);
    }

    protected void l1(VersionedParcelable versionedParcelable0) {
        if(versionedParcelable0 == null) {
            this.e1(null);
            return;
        }
        this.n1(versionedParcelable0);
        VersionedParcel versionedParcel0 = this.c();
        this.k1(versionedParcelable0, versionedParcel0);
        versionedParcel0.a();
    }

    public boolean m(boolean z, int v) {
        return this.F(v) ? this.l() : z;
    }

    protected abstract void m0(boolean arg1);

    public void m1(VersionedParcelable versionedParcelable0, int v) {
        this.i0(v);
        this.l1(versionedParcelable0);
    }

    protected boolean[] n() {
        int v = this.L();
        if(v < 0) {
            return null;
        }
        boolean[] arr_z = new boolean[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_z[v1] = this.L() != 0;
        }
        return arr_z;
    }

    public void n0(boolean z, int v) {
        this.i0(v);
        this.m0(z);
    }

    private void n1(VersionedParcelable versionedParcelable0) {
        Class class0;
        try {
            class0 = this.d(versionedParcelable0.getClass());
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException(versionedParcelable0.getClass().getSimpleName() + " does not have a Parcelizer", classNotFoundException0);
        }
        this.e1(class0.getName());
    }

    public boolean[] o(boolean[] arr_z, int v) {
        return this.F(v) ? this.n() : arr_z;
    }

    protected void o0(boolean[] arr_z) {
        if(arr_z != null) {
            this.L0(arr_z.length);
            for(int v = 0; v < arr_z.length; ++v) {
                this.L0(((int)arr_z[v]));
            }
            return;
        }
        this.L0(-1);
    }

    protected abstract Bundle p();

    public void p0(boolean[] arr_z, int v) {
        this.i0(v);
        this.o0(arr_z);
    }

    public Bundle q(Bundle bundle0, int v) {
        return this.F(v) ? this.p() : bundle0;
    }

    protected abstract void q0(Bundle arg1);

    public byte r(byte b, int v) {
        return this.F(v) ? ((byte)(this.L() & 0xFF)) : b;
    }

    public void r0(Bundle bundle0, int v) {
        this.i0(v);
        this.q0(bundle0);
    }

    protected abstract byte[] s();

    public void s0(byte b, int v) {
        this.i0(v);
        this.L0(((int)b));
    }

    public byte[] t(byte[] arr_b, int v) {
        return this.F(v) ? this.s() : arr_b;
    }

    protected abstract void t0(byte[] arg1);

    public char[] u(char[] arr_c, int v) {
        if(!this.F(v)) {
            return arr_c;
        }
        int v1 = this.L();
        if(v1 < 0) {
            return null;
        }
        char[] arr_c1 = new char[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_c1[v2] = (char)this.L();
        }
        return arr_c1;
    }

    public void u0(byte[] arr_b, int v) {
        this.i0(v);
        this.t0(arr_b);
    }

    protected abstract CharSequence v();

    protected abstract void v0(byte[] arg1, int arg2, int arg3);

    public CharSequence w(CharSequence charSequence0, int v) {
        return this.F(v) ? this.v() : charSequence0;
    }

    public void w0(byte[] arr_b, int v, int v1, int v2) {
        this.i0(v2);
        this.v0(arr_b, v, v1);
    }

    private Collection x(Collection collection0) {
        int v = this.L();
        if(v < 0) {
            return null;
        }
        if(v != 0) {
            switch(this.L()) {
                case 1: {
                    break;
                }
                case 2: {
                    while(v > 0) {
                        collection0.add(this.V());
                        --v;
                    }
                    return collection0;
                }
                case 3: {
                    while(v > 0) {
                        collection0.add(this.X());
                        --v;
                    }
                    return collection0;
                }
                case 4: {
                    while(v > 0) {
                        collection0.add(this.c0());
                        --v;
                    }
                    return collection0;
                }
                case 5: {
                    while(v > 0) {
                        collection0.add(this.e0());
                        --v;
                    }
                    return collection0;
                }
                default: {
                    return collection0;
                }
            }
            while(v > 0) {
                collection0.add(this.g0());
                --v;
            }
        }
        return collection0;
    }

    public void x0(char[] arr_c, int v) {
        this.i0(v);
        if(arr_c != null) {
            this.L0(arr_c.length);
            for(int v1 = 0; v1 < arr_c.length; ++v1) {
                this.L0(((int)arr_c[v1]));
            }
            return;
        }
        this.L0(-1);
    }

    protected abstract double y();

    protected abstract void y0(CharSequence arg1);

    public double z(double f, int v) {
        return this.F(v) ? this.y() : f;
    }

    public void z0(CharSequence charSequence0, int v) {
        this.i0(v);
        this.y0(charSequence0);
    }
}

