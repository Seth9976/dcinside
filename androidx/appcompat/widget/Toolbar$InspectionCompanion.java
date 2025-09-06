package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;

@RequiresApi(29)
@RestrictTo({Scope.a})
public final class Toolbar.InspectionCompanion implements InspectionCompanion {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;

    public Toolbar.InspectionCompanion() {
        this.a = false;
    }

    public void a(@NonNull Toolbar toolbar0, @NonNull PropertyReader propertyReader0) {
        if(!this.a) {
            throw e.a();
        }
        propertyReader0.readObject(this.b, toolbar0.getCollapseContentDescription());
        propertyReader0.readObject(this.c, toolbar0.getCollapseIcon());
        propertyReader0.readInt(this.d, toolbar0.getContentInsetEnd());
        propertyReader0.readInt(this.e, toolbar0.getContentInsetEndWithActions());
        propertyReader0.readInt(this.f, toolbar0.getContentInsetLeft());
        propertyReader0.readInt(this.g, toolbar0.getContentInsetRight());
        propertyReader0.readInt(this.h, toolbar0.getContentInsetStart());
        propertyReader0.readInt(this.i, toolbar0.getContentInsetStartWithNavigation());
        propertyReader0.readObject(this.j, toolbar0.getLogo());
        propertyReader0.readObject(this.k, toolbar0.getLogoDescription());
        propertyReader0.readObject(this.l, toolbar0.getMenu());
        propertyReader0.readObject(this.m, toolbar0.getNavigationContentDescription());
        propertyReader0.readObject(this.n, toolbar0.getNavigationIcon());
        propertyReader0.readResourceId(this.o, toolbar0.getPopupTheme());
        propertyReader0.readObject(this.p, toolbar0.getSubtitle());
        propertyReader0.readObject(this.q, toolbar0.getTitle());
        propertyReader0.readInt(this.r, toolbar0.getTitleMarginBottom());
        propertyReader0.readInt(this.s, toolbar0.getTitleMarginEnd());
        propertyReader0.readInt(this.t, toolbar0.getTitleMarginStart());
        propertyReader0.readInt(this.u, toolbar0.getTitleMarginTop());
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper0) {
        this.b = propertyMapper0.mapObject("collapseContentDescription", attr.collapseContentDescription);
        this.c = propertyMapper0.mapObject("collapseIcon", attr.collapseIcon);
        this.d = propertyMapper0.mapInt("contentInsetEnd", attr.contentInsetEnd);
        this.e = propertyMapper0.mapInt("contentInsetEndWithActions", attr.contentInsetEndWithActions);
        this.f = propertyMapper0.mapInt("contentInsetLeft", attr.contentInsetLeft);
        this.g = propertyMapper0.mapInt("contentInsetRight", attr.contentInsetRight);
        this.h = propertyMapper0.mapInt("contentInsetStart", attr.contentInsetStart);
        this.i = propertyMapper0.mapInt("contentInsetStartWithNavigation", attr.contentInsetStartWithNavigation);
        this.j = propertyMapper0.mapObject("logo", attr.logo);
        this.k = propertyMapper0.mapObject("logoDescription", attr.logoDescription);
        this.l = propertyMapper0.mapObject("menu", attr.menu);
        this.m = propertyMapper0.mapObject("navigationContentDescription", attr.navigationContentDescription);
        this.n = propertyMapper0.mapObject("navigationIcon", attr.navigationIcon);
        this.o = propertyMapper0.mapResourceId("popupTheme", attr.popupTheme);
        this.p = propertyMapper0.mapObject("subtitle", attr.subtitle);
        this.q = propertyMapper0.mapObject("title", attr.title);
        this.r = propertyMapper0.mapInt("titleMarginBottom", attr.titleMarginBottom);
        this.s = propertyMapper0.mapInt("titleMarginEnd", attr.titleMarginEnd);
        this.t = propertyMapper0.mapInt("titleMarginStart", attr.titleMarginStart);
        this.u = propertyMapper0.mapInt("titleMarginTop", attr.titleMarginTop);
        this.a = true;
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void readProperties(@NonNull Object object0, @NonNull PropertyReader propertyReader0) {
        this.a(((Toolbar)object0), propertyReader0);
    }
}

