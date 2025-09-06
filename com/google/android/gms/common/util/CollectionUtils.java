package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@KeepForSdk
public final class CollectionUtils {
    @KeepForSdk
    public static boolean isEmpty(@Nullable Collection collection0) {
        return collection0 == null ? true : collection0.isEmpty();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static List listOf() {
        return Collections.emptyList();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static List listOf(@NonNull Object object0) {
        return Collections.singletonList(object0);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static List listOf(@NonNull Object[] arr_object) {
        switch(arr_object.length) {
            case 0: {
                return Collections.emptyList();
            }
            case 1: {
                return Collections.singletonList(arr_object[0]);
            }
            default: {
                return DesugarCollections.unmodifiableList(Arrays.asList(arr_object));
            }
        }
    }

    @NonNull
    @KeepForSdk
    public static Map mapOf(@NonNull Object object0, @NonNull Object object1, @NonNull Object object2, @NonNull Object object3, @NonNull Object object4, @NonNull Object object5) {
        Map map0 = CollectionUtils.zza(3, false);
        map0.put(object0, object1);
        map0.put(object2, object3);
        map0.put(object4, object5);
        return DesugarCollections.unmodifiableMap(map0);
    }

    @NonNull
    @KeepForSdk
    public static Map mapOf(@NonNull Object object0, @NonNull Object object1, @NonNull Object object2, @NonNull Object object3, @NonNull Object object4, @NonNull Object object5, @NonNull Object object6, @NonNull Object object7, @NonNull Object object8, @NonNull Object object9, @NonNull Object object10, @NonNull Object object11) {
        Map map0 = CollectionUtils.zza(6, false);
        map0.put(object0, object1);
        map0.put(object2, object3);
        map0.put(object4, object5);
        map0.put(object6, object7);
        map0.put(object8, object9);
        map0.put(object10, object11);
        return DesugarCollections.unmodifiableMap(map0);
    }

    @NonNull
    @KeepForSdk
    public static Map mapOfKeyValueArrays(@NonNull Object[] arr_object, @NonNull Object[] arr_object1) {
        if(arr_object.length == arr_object1.length) {
            switch(arr_object.length) {
                case 0: {
                    return Collections.emptyMap();
                }
                case 1: {
                    return Collections.singletonMap(arr_object[0], arr_object1[0]);
                }
                default: {
                    Map map0 = CollectionUtils.zza(arr_object.length, false);
                    for(int v = 0; v < arr_object.length; ++v) {
                        map0.put(arr_object[v], arr_object1[v]);
                    }
                    return DesugarCollections.unmodifiableMap(map0);
                }
            }
        }
        throw new IllegalArgumentException("Key and values array lengths not equal: " + arr_object.length + " != " + arr_object1.length);
    }

    @NonNull
    @KeepForSdk
    public static Set mutableSetOfWithSize(int v) {
        return v == 0 ? new ArraySet() : CollectionUtils.zzb(v, true);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static Set setOf(@NonNull Object object0, @NonNull Object object1, @NonNull Object object2) {
        Set set0 = CollectionUtils.zzb(3, false);
        set0.add(object0);
        set0.add(object1);
        set0.add(object2);
        return DesugarCollections.unmodifiableSet(set0);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static Set setOf(@NonNull Object[] arr_object) {
        switch(arr_object.length) {
            case 0: {
                return Collections.emptySet();
            }
            case 1: {
                return Collections.singleton(arr_object[0]);
            }
            case 2: {
                Object object0 = arr_object[0];
                Object object1 = arr_object[1];
                Set set1 = CollectionUtils.zzb(2, false);
                set1.add(object0);
                set1.add(object1);
                return DesugarCollections.unmodifiableSet(set1);
            }
            case 3: {
                return CollectionUtils.setOf(arr_object[0], arr_object[1], arr_object[2]);
            }
            case 4: {
                Object object2 = arr_object[0];
                Object object3 = arr_object[1];
                Object object4 = arr_object[2];
                Object object5 = arr_object[3];
                Set set2 = CollectionUtils.zzb(4, false);
                set2.add(object2);
                set2.add(object3);
                set2.add(object4);
                set2.add(object5);
                return DesugarCollections.unmodifiableSet(set2);
            }
            default: {
                Set set0 = CollectionUtils.zzb(arr_object.length, false);
                Collections.addAll(set0, arr_object);
                return DesugarCollections.unmodifiableSet(set0);
            }
        }
    }

    private static Map zza(int v, boolean z) {
        return v <= 0x100 ? new ArrayMap(v) : new HashMap(v, 1.0f);
    }

    private static Set zzb(int v, boolean z) {
        if(v <= (z ? 0x80 : 0x100)) {
            return new ArraySet(v);
        }
        return z ? new HashSet(v, 0.75f) : new HashSet(v, 1.0f);
    }
}

