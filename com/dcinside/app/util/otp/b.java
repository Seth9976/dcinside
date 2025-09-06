package com.dcinside.app.util.otp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.dcinside.app.util.Gk;
import com.google.common.base.H;
import com.google.common.base.P;
import com.google.common.collect.O2;
import com.google.common.collect.z3;
import j..util.Objects;
import java.io.Serializable;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import y4.l;

public class b {
    public static class a extends RuntimeException {
        public a(String s) {
            super(s);
        }

        public a(String s, Exception exception0) {
            super(s, exception0);
        }
    }

    public static class com.dcinside.app.util.otp.b.b extends Exception {
        public com.dcinside.app.util.otp.b.b(String s) {
            super(s);
        }

        public com.dcinside.app.util.otp.b.b(String s, Exception exception0) {
            super(s, exception0);
        }
    }

    static class c extends RuntimeException {
        public c(String s, Exception exception0) {
            super(s, exception0);
        }
    }

    public static class d implements Serializable {
        private final String a;
        private final String b;

        public d(String s, String s1) {
            H.E(s);
            this.a = s;
            this.b = s1;
        }

        public String a() {
            return this.b;
        }

        // 去混淆评级： 低(20)
        public String b() {
            return P.d(this.b) || !this.a.startsWith(this.b + ":") ? this.a.trim() : this.a.substring(this.b.length() + 1).trim();
        }

        @Override
        public boolean equals(Object object0) {
            if(!(object0 instanceof d)) {
                return false;
            }
            boolean z = Objects.equals(this.b, ((d)object0).b);
            return this.a.equals(((d)object0).a) && z;
        }

        public String getName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.b == null ? this.a.hashCode() : (this.a + "|" + this.b).hashCode();
        }

        // 去混淆评级： 低(20)
        @Override
        @l
        public String toString() {
            return P.d(this.b) || this.a.startsWith(this.b + ":") ? this.a : this.b + ":" + this.a;
        }
    }

    public static enum e {
        TOTP(0),
        HOTP(1);

        public final Integer a;

        private e(Integer integer0) {
            this.a = integer0;
        }

        private static e[] a() [...] // Inlined contents

        public static e b(Integer integer0) {
            e[] arr_b$e = e.values();
            for(int v = 0; v < arr_b$e.length; ++v) {
                e b$e0 = arr_b$e[v];
                if(b$e0.a.equals(integer0)) {
                    return b$e0;
                }
            }
            return null;
        }
    }

    @VisibleForTesting
    SQLiteDatabase a;
    public static final Integer b = null;
    public static final String c = "Google Internal 2Factor";
    public static final String d = "Google";
    @VisibleForTesting
    static final String[] e = null;
    @VisibleForTesting
    static final int f = 20;
    @VisibleForTesting
    static final String g = "_id";
    @VisibleForTesting
    static final String h = "email";
    @VisibleForTesting
    static final String i = "secret";
    @VisibleForTesting
    static final String j = "counter";
    @VisibleForTesting
    static final String k = "type";
    @VisibleForTesting
    static final String l = "provider";
    @VisibleForTesting
    static final String m = "issuer";
    @VisibleForTesting
    static final String n = "original_name";
    @VisibleForTesting
    static final String o = "accounts";
    private static final String p = "name";
    @VisibleForTesting
    static final int q = 0;
    @VisibleForTesting
    static final int r = 1;
    private static final int s = -1;
    private static final String t = "GAuthenticator.AcctDb";

    static {
        b.b = 0;
        b.e = new String[]{"Google", "Dropbox"};
    }

    public b(Context context0) {
        SQLiteDatabase sQLiteDatabase0 = this.E(context0);
        this.a = sQLiteDatabase0;
        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS accounts (_id INTEGER PRIMARY KEY, email TEXT NOT NULL, secret TEXT NOT NULL, counter INTEGER DEFAULT 0, type INTEGER, provider INTEGER DEFAULT 0, issuer TEXT DEFAULT NULL, original_name TEXT DEFAULT NULL)");
        Collection collection0 = this.B();
        Locale locale0 = Locale.US;
        if(!collection0.contains("provider")) {
            this.a.execSQL("ALTER TABLE accounts ADD COLUMN provider INTEGER DEFAULT 0");
        }
        if(!collection0.contains("issuer".toLowerCase(locale0))) {
            this.a.execSQL("ALTER TABLE accounts ADD COLUMN issuer TEXT DEFAULT NULL");
            this.c();
        }
        if(!collection0.contains("original_name".toLowerCase(locale0))) {
            this.a.execSQL("ALTER TABLE accounts ADD COLUMN original_name TEXT DEFAULT NULL");
            Log.i("GAuthenticator.AcctDb", "Database upgrade complete. Database consistent: " + this.z());
        }
    }

    public boolean A(d b$d0) {
        if("Google".equalsIgnoreCase(b$d0.a())) {
            return true;
        }
        if(b$d0.a() != null) {
            return false;
        }
        if(b$d0.getName().equals("Google Internal 2Factor")) {
            return true;
        }
        Cursor cursor0 = this.m(b$d0);
        try {
            if(!b.e(cursor0)) {
                cursor0.moveToFirst();
                if(cursor0.getInt(cursor0.getColumnIndex("provider")) == 1) {
                    return true;
                }
            }
        }
        finally {
            b.H(cursor0);
        }
        if(this.r(b$d0) != null) {
            return false;
        }
        String s = b$d0.getName().toLowerCase(Locale.US);
        return s.endsWith("@gmail.com") || s.endsWith("@google.com");
    }

    private Collection B() {
        return b.C(this.a);
    }

    @VisibleForTesting
    static Collection C(SQLiteDatabase sQLiteDatabase0) {
        Cursor cursor0 = sQLiteDatabase0.rawQuery("PRAGMA table_info(accounts)", new String[0]);
        Collection collection0 = z3.q();
        try {
            if(cursor0 != null) {
                int v1 = cursor0.getColumnIndexOrThrow("name");
                while(cursor0.moveToNext()) {
                    collection0.add(cursor0.getString(v1).toLowerCase(Locale.US));
                }
            }
            return collection0;
        }
        finally {
            b.H(cursor0);
        }
    }

    private ContentValues D(String s, e b$e0, Integer integer0, Boolean boolean0) {
        ContentValues contentValues0 = new ContentValues();
        if(s != null) {
            contentValues0.put("secret", s);
        }
        if(b$e0 != null) {
            contentValues0.put("type", b$e0.ordinal());
        }
        if(integer0 != null) {
            contentValues0.put("counter", integer0);
        }
        if(boolean0 != null) {
            contentValues0.put("provider", ((int)boolean0.booleanValue()));
        }
        return contentValues0;
    }

    private SQLiteDatabase E(Context context0) {
        for(int v = 0; true; ++v) {
            try {
                return context0.openOrCreateDatabase("databases", 0, null);
            }
            catch(SQLiteException sQLiteException0) {
            }
            if(v >= 2) {
                break;
            }
        }
        throw new c("Failed to open AccountDb database in three tries.\n" + Gk.l(context0), sQLiteException0);
    }

    public void F(d b$d0, String s) {
        H.E(b$d0);
        H.E(b$d0.getName());
        H.E(s);
        if(b$d0.getName().equals(s)) {
            return;
        }
        if("Google Internal 2Factor".equals(b$d0.getName())) {
            throw new UnsupportedOperationException();
        }
        if(this.x(new d(s, b$d0.a()))) {
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("email", s);
        if(this.a.update("accounts", contentValues0, b.J(b$d0), null) > 1) {
            Log.wtf("GAuthenticator.AcctDb", "Unexpectedly changed multiple rows during rename. Database consistent: " + this.z());
        }
    }

    public void G(d b$d0, d b$d1) throws com.dcinside.app.util.otp.b.b {
        this.a.beginTransaction();
        try {
            int v1 = this.p(b$d0);
            int v2 = this.p(b$d1);
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("_id", -1);
            this.a.updateWithOnConflict("accounts", contentValues0, b.J(b$d1), null, 1);
            ContentValues contentValues1 = new ContentValues();
            contentValues1.put("_id", v2);
            this.a.updateWithOnConflict("accounts", contentValues1, b.J(b$d0), null, 1);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("_id", v1);
            this.a.updateWithOnConflict("accounts", contentValues2, b.J(b$d1), null, 1);
            this.a.setTransactionSuccessful();
        }
        catch(SQLiteException sQLiteException0) {
            throw new com.dcinside.app.util.otp.b.b(String.format("Updating the Id failed for %s and %s", b$d0, b$d1), sQLiteException0);
        }
        finally {
            this.a.endTransaction();
        }
    }

    private static void H(Cursor cursor0) {
        if(cursor0 != null && !cursor0.isClosed()) {
            cursor0.close();
        }
    }

    public boolean I(d b$d0, String s, e b$e0, Integer integer0, Boolean boolean0) {
        H.E(b$d0);
        Log.d("GAuthenticator.AcctDb", "Updating account: " + b$d0);
        ContentValues contentValues0 = this.D(s, b$e0, integer0, boolean0);
        int v = this.a.update("accounts", contentValues0, b.J(b$d0), null);
        if(v > 1) {
            Log.wtf("GAuthenticator.AcctDb", "Unexpectedly changed multiple rows during update. Database consistent: " + this.z());
        }
        return v > 0;
    }

    @VisibleForTesting
    static String J(d b$d0) {
        H.E(b$d0);
        return "email = " + DatabaseUtils.sqlEscapeString(b$d0.getName()) + " AND " + b.K(b$d0.a());
    }

    private static String K(String s) {
        return s == null ? "issuer IS NULL" : "issuer = " + DatabaseUtils.sqlEscapeString(s);
    }

    public d a(String s, String s1, e b$e0, Integer integer0, Boolean boolean0, String s2) {
        H.E(s);
        H.E(s1);
        H.E(b$e0);
        if(s2 != null && s2.length() == 0) {
            s2 = null;
        }
        ContentValues contentValues0 = this.D(s1, b$e0, integer0, boolean0);
        d b$d0 = new d(s, s2);
        Log.i("GAuthenticator.AcctDb", "Adding account: " + b$d0);
        if(s2 != null || s.equals("Google Internal 2Factor")) {
            if(s2 != null) {
                contentValues0.put("issuer", s2);
                d b$d1 = this.l(b$d0);
                if(b$d1 != null) {
                    Log.i("GAuthenticator.AcctDb", "Will overwrite similar account: " + b$d1);
                    b$d0 = b$d1;
                }
            }
            if(this.a.update("accounts", contentValues0, b.J(b$d0), null) == 0) {
                contentValues0.put("email", s);
                contentValues0.put("original_name", s);
                this.a.insert("accounts", null, contentValues0);
            }
            else {
                Log.i("GAuthenticator.AcctDb", "Overwrote existing OTP seed for: " + b$d0);
            }
            if(!b$d0.getName().equals(s)) {
                this.F(b$d0, s);
            }
        }
        else {
            contentValues0.put("email", b$d0.getName());
            contentValues0.put("original_name", b$d0.getName());
            int v = 0;
            while(!this.y(contentValues0)) {
                ++v;
                if(v >= 20) {
                    throw new a("Too many accounts with same name: " + s);
                }
                b$d0 = new d(s + "(" + v + ")", null);
                contentValues0.remove("email");
                contentValues0.put("email", b$d0.getName());
            }
        }
        return b$d0;
    }

    public boolean b(d b$d0) {
        return b$d0.a() != null || b$d0.getName().equals("Google Internal 2Factor") ? this.l(b$d0) != null : false;
    }

    private void c() {
        for(Object object0: this.n()) {
            d b$d0 = (d)object0;
            if(b$d0.a() == null) {
                String[] arr_s = b.e;
                for(int v = 0; v < arr_s.length; ++v) {
                    String s = arr_s[v];
                    if(b$d0.getName().startsWith(s + ":")) {
                        Log.d("GAuthenticator.AcctDb", "Auto-upgrading old-style account: " + b$d0.toString());
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("issuer", s);
                        if(this.a.update("accounts", contentValues0, b.J(b$d0), null) > 1) {
                            Log.wtf("GAuthenticator.AcctDb", "Unexpectedly changed multiple rows while auto-upgrading account: " + b$d0.toString());
                        }
                    }
                }
            }
            else {
                Log.wtf("GAuthenticator.AcctDb", "Existing new-style account detected during account upgrade process: " + b$d0.toString());
            }
        }
    }

    public void d() {
        this.a.close();
    }

    private static boolean e(Cursor cursor0) {
        return cursor0 == null || cursor0.getCount() == 0;
    }

    private static byte[] f(String s) throws com.dcinside.app.util.otp.c.a {
        return com.dcinside.app.util.otp.c.a.a(s);
    }

    public void g(d b$d0) {
        this.a.delete("accounts", b.J(b$d0), null);
        this.a.execSQL("VACUUM");
    }

    @VisibleForTesting
    public boolean h() {
        this.a.delete("accounts", null, null);
        return true;
    }

    @VisibleForTesting
    public static boolean i(Context context0) {
        return context0.deleteDatabase("databases");
    }

    public d j() {
        d b$d0 = new d("Google Internal 2Factor", null);
        return this.x(b$d0) ? b$d0 : null;
    }

    public d k(String s) {
        for(int v = 0; v < 2; ++v) {
            String s1 = new String[]{"", "Google:"}[v];
            d b$d0 = new d(s1 + s, "Google");
            if(this.x(b$d0)) {
                return b$d0;
            }
            for(Object object0: this.n()) {
                d b$d1 = (d)object0;
                if("Google".equals(b$d1.a()) && s.equalsIgnoreCase(s1 + this.r(b$d1))) {
                    return b$d1;
                }
                if(false) {
                    break;
                }
            }
            d b$d2 = new d(s1 + s, null);
            if(this.x(b$d2)) {
                return b$d2;
            }
        }
        return s.toLowerCase(Locale.US).endsWith("@google.com") ? this.j() : null;
    }

    public d l(d b$d0) {
        if(this.x(b$d0)) {
            return b$d0;
        }
        if(b$d0.a() == null) {
            return null;
        }
        Cursor cursor0 = this.q(b$d0.a());
        if(cursor0 == null) {
            b.H(null);
            return null;
        }
        try {
            int v1 = cursor0.getColumnIndex("email");
            while(cursor0.moveToNext()) {
                d b$d1 = new d(cursor0.getString(v1), b$d0.a());
                if(b$d0.b().equals(b$d1.b())) {
                    return b$d1;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
        finally {
            b.H(cursor0);
        }
    }

    private Cursor m(d b$d0) {
        return this.a.query("accounts", null, b.J(b$d0), null, null, null, null);
    }

    public List n() {
        Cursor cursor0 = this.a.query("accounts", null, null, null, null, null, null, null);
        try {
            if(b.e(cursor0)) {
                return O2.A();
            }
            int v1 = cursor0.getCount();
            int v2 = cursor0.getColumnIndex("email");
            int v3 = cursor0.getColumnIndex("issuer");
            com.google.common.collect.O2.a o2$a0 = O2.n();
            for(int v4 = 0; v4 < v1; ++v4) {
                cursor0.moveToPosition(v4);
                o2$a0.j(new d(cursor0.getString(v2), (v3 < 0 ? null : cursor0.getString(v3))));
            }
            return o2$a0.n();
        }
        finally {
            b.H(cursor0);
        }
    }

    public Integer o(d b$d0) {
        Cursor cursor0 = this.m(b$d0);
        try {
            if(!b.e(cursor0)) {
                cursor0.moveToFirst();
                return cursor0.getInt(cursor0.getColumnIndex("counter"));
            }
            return null;
        }
        finally {
            b.H(cursor0);
        }
    }

    @VisibleForTesting
    int p(d b$d0) {
        Cursor cursor0 = this.m(b$d0);
        try {
            if(!b.e(cursor0)) {
                cursor0.moveToFirst();
                return cursor0.getInt(cursor0.getColumnIndex("_id"));
            }
            return -1;
        }
        finally {
            b.H(cursor0);
        }
    }

    private Cursor q(String s) {
        return this.a.query("accounts", null, b.K(s), null, null, null, null);
    }

    public String r(d b$d0) {
        Cursor cursor0 = this.m(b$d0);
        try {
            if(!b.e(cursor0)) {
                cursor0.moveToFirst();
                int v1 = cursor0.getColumnIndex("original_name");
                return v1 < 0 ? null : cursor0.getString(v1);
            }
            return null;
        }
        finally {
            b.H(cursor0);
        }
    }

    public static String s(String s, String s1) {
        return new d(s, s1).toString();
    }

    public String t(d b$d0) {
        Cursor cursor0 = this.m(b$d0);
        try {
            if(!b.e(cursor0)) {
                cursor0.moveToFirst();
                return cursor0.getString(cursor0.getColumnIndex("secret"));
            }
            return null;
        }
        finally {
            b.H(cursor0);
        }
    }

    public static com.dcinside.app.util.otp.g.a u(String s) {
        try {
            byte[] arr_b = b.f(s);
            Mac mac0 = Mac.getInstance("HMACSHA1");
            mac0.init(new SecretKeySpec(arr_b, ""));
            return new com.dcinside.app.util.otp.a(mac0);
        }
        catch(com.dcinside.app.util.otp.c.a | NoSuchAlgorithmException | InvalidKeyException | IllegalArgumentException c$a0) {
            String s1 = c$a0.getMessage();
            Objects.requireNonNull(s1);
            Log.e("GAuthenticator.AcctDb", s1);
            return null;
        }
    }

    public e v(d b$d0) {
        Cursor cursor0 = this.m(b$d0);
        try {
            if(!b.e(cursor0)) {
                cursor0.moveToFirst();
                return e.b(cursor0.getInt(cursor0.getColumnIndex("type")));
            }
            return null;
        }
        finally {
            b.H(cursor0);
        }
    }

    public void w(d b$d0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("counter", ((int)(((int)this.o(b$d0)) + 1)));
        this.a.update("accounts", contentValues0, b.J(b$d0), null);
    }

    public boolean x(d b$d0) {
        Cursor cursor0 = this.m(b$d0);
        try {
            boolean z = b.e(cursor0);
            return !z;
        }
        finally {
            b.H(cursor0);
        }
    }

    private boolean y(ContentValues contentValues0) {
        H.E(contentValues0);
        H.E(contentValues0.get("email"));
        return this.x(new d(((String)contentValues0.get("email")), ((String)contentValues0.get("issuer")))) ? false : this.a.insert("accounts", null, contentValues0) != -1L;
    }

    @VisibleForTesting
    boolean z() {
        boolean z;
        Collection collection0 = this.B();
        if(8 < collection0.size()) {
            Log.w("GAuthenticator.AcctDb", "Database has extra columns");
        }
        if(8 > collection0.size()) {
            Log.e("GAuthenticator.AcctDb", "Database is missing columns");
            z = false;
        }
        else {
            z = true;
        }
        for(int v = 0; v < 8; ++v) {
            String s = new String[]{"_id", "email", "secret", "counter", "type", "provider", "issuer", "original_name"}[v];
            if(!collection0.contains(s.toLowerCase(Locale.US))) {
                Log.e("GAuthenticator.AcctDb", "Database is missing column: " + s);
                z = false;
            }
        }
        for(Object object0: this.n()) {
            d b$d0 = (d)object0;
            Cursor cursor0 = this.a.query("accounts", null, b.J(b$d0), null, null, null, null);
            try {
                if(cursor0 == null) {
                    Log.e("GAuthenticator.AcctDb", "Failed to get a cursor for account: " + b$d0.toString());
                    goto label_23;
                }
                goto label_26;
            }
            catch(Throwable throwable0) {
                b.H(cursor0);
                throw throwable0;
            }
        label_23:
            b.H(null);
            z = false;
            continue;
            try {
            label_26:
                if(cursor0.getCount() != 1) {
                    Log.e("GAuthenticator.AcctDb", "Multiple copies detected for account: " + b$d0.toString());
                    z = false;
                }
            }
            catch(Throwable throwable0) {
                b.H(cursor0);
                throw throwable0;
            }
            b.H(cursor0);
        }
        return z;
    }
}

