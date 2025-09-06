package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import j..time.ZoneOffset;
import j..time.format.DateTimeFormatter;
import j..util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;

class l {
    private final SharedPreferences a;
    private static l b = null;
    private static final String c = "fire-global";
    private static final String d = "FirebaseAppHeartBeat";
    private static final String e = "FirebaseHeartBeat";
    private static final String f = "fire-count";
    private static final String g = "last-used-date";
    private static final int h = 30;

    static {
    }

    public l(Context context0, String s) {
        this.a = context0.getSharedPreferences("FirebaseHeartBeat" + s, 0);
    }

    @RestrictTo({Scope.e})
    @VisibleForTesting
    l(SharedPreferences sharedPreferences0) {
        this.a = sharedPreferences0;
    }

    private void a() {
        synchronized(this) {
            long v1 = this.a.getLong("fire-count", 0L);
            String s = "";
            String s1 = null;
            for(Object object0: this.a.getAll().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() instanceof Set) {
                    for(Object object1: ((Set)map$Entry0.getValue())) {
                        String s2 = (String)object1;
                        if(s1 == null || s1.compareTo(s2) > 0) {
                            s = (String)map$Entry0.getKey();
                            s1 = s2;
                        }
                    }
                }
            }
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet(this.a.getStringSet(s, hashSet0));
            hashSet1.remove(s1);
            this.a.edit().putStringSet(s, hashSet1).putLong("fire-count", v1 - 1L).commit();
        }
    }

    void b() {
        synchronized(this) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.a.edit();
            int v1 = 0;
            for(Object object0: this.a.getAll().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() instanceof Set) {
                    Set set0 = (Set)map$Entry0.getValue();
                    String s = this.d(System.currentTimeMillis());
                    String s1 = (String)map$Entry0.getKey();
                    if(set0.contains(s)) {
                        HashSet hashSet0 = new HashSet();
                        hashSet0.add(s);
                        ++v1;
                        sharedPreferences$Editor0.putStringSet(s1, hashSet0);
                    }
                    else {
                        sharedPreferences$Editor0.remove(s1);
                    }
                }
            }
            if(v1 == 0) {
                sharedPreferences$Editor0.remove("fire-count");
            }
            else {
                sharedPreferences$Editor0.putLong("fire-count", ((long)v1));
            }
            sharedPreferences$Editor0.commit();
        }
    }

    List c() {
        synchronized(this) {
            List list0 = new ArrayList();
            for(Object object0: this.a.getAll().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() instanceof Set) {
                    HashSet hashSet0 = new HashSet(((Set)map$Entry0.getValue()));
                    hashSet0.remove(this.d(System.currentTimeMillis()));
                    if(!hashSet0.isEmpty()) {
                        ((ArrayList)list0).add(m.a(((String)map$Entry0.getKey()), new ArrayList(hashSet0)));
                    }
                }
            }
            this.n(System.currentTimeMillis());
            return list0;
        }
    }

    private String d(long v) {
        synchronized(this) {
            return Build.VERSION.SDK_INT >= 26 ? DateRetargetClass.toInstant(new Date(v)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE) : new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(v));
        }
    }

    @RestrictTo({Scope.e})
    @VisibleForTesting
    int e() {
        return (int)this.a.getLong("fire-count", 0L);
    }

    long f() {
        synchronized(this) {
            return this.a.getLong("fire-global", -1L);
        }
    }

    private String g(String s) {
        synchronized(this) {
            for(Object object0: this.a.getAll().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() instanceof Set) {
                    for(Object object1: ((Set)map$Entry0.getValue())) {
                        if(s.equals(((String)object1))) {
                            return (String)map$Entry0.getKey();
                        }
                        if(false) {
                            break;
                        }
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return null;
        }
    }

    boolean h(long v, long v1) {
        synchronized(this) {
            return this.d(v).equals(this.d(v1));
        }
    }

    void i() {
        synchronized(this) {
            String s = this.d(System.currentTimeMillis());
            this.a.edit().putString("last-used-date", s).commit();
            this.j(s);
        }
    }

    private void j(String s) {
        synchronized(this) {
            String s1 = this.g(s);
            if(s1 == null) {
                return;
            }
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet(this.a.getStringSet(s1, hashSet0));
            hashSet1.remove(s);
            if(hashSet1.isEmpty()) {
                this.a.edit().remove(s1).commit();
            }
            else {
                this.a.edit().putStringSet(s1, hashSet1).commit();
            }
        }
    }

    boolean k(long v) {
        synchronized(this) {
            return this.l("fire-global", v);
        }
    }

    boolean l(String s, long v) {
        synchronized(this) {
            if(this.a.contains(s)) {
                if(!this.h(this.a.getLong(s, -1L), v)) {
                    this.a.edit().putLong(s, v).commit();
                    return true;
                }
                return false;
            }
            this.a.edit().putLong(s, v).commit();
            return true;
        }
    }

    void m(long v, String s) {
        synchronized(this) {
            String s1 = this.d(v);
            if(this.a.getString("last-used-date", "").equals(s1)) {
                String s2 = this.g(s1);
                if(s2 == null) {
                    return;
                }
                if(s2.equals(s)) {
                    return;
                }
                this.o(s, s1);
                return;
            }
            long v2 = this.a.getLong("fire-count", 0L);
            if(v2 + 1L == 30L) {
                this.a();
                v2 = this.a.getLong("fire-count", 0L);
            }
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet(this.a.getStringSet(s, hashSet0));
            hashSet1.add(s1);
            this.a.edit().putStringSet(s, hashSet1).putLong("fire-count", v2 + 1L).putString("last-used-date", s1).commit();
        }
    }

    void n(long v) {
        synchronized(this) {
            this.a.edit().putLong("fire-global", v).commit();
        }
    }

    private void o(String s, String s1) {
        synchronized(this) {
            this.j(s1);
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet(this.a.getStringSet(s, hashSet0));
            hashSet1.add(s1);
            this.a.edit().putStringSet(s, hashSet1).commit();
        }
    }
}

