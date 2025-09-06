package androidx.core.app;

import android.app.Person.Builder;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import j..util.Objects;

public class Person {
    @RequiresApi(22)
    static class Api22Impl {
        static Person a(PersistableBundle persistableBundle0) {
            return new Builder().f(persistableBundle0.getString("name")).g(persistableBundle0.getString("uri")).e(persistableBundle0.getString("key")).b(persistableBundle0.getBoolean("isBot")).d(persistableBundle0.getBoolean("isImportant")).a();
        }

        static PersistableBundle b(Person person0) {
            PersistableBundle persistableBundle0 = new PersistableBundle();
            persistableBundle0.putString("name", (person0.a == null ? null : person0.a.toString()));
            persistableBundle0.putString("uri", person0.c);
            persistableBundle0.putString("key", person0.d);
            persistableBundle0.putBoolean("isBot", person0.e);
            persistableBundle0.putBoolean("isImportant", person0.f);
            return persistableBundle0;
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        static Person a(android.app.Person person0) {
            Builder person$Builder0 = new Builder().f(person0.getName());
            return person0.getIcon() == null ? person$Builder0.c(null).g(person0.getUri()).e(person0.getKey()).b(person0.isBot()).d(person0.isImportant()).a() : person$Builder0.c(IconCompat.h(person0.getIcon())).g(person0.getUri()).e(person0.getKey()).b(person0.isBot()).d(person0.isImportant()).a();
        }

        static android.app.Person b(Person person0) {
            Person.Builder person$Builder0 = new Person.Builder().setName(person0.f());
            return person0.d() == null ? person$Builder0.setIcon(null).setUri(person0.g()).setKey(person0.e()).setBot(person0.h()).setImportant(person0.i()).build() : person$Builder0.setIcon(person0.d().H()).setUri(person0.g()).setKey(person0.e()).setBot(person0.h()).setImportant(person0.i()).build();
        }
    }

    public static class Builder {
        CharSequence a;
        IconCompat b;
        String c;
        String d;
        boolean e;
        boolean f;

        public Builder() {
        }

        Builder(Person person0) {
            this.a = person0.a;
            this.b = person0.b;
            this.c = person0.c;
            this.d = person0.d;
            this.e = person0.e;
            this.f = person0.f;
        }

        public Person a() {
            return new Person(this);
        }

        public Builder b(boolean z) {
            this.e = z;
            return this;
        }

        public Builder c(IconCompat iconCompat0) {
            this.b = iconCompat0;
            return this;
        }

        public Builder d(boolean z) {
            this.f = z;
            return this;
        }

        public Builder e(String s) {
            this.d = s;
            return this;
        }

        public Builder f(CharSequence charSequence0) {
            this.a = charSequence0;
            return this;
        }

        public Builder g(String s) {
            this.c = s;
            return this;
        }
    }

    CharSequence a;
    IconCompat b;
    String c;
    String d;
    boolean e;
    boolean f;
    private static final String g = "name";
    private static final String h = "icon";
    private static final String i = "uri";
    private static final String j = "key";
    private static final String k = "isBot";
    private static final String l = "isImportant";

    Person(Builder person$Builder0) {
        this.a = person$Builder0.a;
        this.b = person$Builder0.b;
        this.c = person$Builder0.c;
        this.d = person$Builder0.d;
        this.e = person$Builder0.e;
        this.f = person$Builder0.f;
    }

    @RequiresApi(28)
    @RestrictTo({Scope.c})
    public static Person a(android.app.Person person0) {
        return Api28Impl.a(person0);
    }

    public static Person b(Bundle bundle0) {
        Bundle bundle1 = bundle0.getBundle("icon");
        Builder person$Builder0 = new Builder().f(bundle0.getCharSequence("name"));
        return bundle1 == null ? person$Builder0.c(null).g(bundle0.getString("uri")).e(bundle0.getString("key")).b(bundle0.getBoolean("isBot")).d(bundle0.getBoolean("isImportant")).a() : person$Builder0.c(IconCompat.f(bundle1)).g(bundle0.getString("uri")).e(bundle0.getString("key")).b(bundle0.getBoolean("isBot")).d(bundle0.getBoolean("isImportant")).a();
    }

    @RequiresApi(22)
    @RestrictTo({Scope.c})
    public static Person c(PersistableBundle persistableBundle0) {
        return Api22Impl.a(persistableBundle0);
    }

    public IconCompat d() {
        return this.b;
    }

    public String e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(!(object0 instanceof Person)) {
            return false;
        }
        String s = this.e();
        String s1 = ((Person)object0).e();
        return s != null || s1 != null ? Objects.equals(s, s1) : Objects.equals(Objects.toString(this.f()), Objects.toString(((Person)object0).f())) && Objects.equals(this.g(), ((Person)object0).g()) && Boolean.valueOf(this.h()).equals(Boolean.valueOf(((Person)object0).h())) && Boolean.valueOf(this.i()).equals(Boolean.valueOf(((Person)object0).i()));
    }

    public CharSequence f() {
        return this.a;
    }

    public String g() {
        return this.c;
    }

    public boolean h() {
        return this.e;
    }

    @Override
    public int hashCode() {
        String s = this.e();
        return s == null ? Objects.hash(new Object[]{this.f(), this.g(), Boolean.valueOf(this.h()), Boolean.valueOf(this.i())}) : s.hashCode();
    }

    public boolean i() {
        return this.f;
    }

    @RestrictTo({Scope.c})
    public String j() {
        String s = this.c;
        if(s != null) {
            return s;
        }
        return this.a == null ? "" : "name:" + this.a;
    }

    @RequiresApi(28)
    @RestrictTo({Scope.c})
    public android.app.Person k() {
        return Api28Impl.b(this);
    }

    public Builder l() {
        return new Builder(this);
    }

    public Bundle m() {
        Bundle bundle0 = new Bundle();
        bundle0.putCharSequence("name", this.a);
        bundle0.putBundle("icon", (this.b == null ? null : this.b.G()));
        bundle0.putString("uri", this.c);
        bundle0.putString("key", this.d);
        bundle0.putBoolean("isBot", this.e);
        bundle0.putBoolean("isImportant", this.f);
        return bundle0;
    }

    @RequiresApi(22)
    @RestrictTo({Scope.c})
    public PersistableBundle n() {
        return Api22Impl.b(this);
    }
}

