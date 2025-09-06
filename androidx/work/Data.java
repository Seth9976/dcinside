package androidx.work;

import A3.o;
import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.TypeConverter;
import j..util.DesugarCollections;
import j..util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.reflect.d;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

@s0({"SMAP\nData_.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Data_.kt\nandroidx/work/Data\n*L\n1#1,841:1\n55#1,2:842\n63#1,4:844\n55#1,2:848\n63#1,4:850\n55#1,2:854\n63#1,4:856\n55#1,2:860\n63#1,4:862\n55#1,2:866\n63#1,4:868\n55#1,2:872\n63#1,4:874\n63#1,4:878\n*S KotlinDebug\n*F\n+ 1 Data_.kt\nandroidx/work/Data\n*L\n76#1:842,2\n84#1:844,4\n93#1:848,2\n101#1:850,4\n110#1:854,2\n118#1:856,4\n127#1:860,2\n135#1:862,4\n144#1:866,2\n152#1:868,4\n161#1:872,2\n169#1:874,4\n185#1:878,4\n*E\n"})
public final class Data {
    @s0({"SMAP\nData_.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Data_.kt\nandroidx/work/Data$Builder\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,841:1\n215#2,2:842\n*S KotlinDebug\n*F\n+ 1 Data_.kt\nandroidx/work/Data$Builder\n*L\n469#1:842,2\n*E\n"})
    public static final class Builder {
        @l
        private final Map a;

        public Builder() {
            this.a = new LinkedHashMap();
        }

        @l
        public final Data a() {
            Data data0 = new Data(this.a);
            Data.b.f(data0);
            return data0;
        }

        @RestrictTo({Scope.b})
        @l
        public final Builder b(@l String s, @m Object object0) {
            L.p(s, "key");
            Map map0 = this.a;
            if(object0 == null) {
                object0 = null;
            }
            else {
                d d0 = m0.d(object0.getClass());
                if(!(((((((((((((L.g(d0, m0.d(Boolean.TYPE)) ? true : L.g(d0, m0.d(Byte.TYPE))) ? true : L.g(d0, m0.d(Integer.TYPE))) ? true : L.g(d0, m0.d(Long.TYPE))) ? true : L.g(d0, m0.d(Float.TYPE))) ? true : L.g(d0, m0.d(Double.TYPE))) ? true : L.g(d0, m0.d(String.class))) ? true : L.g(d0, m0.d(Boolean[].class))) ? true : L.g(d0, m0.d(Byte[].class))) ? true : L.g(d0, m0.d(Integer[].class))) ? true : L.g(d0, m0.d(Long[].class))) ? true : L.g(d0, m0.d(Float[].class))) ? true : L.g(d0, m0.d(Double[].class))) ? true : L.g(d0, m0.d(String[].class)))) {
                    if(L.g(d0, m0.d(boolean[].class))) {
                        object0 = Data_Kt.h(((boolean[])object0));
                    }
                    else if(L.g(d0, m0.d(byte[].class))) {
                        object0 = Data_Kt.i(((byte[])object0));
                    }
                    else if(L.g(d0, m0.d(int[].class))) {
                        object0 = Data_Kt.l(((int[])object0));
                    }
                    else if(L.g(d0, m0.d(long[].class))) {
                        object0 = Data_Kt.m(((long[])object0));
                    }
                    else if(L.g(d0, m0.d(float[].class))) {
                        object0 = Data_Kt.k(((float[])object0));
                    }
                    else {
                        if(!L.g(d0, m0.d(double[].class))) {
                            throw new IllegalArgumentException("Key " + s + " has invalid type " + d0);
                        }
                        object0 = Data_Kt.j(((double[])object0));
                    }
                }
            }
            map0.put(s, object0);
            return this;
        }

        @l
        public final Builder c(@l Data data0) {
            L.p(data0, "data");
            this.d(data0.a);
            return this;
        }

        @l
        public final Builder d(@l Map map0) {
            L.p(map0, "values");
            for(Object object0: map0.entrySet()) {
                this.b(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
            }
            return this;
        }

        @l
        public final Builder e(@l String s, boolean z) {
            L.p(s, "key");
            return this.i(s, Boolean.valueOf(z));
        }

        @l
        public final Builder f(@l String s, @l boolean[] arr_z) {
            L.p(s, "key");
            L.p(arr_z, "value");
            Boolean[] arr_boolean = Data_Kt.h(arr_z);
            this.a.put(s, arr_boolean);
            return this;
        }

        @l
        public final Builder g(@l String s, byte b) {
            L.p(s, "key");
            return this.i(s, b);
        }

        @l
        public final Builder h(@l String s, @l byte[] arr_b) {
            L.p(s, "key");
            L.p(arr_b, "value");
            Byte[] arr_byte = Data_Kt.i(arr_b);
            this.a.put(s, arr_byte);
            return this;
        }

        private final Builder i(String s, Object object0) {
            this.a.put(s, object0);
            return this;
        }

        @l
        public final Builder j(@l String s, double f) {
            L.p(s, "key");
            return this.i(s, f);
        }

        @l
        public final Builder k(@l String s, @l double[] arr_f) {
            L.p(s, "key");
            L.p(arr_f, "value");
            Double[] arr_double = Data_Kt.j(arr_f);
            this.a.put(s, arr_double);
            return this;
        }

        @l
        public final Builder l(@l String s, float f) {
            L.p(s, "key");
            return this.i(s, f);
        }

        @l
        public final Builder m(@l String s, @l float[] arr_f) {
            L.p(s, "key");
            L.p(arr_f, "value");
            Float[] arr_float = Data_Kt.k(arr_f);
            this.a.put(s, arr_float);
            return this;
        }

        @l
        public final Builder n(@l String s, int v) {
            L.p(s, "key");
            return this.i(s, v);
        }

        @l
        public final Builder o(@l String s, @l int[] arr_v) {
            L.p(s, "key");
            L.p(arr_v, "value");
            Integer[] arr_integer = Data_Kt.l(arr_v);
            this.a.put(s, arr_integer);
            return this;
        }

        @l
        public final Builder p(@l String s, long v) {
            L.p(s, "key");
            return this.i(s, v);
        }

        @l
        public final Builder q(@l String s, @l long[] arr_v) {
            L.p(s, "key");
            L.p(arr_v, "value");
            Long[] arr_long = Data_Kt.m(arr_v);
            this.a.put(s, arr_long);
            return this;
        }

        @l
        public final Builder r(@l String s, @m String s1) {
            L.p(s, "key");
            return this.i(s, s1);
        }

        @l
        public final Builder s(@l String s, @l String[] arr_s) {
            L.p(s, "key");
            L.p(arr_s, "value");
            return this.i(s, arr_s);
        }
    }

    @s0({"SMAP\nData_.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Data_.kt\nandroidx/work/Data$Companion\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,841:1\n32#2:842\n32#2:843\n32#2:845\n32#2:846\n1#3:844\n*S KotlinDebug\n*F\n+ 1 Data_.kt\nandroidx/work/Data$Companion\n*L\n599#1:842\n710#1:843\n814#1:845\n816#1:846\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @TypeConverter
        @l
        @n
        public final Data a(@l byte[] arr_b) {
            DataInputStream dataInputStream0;
            ObjectInputStream objectInputStream0;
            int v;
            ByteArrayInputStream byteArrayInputStream0;
            L.p(arr_b, "bytes");
            if(arr_b.length > 0x2800) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            if(arr_b.length == 0) {
                return Data.c;
            }
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            try {
                byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
                v = 0;
                if(Companion.b(byteArrayInputStream0)) {
                    objectInputStream0 = new ObjectInputStream(byteArrayInputStream0);
                    goto label_9;
                }
                goto label_21;
            }
            catch(IOException iOException0) {
                Logger.e().d("WM-Data", "Error in Data#fromByteArray: ", iOException0);
                return new Data(linkedHashMap0);
            }
            catch(ClassNotFoundException classNotFoundException0) {
                Logger.e().d("WM-Data", "Error in Data#fromByteArray: ", classNotFoundException0);
                return new Data(linkedHashMap0);
            }
            try {
            label_9:
                int v1 = objectInputStream0.readInt();
                while(true) {
                    if(v >= v1) {
                        goto label_19;
                    }
                    String s = objectInputStream0.readUTF();
                    L.o(s, "readUTF()");
                    linkedHashMap0.put(s, objectInputStream0.readObject());
                    ++v;
                }
            }
            catch(Throwable throwable0) {
                try {
                    c.a(objectInputStream0, throwable0);
                    throw throwable0;
                label_19:
                    c.a(objectInputStream0, null);
                }
                catch(IOException iOException0) {
                    Logger.e().d("WM-Data", "Error in Data#fromByteArray: ", iOException0);
                    return new Data(linkedHashMap0);
                }
                catch(ClassNotFoundException classNotFoundException0) {
                    Logger.e().d("WM-Data", "Error in Data#fromByteArray: ", classNotFoundException0);
                    return new Data(linkedHashMap0);
                }
            }
            return new Data(linkedHashMap0);
            try {
            label_21:
                dataInputStream0 = new DataInputStream(byteArrayInputStream0);
            }
            catch(IOException iOException0) {
                Logger.e().d("WM-Data", "Error in Data#fromByteArray: ", iOException0);
                return new Data(linkedHashMap0);
            }
            catch(ClassNotFoundException classNotFoundException0) {
                Logger.e().d("WM-Data", "Error in Data#fromByteArray: ", classNotFoundException0);
                return new Data(linkedHashMap0);
            }
            try {
                Companion.c(dataInputStream0);
                int v2 = dataInputStream0.readInt();
                while(true) {
                    if(v >= v2) {
                        goto label_34;
                    }
                    Object object0 = Companion.d(dataInputStream0, dataInputStream0.readByte());
                    String s1 = dataInputStream0.readUTF();
                    L.o(s1, "key");
                    linkedHashMap0.put(s1, object0);
                    ++v;
                }
            }
            catch(Throwable throwable1) {
                try {
                    c.a(dataInputStream0, throwable1);
                    throw throwable1;
                label_34:
                    c.a(dataInputStream0, null);
                    return new Data(linkedHashMap0);
                }
                catch(IOException iOException0) {
                }
                catch(ClassNotFoundException classNotFoundException0) {
                    Logger.e().d("WM-Data", "Error in Data#fromByteArray: ", classNotFoundException0);
                    return new Data(linkedHashMap0);
                }
            }
            Logger.e().d("WM-Data", "Error in Data#fromByteArray: ", iOException0);
            return new Data(linkedHashMap0);
        }

        private static final boolean b(ByteArrayInputStream byteArrayInputStream0) {
            byte[] arr_b = new byte[2];
            byteArrayInputStream0.read(arr_b);
            boolean z = arr_b[0] == -84 && arr_b[1] == -19;
            byteArrayInputStream0.reset();
            return z;
        }

        private static final void c(DataInputStream dataInputStream0) {
            int v = dataInputStream0.readShort();
            if(v != 0xFFFFABEF) {
                throw new IllegalStateException(("Magic number doesn\'t match: " + v).toString());
            }
            int v1 = dataInputStream0.readShort();
            if(v1 != 1) {
                throw new IllegalStateException(("Unsupported version number: " + v1).toString());
            }
        }

        private static final Object d(DataInputStream dataInputStream0, byte b) {
            Boolean[] arr_boolean = null;
        alab1:
            switch(b) {
                case 0: {
                    break;
                }
                case 1: {
                    return Boolean.valueOf(dataInputStream0.readBoolean());
                }
                case 2: {
                    return dataInputStream0.readByte();
                }
                case 3: {
                    return dataInputStream0.readInt();
                }
                case 4: {
                    return dataInputStream0.readLong();
                }
                case 5: {
                    return dataInputStream0.readFloat();
                }
                case 6: {
                    return dataInputStream0.readDouble();
                label_9:
                    int v = 0;
                    switch(b) {
                        case 7: {
                            return dataInputStream0.readUTF();
                        }
                        case 8: {
                            int v1 = dataInputStream0.readInt();
                            arr_boolean = new Boolean[v1];
                            while(v < v1) {
                                arr_boolean[v] = Boolean.valueOf(dataInputStream0.readBoolean());
                                ++v;
                            }
                            return arr_boolean;
                        }
                        case 9: {
                            int v2 = dataInputStream0.readInt();
                            arr_boolean = new Byte[v2];
                            while(v < v2) {
                                arr_boolean[v] = dataInputStream0.readByte();
                                ++v;
                            }
                            return arr_boolean;
                        }
                        case 10: {
                            int v3 = dataInputStream0.readInt();
                            arr_boolean = new Integer[v3];
                            while(v < v3) {
                                arr_boolean[v] = dataInputStream0.readInt();
                                ++v;
                            }
                            return arr_boolean;
                        }
                        case 11: {
                            int v4 = dataInputStream0.readInt();
                            arr_boolean = new Long[v4];
                            while(v < v4) {
                                arr_boolean[v] = dataInputStream0.readLong();
                                ++v;
                            }
                            return arr_boolean;
                        }
                        case 12: {
                            int v5 = dataInputStream0.readInt();
                            arr_boolean = new Float[v5];
                            while(v < v5) {
                                arr_boolean[v] = dataInputStream0.readFloat();
                                ++v;
                            }
                            return arr_boolean;
                        }
                        case 13: {
                            int v7 = dataInputStream0.readInt();
                            arr_boolean = new Double[v7];
                            while(true) {
                                if(v >= v7) {
                                    break alab1;
                                }
                                arr_boolean[v] = dataInputStream0.readDouble();
                                ++v;
                            }
                        }
                        case 14: {
                            int v6 = dataInputStream0.readInt();
                            String[] arr_s = new String[v6];
                            while(v < v6) {
                                String s = dataInputStream0.readUTF();
                                if(L.g(s, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                                    s = null;
                                }
                                arr_s[v] = s;
                                ++v;
                            }
                            return arr_s;
                        }
                        default: {
                            throw new IllegalStateException("Unsupported type " + ((int)b));
                        }
                    }
                }
                default: {
                    goto label_9;
                }
            }
            return arr_boolean;
        }

        @RestrictTo({Scope.b})
        @k(message = "This is kept for testing migration", replaceWith = @c0(expression = "toByteArrayInternalV1", imports = {}))
        @l
        @n
        public final byte[] e(@l Data data0) {
            ObjectOutputStream objectOutputStream0;
            ByteArrayOutputStream byteArrayOutputStream0;
            L.p(data0, "data");
            try {
                byteArrayOutputStream0 = new ByteArrayOutputStream();
            }
            catch(IOException iOException0) {
                Logger.e().d("WM-Data", "Error in Data#toByteArray: ", iOException0);
                return new byte[0];
            }
            try {
                objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
            }
            catch(Throwable throwable0) {
                goto label_20;
            }
            try {
                objectOutputStream0.writeInt(data0.v());
                Iterator iterator0 = data0.a.entrySet().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_17;
                    }
                    Object object0 = iterator0.next();
                    String s = (String)((Map.Entry)object0).getKey();
                    Object object1 = ((Map.Entry)object0).getValue();
                    objectOutputStream0.writeUTF(s);
                    objectOutputStream0.writeObject(object1);
                }
            }
            catch(Throwable throwable1) {
            }
            try {
                throw throwable1;
            }
            catch(Throwable throwable2) {
                try {
                    c.a(objectOutputStream0, throwable1);
                    throw throwable2;
                label_17:
                    c.a(objectOutputStream0, null);
                    goto label_22;
                }
                catch(Throwable throwable0) {
                }
            }
            try {
            label_20:
                c.a(byteArrayOutputStream0, throwable0);
                throw throwable0;
            label_22:
                c.a(byteArrayOutputStream0, null);
                if(byteArrayOutputStream0.size() > 0x2800) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] arr_b = byteArrayOutputStream0.toByteArray();
                L.o(arr_b, "{\n                val st…ByteArray()\n            }");
                return arr_b;
            }
            catch(IOException iOException0) {
            }
            Logger.e().d("WM-Data", "Error in Data#toByteArray: ", iOException0);
            return new byte[0];
        }

        @RestrictTo({Scope.b})
        @TypeConverter
        @l
        @n
        public final byte[] f(@l Data data0) {
            byte[] arr_b;
            DataOutputStream dataOutputStream0;
            ByteArrayOutputStream byteArrayOutputStream0;
            L.p(data0, "data");
            try {
                byteArrayOutputStream0 = new ByteArrayOutputStream();
                dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
            }
            catch(IOException iOException0) {
                Logger.e().d("WM-Data", "Error in Data#toByteArray: ", iOException0);
                return new byte[0];
            }
            try {
                Companion.i(dataOutputStream0);
                dataOutputStream0.writeInt(data0.v());
                for(Object object0: data0.a.entrySet()) {
                    Companion.h(dataOutputStream0, ((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
                }
                dataOutputStream0.flush();
                if(dataOutputStream0.size() > 0x2800) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                arr_b = byteArrayOutputStream0.toByteArray();
                goto label_20;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                try {
                    c.a(dataOutputStream0, throwable0);
                    throw throwable1;
                label_20:
                    c.a(dataOutputStream0, null);
                    L.o(arr_b, "{\n                ByteAr…          }\n            }");
                    return arr_b;
                }
                catch(IOException iOException0) {
                }
            }
            Logger.e().d("WM-Data", "Error in Data#toByteArray: ", iOException0);
            return new byte[0];
        }

        private static final void g(DataOutputStream dataOutputStream0, Object[] arr_object) {
            int v;
            d d0 = m0.d(arr_object.getClass());
            if(L.g(d0, m0.d(Boolean[].class))) {
                v = 8;
            }
            else {
                if(L.g(d0, m0.d(Byte[].class))) {
                    v = 9;
                    goto label_21;
                }
                if(L.g(d0, m0.d(Integer[].class))) {
                    v = 10;
                    goto label_21;
                }
                if(L.g(d0, m0.d(Long[].class))) {
                    v = 11;
                    goto label_21;
                }
                if(L.g(d0, m0.d(Float[].class))) {
                    v = 12;
                    goto label_21;
                }
                if(L.g(d0, m0.d(Double[].class))) {
                    v = 13;
                }
                else if(L.g(d0, m0.d(String[].class))) {
                    v = 14;
                }
                else {
                    throw new IllegalArgumentException("Unsupported value type " + m0.d(arr_object.getClass()).g());
                }
            }
        label_21:
            dataOutputStream0.writeByte(v);
            dataOutputStream0.writeInt(arr_object.length);
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                Object object0 = arr_object[v1];
                Boolean boolean0 = null;
                switch(v) {
                    case 8: {
                        if(object0 instanceof Boolean) {
                            boolean0 = (Boolean)object0;
                        }
                        dataOutputStream0.writeBoolean((boolean0 == null ? false : boolean0.booleanValue()));
                        break;
                    }
                    case 9: {
                        if(object0 instanceof Byte) {
                            boolean0 = (Byte)object0;
                        }
                        dataOutputStream0.writeByte((boolean0 == null ? 0 : ((byte)(((Byte)boolean0)))));
                        break;
                    }
                    case 10: {
                        if(object0 instanceof Integer) {
                            boolean0 = (Integer)object0;
                        }
                        dataOutputStream0.writeInt((boolean0 == null ? 0 : ((int)(((Integer)boolean0)))));
                        break;
                    }
                    case 11: {
                        if(object0 instanceof Long) {
                            boolean0 = (Long)object0;
                        }
                        dataOutputStream0.writeLong((boolean0 == null ? 0L : ((long)(((Long)boolean0)))));
                        break;
                    }
                    case 12: {
                        if(object0 instanceof Float) {
                            boolean0 = (Float)object0;
                        }
                        dataOutputStream0.writeFloat((boolean0 == null ? 0.0f : ((float)(((Float)boolean0)))));
                        break;
                    }
                    case 13: {
                        if(object0 instanceof Double) {
                            boolean0 = (Double)object0;
                        }
                        dataOutputStream0.writeDouble((boolean0 == null ? 0.0 : ((double)(((Double)boolean0)))));
                        break;
                    }
                    case 14: {
                        if(object0 instanceof String) {
                            boolean0 = (String)object0;
                        }
                        if(boolean0 == null) {
                            boolean0 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                        }
                        dataOutputStream0.writeUTF(((String)boolean0));
                    }
                }
            }
        }

        private static final void h(DataOutputStream dataOutputStream0, String s, Object object0) {
            if(object0 == null) {
                dataOutputStream0.writeByte(0);
            }
            else {
                if(object0 instanceof Boolean) {
                    dataOutputStream0.writeByte(1);
                    dataOutputStream0.writeBoolean(((Boolean)object0).booleanValue());
                    dataOutputStream0.writeUTF(s);
                    return;
                }
                if(object0 instanceof Byte) {
                    dataOutputStream0.writeByte(2);
                    dataOutputStream0.writeByte(((Number)object0).byteValue());
                    dataOutputStream0.writeUTF(s);
                    return;
                }
                if(object0 instanceof Integer) {
                    dataOutputStream0.writeByte(3);
                    dataOutputStream0.writeInt(((Number)object0).intValue());
                    dataOutputStream0.writeUTF(s);
                    return;
                }
                if(object0 instanceof Long) {
                    dataOutputStream0.writeByte(4);
                    dataOutputStream0.writeLong(((Number)object0).longValue());
                    dataOutputStream0.writeUTF(s);
                    return;
                }
                if(object0 instanceof Float) {
                    dataOutputStream0.writeByte(5);
                    dataOutputStream0.writeFloat(((Number)object0).floatValue());
                    dataOutputStream0.writeUTF(s);
                    return;
                }
                if(object0 instanceof Double) {
                    dataOutputStream0.writeByte(6);
                    dataOutputStream0.writeDouble(((Number)object0).doubleValue());
                    dataOutputStream0.writeUTF(s);
                    return;
                }
                if(object0 instanceof String) {
                    dataOutputStream0.writeByte(7);
                    dataOutputStream0.writeUTF(((String)object0));
                }
                else if(object0 instanceof Object[]) {
                    Companion.g(dataOutputStream0, ((Object[])object0));
                }
                else {
                    throw new IllegalArgumentException("Unsupported value type " + m0.d(object0.getClass()).u());
                }
            }
            dataOutputStream0.writeUTF(s);
        }

        private static final void i(DataOutputStream dataOutputStream0) {
            dataOutputStream0.writeShort(0xFFFFABEF);
            dataOutputStream0.writeShort(1);
        }
    }

    @l
    private final Map a;
    @l
    public static final Companion b = null;
    @l
    @f
    public static final Data c = null;
    @SuppressLint({"MinMaxConstant"})
    public static final int d = 0x2800;
    private static final byte e = 0;
    private static final byte f = 1;
    private static final byte g = 2;
    private static final byte h = 3;
    private static final byte i = 4;
    private static final byte j = 5;
    private static final byte k = 6;
    private static final byte l = 7;
    private static final byte m = 8;
    private static final byte n = 9;
    private static final byte o = 10;
    private static final byte p = 11;
    private static final byte q = 12;
    private static final byte r = 13;
    private static final byte s = 14;
    @l
    private static final String t = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
    private static final short u = (short)0xABEF;
    private static final short v = 1;

    static {
        Data.b = new Companion(null);
        Data.c = new Builder().a();
    }

    public Data(@l Data data0) {
        L.p(data0, "other");
        super();
        this.a = new HashMap(data0.a);
    }

    public Data(@l Map map0) {
        L.p(map0, "values");
        super();
        this.a = new HashMap(map0);
    }

    @TypeConverter
    @l
    @n
    public static final Data b(@l byte[] arr_b) {
        return Data.b.a(arr_b);
    }

    public final boolean c(@l String s, boolean z) {
        L.p(s, "key");
        Boolean boolean0 = Boolean.valueOf(z);
        Object object0 = this.a.get(s);
        if(object0 instanceof Boolean) {
            boolean0 = object0;
        }
        return boolean0.booleanValue();
    }

    @m
    public final boolean[] d(@l String s) {
        L.p(s, "key");
        Object object0 = this.a.get(s);
        if(object0 instanceof Object[] && ((Object[])object0) instanceof Object[]) {
            androidx.work.Data.getBooleanArray..inlined.getTypedArray.1 data$getBooleanArray$$inlined$getTypedArray$10 = new Function1() {
                final Object e;

                {
                    this.e = object0;
                    super(1);
                }

                public final Object a(int v) {
                    Object object0 = ((Object[])this.e)[v];
                    if(object0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    return (Boolean)object0;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).intValue());
                }
            };
            boolean[] arr_z = new boolean[((Object[])object0).length];
            for(int v = 0; v < ((Object[])object0).length; ++v) {
                arr_z[v] = ((Boolean)data$getBooleanArray$$inlined$getTypedArray$10.invoke(v)).booleanValue();
            }
            return arr_z;
        }
        return null;
    }

    public final byte e(@l String s, byte b) {
        L.p(s, "key");
        Byte byte0 = b;
        Object object0 = this.a.get(s);
        if(object0 instanceof Byte) {
            byte0 = object0;
        }
        return byte0.byteValue();
    }

    @Override
    public boolean equals(@m Object object0) {
        boolean z;
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(L.g(Data.class, class0)) {
                Set set0 = this.a.keySet();
                if(!L.g(set0, ((Data)object0).a.keySet())) {
                    return false;
                }
                for(Object object1: set0) {
                    Object object2 = this.a.get(((String)object1));
                    Object object3 = ((Data)object0).a.get(((String)object1));
                    if(object2 == null || object3 == null) {
                        z = object2 == object3;
                    }
                    else if(!(object2 instanceof Object[]) || !(object3 instanceof Object[])) {
                        z = L.g(object2, object3);
                    }
                    else {
                        z = kotlin.collections.l.g(((Object[])object2), ((Object[])object3));
                    }
                    if(!z) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @m
    public final byte[] f(@l String s) {
        L.p(s, "key");
        Object object0 = this.a.get(s);
        if(object0 instanceof Object[] && ((Object[])object0) instanceof Object[]) {
            androidx.work.Data.getByteArray..inlined.getTypedArray.1 data$getByteArray$$inlined$getTypedArray$10 = new Function1() {
                final Object e;

                {
                    this.e = object0;
                    super(1);
                }

                public final Object a(int v) {
                    Object object0 = ((Object[])this.e)[v];
                    if(object0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Byte");
                    }
                    return (Byte)object0;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).intValue());
                }
            };
            byte[] arr_b = new byte[((Object[])object0).length];
            for(int v = 0; v < ((Object[])object0).length; ++v) {
                arr_b[v] = ((Number)data$getByteArray$$inlined$getTypedArray$10.invoke(v)).byteValue();
            }
            return arr_b;
        }
        return null;
    }

    public final double g(@l String s, double f) {
        L.p(s, "key");
        Double double0 = f;
        Object object0 = this.a.get(s);
        if(object0 instanceof Double) {
            double0 = object0;
        }
        return double0.doubleValue();
    }

    @m
    public final double[] h(@l String s) {
        L.p(s, "key");
        Object object0 = this.a.get(s);
        if(object0 instanceof Object[] && ((Object[])object0) instanceof Object[]) {
            androidx.work.Data.getDoubleArray..inlined.getTypedArray.1 data$getDoubleArray$$inlined$getTypedArray$10 = new Function1() {
                final Object e;

                {
                    this.e = object0;
                    super(1);
                }

                public final Object a(int v) {
                    Object object0 = ((Object[])this.e)[v];
                    if(object0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
                    }
                    return (Double)object0;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).intValue());
                }
            };
            double[] arr_f = new double[((Object[])object0).length];
            for(int v = 0; v < ((Object[])object0).length; ++v) {
                arr_f[v] = ((Number)data$getDoubleArray$$inlined$getTypedArray$10.invoke(v)).doubleValue();
            }
            return arr_f;
        }
        return null;
    }

    @Override
    public int hashCode() {
        int v = 0;
        for(Object object0: this.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = map$Entry0.getValue();
            v += (object1 instanceof Object[] ? Objects.hashCode(map$Entry0.getKey()) ^ kotlin.collections.l.b(((Object[])object1)) : map$Entry0.hashCode());
        }
        return v * 0x1F;
    }

    public final float i(@l String s, float f) {
        L.p(s, "key");
        Float float0 = f;
        Object object0 = this.a.get(s);
        if(object0 instanceof Float) {
            float0 = object0;
        }
        return float0.floatValue();
    }

    @m
    public final float[] j(@l String s) {
        L.p(s, "key");
        Object object0 = this.a.get(s);
        if(object0 instanceof Object[] && ((Object[])object0) instanceof Object[]) {
            androidx.work.Data.getFloatArray..inlined.getTypedArray.1 data$getFloatArray$$inlined$getTypedArray$10 = new Function1() {
                final Object e;

                {
                    this.e = object0;
                    super(1);
                }

                public final Object a(int v) {
                    Object object0 = ((Object[])this.e)[v];
                    if(object0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                    }
                    return (Float)object0;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).intValue());
                }
            };
            float[] arr_f = new float[((Object[])object0).length];
            for(int v = 0; v < ((Object[])object0).length; ++v) {
                arr_f[v] = ((Number)data$getFloatArray$$inlined$getTypedArray$10.invoke(v)).floatValue();
            }
            return arr_f;
        }
        return null;
    }

    public final int k(@l String s, int v) {
        L.p(s, "key");
        Integer integer0 = v;
        Object object0 = this.a.get(s);
        if(object0 instanceof Integer) {
            integer0 = object0;
        }
        return integer0.intValue();
    }

    @m
    public final int[] l(@l String s) {
        L.p(s, "key");
        Object object0 = this.a.get(s);
        if(object0 instanceof Object[] && ((Object[])object0) instanceof Object[]) {
            androidx.work.Data.getIntArray..inlined.getTypedArray.1 data$getIntArray$$inlined$getTypedArray$10 = new Function1() {
                final Object e;

                {
                    this.e = object0;
                    super(1);
                }

                public final Object a(int v) {
                    Object object0 = ((Object[])this.e)[v];
                    if(object0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                    return (Integer)object0;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).intValue());
                }
            };
            int[] arr_v = new int[((Object[])object0).length];
            for(int v = 0; v < ((Object[])object0).length; ++v) {
                arr_v[v] = ((Number)data$getIntArray$$inlined$getTypedArray$10.invoke(v)).intValue();
            }
            return arr_v;
        }
        return null;
    }

    @l
    public final Map m() {
        Map map0 = DesugarCollections.unmodifiableMap(this.a);
        L.o(map0, "unmodifiableMap(values)");
        return map0;
    }

    public final long n(@l String s, long v) {
        L.p(s, "key");
        Long long0 = v;
        Object object0 = this.a.get(s);
        if(object0 instanceof Long) {
            long0 = object0;
        }
        return long0.longValue();
    }

    @m
    public final long[] o(@l String s) {
        L.p(s, "key");
        Object object0 = this.a.get(s);
        if(object0 instanceof Object[] && ((Object[])object0) instanceof Object[]) {
            androidx.work.Data.getLongArray..inlined.getTypedArray.1 data$getLongArray$$inlined$getTypedArray$10 = new Function1() {
                final Object e;

                {
                    this.e = object0;
                    super(1);
                }

                public final Object a(int v) {
                    Object object0 = ((Object[])this.e)[v];
                    if(object0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                    }
                    return (Long)object0;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).intValue());
                }
            };
            long[] arr_v = new long[((Object[])object0).length];
            for(int v = 0; v < ((Object[])object0).length; ++v) {
                arr_v[v] = ((Number)data$getLongArray$$inlined$getTypedArray$10.invoke(v)).longValue();
            }
            return arr_v;
        }
        return null;
    }

    private final Object p(String s, Object object0) {
        Object object1 = this.a.get(s);
        L.y(3, "T");
        return object1 instanceof Object ? object1 : object0;
    }

    @m
    public final String q(@l String s) {
        L.p(s, "key");
        Object object0 = this.a.get(s);
        return object0 instanceof String ? ((String)object0) : null;
    }

    @m
    public final String[] r(@l String s) {
        L.p(s, "key");
        Object object0 = this.a.get(s);
        if(object0 instanceof Object[] && ((Object[])object0) instanceof Object[]) {
            androidx.work.Data.getStringArray..inlined.getTypedArray.1 data$getStringArray$$inlined$getTypedArray$10 = new Function1() {
                final Object e;

                {
                    this.e = object0;
                    super(1);
                }

                public final Object a(int v) {
                    Object object0 = ((Object[])this.e)[v];
                    if(object0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    return (String)object0;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).intValue());
                }
            };
            String[] arr_s = new String[((Object[])object0).length];
            for(int v = 0; v < ((Object[])object0).length; ++v) {
                arr_s[v] = data$getStringArray$$inlined$getTypedArray$10.invoke(v);
            }
            return arr_s;
        }
        return null;
    }

    private final Object s(String s, o o0) {
        Object object0 = this.a.get(s);
        if(object0 instanceof Object[] && ((Object[])object0) instanceof Object[]) {
            L.w();
            androidx.work.Data.getTypedArray.1 data$getTypedArray$10 = new Function1() {
                final Object e;

                {
                    this.e = object0;
                    super(1);
                }

                public final Object a(int v) {
                    Object object0 = ((Object[])this.e)[v];
                    L.y(1, "T");
                    return object0;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).intValue());
                }
            };
            return o0.invoke(((int)((Object[])object0).length), data$getTypedArray$10);
        }
        return null;
    }

    public final boolean t(String s) {
        L.p(s, "key");
        L.y(4, "T");
        return this.u(s, Object.class);
    }

    @Override
    @l
    public String toString() {
        String s = "Data {" + u.m3(this.a.entrySet(), null, null, null, 0, null, androidx.work.Data.toString.1.content.1.e, 0x1F, null) + "}";
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;

        final class androidx.work.Data.toString.1.content.1 extends N implements Function1 {
            public static final androidx.work.Data.toString.1.content.1 e;

            static {
                androidx.work.Data.toString.1.content.1.e = new androidx.work.Data.toString.1.content.1();
            }

            androidx.work.Data.toString.1.content.1() {
                super(1);
            }

            public final CharSequence a(Map.Entry map$Entry0) {
                L.p(map$Entry0, "<name for destructuring parameter 0>");
                String s = (String)map$Entry0.getKey();
                String s1 = map$Entry0.getValue();
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(s);
                stringBuilder0.append(" : ");
                if(s1 instanceof Object[]) {
                    s1 = Arrays.toString(((Object[])s1));
                    L.o(s1, "toString(this)");
                }
                stringBuilder0.append(s1);
                return stringBuilder0.toString();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Map.Entry)object0));
            }
        }

    }

    public final boolean u(@l String s, @l Class class0) {
        L.p(s, "key");
        L.p(class0, "klass");
        Object object0 = this.a.get(s);
        return object0 != null && class0.isAssignableFrom(object0.getClass());
    }

    @RestrictTo({Scope.b})
    @VisibleForTesting
    public final int v() {
        return this.a.size();
    }

    @l
    public final byte[] w() {
        return Data.b.f(this);
    }

    @RestrictTo({Scope.b})
    @k(message = "This is kept for testing migration", replaceWith = @c0(expression = "toByteArrayInternalV1", imports = {}))
    @l
    @n
    public static final byte[] x(@l Data data0) {
        return Data.b.e(data0);
    }

    @RestrictTo({Scope.b})
    @TypeConverter
    @l
    @n
    public static final byte[] y(@l Data data0) {
        return Data.b.f(data0);
    }
}

