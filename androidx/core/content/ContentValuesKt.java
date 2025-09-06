package androidx.core.content;

import android.content.ContentValues;
import kotlin.V;
import y4.l;

public final class ContentValuesKt {
    @l
    public static final ContentValues a(@l V[] arr_v) {
        ContentValues contentValues0 = new ContentValues(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            V v1 = arr_v[v];
            String s = (String)v1.a();
            Object object0 = v1.b();
            if(object0 == null) {
                contentValues0.putNull(s);
            }
            else if(object0 instanceof String) {
                contentValues0.put(s, ((String)object0));
            }
            else if(object0 instanceof Integer) {
                contentValues0.put(s, ((Integer)object0));
            }
            else if(object0 instanceof Long) {
                contentValues0.put(s, ((Long)object0));
            }
            else if(object0 instanceof Boolean) {
                contentValues0.put(s, ((Boolean)object0));
            }
            else if(object0 instanceof Float) {
                contentValues0.put(s, ((Float)object0));
            }
            else if(object0 instanceof Double) {
                contentValues0.put(s, ((Double)object0));
            }
            else if(object0 instanceof byte[]) {
                contentValues0.put(s, ((byte[])object0));
            }
            else if(object0 instanceof Byte) {
                contentValues0.put(s, ((Byte)object0));
            }
            else {
                if(!(object0 instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + object0.getClass().getCanonicalName() + " for key \"" + s + '\"');
                }
                contentValues0.put(s, ((Short)object0));
            }
        }
        return contentValues0;
    }
}

