package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.window.R.styleable;
import androidx.window.core.ExperimentalWindowApi;
import java.util.HashSet;
import java.util.Set;
import kotlin.collections.k0;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;
import y4.m;

@ExperimentalWindowApi
public final class SplitRuleParser {
    private final ComponentName a(String s, CharSequence charSequence0) {
        if(charSequence0 == null || charSequence0.length() == 0) {
            throw new IllegalArgumentException("Activity name must not be null");
        }
        String s1 = charSequence0.toString();
        if(s1.charAt(0) == 46) {
            return new ComponentName(s, s + s1);
        }
        int v = v.r3(s1, '/', 0, false, 6, null);
        if(v > 0) {
            s = s1.substring(0, v);
            L.o(s, "this as java.lang.String…ing(startIndex, endIndex)");
            s1 = s1.substring(v + 1);
            L.o(s1, "this as java.lang.String).substring(startIndex)");
        }
        return L.g(s1, "*") || v.r3(s1, '.', 0, false, 6, null) >= 0 ? new ComponentName(s, s1) : new ComponentName(s, s + '.' + s1);
    }

    private final ActivityFilter b(Context context0, XmlResourceParser xmlResourceParser0) {
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(xmlResourceParser0, styleable.ActivityFilter, 0, 0);
        String s = typedArray0.getString(styleable.ActivityFilter_activityName);
        String s1 = typedArray0.getString(styleable.ActivityFilter_activityAction);
        L.o("com.dcinside.app.android", "packageName");
        return new ActivityFilter(this.a("com.dcinside.app.android", s), s1);
    }

    private final ActivityRule c(Context context0, XmlResourceParser xmlResourceParser0) {
        boolean z = context0.getTheme().obtainStyledAttributes(xmlResourceParser0, styleable.ActivityRule, 0, 0).getBoolean(styleable.ActivityRule_alwaysExpand, false);
        return new ActivityRule(k0.k(), z);
    }

    private final SplitPairFilter d(Context context0, XmlResourceParser xmlResourceParser0) {
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(xmlResourceParser0, styleable.SplitPairFilter, 0, 0);
        String s = typedArray0.getString(styleable.SplitPairFilter_primaryActivityName);
        String s1 = typedArray0.getString(styleable.SplitPairFilter_secondaryActivityName);
        String s2 = typedArray0.getString(styleable.SplitPairFilter_secondaryActivityAction);
        L.o("com.dcinside.app.android", "packageName");
        return new SplitPairFilter(this.a("com.dcinside.app.android", s), this.a("com.dcinside.app.android", s1), s2);
    }

    private final SplitPairRule e(Context context0, XmlResourceParser xmlResourceParser0) {
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(xmlResourceParser0, styleable.SplitPairRule, 0, 0);
        float f = typedArray0.getFloat(styleable.SplitPairRule_splitRatio, 0.0f);
        int v = (int)typedArray0.getDimension(styleable.SplitPairRule_splitMinWidth, 0.0f);
        int v1 = (int)typedArray0.getDimension(styleable.SplitPairRule_splitMinSmallestWidth, 0.0f);
        int v2 = typedArray0.getInt(styleable.SplitPairRule_splitLayoutDirection, 3);
        boolean z = typedArray0.getBoolean(styleable.SplitPairRule_finishPrimaryWithSecondary, false);
        boolean z1 = typedArray0.getBoolean(styleable.SplitPairRule_finishSecondaryWithPrimary, true);
        boolean z2 = typedArray0.getBoolean(styleable.SplitPairRule_clearTop, false);
        return new SplitPairRule(k0.k(), z, z1, z2, v, v1, f, v2);
    }

    private final SplitPlaceholderRule f(Context context0, XmlResourceParser xmlResourceParser0) {
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(xmlResourceParser0, styleable.SplitPlaceholderRule, 0, 0);
        String s = typedArray0.getString(styleable.SplitPlaceholderRule_placeholderActivityName);
        float f = typedArray0.getFloat(styleable.SplitPlaceholderRule_splitRatio, 0.0f);
        int v = (int)typedArray0.getDimension(styleable.SplitPlaceholderRule_splitMinWidth, 0.0f);
        int v1 = (int)typedArray0.getDimension(styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f);
        int v2 = typedArray0.getInt(styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
        L.o("com.dcinside.app.android", "packageName");
        ComponentName componentName0 = this.a("com.dcinside.app.android", s);
        Set set0 = k0.k();
        Intent intent0 = new Intent().setComponent(componentName0);
        L.o(intent0, "Intent().setComponent(pl…eholderActivityClassName)");
        return new SplitPlaceholderRule(set0, intent0, v, v1, f, v2);
    }

    @m
    public final Set g(@l Context context0, int v) {
        L.p(context0, "context");
        return this.h(context0, v);
    }

    private final Set h(Context context0, int v) {
        SplitPairRule splitPairRule1;
        SplitPlaceholderRule splitPlaceholderRule1;
        ActivityRule activityRule1;
        XmlResourceParser xmlResourceParser0;
        Resources resources0 = context0.getResources();
        try {
            xmlResourceParser0 = resources0.getXml(v);
            L.o(xmlResourceParser0, "resources.getXml(splitResourceId)");
        }
        catch(Resources.NotFoundException unused_ex) {
            return null;
        }
        Set set0 = new HashSet();
        int v1 = xmlResourceParser0.getDepth();
        int v2 = xmlResourceParser0.next();
        ActivityRule activityRule0 = null;
        SplitPairRule splitPairRule0 = null;
        SplitPlaceholderRule splitPlaceholderRule0 = null;
        while(v2 != 1 && (v2 != 3 || xmlResourceParser0.getDepth() > v1)) {
            if(xmlResourceParser0.getEventType() == 2 && !L.g("split-config", xmlResourceParser0.getName())) {
                String s = xmlResourceParser0.getName();
                if(s != null) {
                    switch(s) {
                        case "ActivityFilter": {
                            if(activityRule0 == null && splitPlaceholderRule0 == null) {
                                throw new IllegalArgumentException("Found orphaned ActivityFilter");
                            }
                            ActivityFilter activityFilter0 = this.b(context0, xmlResourceParser0);
                            if(activityRule0 != null) {
                                ((HashSet)set0).remove(activityRule0);
                                activityRule1 = activityRule0.c(activityFilter0);
                                ((HashSet)set0).add(activityRule1);
                                activityRule0 = activityRule1;
                            }
                            else if(splitPlaceholderRule0 != null) {
                                ((HashSet)set0).remove(splitPlaceholderRule0);
                                splitPlaceholderRule1 = splitPlaceholderRule0.h(activityFilter0);
                                ((HashSet)set0).add(splitPlaceholderRule1);
                                splitPlaceholderRule0 = splitPlaceholderRule1;
                            }
                            break;
                        }
                        case "ActivityRule": {
                            activityRule1 = this.c(context0, xmlResourceParser0);
                            ((HashSet)set0).add(activityRule1);
                            splitPairRule0 = null;
                            splitPlaceholderRule0 = null;
                            activityRule0 = activityRule1;
                            break;
                        }
                        case "SplitPairFilter": {
                            if(splitPairRule0 == null) {
                                throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                            }
                            SplitPairFilter splitPairFilter0 = this.d(context0, xmlResourceParser0);
                            ((HashSet)set0).remove(splitPairRule0);
                            splitPairRule1 = splitPairRule0.j(splitPairFilter0);
                            ((HashSet)set0).add(splitPairRule1);
                            splitPairRule0 = splitPairRule1;
                            break;
                        }
                        case "SplitPairRule": {
                            splitPairRule1 = this.e(context0, xmlResourceParser0);
                            ((HashSet)set0).add(splitPairRule1);
                            activityRule0 = null;
                            splitPlaceholderRule0 = null;
                            splitPairRule0 = splitPairRule1;
                            break;
                        }
                        case "SplitPlaceholderRule": {
                            splitPlaceholderRule1 = this.f(context0, xmlResourceParser0);
                            ((HashSet)set0).add(splitPlaceholderRule1);
                            activityRule0 = null;
                            splitPairRule0 = null;
                            splitPlaceholderRule0 = splitPlaceholderRule1;
                        }
                    }
                }
            }
            v2 = xmlResourceParser0.next();
        }
        return set0;
    }
}

