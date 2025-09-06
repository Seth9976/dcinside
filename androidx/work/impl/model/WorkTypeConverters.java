package androidx.work.impl.model;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.room.TypeConverter;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints.ContentUriTrigger;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo.State;
import androidx.work.impl.utils.NetworkRequest28;
import androidx.work.impl.utils.NetworkRequestCompat;
import androidx.work.impl.utils.NetworkRequestCompatKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.J;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.n;

@s0({"SMAP\nWorkTypeConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkTypeConverters.kt\nandroidx/work/impl/model/WorkTypeConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,315:1\n1#2:316\n13600#3,2:317\n13600#3,2:319\n*S KotlinDebug\n*F\n+ 1 WorkTypeConverters.kt\nandroidx/work/impl/model/WorkTypeConverters\n*L\n307#1:317,2\n309#1:319,2\n*E\n"})
public final class WorkTypeConverters {
    static final class BackoffPolicyIds {
        @l
        public static final BackoffPolicyIds a = null;
        public static final int b = 0;
        public static final int c = 1;

        static {
            BackoffPolicyIds.a = new BackoffPolicyIds();
        }
    }

    static final class NetworkTypeIds {
        @l
        public static final NetworkTypeIds a = null;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        public static final int e = 3;
        public static final int f = 4;
        public static final int g = 5;

        static {
            NetworkTypeIds.a = new NetworkTypeIds();
        }
    }

    static final class OutOfPolicyIds {
        @l
        public static final OutOfPolicyIds a = null;
        public static final int b = 0;
        public static final int c = 1;

        static {
            OutOfPolicyIds.a = new OutOfPolicyIds();
        }
    }

    public static final class StateIds {
        @l
        public static final StateIds a = null;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        public static final int e = 3;
        public static final int f = 4;
        public static final int g = 5;
        @l
        public static final String h = "(2, 3, 5)";

        static {
            StateIds.a = new StateIds();
        }
    }

    public final class WhenMappings {
        public static final int[] a;
        public static final int[] b;
        public static final int[] c;
        public static final int[] d;

        static {
            int[] arr_v = new int[State.values().length];
            try {
                arr_v[State.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[State.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[State.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[State.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[State.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[State.f.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
            int[] arr_v1 = new int[BackoffPolicy.values().length];
            try {
                arr_v1[BackoffPolicy.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[BackoffPolicy.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.b = arr_v1;
            int[] arr_v2 = new int[NetworkType.values().length];
            try {
                arr_v2[NetworkType.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[NetworkType.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[NetworkType.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[NetworkType.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[NetworkType.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.c = arr_v2;
            int[] arr_v3 = new int[OutOfQuotaPolicy.values().length];
            try {
                arr_v3[OutOfQuotaPolicy.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v3[OutOfQuotaPolicy.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.d = arr_v3;
        }
    }

    @l
    public static final WorkTypeConverters a;

    static {
        WorkTypeConverters.a = new WorkTypeConverters();
    }

    @TypeConverter
    @n
    public static final int a(@l BackoffPolicy backoffPolicy0) {
        L.p(backoffPolicy0, "backoffPolicy");
        switch(backoffPolicy0) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            default: {
                throw new J();
            }
        }
    }

    @TypeConverter
    @l
    @n
    public static final Set b(@l byte[] arr_b) {
        ObjectInputStream objectInputStream0;
        L.p(arr_b, "bytes");
        Set set0 = new LinkedHashSet();
        if(arr_b.length == 0) {
            return set0;
        }
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
        try {
            objectInputStream0 = new ObjectInputStream(byteArrayInputStream0);
        }
        catch(IOException iOException0) {
            goto label_23;
        }
        catch(Throwable throwable0) {
            c.a(byteArrayInputStream0, throwable0);
            throw throwable0;
        }
        try {
            int v = objectInputStream0.readInt();
            int v1 = 0;
            while(true) {
                if(v1 >= v) {
                    goto label_20;
                }
                Uri uri0 = Uri.parse(objectInputStream0.readUTF());
                boolean z = objectInputStream0.readBoolean();
                L.o(uri0, "uri");
                set0.add(new ContentUriTrigger(uri0, z));
                ++v1;
            }
        }
        catch(Throwable throwable1) {
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            try {
                try {
                    c.a(objectInputStream0, throwable1);
                    throw throwable2;
                label_20:
                    c.a(objectInputStream0, null);
                }
                catch(IOException iOException0) {
                label_23:
                    iOException0.printStackTrace();
                }
                goto label_28;
            }
            catch(Throwable throwable0) {
            }
        }
        c.a(byteArrayInputStream0, throwable0);
        throw throwable0;
    label_28:
        c.a(byteArrayInputStream0, null);
        return set0;
    }

    @TypeConverter
    @l
    @n
    public static final byte[] c(@l NetworkRequestCompat networkRequestCompat0) {
        ObjectOutputStream objectOutputStream0;
        L.p(networkRequestCompat0, "requestCompat");
        int v = 0;
        if(Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest0 = networkRequestCompat0.e();
        if(networkRequest0 == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
        }
        catch(Throwable throwable0) {
            c.a(byteArrayOutputStream0, throwable0);
            throw throwable0;
        }
        try {
            int[] arr_v = NetworkRequestCompatKt.b(networkRequest0);
            int[] arr_v1 = NetworkRequestCompatKt.a(networkRequest0);
            objectOutputStream0.writeInt(arr_v.length);
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                objectOutputStream0.writeInt(arr_v[v1]);
            }
            objectOutputStream0.writeInt(arr_v1.length);
            while(true) {
                if(v >= arr_v1.length) {
                    goto label_27;
                }
                objectOutputStream0.writeInt(arr_v1[v]);
                ++v;
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
            label_27:
                c.a(objectOutputStream0, null);
                goto label_32;
            }
            catch(Throwable throwable0) {
            }
        }
        c.a(byteArrayOutputStream0, throwable0);
        throw throwable0;
    label_32:
        c.a(byteArrayOutputStream0, null);
        byte[] arr_b = byteArrayOutputStream0.toByteArray();
        L.o(arr_b, "outputStream.toByteArray()");
        return arr_b;
    }

    @TypeConverter
    @l
    @n
    public static final BackoffPolicy d(int v) {
        switch(v) {
            case 0: {
                return BackoffPolicy.a;
            }
            case 1: {
                return BackoffPolicy.b;
            }
            default: {
                throw new IllegalArgumentException("Could not convert " + v + " to BackoffPolicy");
            }
        }
    }

    @TypeConverter
    @l
    @n
    public static final NetworkType e(int v) {
        switch(v) {
            case 0: {
                return NetworkType.a;
            }
            case 1: {
                return NetworkType.b;
            }
            case 2: {
                return NetworkType.c;
            }
            case 3: {
                return NetworkType.d;
            }
            case 4: {
                return NetworkType.e;
            }
            default: {
                if(Build.VERSION.SDK_INT < 30 || v != 5) {
                    throw new IllegalArgumentException("Could not convert " + v + " to NetworkType");
                }
                return NetworkType.f;
            }
        }
    }

    @TypeConverter
    @l
    @n
    public static final OutOfQuotaPolicy f(int v) {
        switch(v) {
            case 0: {
                return OutOfQuotaPolicy.a;
            }
            case 1: {
                return OutOfQuotaPolicy.b;
            }
            default: {
                throw new IllegalArgumentException("Could not convert " + v + " to OutOfQuotaPolicy");
            }
        }
    }

    @TypeConverter
    @l
    @n
    public static final State g(int v) {
        switch(v) {
            case 0: {
                return State.a;
            }
            case 1: {
                return State.b;
            }
            case 2: {
                return State.c;
            }
            case 3: {
                return State.d;
            }
            case 4: {
                return State.e;
            }
            case 5: {
                return State.f;
            }
            default: {
                throw new IllegalArgumentException("Could not convert " + v + " to State");
            }
        }
    }

    @TypeConverter
    @n
    public static final int h(@l NetworkType networkType0) {
        L.p(networkType0, "networkType");
        int v = WhenMappings.c[networkType0.ordinal()];
        int v1 = 1;
        switch(v) {
            case 1: {
                return 0;
            label_6:
                v1 = 3;
                switch(v) {
                    case 3: {
                        return 2;
                    label_10:
                        if(v != 5) {
                            if(Build.VERSION.SDK_INT < 30 || networkType0 != NetworkType.f) {
                                throw new IllegalArgumentException("Could not convert " + networkType0 + " to int");
                            }
                            return v1;
                        }
                        return 4;
                    }
                    case 4: {
                        return v1;
                    }
                    default: {
                        goto label_10;
                    }
                }
            }
            case 2: {
                return v1;
            }
            default: {
                goto label_6;
            }
        }
    }

    @TypeConverter
    @n
    public static final int i(@l OutOfQuotaPolicy outOfQuotaPolicy0) {
        L.p(outOfQuotaPolicy0, "policy");
        switch(outOfQuotaPolicy0) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            default: {
                throw new J();
            }
        }
    }

    @TypeConverter
    @l
    @n
    public static final byte[] j(@l Set set0) {
        ObjectOutputStream objectOutputStream0;
        L.p(set0, "triggers");
        if(set0.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
        }
        catch(Throwable throwable0) {
            c.a(byteArrayOutputStream0, throwable0);
            throw throwable0;
        }
        try {
            objectOutputStream0.writeInt(set0.size());
            Iterator iterator0 = set0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    goto label_17;
                }
                Object object0 = iterator0.next();
                objectOutputStream0.writeUTF(((ContentUriTrigger)object0).a().toString());
                objectOutputStream0.writeBoolean(((ContentUriTrigger)object0).b());
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
        c.a(byteArrayOutputStream0, throwable0);
        throw throwable0;
    label_22:
        c.a(byteArrayOutputStream0, null);
        byte[] arr_b = byteArrayOutputStream0.toByteArray();
        L.o(arr_b, "outputStream.toByteArray()");
        return arr_b;
    }

    @TypeConverter
    @n
    public static final int k(@l State workInfo$State0) {
        L.p(workInfo$State0, "state");
        switch(workInfo$State0) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 2;
            }
            case 4: {
                return 3;
            }
            case 5: {
                return 4;
            }
            case 6: {
                return 5;
            }
            default: {
                throw new J();
            }
        }
    }

    @TypeConverter
    @l
    @n
    public static final NetworkRequestCompat l(@l byte[] arr_b) {
        NetworkRequestCompat networkRequestCompat0;
        ObjectInputStream objectInputStream0;
        L.p(arr_b, "bytes");
        if(Build.VERSION.SDK_INT >= 28 && arr_b.length != 0) {
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
            try {
                objectInputStream0 = new ObjectInputStream(byteArrayInputStream0);
            }
            catch(Throwable throwable0) {
                c.a(byteArrayInputStream0, throwable0);
                throw throwable0;
            }
            try {
                int v = objectInputStream0.readInt();
                int[] arr_v = new int[v];
                for(int v2 = 0; v2 < v; ++v2) {
                    arr_v[v2] = objectInputStream0.readInt();
                }
                int v3 = objectInputStream0.readInt();
                int[] arr_v1 = new int[v3];
                for(int v1 = 0; v1 < v3; ++v1) {
                    arr_v1[v1] = objectInputStream0.readInt();
                }
                networkRequestCompat0 = NetworkRequest28.a.b(arr_v1, arr_v);
                goto label_25;
            }
            catch(Throwable throwable1) {
            }
            try {
                throw throwable1;
            }
            catch(Throwable throwable2) {
                try {
                    c.a(objectInputStream0, throwable1);
                    throw throwable2;
                label_25:
                    c.a(objectInputStream0, null);
                    goto label_30;
                }
                catch(Throwable throwable0) {
                }
            }
            c.a(byteArrayInputStream0, throwable0);
            throw throwable0;
        label_30:
            c.a(byteArrayInputStream0, null);
            return networkRequestCompat0;
        }
        return new NetworkRequestCompat(null);
    }
}

