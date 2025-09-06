package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import androidx.core.content.res.ResourcesCompat;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

class ResourcesWrapper extends Resources {
    private final Resources a;

    public ResourcesWrapper(Resources resources0) {
        super(resources0.getAssets(), resources0.getDisplayMetrics(), resources0.getConfiguration());
        this.a = resources0;
    }

    final Drawable a(int v) throws Resources.NotFoundException {
        return super.getDrawable(v);
    }

    @Override  // android.content.res.Resources
    public XmlResourceParser getAnimation(int v) throws Resources.NotFoundException {
        return this.a.getAnimation(v);
    }

    @Override  // android.content.res.Resources
    public boolean getBoolean(int v) throws Resources.NotFoundException {
        return this.a.getBoolean(v);
    }

    @Override  // android.content.res.Resources
    public int getColor(int v) throws Resources.NotFoundException {
        return this.a.getColor(v);
    }

    @Override  // android.content.res.Resources
    public ColorStateList getColorStateList(int v) throws Resources.NotFoundException {
        return this.a.getColorStateList(v);
    }

    @Override  // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.a.getConfiguration();
    }

    @Override  // android.content.res.Resources
    public float getDimension(int v) throws Resources.NotFoundException {
        return this.a.getDimension(v);
    }

    @Override  // android.content.res.Resources
    public int getDimensionPixelOffset(int v) throws Resources.NotFoundException {
        return this.a.getDimensionPixelOffset(v);
    }

    @Override  // android.content.res.Resources
    public int getDimensionPixelSize(int v) throws Resources.NotFoundException {
        return this.a.getDimensionPixelSize(v);
    }

    @Override  // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.a.getDisplayMetrics();
    }

    @Override  // android.content.res.Resources
    public Drawable getDrawable(int v) throws Resources.NotFoundException {
        return this.a.getDrawable(v);
    }

    @Override  // android.content.res.Resources
    @RequiresApi(21)
    public Drawable getDrawable(int v, Resources.Theme resources$Theme0) throws Resources.NotFoundException {
        return ResourcesCompat.g(this.a, v, resources$Theme0);
    }

    @Override  // android.content.res.Resources
    public Drawable getDrawableForDensity(int v, int v1) throws Resources.NotFoundException {
        return ResourcesCompat.h(this.a, v, v1, null);
    }

    @Override  // android.content.res.Resources
    @RequiresApi(21)
    public Drawable getDrawableForDensity(int v, int v1, Resources.Theme resources$Theme0) {
        return ResourcesCompat.h(this.a, v, v1, resources$Theme0);
    }

    @Override  // android.content.res.Resources
    public float getFraction(int v, int v1, int v2) {
        return this.a.getFraction(v, v1, v2);
    }

    @Override  // android.content.res.Resources
    public int getIdentifier(String s, String s1, String s2) {
        return this.a.getIdentifier(s, s1, s2);
    }

    @Override  // android.content.res.Resources
    public int[] getIntArray(int v) throws Resources.NotFoundException {
        return this.a.getIntArray(v);
    }

    @Override  // android.content.res.Resources
    public int getInteger(int v) throws Resources.NotFoundException {
        return this.a.getInteger(v);
    }

    @Override  // android.content.res.Resources
    public XmlResourceParser getLayout(int v) throws Resources.NotFoundException {
        return this.a.getLayout(v);
    }

    @Override  // android.content.res.Resources
    public Movie getMovie(int v) throws Resources.NotFoundException {
        return this.a.getMovie(v);
    }

    @Override  // android.content.res.Resources
    public String getQuantityString(int v, int v1) throws Resources.NotFoundException {
        return this.a.getQuantityString(v, v1);
    }

    @Override  // android.content.res.Resources
    public String getQuantityString(int v, int v1, Object[] arr_object) throws Resources.NotFoundException {
        return this.a.getQuantityString(v, v1, arr_object);
    }

    @Override  // android.content.res.Resources
    public CharSequence getQuantityText(int v, int v1) throws Resources.NotFoundException {
        return this.a.getQuantityText(v, v1);
    }

    @Override  // android.content.res.Resources
    public String getResourceEntryName(int v) throws Resources.NotFoundException {
        return this.a.getResourceEntryName(v);
    }

    @Override  // android.content.res.Resources
    public String getResourceName(int v) throws Resources.NotFoundException {
        return this.a.getResourceName(v);
    }

    @Override  // android.content.res.Resources
    public String getResourcePackageName(int v) throws Resources.NotFoundException {
        return this.a.getResourcePackageName(v);
    }

    @Override  // android.content.res.Resources
    public String getResourceTypeName(int v) throws Resources.NotFoundException {
        return this.a.getResourceTypeName(v);
    }

    @Override  // android.content.res.Resources
    public String getString(int v) throws Resources.NotFoundException {
        return this.a.getString(v);
    }

    @Override  // android.content.res.Resources
    public String getString(int v, Object[] arr_object) throws Resources.NotFoundException {
        return this.a.getString(v, arr_object);
    }

    @Override  // android.content.res.Resources
    public String[] getStringArray(int v) throws Resources.NotFoundException {
        return this.a.getStringArray(v);
    }

    @Override  // android.content.res.Resources
    public CharSequence getText(int v) throws Resources.NotFoundException {
        return this.a.getText(v);
    }

    @Override  // android.content.res.Resources
    public CharSequence getText(int v, CharSequence charSequence0) {
        return this.a.getText(v, charSequence0);
    }

    @Override  // android.content.res.Resources
    public CharSequence[] getTextArray(int v) throws Resources.NotFoundException {
        return this.a.getTextArray(v);
    }

    @Override  // android.content.res.Resources
    public void getValue(int v, TypedValue typedValue0, boolean z) throws Resources.NotFoundException {
        this.a.getValue(v, typedValue0, z);
    }

    @Override  // android.content.res.Resources
    public void getValue(String s, TypedValue typedValue0, boolean z) throws Resources.NotFoundException {
        this.a.getValue(s, typedValue0, z);
    }

    @Override  // android.content.res.Resources
    public void getValueForDensity(int v, int v1, TypedValue typedValue0, boolean z) throws Resources.NotFoundException {
        this.a.getValueForDensity(v, v1, typedValue0, z);
    }

    @Override  // android.content.res.Resources
    public XmlResourceParser getXml(int v) throws Resources.NotFoundException {
        return this.a.getXml(v);
    }

    @Override  // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet0, int[] arr_v) {
        return this.a.obtainAttributes(attributeSet0, arr_v);
    }

    @Override  // android.content.res.Resources
    public TypedArray obtainTypedArray(int v) throws Resources.NotFoundException {
        return this.a.obtainTypedArray(v);
    }

    @Override  // android.content.res.Resources
    public InputStream openRawResource(int v) throws Resources.NotFoundException {
        return this.a.openRawResource(v);
    }

    @Override  // android.content.res.Resources
    public InputStream openRawResource(int v, TypedValue typedValue0) throws Resources.NotFoundException {
        return this.a.openRawResource(v, typedValue0);
    }

    @Override  // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int v) throws Resources.NotFoundException {
        return this.a.openRawResourceFd(v);
    }

    @Override  // android.content.res.Resources
    public void parseBundleExtra(String s, AttributeSet attributeSet0, Bundle bundle0) throws XmlPullParserException {
        this.a.parseBundleExtra(s, attributeSet0, bundle0);
    }

    @Override  // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser0, Bundle bundle0) throws XmlPullParserException, IOException {
        this.a.parseBundleExtras(xmlResourceParser0, bundle0);
    }

    @Override  // android.content.res.Resources
    public void updateConfiguration(Configuration configuration0, DisplayMetrics displayMetrics0) {
        super.updateConfiguration(configuration0, displayMetrics0);
        Resources resources0 = this.a;
        if(resources0 != null) {
            resources0.updateConfiguration(configuration0, displayMetrics0);
        }
    }
}

