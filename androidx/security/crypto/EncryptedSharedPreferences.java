package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import com.google.crypto.tink.aead.a;
import com.google.crypto.tink.b;
import com.google.crypto.tink.i;
import com.google.crypto.tink.subtle.g;
import com.google.crypto.tink.t;
import com.google.crypto.tink.u;
import com.google.crypto.tink.w;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class EncryptedSharedPreferences implements SharedPreferences {
    static final class Editor implements SharedPreferences.Editor {
        private final EncryptedSharedPreferences a;
        private final SharedPreferences.Editor b;
        private final List c;
        private final AtomicBoolean d;

        Editor(EncryptedSharedPreferences encryptedSharedPreferences0, SharedPreferences.Editor sharedPreferences$Editor0) {
            this.d = new AtomicBoolean(false);
            this.a = encryptedSharedPreferences0;
            this.b = sharedPreferences$Editor0;
            this.c = new CopyOnWriteArrayList();
        }

        private void a() {
            if(this.d.getAndSet(false)) {
                for(Object object0: this.a.getAll().keySet()) {
                    String s = (String)object0;
                    if(!this.c.contains(s) && !this.a.g(s)) {
                        String s1 = this.a.d(s);
                        this.b.remove(s1);
                    }
                }
            }
        }

        @Override  // android.content.SharedPreferences$Editor
        public void apply() {
            this.a();
            this.b.apply();
            this.b();
            this.c.clear();
        }

        private void b() {
            for(Object object0: this.a.b) {
                SharedPreferences.OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener0 = (SharedPreferences.OnSharedPreferenceChangeListener)object0;
                for(Object object1: this.c) {
                    sharedPreferences$OnSharedPreferenceChangeListener0.onSharedPreferenceChanged(this.a, ((String)object1));
                }
            }
        }

        private void c(String s, byte[] arr_b) {
            if(!this.a.g(s)) {
                this.c.add(s);
                if(s == null) {
                    s = "__NULL__";
                }
                try {
                    Pair pair0 = this.a.e(s, arr_b);
                    this.b.putString(((String)pair0.first), ((String)pair0.second));
                    return;
                }
                catch(GeneralSecurityException generalSecurityException0) {
                    throw new SecurityException("Could not encrypt data: " + generalSecurityException0.getMessage(), generalSecurityException0);
                }
            }
            throw new SecurityException(s + " is a reserved key for the encryption keyset.");
        }

        @Override  // android.content.SharedPreferences$Editor
        @NonNull
        public SharedPreferences.Editor clear() {
            this.d.set(true);
            return this;
        }

        @Override  // android.content.SharedPreferences$Editor
        public boolean commit() {
            this.a();
            try {
                return this.b.commit();
            }
            finally {
                this.b();
                this.c.clear();
            }
        }

        @Override  // android.content.SharedPreferences$Editor
        @NonNull
        public SharedPreferences.Editor putBoolean(@Nullable String s, boolean z) {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(5);
            byteBuffer0.putInt(EncryptedType.g.c());
            byteBuffer0.put(((byte)z));
            this.c(s, byteBuffer0.array());
            return this;
        }

        @Override  // android.content.SharedPreferences$Editor
        @NonNull
        public SharedPreferences.Editor putFloat(@Nullable String s, float f) {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
            byteBuffer0.putInt(EncryptedType.f.c());
            byteBuffer0.putFloat(f);
            this.c(s, byteBuffer0.array());
            return this;
        }

        @Override  // android.content.SharedPreferences$Editor
        @NonNull
        public SharedPreferences.Editor putInt(@Nullable String s, int v) {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
            byteBuffer0.putInt(EncryptedType.d.c());
            byteBuffer0.putInt(v);
            this.c(s, byteBuffer0.array());
            return this;
        }

        @Override  // android.content.SharedPreferences$Editor
        @NonNull
        public SharedPreferences.Editor putLong(@Nullable String s, long v) {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(12);
            byteBuffer0.putInt(EncryptedType.e.c());
            byteBuffer0.putLong(v);
            this.c(s, byteBuffer0.array());
            return this;
        }

        @Override  // android.content.SharedPreferences$Editor
        @NonNull
        public SharedPreferences.Editor putString(@Nullable String s, @Nullable String s1) {
            if(s1 == null) {
                s1 = "__NULL__";
            }
            byte[] arr_b = s1.getBytes(StandardCharsets.UTF_8);
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b.length + 8);
            byteBuffer0.putInt(EncryptedType.b.c());
            byteBuffer0.putInt(arr_b.length);
            byteBuffer0.put(arr_b);
            this.c(s, byteBuffer0.array());
            return this;
        }

        @Override  // android.content.SharedPreferences$Editor
        @NonNull
        public SharedPreferences.Editor putStringSet(@Nullable String s, @Nullable Set set0) {
            if(set0 == null) {
                set0 = new ArraySet();
                set0.add("__NULL__");
            }
            ArrayList arrayList0 = new ArrayList(set0.size());
            int v = set0.size() * 4;
            for(Object object0: set0) {
                byte[] arr_b = ((String)object0).getBytes(StandardCharsets.UTF_8);
                arrayList0.add(arr_b);
                v += arr_b.length;
            }
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(v + 4);
            byteBuffer0.putInt(EncryptedType.c.c());
            for(Object object1: arrayList0) {
                byteBuffer0.putInt(((byte[])object1).length);
                byteBuffer0.put(((byte[])object1));
            }
            this.c(s, byteBuffer0.array());
            return this;
        }

        @Override  // android.content.SharedPreferences$Editor
        @NonNull
        public SharedPreferences.Editor remove(@Nullable String s) {
            if(this.a.g(s)) {
                throw new SecurityException(s + " is a reserved key for the encryption keyset.");
            }
            String s1 = this.a.d(s);
            this.b.remove(s1);
            this.c.add(s);
            return this;
        }
    }

    static enum EncryptedType {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);

        private final int a;

        private EncryptedType(int v1) {
            this.a = v1;
        }

        private static EncryptedType[] a() [...] // Inlined contents

        @Nullable
        public static EncryptedType b(int v) {
            switch(v) {
                case 0: {
                    return EncryptedType.b;
                }
                case 1: {
                    return EncryptedType.c;
                }
                case 2: {
                    return EncryptedType.d;
                }
                case 3: {
                    return EncryptedType.e;
                }
                case 4: {
                    return EncryptedType.f;
                }
                case 5: {
                    return EncryptedType.g;
                }
                default: {
                    return null;
                }
            }
        }

        public int c() {
            return this.a;
        }
    }

    public static enum PrefKeyEncryptionScheme {
        AES256_SIV("AES256_SIV");

        private final String a;

        private PrefKeyEncryptionScheme(String s1) {
            this.a = s1;
        }

        private static PrefKeyEncryptionScheme[] a() [...] // Inlined contents

        t b() throws GeneralSecurityException {
            return u.a(this.a);
        }
    }

    public static enum PrefValueEncryptionScheme {
        AES256_GCM("AES256_GCM");

        private final String a;

        private PrefValueEncryptionScheme(String s1) {
            this.a = s1;
        }

        private static PrefValueEncryptionScheme[] a() [...] // Inlined contents

        t b() throws GeneralSecurityException {
            return u.a(this.a);
        }
    }

    final SharedPreferences a;
    final CopyOnWriteArrayList b;
    final String c;
    final String d;
    final b e;
    final i f;
    private static final String g = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
    private static final String h = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
    private static final String i = "__NULL__";

    EncryptedSharedPreferences(@NonNull String s, @NonNull String s1, @NonNull SharedPreferences sharedPreferences0, @NonNull b b0, @NonNull i i0) {
        this.c = s;
        this.a = sharedPreferences0;
        this.d = s1;
        this.e = b0;
        this.f = i0;
        this.b = new CopyOnWriteArrayList();
    }

    @NonNull
    public static SharedPreferences a(@NonNull Context context0, @NonNull String s, @NonNull MasterKey masterKey0, @NonNull PrefKeyEncryptionScheme encryptedSharedPreferences$PrefKeyEncryptionScheme0, @NonNull PrefValueEncryptionScheme encryptedSharedPreferences$PrefValueEncryptionScheme0) throws GeneralSecurityException, IOException {
        return EncryptedSharedPreferences.b(s, masterKey0.b(), context0, encryptedSharedPreferences$PrefKeyEncryptionScheme0, encryptedSharedPreferences$PrefValueEncryptionScheme0);
    }

    @NonNull
    @Deprecated
    public static SharedPreferences b(@NonNull String s, @NonNull String s1, @NonNull Context context0, @NonNull PrefKeyEncryptionScheme encryptedSharedPreferences$PrefKeyEncryptionScheme0, @NonNull PrefValueEncryptionScheme encryptedSharedPreferences$PrefValueEncryptionScheme0) throws GeneralSecurityException, IOException {
        com.google.crypto.tink.daead.b.b();
        a.b();
        Context context1 = context0.getApplicationContext();
        w w0 = new com.google.crypto.tink.integration.android.a.b().m(encryptedSharedPreferences$PrefKeyEncryptionScheme0.b()).p(context1, "__androidx_security_crypto_encrypted_prefs_key_keyset__", s).o("android-keystore://" + s1).f().l();
        w w1 = new com.google.crypto.tink.integration.android.a.b().m(encryptedSharedPreferences$PrefValueEncryptionScheme0.b()).p(context1, "__androidx_security_crypto_encrypted_prefs_value_keyset__", s).o("android-keystore://" + s1).f().l();
        Object object0 = w0.y(i.class);
        Object object1 = w1.y(b.class);
        return new EncryptedSharedPreferences(s, s1, context1.getSharedPreferences(s, 0), ((b)object1), ((i)object0));
    }

    String c(String s) {
        try {
            byte[] arr_b = g.b(s, 0);
            String s1 = new String(this.f.a(arr_b, this.c.getBytes()), StandardCharsets.UTF_8);
            return s1.equals("__NULL__") ? null : s1;
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new SecurityException("Could not decrypt key. " + generalSecurityException0.getMessage(), generalSecurityException0);
        }
    }

    @Override  // android.content.SharedPreferences
    public boolean contains(@Nullable String s) {
        if(this.g(s)) {
            throw new SecurityException(s + " is a reserved key for the encryption keyset.");
        }
        String s1 = this.d(s);
        return this.a.contains(s1);
    }

    String d(String s) {
        if(s == null) {
            s = "__NULL__";
        }
        try {
            return g.e(this.f.b(s.getBytes(StandardCharsets.UTF_8), this.c.getBytes()));
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new SecurityException("Could not encrypt key. " + generalSecurityException0.getMessage(), generalSecurityException0);
        }
    }

    Pair e(String s, byte[] arr_b) throws GeneralSecurityException {
        String s1 = this.d(s);
        return new Pair(s1, g.e(this.e.a(arr_b, s1.getBytes(StandardCharsets.UTF_8))));
    }

    @Override  // android.content.SharedPreferences
    @NonNull
    public SharedPreferences.Editor edit() {
        return new Editor(this, this.a.edit());
    }

    private Object f(String s) throws SecurityException {
        if(this.g(s)) {
            throw new SecurityException(s + " is a reserved key for the encryption keyset.");
        }
        if(s == null) {
            s = "__NULL__";
        }
        try {
            String s1 = this.d(s);
            String s2 = this.a.getString(s1, null);
            if(s2 == null) {
                return null;
            }
            boolean z = false;
            byte[] arr_b = g.b(s2, 0);
            Charset charset0 = StandardCharsets.UTF_8;
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.e.b(arr_b, s1.getBytes(charset0)));
            byteBuffer0.position(0);
            int v = byteBuffer0.getInt();
            EncryptedType encryptedSharedPreferences$EncryptedType0 = EncryptedType.b(v);
            if(encryptedSharedPreferences$EncryptedType0 != null) {
                switch(encryptedSharedPreferences$EncryptedType0) {
                    case 1: {
                        int v1 = byteBuffer0.getInt();
                        ByteBuffer byteBuffer1 = byteBuffer0.slice();
                        byteBuffer0.limit(v1);
                        String s3 = charset0.decode(byteBuffer1).toString();
                        return s3.equals("__NULL__") ? null : s3;
                    }
                    case 2: {
                        return byteBuffer0.getInt();
                    }
                    case 3: {
                        return byteBuffer0.getLong();
                    }
                    case 4: {
                        return byteBuffer0.getFloat();
                    }
                    case 5: {
                        if(byteBuffer0.get() != 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    case 6: {
                        ArraySet arraySet0 = new ArraySet();
                        while(byteBuffer0.hasRemaining()) {
                            int v2 = byteBuffer0.getInt();
                            ByteBuffer byteBuffer2 = byteBuffer0.slice();
                            byteBuffer2.limit(v2);
                            byteBuffer0.position(byteBuffer0.position() + v2);
                            arraySet0.add(StandardCharsets.UTF_8.decode(byteBuffer2).toString());
                        }
                        return arraySet0.size() == 1 && "__NULL__".equals(arraySet0.o(0)) ? null : arraySet0;
                    }
                    default: {
                        throw new SecurityException("Unhandled type for encrypted pref value: " + encryptedSharedPreferences$EncryptedType0);
                    }
                }
            }
            throw new SecurityException("Unknown type ID for encrypted pref value: " + v);
        }
        catch(GeneralSecurityException generalSecurityException0) {
        }
        throw new SecurityException("Could not decrypt value. " + generalSecurityException0.getMessage(), generalSecurityException0);
    }

    // 去混淆评级： 低(20)
    boolean g(String s) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(s) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(s);
    }

    @Override  // android.content.SharedPreferences
    @NonNull
    public Map getAll() {
        Map map0 = new HashMap();
        for(Object object0: this.a.getAll().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(!this.g(((String)map$Entry0.getKey()))) {
                String s = this.c(((String)map$Entry0.getKey()));
                map0.put(s, this.f(s));
            }
        }
        return map0;
    }

    @Override  // android.content.SharedPreferences
    public boolean getBoolean(@Nullable String s, boolean z) {
        Object object0 = this.f(s);
        return object0 instanceof Boolean ? ((Boolean)object0).booleanValue() : z;
    }

    @Override  // android.content.SharedPreferences
    public float getFloat(@Nullable String s, float f) {
        Object object0 = this.f(s);
        return object0 instanceof Float ? ((float)(((Float)object0))) : f;
    }

    @Override  // android.content.SharedPreferences
    public int getInt(@Nullable String s, int v) {
        Object object0 = this.f(s);
        return object0 instanceof Integer ? ((int)(((Integer)object0))) : v;
    }

    @Override  // android.content.SharedPreferences
    public long getLong(@Nullable String s, long v) {
        Object object0 = this.f(s);
        return object0 instanceof Long ? ((long)(((Long)object0))) : v;
    }

    @Override  // android.content.SharedPreferences
    @Nullable
    public String getString(@Nullable String s, @Nullable String s1) {
        Object object0 = this.f(s);
        return object0 instanceof String ? ((String)object0) : s1;
    }

    @Override  // android.content.SharedPreferences
    @Nullable
    public Set getStringSet(@Nullable String s, @Nullable Set set0) {
        Set set1;
        Object object0 = this.f(s);
        if(object0 instanceof Set) {
            set1 = (Set)object0;
            return set1.size() <= 0 ? set0 : set1;
        }
        set1 = new ArraySet();
        return set1.size() <= 0 ? set0 : set1;
    }

    @Override  // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(@NonNull SharedPreferences.OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener0) {
        this.b.add(sharedPreferences$OnSharedPreferenceChangeListener0);
    }

    @Override  // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(@NonNull SharedPreferences.OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener0) {
        this.b.remove(sharedPreferences$OnSharedPreferenceChangeListener0);
    }
}

