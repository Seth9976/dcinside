package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.V;
import kotlin.jvm.internal.L;
import y4.l;

public final class BundleKt {
    @l
    public static final Bundle a() {
        return new Bundle(0);
    }

    @l
    public static final Bundle b(@l V[] arr_v) {
        Bundle bundle0 = new Bundle(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            V v1 = arr_v[v];
            String s = (String)v1.a();
            Object object0 = v1.b();
            if(object0 == null) {
                bundle0.putString(s, null);
            }
            else if(object0 instanceof Boolean) {
                bundle0.putBoolean(s, ((Boolean)object0).booleanValue());
            }
            else if(object0 instanceof Byte) {
                bundle0.putByte(s, ((Number)object0).byteValue());
            }
            else if(object0 instanceof Character) {
                bundle0.putChar(s, ((Character)object0).charValue());
            }
            else if(object0 instanceof Double) {
                bundle0.putDouble(s, ((Number)object0).doubleValue());
            }
            else if(object0 instanceof Float) {
                bundle0.putFloat(s, ((Number)object0).floatValue());
            }
            else if(object0 instanceof Integer) {
                bundle0.putInt(s, ((Number)object0).intValue());
            }
            else if(object0 instanceof Long) {
                bundle0.putLong(s, ((Number)object0).longValue());
            }
            else if(object0 instanceof Short) {
                bundle0.putShort(s, ((Number)object0).shortValue());
            }
            else if(object0 instanceof Bundle) {
                bundle0.putBundle(s, ((Bundle)object0));
            }
            else if(object0 instanceof CharSequence) {
                bundle0.putCharSequence(s, ((CharSequence)object0));
            }
            else if(object0 instanceof Parcelable) {
                bundle0.putParcelable(s, ((Parcelable)object0));
            }
            else if(object0 instanceof boolean[]) {
                bundle0.putBooleanArray(s, ((boolean[])object0));
            }
            else if(object0 instanceof byte[]) {
                bundle0.putByteArray(s, ((byte[])object0));
            }
            else if(object0 instanceof char[]) {
                bundle0.putCharArray(s, ((char[])object0));
            }
            else if(object0 instanceof double[]) {
                bundle0.putDoubleArray(s, ((double[])object0));
            }
            else if(object0 instanceof float[]) {
                bundle0.putFloatArray(s, ((float[])object0));
            }
            else if(object0 instanceof int[]) {
                bundle0.putIntArray(s, ((int[])object0));
            }
            else if(object0 instanceof long[]) {
                bundle0.putLongArray(s, ((long[])object0));
            }
            else if(object0 instanceof short[]) {
                bundle0.putShortArray(s, ((short[])object0));
            }
            else if(object0 instanceof Object[]) {
                Class class0 = object0.getClass().getComponentType();
                L.m(class0);
                if(Parcelable.class.isAssignableFrom(class0)) {
                    L.n(object0, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle0.putParcelableArray(s, ((Parcelable[])object0));
                }
                else if(String.class.isAssignableFrom(class0)) {
                    L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle0.putStringArray(s, ((String[])object0));
                }
                else if(CharSequence.class.isAssignableFrom(class0)) {
                    L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle0.putCharSequenceArray(s, ((CharSequence[])object0));
                }
                else {
                    if(!Serializable.class.isAssignableFrom(class0)) {
                        throw new IllegalArgumentException("Illegal value array type " + class0.getCanonicalName() + " for key \"" + s + '\"');
                    }
                    bundle0.putSerializable(s, ((Serializable)object0));
                }
            }
            else if(object0 instanceof Serializable) {
                bundle0.putSerializable(s, ((Serializable)object0));
            }
            else if(object0 instanceof IBinder) {
                bundle0.putBinder(s, ((IBinder)object0));
            }
            else if(object0 instanceof Size) {
                BundleApi21ImplKt.a(bundle0, s, ((Size)object0));
            }
            else {
                if(!(object0 instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + object0.getClass().getCanonicalName() + " for key \"" + s + '\"');
                }
                BundleApi21ImplKt.b(bundle0, s, ((SizeF)object0));
            }
        }
        return bundle0;
    }
}

