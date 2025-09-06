package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlin.sequences.p;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.n;

@Name("activity")
public class ActivityNavigator extends Navigator {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @n
        public final void a(@l Activity activity0) {
            L.p(activity0, "activity");
            Intent intent0 = activity0.getIntent();
            if(intent0 == null) {
                return;
            }
            int v = intent0.getIntExtra("android-support-navigation:ActivityNavigator:popEnterAnim", -1);
            int v1 = intent0.getIntExtra("android-support-navigation:ActivityNavigator:popExitAnim", -1);
            if(v != -1 || v1 != -1) {
                if(v == -1) {
                    v = 0;
                }
                if(v1 == -1) {
                    v1 = 0;
                }
                activity0.overridePendingTransition(v, v1);
            }
        }
    }

    @ClassType(Activity.class)
    public static class Destination extends NavDestination {
        @m
        private Intent l;
        @m
        private String m;
        @m
        private String n;
        @m
        private ComponentName o;
        @m
        private String p;
        @m
        private Uri q;

        public Destination(@l Navigator navigator0) {
            L.p(navigator0, "activityNavigator");
            super(navigator0);
        }

        public Destination(@l NavigatorProvider navigatorProvider0) {
            L.p(navigatorProvider0, "navigatorProvider");
            this(navigatorProvider0.e(ActivityNavigator.class));
        }

        @Override  // androidx.navigation.NavDestination
        @CallSuper
        public void A(@l Context context0, @l AttributeSet attributeSet0) {
            L.p(context0, "context");
            L.p(attributeSet0, "attrs");
            super.A(context0, attributeSet0);
            TypedArray typedArray0 = context0.getResources().obtainAttributes(attributeSet0, styleable.ActivityNavigator);
            L.o(typedArray0, "context.resources.obtain…tyNavigator\n            )");
            String s = typedArray0.getString(styleable.ActivityNavigator_targetPackage);
            if(s != null) {
                L.o("com.dcinside.app.android", "context.packageName");
                s = v.l2(s, "${applicationId}", "com.dcinside.app.android", false, 4, null);
            }
            this.b0(s);
            String s1 = typedArray0.getString(styleable.ActivityNavigator_android_name);
            if(s1 != null) {
                if(s1.charAt(0) == 46) {
                    s1 = "com.dcinside.app.android" + s1;
                }
                this.X(new ComponentName(context0, s1));
            }
            this.W(typedArray0.getString(styleable.ActivityNavigator_action));
            String s2 = typedArray0.getString(styleable.ActivityNavigator_data);
            if(s2 != null) {
                this.Y(Uri.parse(s2));
            }
            this.Z(typedArray0.getString(styleable.ActivityNavigator_dataPattern));
            typedArray0.recycle();
        }

        @Override  // androidx.navigation.NavDestination
        @RestrictTo({Scope.b})
        public boolean M() {
            return false;
        }

        @m
        public final String N() {
            return this.l == null ? null : this.l.getAction();
        }

        @m
        public final ComponentName O() {
            return this.l == null ? null : this.l.getComponent();
        }

        @m
        public final Uri P() {
            return this.l == null ? null : this.l.getData();
        }

        @m
        public final String S() {
            return this.m;
        }

        @m
        public final Intent U() {
            return this.l;
        }

        @m
        public final String V() {
            return this.l == null ? null : this.l.getPackage();
        }

        @l
        public final Destination W(@m String s) {
            if(this.l == null) {
                this.l = new Intent();
            }
            Intent intent0 = this.l;
            L.m(intent0);
            intent0.setAction(s);
            return this;
        }

        @l
        public final Destination X(@m ComponentName componentName0) {
            if(this.l == null) {
                this.l = new Intent();
            }
            Intent intent0 = this.l;
            L.m(intent0);
            intent0.setComponent(componentName0);
            return this;
        }

        @l
        public final Destination Y(@m Uri uri0) {
            if(this.l == null) {
                this.l = new Intent();
            }
            Intent intent0 = this.l;
            L.m(intent0);
            intent0.setData(uri0);
            return this;
        }

        @l
        public final Destination Z(@m String s) {
            this.m = s;
            return this;
        }

        @l
        public final Destination a0(@m Intent intent0) {
            this.l = intent0;
            return this;
        }

        @l
        public final Destination b0(@m String s) {
            if(this.l == null) {
                this.l = new Intent();
            }
            Intent intent0 = this.l;
            L.m(intent0);
            intent0.setPackage(s);
            return this;
        }

        @Override  // androidx.navigation.NavDestination
        public boolean equals(@m Object object0) {
            if(object0 != null && object0 instanceof Destination && super.equals(object0)) {
                Intent intent0 = this.l;
                return intent0 == null ? ((Destination)object0).l == null && L.g(this.m, ((Destination)object0).m) : intent0.filterEquals(((Destination)object0).l) && L.g(this.m, ((Destination)object0).m);
            }
            return false;
        }

        @Override  // androidx.navigation.NavDestination
        public int hashCode() {
            int v = super.hashCode();
            int v1 = 0;
            int v2 = this.l == null ? 0 : this.l.filterHashCode();
            String s = this.m;
            if(s != null) {
                v1 = s.hashCode();
            }
            return (v * 0x1F + v2) * 0x1F + v1;
        }

        @Override  // androidx.navigation.NavDestination
        @l
        public String toString() {
            ComponentName componentName0 = this.O();
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(super.toString());
            if(componentName0 == null) {
                String s = this.N();
                if(s != null) {
                    stringBuilder0.append(" action=");
                    stringBuilder0.append(s);
                }
            }
            else {
                stringBuilder0.append(" class=");
                stringBuilder0.append(componentName0.getClassName());
            }
            String s1 = stringBuilder0.toString();
            L.o(s1, "sb.toString()");
            return s1;
        }
    }

    public static final class Extras implements androidx.navigation.Navigator.Extras {
        public static final class Builder {
            private int a;
            @m
            private ActivityOptionsCompat b;

            @l
            public final Builder a(int v) {
                this.a |= v;
                return this;
            }

            @l
            public final Extras b() {
                return new Extras(this.a, this.b);
            }

            @l
            public final Builder c(@l ActivityOptionsCompat activityOptionsCompat0) {
                L.p(activityOptionsCompat0, "activityOptions");
                this.b = activityOptionsCompat0;
                return this;
            }
        }

        private final int a;
        @m
        private final ActivityOptionsCompat b;

        public Extras(int v, @m ActivityOptionsCompat activityOptionsCompat0) {
            this.a = v;
            this.b = activityOptionsCompat0;
        }

        @m
        public final ActivityOptionsCompat a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }
    }

    @l
    private final Context c;
    @m
    private final Activity d;
    @l
    public static final Companion e = null;
    @l
    private static final String f = "android-support-navigation:ActivityNavigator:source";
    @l
    private static final String g = "android-support-navigation:ActivityNavigator:current";
    @l
    private static final String h = "android-support-navigation:ActivityNavigator:popEnterAnim";
    @l
    private static final String i = "android-support-navigation:ActivityNavigator:popExitAnim";
    @l
    private static final String j = "ActivityNavigator";

    static {
        ActivityNavigator.e = new Companion(null);
    }

    public ActivityNavigator(@l Context context0) {
        Object object0 = null;
        L.p(context0, "context");
        super();
        this.c = context0;
        for(Object object1: p.n(context0, androidx.navigation.ActivityNavigator.hostActivity.1.e)) {
            if(((Context)object1) instanceof Activity) {
                object0 = object1;
                break;
            }
        }
        this.d = (Activity)object0;

        final class androidx.navigation.ActivityNavigator.hostActivity.1 extends N implements Function1 {
            public static final androidx.navigation.ActivityNavigator.hostActivity.1 e;

            static {
                androidx.navigation.ActivityNavigator.hostActivity.1.e = new androidx.navigation.ActivityNavigator.hostActivity.1();
            }

            androidx.navigation.ActivityNavigator.hostActivity.1() {
                super(1);
            }

            @m
            public final Context a(@l Context context0) {
                L.p(context0, "it");
                return context0 instanceof ContextWrapper ? ((ContextWrapper)context0).getBaseContext() : null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Context)object0));
            }
        }

    }

    @Override  // androidx.navigation.Navigator
    public NavDestination a() {
        return this.m();
    }

    @Override  // androidx.navigation.Navigator
    public NavDestination d(NavDestination navDestination0, Bundle bundle0, NavOptions navOptions0, androidx.navigation.Navigator.Extras navigator$Extras0) {
        return this.o(((Destination)navDestination0), bundle0, navOptions0, navigator$Extras0);
    }

    @Override  // androidx.navigation.Navigator
    public boolean k() {
        Activity activity0 = this.d;
        if(activity0 != null) {
            activity0.finish();
            return true;
        }
        return false;
    }

    @n
    public static final void l(@l Activity activity0) {
        ActivityNavigator.e.a(activity0);
    }

    @l
    public Destination m() {
        return new Destination(this);
    }

    @RestrictTo({Scope.b})
    @l
    public final Context n() {
        return this.c;
    }

    @m
    public NavDestination o(@l Destination activityNavigator$Destination0, @m Bundle bundle0, @m NavOptions navOptions0, @m androidx.navigation.Navigator.Extras navigator$Extras0) {
        L.p(activityNavigator$Destination0, "destination");
        if(activityNavigator$Destination0.U() == null) {
            throw new IllegalStateException(("Destination " + activityNavigator$Destination0.q() + " does not have an Intent set.").toString());
        }
        Intent intent0 = new Intent(activityNavigator$Destination0.U());
        if(bundle0 != null) {
            intent0.putExtras(bundle0);
            String s = activityNavigator$Destination0.S();
            if(s != null && s.length() != 0) {
                StringBuffer stringBuffer0 = new StringBuffer();
                Matcher matcher0 = Pattern.compile("\\{(.+?)\\}").matcher(s);
                while(matcher0.find()) {
                    String s1 = matcher0.group(1);
                    if(!bundle0.containsKey(s1)) {
                        throw new IllegalArgumentException("Could not find " + s1 + " in " + bundle0 + " to fill data pattern " + s);
                    }
                    matcher0.appendReplacement(stringBuffer0, "");
                    stringBuffer0.append(Uri.encode(String.valueOf(bundle0.get(s1))));
                }
                matcher0.appendTail(stringBuffer0);
                intent0.setData(Uri.parse(stringBuffer0.toString()));
            }
        }
        if(navigator$Extras0 instanceof Extras) {
            intent0.addFlags(((Extras)navigator$Extras0).b());
        }
        if(this.d == null) {
            intent0.addFlags(0x10000000);
        }
        if(navOptions0 != null && navOptions0.i()) {
            intent0.addFlags(0x20000000);
        }
        Activity activity0 = this.d;
        if(activity0 != null) {
            Intent intent1 = activity0.getIntent();
            if(intent1 != null) {
                int v = intent1.getIntExtra("android-support-navigation:ActivityNavigator:current", 0);
                if(v != 0) {
                    intent0.putExtra("android-support-navigation:ActivityNavigator:source", v);
                }
            }
        }
        intent0.putExtra("android-support-navigation:ActivityNavigator:current", activityNavigator$Destination0.q());
        Resources resources0 = this.c.getResources();
        if(navOptions0 != null) {
            int v1 = navOptions0.c();
            int v2 = navOptions0.d();
            if((v1 <= 0 || !L.g(resources0.getResourceTypeName(v1), "animator")) && (v2 <= 0 || !L.g(resources0.getResourceTypeName(v2), "animator"))) {
                intent0.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", v1);
                intent0.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", v2);
            }
            else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources0.getResourceName(v1) + " and popExit resource " + resources0.getResourceName(v2) + " when launching " + activityNavigator$Destination0);
            }
        }
        if(navigator$Extras0 instanceof Extras) {
            ActivityOptionsCompat activityOptionsCompat0 = ((Extras)navigator$Extras0).a();
            if(activityOptionsCompat0 == null) {
                this.c.startActivity(intent0);
            }
            else {
                ContextCompat.startActivity(this.c, intent0, activityOptionsCompat0.p());
            }
        }
        else {
            this.c.startActivity(intent0);
        }
        if(navOptions0 != null && this.d != null) {
            int v3 = navOptions0.a();
            int v4 = navOptions0.b();
            if(v3 > 0 && L.g(resources0.getResourceTypeName(v3), "animator") || v4 > 0 && L.g(resources0.getResourceTypeName(v4), "animator")) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources0.getResourceName(v3) + " and exit resource " + resources0.getResourceName(v4) + "when launching " + activityNavigator$Destination0);
                return null;
            }
            if(v3 >= 0 || v4 >= 0) {
                int v5 = s.u(v3, 0);
                int v6 = s.u(v4, 0);
                this.d.overridePendingTransition(v5, v6);
            }
        }
        return null;
    }
}

