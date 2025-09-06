package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import jeb.synthetic.TWR;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import org.xmlpull.v1.XmlPullParserException;
import y4.l;
import y4.m;

public final class NavInflater {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final NavType a(@l TypedValue typedValue0, @m NavType navType0, @l NavType navType1, @m String s, @l String s1) throws XmlPullParserException {
            L.p(typedValue0, "value");
            L.p(navType1, "expectedNavType");
            L.p(s1, "foundType");
            if(navType0 != null && navType0 != navType1) {
                throw new XmlPullParserException("Type is " + s + " but found " + s1 + ": " + typedValue0.data);
            }
            return navType0 == null ? navType1 : navType0;
        }
    }

    @l
    private final Context a;
    @l
    private final NavigatorProvider b;
    @l
    public static final Companion c = null;
    @l
    private static final String d = "argument";
    @l
    private static final String e = "deepLink";
    @l
    private static final String f = "action";
    @l
    private static final String g = "include";
    @RestrictTo({Scope.b})
    @l
    public static final String h = "${applicationId}";
    @l
    private static final ThreadLocal i;

    static {
        NavInflater.c = new Companion(null);
        NavInflater.i = new ThreadLocal();
    }

    public NavInflater(@l Context context0, @l NavigatorProvider navigatorProvider0) {
        L.p(context0, "context");
        L.p(navigatorProvider0, "navigatorProvider");
        super();
        this.a = context0;
        this.b = navigatorProvider0;
    }

    private final NavDestination a(Resources resources0, XmlResourceParser xmlResourceParser0, AttributeSet attributeSet0, int v) throws XmlPullParserException, IOException {
        String s = xmlResourceParser0.getName();
        L.o(s, "parser.name");
        NavDestination navDestination0 = this.b.f(s).a();
        navDestination0.A(this.a, attributeSet0);
        int v1 = xmlResourceParser0.getDepth();
        int v2;
        while((v2 = xmlResourceParser0.next()) != 1) {
            int v3 = xmlResourceParser0.getDepth();
            if(v3 < v1 + 1 && v2 == 3) {
                break;
            }
            if(v2 == 2 && v3 <= v1 + 1) {
                String s1 = xmlResourceParser0.getName();
                if(L.g("argument", s1)) {
                    this.f(resources0, navDestination0, attributeSet0, v);
                }
                else if(L.g("deepLink", s1)) {
                    this.g(resources0, navDestination0, attributeSet0);
                }
                else if(L.g("action", s1)) {
                    this.c(resources0, navDestination0, attributeSet0, xmlResourceParser0, v);
                }
                else if(L.g("include", s1) && navDestination0 instanceof NavGraph) {
                    TypedArray typedArray0 = resources0.obtainAttributes(attributeSet0, styleable.NavInclude);
                    L.o(typedArray0, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((NavGraph)navDestination0).O(this.b(typedArray0.getResourceId(styleable.NavInclude_graph, 0)));
                    typedArray0.recycle();
                }
                else if(navDestination0 instanceof NavGraph) {
                    ((NavGraph)navDestination0).O(this.a(resources0, xmlResourceParser0, attributeSet0, v));
                }
            }
        }
        return navDestination0;
    }

    @SuppressLint({"ResourceType"})
    @l
    public final NavGraph b(@NavigationRes int v) {
        NavGraph navGraph0;
        Resources resources0 = this.a.getResources();
        XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
        L.o(xmlResourceParser0, "res.getXml(graphResId)");
        AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
        try {
            try {
                do {
                    int v1 = xmlResourceParser0.next();
                }
                while(v1 != 1 && v1 != 2);
                if(v1 != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String s = xmlResourceParser0.getName();
                L.o(resources0, "res");
                L.o(attributeSet0, "attrs");
                NavDestination navDestination0 = this.a(resources0, xmlResourceParser0, attributeSet0, v);
                if(!(navDestination0 instanceof NavGraph)) {
                    throw new IllegalArgumentException(("Root element <" + s + "> did not inflate into a NavGraph").toString());
                }
                navGraph0 = (NavGraph)navDestination0;
            }
            catch(Exception exception0) {
                throw new RuntimeException("Exception inflating " + resources0.getResourceName(v) + " line " + xmlResourceParser0.getLineNumber(), exception0);
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(xmlResourceParser0, throwable0);
            throw throwable0;
        }
        xmlResourceParser0.close();
        return navGraph0;
    }

    private final void c(Resources resources0, NavDestination navDestination0, AttributeSet attributeSet0, XmlResourceParser xmlResourceParser0, int v) throws IOException, XmlPullParserException {
        L.o(androidx.navigation.common.R.styleable.NavAction, "NavAction");
        TypedArray typedArray0 = this.a.obtainStyledAttributes(attributeSet0, androidx.navigation.common.R.styleable.NavAction, 0, 0);
        int v1 = typedArray0.getResourceId(androidx.navigation.common.R.styleable.NavAction_android_id, 0);
        NavAction navAction0 = new NavAction(typedArray0.getResourceId(androidx.navigation.common.R.styleable.NavAction_destination, 0), null, null, 6, null);
        Builder navOptions$Builder0 = new Builder();
        navOptions$Builder0.d(typedArray0.getBoolean(androidx.navigation.common.R.styleable.NavAction_launchSingleTop, false));
        navOptions$Builder0.m(typedArray0.getBoolean(androidx.navigation.common.R.styleable.NavAction_restoreState, false));
        navOptions$Builder0.h(typedArray0.getResourceId(androidx.navigation.common.R.styleable.NavAction_popUpTo, -1), typedArray0.getBoolean(androidx.navigation.common.R.styleable.NavAction_popUpToInclusive, false), typedArray0.getBoolean(androidx.navigation.common.R.styleable.NavAction_popUpToSaveState, false));
        navOptions$Builder0.b(typedArray0.getResourceId(androidx.navigation.common.R.styleable.NavAction_enterAnim, -1));
        navOptions$Builder0.c(typedArray0.getResourceId(androidx.navigation.common.R.styleable.NavAction_exitAnim, -1));
        navOptions$Builder0.e(typedArray0.getResourceId(androidx.navigation.common.R.styleable.NavAction_popEnterAnim, -1));
        navOptions$Builder0.f(typedArray0.getResourceId(androidx.navigation.common.R.styleable.NavAction_popExitAnim, -1));
        navAction0.e(navOptions$Builder0.a());
        Bundle bundle0 = new Bundle();
        int v2 = xmlResourceParser0.getDepth();
        int v3;
        while((v3 = xmlResourceParser0.next()) != 1) {
            int v4 = xmlResourceParser0.getDepth();
            if(v4 < v2 + 1 && v3 == 3) {
                break;
            }
            if(v3 == 2 && v4 <= v2 + 1 && L.g("argument", xmlResourceParser0.getName())) {
                this.e(resources0, bundle0, attributeSet0, v);
            }
        }
        if(!bundle0.isEmpty()) {
            navAction0.d(bundle0);
        }
        navDestination0.E(v1, navAction0);
        typedArray0.recycle();
    }

    private final NavArgument d(TypedArray typedArray0, Resources resources0, int v) throws XmlPullParserException {
        NavType navType0;
        androidx.navigation.NavArgument.Builder navArgument$Builder0 = new androidx.navigation.NavArgument.Builder();
        int v1 = 0;
        navArgument$Builder0.c(typedArray0.getBoolean(androidx.navigation.common.R.styleable.NavArgument_nullable, false));
        ThreadLocal threadLocal0 = NavInflater.i;
        TypedValue typedValue0 = (TypedValue)threadLocal0.get();
        if(typedValue0 == null) {
            typedValue0 = new TypedValue();
            threadLocal0.set(typedValue0);
        }
        String s = typedArray0.getString(androidx.navigation.common.R.styleable.NavArgument_argType);
        Object object0 = null;
        if(s == null) {
            navType0 = null;
        }
        else {
            String s1 = resources0.getResourcePackageName(v);
            navType0 = b.a(NavType.c, s, s1);
        }
        if(typedArray0.getValue(androidx.navigation.common.R.styleable.NavArgument_android_defaultValue, typedValue0)) {
            NavType navType1 = NavType.e;
            if(navType0 == navType1) {
                int v2 = typedValue0.resourceId;
                if(v2 == 0) {
                    if(typedValue0.type != 16 || typedValue0.data != 0) {
                        throw new XmlPullParserException("unsupported value \'" + typedValue0.string + "\' for " + navType0.c() + ". Must be a reference to a resource.");
                    }
                    object0 = 0;
                }
                else {
                    object0 = v2;
                }
            }
            else {
                int v3 = typedValue0.resourceId;
                if(v3 != 0) {
                    if(navType0 != null) {
                        throw new XmlPullParserException("unsupported value \'" + typedValue0.string + "\' for " + navType0.c() + ". You must use a \"" + navType1.c() + "\" type to reference other resources.");
                    }
                    navType0 = navType1;
                    object0 = v3;
                }
                else if(navType0 == NavType.m) {
                    object0 = typedArray0.getString(1);
                }
                else {
                    int v4 = typedValue0.type;
                    switch(v4) {
                        case 3: {
                            String s2 = typedValue0.string.toString();
                            if(navType0 == null) {
                                navType0 = NavType.c.b(s2);
                            }
                            object0 = navType0.h(s2);
                            break;
                        }
                        case 4: {
                            navType0 = NavInflater.c.a(typedValue0, navType0, NavType.i, s, "float");
                            object0 = typedValue0.getFloat();
                            break;
                        }
                        case 5: {
                            navType0 = NavInflater.c.a(typedValue0, navType0, NavType.d, s, "dimension");
                            object0 = (int)typedValue0.getDimension(resources0.getDisplayMetrics());
                            break;
                        }
                        case 18: {
                            navType0 = NavInflater.c.a(typedValue0, navType0, NavType.k, s, "boolean");
                            if(typedValue0.data != 0) {
                                v1 = 1;
                            }
                            object0 = Boolean.valueOf(((boolean)v1));
                            break;
                        }
                        default: {
                            if(v4 < 16 || v4 > 0x1F) {
                                throw new XmlPullParserException("unsupported argument type " + typedValue0.type);
                            }
                            NavType navType2 = NavType.i;
                            if(navType0 == navType2) {
                                navType0 = NavInflater.c.a(typedValue0, navType0, navType2, s, "float");
                                object0 = (float)typedValue0.data;
                            }
                            else {
                                navType0 = NavInflater.c.a(typedValue0, navType0, NavType.d, s, "integer");
                                object0 = typedValue0.data;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if(object0 != null) {
            navArgument$Builder0.b(object0);
        }
        if(navType0 != null) {
            navArgument$Builder0.d(navType0);
        }
        return navArgument$Builder0.a();
    }

    private final void e(Resources resources0, Bundle bundle0, AttributeSet attributeSet0, int v) throws XmlPullParserException {
        TypedArray typedArray0 = resources0.obtainAttributes(attributeSet0, androidx.navigation.common.R.styleable.NavArgument);
        L.o(typedArray0, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String s = typedArray0.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if(s == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        L.o(s, "array.getString(R.stylea…uments must have a name\")");
        NavArgument navArgument0 = this.d(typedArray0, resources0, v);
        if(navArgument0.c()) {
            navArgument0.e(s, bundle0);
        }
        typedArray0.recycle();
    }

    private final void f(Resources resources0, NavDestination navDestination0, AttributeSet attributeSet0, int v) throws XmlPullParserException {
        TypedArray typedArray0 = resources0.obtainAttributes(attributeSet0, androidx.navigation.common.R.styleable.NavArgument);
        L.o(typedArray0, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String s = typedArray0.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if(s == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        L.o(s, "array.getString(R.stylea…uments must have a name\")");
        navDestination0.b(s, this.d(typedArray0, resources0, v));
        typedArray0.recycle();
    }

    private final void g(Resources resources0, NavDestination navDestination0, AttributeSet attributeSet0) throws XmlPullParserException {
        TypedArray typedArray0 = resources0.obtainAttributes(attributeSet0, androidx.navigation.common.R.styleable.NavDeepLink);
        L.o(typedArray0, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String s = typedArray0.getString(androidx.navigation.common.R.styleable.NavDeepLink_uri);
        String s1 = typedArray0.getString(androidx.navigation.common.R.styleable.NavDeepLink_action);
        String s2 = typedArray0.getString(androidx.navigation.common.R.styleable.NavDeepLink_mimeType);
        if((s == null || s.length() == 0) && (s1 == null || s1.length() == 0) && (s2 == null || s2.length() == 0)) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        androidx.navigation.NavDeepLink.Builder navDeepLink$Builder0 = new androidx.navigation.NavDeepLink.Builder();
        if(s != null) {
            L.o("com.dcinside.app.android", "context.packageName");
            navDeepLink$Builder0.g(v.l2(s, "${applicationId}", "com.dcinside.app.android", false, 4, null));
        }
        if(s1 != null && s1.length() != 0) {
            L.o("com.dcinside.app.android", "context.packageName");
            navDeepLink$Builder0.e(v.l2(s1, "${applicationId}", "com.dcinside.app.android", false, 4, null));
        }
        if(s2 != null) {
            L.o("com.dcinside.app.android", "context.packageName");
            navDeepLink$Builder0.f(v.l2(s2, "${applicationId}", "com.dcinside.app.android", false, 4, null));
        }
        navDestination0.c(navDeepLink$Builder0.a());
        typedArray0.recycle();
    }
}

