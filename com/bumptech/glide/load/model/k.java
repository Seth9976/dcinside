package com.bumptech.glide.load.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class k implements i {
    public static final class a {
        private boolean a;
        private Map b;
        private boolean c;
        private static final String d = "User-Agent";
        private static final String e;
        private static final Map f;

        static {
            a.e = "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)";
            HashMap hashMap0 = new HashMap(2);
            if(!TextUtils.isEmpty("Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)")) {
                hashMap0.put("User-Agent", Collections.singletonList(new b("Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)")));
            }
            a.f = DesugarCollections.unmodifiableMap(hashMap0);
        }

        public a() {
            this.a = true;
            this.b = a.f;
            this.c = true;
        }

        public a a(@NonNull String s, @NonNull j j0) {
            if(this.c && "User-Agent".equalsIgnoreCase(s)) {
                return this.h(s, j0);
            }
            this.e();
            this.f(s).add(j0);
            return this;
        }

        public a b(@NonNull String s, @NonNull String s1) {
            return this.a(s, new b(s1));
        }

        public k c() {
            this.a = true;
            return new k(this.b);
        }

        private Map d() {
            Map map0 = new HashMap(this.b.size());
            for(Object object0: this.b.entrySet()) {
                ArrayList arrayList0 = new ArrayList(((Collection)((Map.Entry)object0).getValue()));
                map0.put(((Map.Entry)object0).getKey(), arrayList0);
            }
            return map0;
        }

        private void e() {
            if(this.a) {
                this.a = false;
                this.b = this.d();
            }
        }

        private List f(String s) {
            List list0 = (List)this.b.get(s);
            if(list0 == null) {
                list0 = new ArrayList();
                this.b.put(s, list0);
            }
            return list0;
        }

        @VisibleForTesting
        static String g() {
            if(TextUtils.isEmpty("Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)")) {
                return "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)";
            }
            StringBuilder stringBuilder0 = new StringBuilder(67);
            for(int v = 0; v < 67; ++v) {
                int v1 = "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)".charAt(v);
                if(v1 <= 0x1F && v1 != 9 || v1 >= 0x7F) {
                    stringBuilder0.append('?');
                }
                else {
                    stringBuilder0.append(((char)v1));
                }
            }
            return "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)";
        }

        public a h(@NonNull String s, @Nullable j j0) {
            this.e();
            if(j0 == null) {
                this.b.remove(s);
            }
            else {
                List list0 = this.f(s);
                list0.clear();
                list0.add(j0);
            }
            if(this.c && "User-Agent".equalsIgnoreCase(s)) {
                this.c = false;
            }
            return this;
        }

        public a i(@NonNull String s, @Nullable String s1) {
            return s1 == null ? this.h(s, null) : this.h(s, new b(s1));
        }
    }

    static final class b implements j {
        @NonNull
        private final String a;

        b(@NonNull String s) {
            this.a = s;
        }

        @Override  // com.bumptech.glide.load.model.j
        public String a() {
            return this.a;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof b ? this.a.equals(((b)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        public String toString() {
            return "StringHeaderFactory{value=\'" + this.a + '\'' + '}';
        }
    }

    private final Map c;
    private volatile Map d;

    k(Map map0) {
        this.c = DesugarCollections.unmodifiableMap(map0);
    }

    @Override  // com.bumptech.glide.load.model.i
    public Map H() {
        if(this.d == null) {
            synchronized(this) {
                if(this.d == null) {
                    this.d = DesugarCollections.unmodifiableMap(this.b());
                }
            }
        }
        return this.d;
    }

    @NonNull
    private String a(@NonNull List list0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = ((j)list0.get(v1)).a();
            if(!TextUtils.isEmpty(s)) {
                stringBuilder0.append(s);
                if(v1 != list0.size() - 1) {
                    stringBuilder0.append(',');
                }
            }
        }
        return stringBuilder0.toString();
    }

    private Map b() {
        Map map0 = new HashMap();
        for(Object object0: this.c.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = this.a(((List)map$Entry0.getValue()));
            if(!TextUtils.isEmpty(s)) {
                map0.put(map$Entry0.getKey(), s);
            }
        }
        return map0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof k ? this.c.equals(((k)object0).c) : false;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override
    public String toString() {
        return "LazyHeaders{headers=" + this.c + '}';
    }
}

