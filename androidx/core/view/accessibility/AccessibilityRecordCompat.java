package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.ReplaceWith;
import java.util.List;

public class AccessibilityRecordCompat {
    private final AccessibilityRecord a;

    @Deprecated
    public AccessibilityRecordCompat(Object object0) {
        this.a = (AccessibilityRecord)object0;
    }

    @Deprecated
    public static AccessibilityRecordCompat A(AccessibilityRecordCompat accessibilityRecordCompat0) {
        return new AccessibilityRecordCompat(AccessibilityRecord.obtain(accessibilityRecordCompat0.a));
    }

    @Deprecated
    public void B() {
        this.a.recycle();
    }

    @Deprecated
    public void C(int v) {
        this.a.setAddedCount(v);
    }

    @Deprecated
    public void D(CharSequence charSequence0) {
        this.a.setBeforeText(charSequence0);
    }

    @Deprecated
    public void E(boolean z) {
        this.a.setChecked(z);
    }

    @Deprecated
    public void F(CharSequence charSequence0) {
        this.a.setClassName(charSequence0);
    }

    @Deprecated
    public void G(CharSequence charSequence0) {
        this.a.setContentDescription(charSequence0);
    }

    @Deprecated
    public void H(int v) {
        this.a.setCurrentItemIndex(v);
    }

    @Deprecated
    public void I(boolean z) {
        this.a.setEnabled(z);
    }

    @Deprecated
    public void J(int v) {
        this.a.setFromIndex(v);
    }

    @Deprecated
    public void K(boolean z) {
        this.a.setFullScreen(z);
    }

    @Deprecated
    public void L(int v) {
        this.a.setItemCount(v);
    }

    @Deprecated
    public void M(int v) {
        AccessibilityRecordCompat.N(this.a, v);
    }

    @ReplaceWith(expression = "record.setMaxScrollX(maxScrollX)")
    @Deprecated
    public static void N(AccessibilityRecord accessibilityRecord0, int v) {
        accessibilityRecord0.setMaxScrollX(v);
    }

    @Deprecated
    public void O(int v) {
        AccessibilityRecordCompat.P(this.a, v);
    }

    @ReplaceWith(expression = "record.setMaxScrollY(maxScrollY)")
    @Deprecated
    public static void P(AccessibilityRecord accessibilityRecord0, int v) {
        accessibilityRecord0.setMaxScrollY(v);
    }

    @Deprecated
    public void Q(Parcelable parcelable0) {
        this.a.setParcelableData(parcelable0);
    }

    @Deprecated
    public void R(boolean z) {
        this.a.setPassword(z);
    }

    @Deprecated
    public void S(int v) {
        this.a.setRemovedCount(v);
    }

    @Deprecated
    public void T(int v) {
        this.a.setScrollX(v);
    }

    @Deprecated
    public void U(int v) {
        this.a.setScrollY(v);
    }

    @Deprecated
    public void V(boolean z) {
        this.a.setScrollable(z);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public void W(View view0) {
        this.a.setSource(view0);
    }

    @Deprecated
    public void X(View view0, int v) {
        AccessibilityRecordCompat.Y(this.a, view0, v);
    }

    @ReplaceWith(expression = "record.setSource(root, virtualDescendantId)")
    @Deprecated
    public static void Y(AccessibilityRecord accessibilityRecord0, View view0, int v) {
        accessibilityRecord0.setSource(view0, v);
    }

    @Deprecated
    public void Z(int v) {
        this.a.setToIndex(v);
    }

    @Deprecated
    public int a() {
        return this.a.getAddedCount();
    }

    @Deprecated
    public CharSequence b() {
        return this.a.getBeforeText();
    }

    @Deprecated
    public CharSequence c() {
        return this.a.getClassName();
    }

    @Deprecated
    public CharSequence d() {
        return this.a.getContentDescription();
    }

    @Deprecated
    public int e() {
        return this.a.getCurrentItemIndex();
    }

    @Override
    @Deprecated
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AccessibilityRecordCompat)) {
            return false;
        }
        return this.a == null ? ((AccessibilityRecordCompat)object0).a == null : this.a.equals(((AccessibilityRecordCompat)object0).a);
    }

    @Deprecated
    public int f() {
        return this.a.getFromIndex();
    }

    @Deprecated
    public Object g() {
        return this.a;
    }

    @Deprecated
    public int h() {
        return this.a.getItemCount();
    }

    @Override
    @Deprecated
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Deprecated
    public int i() {
        return AccessibilityRecordCompat.j(this.a);
    }

    @ReplaceWith(expression = "record.getMaxScrollX()")
    @Deprecated
    public static int j(AccessibilityRecord accessibilityRecord0) {
        return accessibilityRecord0.getMaxScrollX();
    }

    @Deprecated
    public int k() {
        return AccessibilityRecordCompat.l(this.a);
    }

    @ReplaceWith(expression = "record.getMaxScrollY()")
    @Deprecated
    public static int l(AccessibilityRecord accessibilityRecord0) {
        return accessibilityRecord0.getMaxScrollY();
    }

    @Deprecated
    public Parcelable m() {
        return this.a.getParcelableData();
    }

    @Deprecated
    public int n() {
        return this.a.getRemovedCount();
    }

    @Deprecated
    public int o() {
        return this.a.getScrollX();
    }

    @Deprecated
    public int p() {
        return this.a.getScrollY();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public AccessibilityNodeInfoCompat q() {
        return AccessibilityNodeInfoCompat.u2(this.a.getSource());
    }

    @Deprecated
    public List r() {
        return this.a.getText();
    }

    @Deprecated
    public int s() {
        return this.a.getToIndex();
    }

    @Deprecated
    public int t() {
        return this.a.getWindowId();
    }

    @Deprecated
    public boolean u() {
        return this.a.isChecked();
    }

    @Deprecated
    public boolean v() {
        return this.a.isEnabled();
    }

    @Deprecated
    public boolean w() {
        return this.a.isFullScreen();
    }

    @Deprecated
    public boolean x() {
        return this.a.isPassword();
    }

    @Deprecated
    public boolean y() {
        return this.a.isScrollable();
    }

    @Deprecated
    public static AccessibilityRecordCompat z() {
        return new AccessibilityRecordCompat(AccessibilityRecord.obtain());
    }
}

