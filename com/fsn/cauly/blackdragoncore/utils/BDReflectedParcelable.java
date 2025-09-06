package com.fsn.cauly.blackdragoncore.utils;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.lang.reflect.Field;

public class BDReflectedParcelable implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public BDReflectedParcelable a(Parcel parcel0) {
            return new BDReflectedParcelable(parcel0);
        }

        public BDReflectedParcelable[] a(int v) {
            return new BDReflectedParcelable[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.a(v);
        }
    }

    public static final Parcelable.Creator CREATOR;

    static {
        BDReflectedParcelable.CREATOR = new a();
    }

    public BDReflectedParcelable() {
    }

    public BDReflectedParcelable(Parcel parcel0) {
        Field[] arr_field = this.getClass().getDeclaredFields();
        for(int v = 0; v < arr_field.length; ++v) {
            try {
                Field field0 = arr_field[v];
                if(!(field0.get(this) instanceof Parcelable.Creator)) {
                    field0.set(this, parcel0.readValue(null));
                }
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                illegalArgumentException0.printStackTrace();
                return;
            }
            catch(IllegalAccessException illegalAccessException0) {
                illegalAccessException0.printStackTrace();
                return;
            }
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        Field[] arr_field = this.getClass().getDeclaredFields();
        for(int v1 = 0; v1 < arr_field.length; ++v1) {
            try {
                Object object0 = arr_field[v1].get(this);
                if(!(object0 instanceof Parcelable.Creator)) {
                    parcel0.writeValue(object0);
                }
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                illegalArgumentException0.printStackTrace();
                return;
            }
            catch(IllegalAccessException illegalAccessException0) {
                illegalAccessException0.printStackTrace();
                return;
            }
        }
    }
}

