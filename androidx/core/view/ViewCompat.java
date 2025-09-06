package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View.AccessibilityDelegate;
import android.view.View.DragShadowBuilder;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnUnhandledKeyEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.Px;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SimpleArrayMap;
import androidx.core.R.id;
import androidx.core.util.Preconditions;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.autofill.AutofillIdCompat;
import androidx.core.view.contentcapture.ContentCaptureSessionCompat;
import androidx.core.viewtree.ViewTree;
import j..util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class ViewCompat {
    static class AccessibilityPaneVisibilityManager implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        private final WeakHashMap a;

        AccessibilityPaneVisibilityManager() {
            this.a = new WeakHashMap();
        }

        void a(View view0) {
            boolean z = view0.isShown() && view0.getWindowVisibility() == 0;
            this.a.put(view0, Boolean.valueOf(z));
            view0.addOnAttachStateChangeListener(this);
            if(view0.isAttachedToWindow()) {
                this.c(view0);
            }
        }

        private void b(Map.Entry map$Entry0) {
            View view0 = (View)map$Entry0.getKey();
            boolean z = ((Boolean)map$Entry0.getValue()).booleanValue();
            boolean z1 = view0.isShown() && view0.getWindowVisibility() == 0;
            if(z != z1) {
                ViewCompat.j1(view0, (z1 ? 16 : 0x20));
                map$Entry0.setValue(Boolean.valueOf(z1));
            }
        }

        private void c(View view0) {
            view0.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        void d(View view0) {
            this.a.remove(view0);
            view0.removeOnAttachStateChangeListener(this);
            this.e(view0);
        }

        private void e(View view0) {
            view0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
        public void onGlobalLayout() {
            if(Build.VERSION.SDK_INT < 28) {
                for(Object object0: this.a.entrySet()) {
                    this.b(((Map.Entry)object0));
                }
            }
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view0) {
            this.c(view0);
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view0) {
        }
    }

    static abstract class AccessibilityViewProperty {
        private final int a;
        private final Class b;
        private final int c;
        private final int d;

        AccessibilityViewProperty(int v, Class class0, int v1) {
            this(v, class0, 0, v1);
        }

        AccessibilityViewProperty(int v, Class class0, int v1, int v2) {
            this.a = v;
            this.b = class0;
            this.d = v1;
            this.c = v2;
        }

        // 去混淆评级： 低(20)
        boolean a(Boolean boolean0, Boolean boolean1) {
            return (boolean0 == null || !boolean0.booleanValue() ? 0 : 1) == (boolean1 == null || !boolean1.booleanValue() ? 0 : 1);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        abstract Object c(View arg1);

        abstract void d(View arg1, Object arg2);

        Object e(View view0) {
            if(this.b()) {
                return this.c(view0);
            }
            Object object0 = view0.getTag(this.a);
            return this.b.isInstance(object0) ? object0 : null;
        }

        void f(View view0, Object object0) {
            if(this.b()) {
                this.d(view0, object0);
                return;
            }
            if(this.g(this.e(view0), object0)) {
                ViewCompat.D(view0);
                view0.setTag(this.a, object0);
                ViewCompat.j1(view0, this.d);
            }
        }

        boolean g(Object object0, Object object1) {
            return !object1.equals(object0);
        }
    }

    @RequiresApi(20)
    static class Api20Impl {
        // 去混淆评级： 低(20)
        static WindowInsets a(View view0, WindowInsets windowInsets0) {
            return ViewGroupCompat.d ? ViewGroupCompat.c(view0, windowInsets0) : view0.dispatchApplyWindowInsets(windowInsets0);
        }

        static WindowInsets b(View view0, WindowInsets windowInsets0) {
            return view0.onApplyWindowInsets(windowInsets0);
        }

        static void c(View view0) {
            view0.requestApplyInsets();
        }
    }

    @RequiresApi(21)
    static class Api21Impl {
        static void a(WindowInsets windowInsets0, View view0) {
            View.OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener0 = (View.OnApplyWindowInsetsListener)view0.getTag(id.tag_window_insets_animation_callback);
            if(view$OnApplyWindowInsetsListener0 != null) {
                view$OnApplyWindowInsetsListener0.onApplyWindowInsets(view0, windowInsets0);
            }
        }

        static WindowInsetsCompat b(View view0, WindowInsetsCompat windowInsetsCompat0, Rect rect0) {
            WindowInsets windowInsets0 = windowInsetsCompat0.K();
            if(windowInsets0 != null) {
                return WindowInsetsCompat.M(view0.computeSystemWindowInsets(windowInsets0, rect0), view0);
            }
            rect0.setEmpty();
            return windowInsetsCompat0;
        }

        static boolean c(View view0, float f, float f1, boolean z) {
            return view0.dispatchNestedFling(f, f1, z);
        }

        static boolean d(View view0, float f, float f1) {
            return view0.dispatchNestedPreFling(f, f1);
        }

        static boolean e(View view0, int v, int v1, int[] arr_v, int[] arr_v1) {
            return view0.dispatchNestedPreScroll(v, v1, arr_v, arr_v1);
        }

        static boolean f(View view0, int v, int v1, int v2, int v3, int[] arr_v) {
            return view0.dispatchNestedScroll(v, v1, v2, v3, arr_v);
        }

        static ColorStateList g(View view0) {
            return view0.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view0) {
            return view0.getBackgroundTintMode();
        }

        static float i(View view0) {
            return view0.getElevation();
        }

        public static WindowInsetsCompat j(View view0) {
            return Api21ReflectionHolder.a(view0);
        }

        static String k(View view0) {
            return view0.getTransitionName();
        }

        static float l(View view0) {
            return view0.getTranslationZ();
        }

        static float m(View view0) {
            return view0.getZ();
        }

        static boolean n(View view0) {
            return view0.hasNestedScrollingParent();
        }

        static boolean o(View view0) {
            return view0.isImportantForAccessibility();
        }

        static boolean p(View view0) {
            return view0.isNestedScrollingEnabled();
        }

        static void q(View view0, ColorStateList colorStateList0) {
            view0.setBackgroundTintList(colorStateList0);
        }

        static void r(View view0, PorterDuff.Mode porterDuff$Mode0) {
            view0.setBackgroundTintMode(porterDuff$Mode0);
        }

        static void s(View view0, float f) {
            view0.setElevation(f);
        }

        static void t(View view0, boolean z) {
            view0.setNestedScrollingEnabled(z);
        }

        static void u(View view0, OnApplyWindowInsetsListener onApplyWindowInsetsListener0) {
            androidx.core.view.ViewCompat.Api21Impl.1 viewCompat$Api21Impl$10 = onApplyWindowInsetsListener0 == null ? null : new View.OnApplyWindowInsetsListener() {
                WindowInsetsCompat a;

                {
                    View view0 = view0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    OnApplyWindowInsetsListener onApplyWindowInsetsListener0 = onApplyWindowInsetsListener0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.a = null;
                }

                @Override  // android.view.View$OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
                    WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.M(windowInsets0, view0);
                    int v = Build.VERSION.SDK_INT;
                    if(v < 30) {
                        Api21Impl.a(windowInsets0, view0);
                        if(windowInsetsCompat0.equals(this.a)) {
                            return onApplyWindowInsetsListener0.a(view0, windowInsetsCompat0).K();
                        }
                    }
                    this.a = windowInsetsCompat0;
                    WindowInsetsCompat windowInsetsCompat1 = onApplyWindowInsetsListener0.a(view0, windowInsetsCompat0);
                    if(v >= 30) {
                        return windowInsetsCompat1.K();
                    }
                    ViewCompat.D1(view0);
                    return windowInsetsCompat1.K();
                }
            };
            if(Build.VERSION.SDK_INT < 30) {
                view0.setTag(id.tag_on_apply_window_listener, viewCompat$Api21Impl$10);
            }
            if(view0.getTag(id.tag_compat_insets_dispatch) != null) {
                return;
            }
            if(viewCompat$Api21Impl$10 != null) {
                view0.setOnApplyWindowInsetsListener(viewCompat$Api21Impl$10);
                return;
            }
            view0.setOnApplyWindowInsetsListener(((View.OnApplyWindowInsetsListener)view0.getTag(id.tag_window_insets_animation_callback)));
        }

        static void v(View view0, String s) {
            view0.setTransitionName(s);
        }

        static void w(View view0, float f) {
            view0.setTranslationZ(f);
        }

        static void x(View view0, float f) {
            view0.setZ(f);
        }

        static boolean y(View view0, int v) {
            return view0.startNestedScroll(v);
        }

        static void z(View view0) {
            view0.stopNestedScroll();
        }
    }

    @RequiresApi(23)
    static class Api23Impl {
        public static WindowInsetsCompat a(View view0) {
            WindowInsets windowInsets0 = view0.getRootWindowInsets();
            if(windowInsets0 == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.L(windowInsets0);
            windowInsetsCompat0.H(windowInsetsCompat0);
            windowInsetsCompat0.d(view0.getRootView());
            return windowInsetsCompat0;
        }

        static int b(View view0) {
            return view0.getScrollIndicators();
        }

        static void c(View view0, int v) {
            view0.setScrollIndicators(v);
        }

        static void d(View view0, int v, int v1) {
            view0.setScrollIndicators(v, v1);
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        static void a(View view0) {
            view0.cancelDragAndDrop();
        }

        static void b(View view0) {
            view0.dispatchFinishTemporaryDetach();
        }

        static void c(View view0) {
            view0.dispatchStartTemporaryDetach();
        }

        static void d(View view0, PointerIcon pointerIcon0) {
            view0.setPointerIcon(pointerIcon0);
        }

        static boolean e(View view0, ClipData clipData0, View.DragShadowBuilder view$DragShadowBuilder0, Object object0, int v) {
            return view0.startDragAndDrop(clipData0, view$DragShadowBuilder0, object0, v);
        }

        static void f(View view0, View.DragShadowBuilder view$DragShadowBuilder0) {
            view0.updateDragShadow(view$DragShadowBuilder0);
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        static void a(View view0, Collection collection0, int v) {
            view0.addKeyboardNavigationClusters(collection0, v);
        }

        public static AutofillId b(View view0) {
            return view0.getAutofillId();
        }

        static int c(View view0) {
            return view0.getImportantForAutofill();
        }

        static int d(View view0) {
            return view0.getNextClusterForwardId();
        }

        static boolean e(View view0) {
            return view0.hasExplicitFocusable();
        }

        static boolean f(View view0) {
            return view0.isFocusedByDefault();
        }

        static boolean g(View view0) {
            return view0.isImportantForAutofill();
        }

        static boolean h(View view0) {
            return view0.isKeyboardNavigationCluster();
        }

        static View i(View view0, View view1, int v) {
            return view0.keyboardNavigationClusterSearch(view1, v);
        }

        static boolean j(View view0) {
            return view0.restoreDefaultFocus();
        }

        static void k(View view0, String[] arr_s) {
            view0.setAutofillHints(arr_s);
        }

        static void l(View view0, boolean z) {
            view0.setFocusedByDefault(z);
        }

        static void m(View view0, int v) {
            view0.setImportantForAutofill(v);
        }

        static void n(View view0, boolean z) {
            view0.setKeyboardNavigationCluster(z);
        }

        static void o(View view0, int v) {
            view0.setNextClusterForwardId(v);
        }

        static void p(View view0, CharSequence charSequence0) {
            view0.setTooltipText(charSequence0);
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        static void a(View view0, OnUnhandledKeyEventListenerCompat viewCompat$OnUnhandledKeyEventListenerCompat0) {
            SimpleArrayMap simpleArrayMap0 = (SimpleArrayMap)view0.getTag(id.tag_unhandled_key_listeners);
            if(simpleArrayMap0 == null) {
                simpleArrayMap0 = new SimpleArrayMap();
                view0.setTag(0x7F0B0F67, simpleArrayMap0);  // id:tag_unhandled_key_listeners
            }
            Objects.requireNonNull(viewCompat$OnUnhandledKeyEventListenerCompat0);
            H h0 = new H(viewCompat$OnUnhandledKeyEventListenerCompat0);
            simpleArrayMap0.put(viewCompat$OnUnhandledKeyEventListenerCompat0, h0);
            view0.addOnUnhandledKeyEventListener(h0);
        }

        static CharSequence b(View view0) {
            return view0.getAccessibilityPaneTitle();
        }

        static boolean c(View view0) {
            return view0.isAccessibilityHeading();
        }

        static boolean d(View view0) {
            return view0.isScreenReaderFocusable();
        }

        static void e(View view0, OnUnhandledKeyEventListenerCompat viewCompat$OnUnhandledKeyEventListenerCompat0) {
            SimpleArrayMap simpleArrayMap0 = (SimpleArrayMap)view0.getTag(id.tag_unhandled_key_listeners);
            if(simpleArrayMap0 == null) {
                return;
            }
            View.OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener0 = (View.OnUnhandledKeyEventListener)simpleArrayMap0.get(viewCompat$OnUnhandledKeyEventListenerCompat0);
            if(view$OnUnhandledKeyEventListener0 != null) {
                view0.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener0);
            }
        }

        static Object f(View view0, int v) {
            return view0.requireViewById(v);
        }

        static void g(View view0, boolean z) {
            view0.setAccessibilityHeading(z);
        }

        static void h(View view0, CharSequence charSequence0) {
            view0.setAccessibilityPaneTitle(charSequence0);
        }

        public static void i(View view0, AutofillIdCompat autofillIdCompat0) {
            view0.setAutofillId((autofillIdCompat0 == null ? null : autofillIdCompat0.a()));
        }

        static void j(View view0, boolean z) {
            view0.setScreenReaderFocusable(z);
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        static View.AccessibilityDelegate a(View view0) {
            return view0.getAccessibilityDelegate();
        }

        static ContentCaptureSession b(View view0) {
            return view0.getContentCaptureSession();
        }

        static List c(View view0) {
            return view0.getSystemGestureExclusionRects();
        }

        static void d(View view0, Context context0, int[] arr_v, AttributeSet attributeSet0, TypedArray typedArray0, int v, int v1) {
            view0.saveAttributeDataForStyleable(context0, arr_v, attributeSet0, typedArray0, v, v1);
        }

        static void e(View view0, ContentCaptureSessionCompat contentCaptureSessionCompat0) {
            view0.setContentCaptureSession((contentCaptureSessionCompat0 == null ? null : contentCaptureSessionCompat0.f()));
        }

        static void f(View view0, List list0) {
            view0.setSystemGestureExclusionRects(list0);
        }

        static void g(View view0, Matrix matrix0) {
            view0.transformMatrixToGlobal(matrix0);
        }
    }

    @RequiresApi(30)
    static class Api30Impl {
        static WindowInsets a(View view0, WindowInsets windowInsets0) {
            return view0.dispatchApplyWindowInsets(windowInsets0);
        }

        static int b(View view0) {
            return view0.getImportantForContentCapture();
        }

        static CharSequence c(View view0) {
            return view0.getStateDescription();
        }

        public static WindowInsetsControllerCompat d(View view0) {
            WindowInsetsController windowInsetsController0 = view0.getWindowInsetsController();
            return windowInsetsController0 == null ? null : WindowInsetsControllerCompat.l(windowInsetsController0);
        }

        static boolean e(View view0) {
            return view0.isImportantForContentCapture();
        }

        static void f(View view0, int v) {
            view0.setImportantForContentCapture(v);
        }

        static void g(View view0, CharSequence charSequence0) {
            view0.setStateDescription(charSequence0);
        }
    }

    @RequiresApi(0x1F)
    static final class Api31Impl {
        public static String[] a(View view0) {
            return view0.getReceiveContentMimeTypes();
        }

        public static ContentInfoCompat b(View view0, ContentInfoCompat contentInfoCompat0) {
            ContentInfo contentInfo0 = contentInfoCompat0.l();
            ContentInfo contentInfo1 = view0.performReceiveContent(contentInfo0);
            if(contentInfo1 == null) {
                return null;
            }
            return contentInfo1 == contentInfo0 ? contentInfoCompat0 : ContentInfoCompat.m(contentInfo1);
        }

        public static void c(View view0, String[] arr_s, OnReceiveContentListener onReceiveContentListener0) {
            if(onReceiveContentListener0 == null) {
                view0.setOnReceiveContentListener(arr_s, null);
                return;
            }
            view0.setOnReceiveContentListener(arr_s, new OnReceiveContentListenerAdapter(onReceiveContentListener0));
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusDirection {
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRealDirection {
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRelativeDirection {
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NestedScrollType {
    }

    @RequiresApi(0x1F)
    static final class OnReceiveContentListenerAdapter implements android.view.OnReceiveContentListener {
        private final OnReceiveContentListener a;

        OnReceiveContentListenerAdapter(OnReceiveContentListener onReceiveContentListener0) {
            this.a = onReceiveContentListener0;
        }

        @Override  // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view0, ContentInfo contentInfo0) {
            ContentInfoCompat contentInfoCompat0 = ContentInfoCompat.m(contentInfo0);
            ContentInfoCompat contentInfoCompat1 = this.a.a(view0, contentInfoCompat0);
            if(contentInfoCompat1 == null) {
                return null;
            }
            return contentInfoCompat1 == contentInfoCompat0 ? contentInfo0 : contentInfoCompat1.l();
        }
    }

    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(View arg1, KeyEvent arg2);
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollAxis {
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollIndicators {
    }

    static class UnhandledKeyEventManager {
        private WeakHashMap a;
        private SparseArray b;
        private WeakReference c;
        private static final ArrayList d;

        static {
            UnhandledKeyEventManager.d = new ArrayList();
        }

        UnhandledKeyEventManager() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        static UnhandledKeyEventManager a(View view0) {
            UnhandledKeyEventManager viewCompat$UnhandledKeyEventManager0 = (UnhandledKeyEventManager)view0.getTag(id.tag_unhandled_key_event_manager);
            if(viewCompat$UnhandledKeyEventManager0 == null) {
                viewCompat$UnhandledKeyEventManager0 = new UnhandledKeyEventManager();
                view0.setTag(0x7F0B0F66, viewCompat$UnhandledKeyEventManager0);  // id:tag_unhandled_key_event_manager
            }
            return viewCompat$UnhandledKeyEventManager0;
        }

        boolean b(View view0, KeyEvent keyEvent0) {
            if(keyEvent0.getAction() == 0) {
                this.g();
            }
            View view1 = this.c(view0, keyEvent0);
            if(keyEvent0.getAction() == 0) {
                int v = keyEvent0.getKeyCode();
                if(view1 != null && !KeyEvent.isModifierKey(v)) {
                    this.d().put(v, new WeakReference(view1));
                }
            }
            return view1 != null;
        }

        private View c(View view0, KeyEvent keyEvent0) {
            if(this.a != null && this.a.containsKey(view0)) {
                if(view0 instanceof ViewGroup) {
                    for(int v = ((ViewGroup)view0).getChildCount() - 1; v >= 0; --v) {
                        View view1 = this.c(((ViewGroup)view0).getChildAt(v), keyEvent0);
                        if(view1 != null) {
                            return view1;
                        }
                    }
                }
                return this.e(view0, keyEvent0) ? view0 : null;
            }
            return null;
        }

        private SparseArray d() {
            if(this.b == null) {
                this.b = new SparseArray();
            }
            return this.b;
        }

        private boolean e(View view0, KeyEvent keyEvent0) {
            ArrayList arrayList0 = (ArrayList)view0.getTag(id.tag_unhandled_key_listeners);
            if(arrayList0 != null) {
                for(int v = arrayList0.size() - 1; v >= 0; --v) {
                    if(((OnUnhandledKeyEventListenerCompat)arrayList0.get(v)).onUnhandledKeyEvent(view0, keyEvent0)) {
                        return true;
                    }
                }
            }
            return false;
        }

        boolean f(KeyEvent keyEvent0) {
            WeakReference weakReference0;
            if(this.c != null && this.c.get() == keyEvent0) {
                return false;
            }
            this.c = new WeakReference(keyEvent0);
            SparseArray sparseArray0 = this.d();
            if(keyEvent0.getAction() == 1) {
                int v = sparseArray0.indexOfKey(keyEvent0.getKeyCode());
                if(v >= 0) {
                    weakReference0 = (WeakReference)sparseArray0.valueAt(v);
                    sparseArray0.removeAt(v);
                }
                else {
                    weakReference0 = null;
                }
            }
            else {
                weakReference0 = null;
            }
            if(weakReference0 == null) {
                weakReference0 = (WeakReference)sparseArray0.get(keyEvent0.getKeyCode());
            }
            if(weakReference0 != null) {
                View view0 = (View)weakReference0.get();
                if(view0 != null && view0.isAttachedToWindow()) {
                    this.e(view0, keyEvent0);
                }
                return true;
            }
            return false;
        }

        private void g() {
            WeakHashMap weakHashMap0 = this.a;
            if(weakHashMap0 != null) {
                weakHashMap0.clear();
            }
            ArrayList arrayList0 = UnhandledKeyEventManager.d;
            if(arrayList0.isEmpty()) {
                return;
            }
            synchronized(arrayList0) {
                if(this.a == null) {
                    this.a = new WeakHashMap();
                }
                for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
                    ArrayList arrayList1 = UnhandledKeyEventManager.d;
                    View view0 = (View)((WeakReference)arrayList1.get(v1)).get();
                    if(view0 == null) {
                        arrayList1.remove(v1);
                    }
                    else {
                        this.a.put(view0, Boolean.TRUE);
                        for(ViewParent viewParent0 = view0.getParent(); viewParent0 instanceof View; viewParent0 = viewParent0.getParent()) {
                            this.a.put(((View)viewParent0), Boolean.TRUE);
                        }
                    }
                }
            }
        }

        static void h(View view0) {
            ArrayList arrayList0 = UnhandledKeyEventManager.d;
            synchronized(arrayList0) {
                for(Object object0: arrayList0) {
                    if(((WeakReference)object0).get() == view0) {
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
                WeakReference weakReference0 = new WeakReference(view0);
                UnhandledKeyEventManager.d.add(weakReference0);
            }
        }

        static void i(View view0) {
            synchronized(UnhandledKeyEventManager.d) {
                for(int v1 = 0; true; ++v1) {
                    ArrayList arrayList1 = UnhandledKeyEventManager.d;
                    if(v1 >= arrayList1.size()) {
                        break;
                    }
                    if(((WeakReference)arrayList1.get(v1)).get() == view0) {
                        arrayList1.remove(v1);
                        return;
                    }
                }
            }
        }
    }

    @Deprecated
    public static final int A = 0x1000000;
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 4;
    public static final int J = 8;
    public static final int K = 16;
    public static final int L = 0x20;
    private static Method M = null;
    private static Method N = null;
    private static boolean O = false;
    private static WeakHashMap P = null;
    private static WeakHashMap Q = null;
    private static Method R = null;
    private static Field S = null;
    private static boolean T = false;
    private static boolean U = true;
    private static ThreadLocal V = null;
    private static final int[] W = null;
    private static final OnReceiveContentViewBehavior X = null;
    private static final AccessibilityPaneVisibilityManager Y = null;
    private static final String a = "ViewCompat";
    @Deprecated
    public static final int b = 0;
    @Deprecated
    public static final int c = 1;
    @Deprecated
    public static final int d = 2;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 4;
    public static final int i = 8;
    @Deprecated
    public static final int j = 0;
    @Deprecated
    public static final int k = 1;
    @Deprecated
    public static final int l = 2;
    @Deprecated
    public static final int m = 4;
    public static final int n = 0;
    public static final int o = 1;
    public static final int p = 2;
    @Deprecated
    public static final int q = 0;
    @Deprecated
    public static final int r = 1;
    @Deprecated
    public static final int s = 2;
    @Deprecated
    public static final int t = 0;
    @Deprecated
    public static final int u = 1;
    @Deprecated
    public static final int v = 2;
    @Deprecated
    public static final int w = 3;
    @Deprecated
    public static final int x = 0xFFFFFF;
    @Deprecated
    public static final int y = 0xFF000000;
    @Deprecated
    public static final int z = 16;

    static {
        ViewCompat.W = new int[]{id.accessibility_custom_action_0, id.accessibility_custom_action_1, id.accessibility_custom_action_2, id.accessibility_custom_action_3, id.accessibility_custom_action_4, id.accessibility_custom_action_5, id.accessibility_custom_action_6, id.accessibility_custom_action_7, id.accessibility_custom_action_8, id.accessibility_custom_action_9, id.accessibility_custom_action_10, id.accessibility_custom_action_11, id.accessibility_custom_action_12, id.accessibility_custom_action_13, id.accessibility_custom_action_14, id.accessibility_custom_action_15, id.accessibility_custom_action_16, id.accessibility_custom_action_17, id.accessibility_custom_action_18, id.accessibility_custom_action_19, id.accessibility_custom_action_20, id.accessibility_custom_action_21, id.accessibility_custom_action_22, id.accessibility_custom_action_23, id.accessibility_custom_action_24, id.accessibility_custom_action_25, id.accessibility_custom_action_26, id.accessibility_custom_action_27, id.accessibility_custom_action_28, id.accessibility_custom_action_29, id.accessibility_custom_action_30, id.accessibility_custom_action_31};
        ViewCompat.X = (ContentInfoCompat contentInfoCompat0) -> contentInfoCompat0;
        ViewCompat.Y = new AccessibilityPaneVisibilityManager();
    }

    @UiThread
    static boolean A(View view0, KeyEvent keyEvent0) {
        return Build.VERSION.SDK_INT < 28 ? UnhandledKeyEventManager.a(view0).b(view0, keyEvent0) : false;
    }

    @UiThread
    public static CharSequence A0(View view0) {
        return (CharSequence)ViewCompat.Q2().e(view0);
    }

    private static void A1(int v, View view0) {
        List list0 = ViewCompat.M(view0);
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            if(((AccessibilityActionCompat)list0.get(v1)).b() == v) {
                list0.remove(v1);
                return;
            }
        }
    }

    public static void A2(View view0, int v) {
        if(Build.VERSION.SDK_INT >= 23) {
            Api23Impl.c(view0, v);
        }
    }

    @UiThread
    static boolean B(View view0, KeyEvent keyEvent0) {
        return Build.VERSION.SDK_INT < 28 ? UnhandledKeyEventManager.a(view0).f(keyEvent0) : false;
    }

    public static List B0(View view0) {
        return Build.VERSION.SDK_INT < 29 ? Collections.emptyList() : Api29Impl.c(view0);
    }

    public static void B1(View view0, OnUnhandledKeyEventListenerCompat viewCompat$OnUnhandledKeyEventListenerCompat0) {
        if(Build.VERSION.SDK_INT >= 28) {
            Api28Impl.e(view0, viewCompat$OnUnhandledKeyEventListenerCompat0);
            return;
        }
        ArrayList arrayList0 = (ArrayList)view0.getTag(id.tag_unhandled_key_listeners);
        if(arrayList0 != null) {
            arrayList0.remove(viewCompat$OnUnhandledKeyEventListenerCompat0);
            if(arrayList0.size() == 0) {
                UnhandledKeyEventManager.i(view0);
            }
        }
    }

    public static void B2(View view0, int v, int v1) {
        if(Build.VERSION.SDK_INT >= 23) {
            Api23Impl.d(view0, v, v1);
        }
    }

    public static void C(View view0) {
        ViewCompat.D(view0);
    }

    public static String C0(View view0) {
        return Api21Impl.k(view0);
    }

    public static void C1(View view0, AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat0, CharSequence charSequence0, AccessibilityViewCommand accessibilityViewCommand0) {
        if(accessibilityViewCommand0 == null && charSequence0 == null) {
            ViewCompat.z1(view0, accessibilityNodeInfoCompat$AccessibilityActionCompat0.b());
            return;
        }
        ViewCompat.d(view0, accessibilityNodeInfoCompat$AccessibilityActionCompat0.a(charSequence0, accessibilityViewCommand0));
    }

    @UiThread
    public static void C2(View view0, CharSequence charSequence0) {
        ViewCompat.Q2().f(view0, charSequence0);
    }

    static void D(View view0) {
        AccessibilityDelegateCompat accessibilityDelegateCompat0 = ViewCompat.G(view0);
        if(accessibilityDelegateCompat0 == null) {
            accessibilityDelegateCompat0 = new AccessibilityDelegateCompat();
        }
        ViewCompat.J1(view0, accessibilityDelegateCompat0);
    }

    @ReplaceWith(expression = "view.getTranslationX()")
    @Deprecated
    public static float D0(View view0) {
        return view0.getTranslationX();
    }

    public static void D1(View view0) {
        Api20Impl.c(view0);
    }

    public static void D2(View view0, List list0) {
        if(Build.VERSION.SDK_INT >= 29) {
            Api29Impl.f(view0, list0);
        }
    }

    @VisibleForTesting
    static void E(View view0, Matrix matrix0) {
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 instanceof View) {
            ViewCompat.E(((View)viewParent0), matrix0);
            matrix0.preTranslate(((float)(-((View)viewParent0).getScrollX())), ((float)(-((View)viewParent0).getScrollY())));
        }
        matrix0.preTranslate(((float)view0.getLeft()), ((float)view0.getTop()));
        matrix0.preConcat(view0.getMatrix());
    }

    @ReplaceWith(expression = "view.getTranslationY()")
    @Deprecated
    public static float E0(View view0) {
        return view0.getTranslationY();
    }

    public static View E1(View view0, @IdRes int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            return (View)Api28Impl.f(view0, v);
        }
        View view1 = view0.findViewById(v);
        if(view1 == null) {
            throw new IllegalArgumentException("ID does not reference a View inside this View");
        }
        return view1;
    }

    public static void E2(View view0, CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.p(view0, charSequence0);
        }
    }

    @Deprecated
    public static int F() {
        return View.generateViewId();
    }

    public static float F0(View view0) {
        return Api21Impl.l(view0);
    }

    @Deprecated
    public static int F1(int v, int v1, int v2) {
        return View.resolveSizeAndState(v, v1, v2);
    }

    public static void F2(View view0, String s) {
        Api21Impl.v(view0, s);
    }

    public static AccessibilityDelegateCompat G(View view0) {
        View.AccessibilityDelegate view$AccessibilityDelegate0 = ViewCompat.H(view0);
        if(view$AccessibilityDelegate0 == null) {
            return null;
        }
        return view$AccessibilityDelegate0 instanceof AccessibilityDelegateAdapter ? ((AccessibilityDelegateAdapter)view$AccessibilityDelegate0).a : new AccessibilityDelegateCompat(view$AccessibilityDelegate0);
    }

    @Deprecated
    public static WindowInsetsControllerCompat G0(View view0) {
        if(Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.d(view0);
        }
        for(Context context0 = view0.getContext(); context0 instanceof ContextWrapper; context0 = ((ContextWrapper)context0).getBaseContext()) {
            if(context0 instanceof Activity) {
                Window window0 = ((Activity)context0).getWindow();
                return window0 == null ? null : WindowCompat.a(window0, view0);
            }
        }
        return null;
    }

    public static boolean G1(View view0) {
        return Build.VERSION.SDK_INT < 26 ? view0.requestFocus() : Api26Impl.j(view0);
    }

    @ReplaceWith(expression = "view.setTranslationX(value)")
    @Deprecated
    public static void G2(View view0, float f) {
        view0.setTranslationX(f);
    }

    private static View.AccessibilityDelegate H(View view0) {
        return Build.VERSION.SDK_INT < 29 ? ViewCompat.I(view0) : Api29Impl.a(view0);
    }

    @ReplaceWith(expression = "view.getWindowSystemUiVisibility()")
    @Deprecated
    public static int H0(View view0) {
        return view0.getWindowSystemUiVisibility();
    }

    public static void H1(View view0, @SuppressLint({"ContextFirst"}) Context context0, int[] arr_v, AttributeSet attributeSet0, TypedArray typedArray0, int v, int v1) {
        if(Build.VERSION.SDK_INT >= 29) {
            Api29Impl.d(view0, context0, arr_v, attributeSet0, typedArray0, v, v1);
        }
    }

    @ReplaceWith(expression = "view.setTranslationY(value)")
    @Deprecated
    public static void H2(View view0, float f) {
        view0.setTranslationY(f);
    }

    private static View.AccessibilityDelegate I(View view0) {
        if(ViewCompat.T) {
            return null;
        }
        if(ViewCompat.S == null) {
            try {
                Field field0 = View.class.getDeclaredField("mAccessibilityDelegate");
                ViewCompat.S = field0;
                field0.setAccessible(true);
            }
            catch(Throwable unused_ex) {
                ViewCompat.T = true;
                return null;
            }
        }
        try {
            Object object0 = ViewCompat.S.get(view0);
            return object0 instanceof View.AccessibilityDelegate ? ((View.AccessibilityDelegate)object0) : null;
        }
        catch(Throwable unused_ex) {
            ViewCompat.T = true;
            return null;
        }
    }

    @ReplaceWith(expression = "view.getX()")
    @Deprecated
    public static float I0(View view0) {
        return view0.getX();
    }

    private static AccessibilityViewProperty I1() {
        return new AccessibilityViewProperty(id.tag_screen_reader_focusable, Boolean.class, 28) {
            @Override  // androidx.core.view.ViewCompat$AccessibilityViewProperty
            @RequiresApi(28)
            Object c(View view0) {
                return this.h(view0);
            }

            @Override  // androidx.core.view.ViewCompat$AccessibilityViewProperty
            @RequiresApi(28)
            void d(View view0, Object object0) {
                this.i(view0, ((Boolean)object0));
            }

            @Override  // androidx.core.view.ViewCompat$AccessibilityViewProperty
            boolean g(Object object0, Object object1) {
                return this.j(((Boolean)object0), ((Boolean)object1));
            }

            @RequiresApi(28)
            Boolean h(View view0) {
                return Boolean.valueOf(Api28Impl.d(view0));
            }

            @RequiresApi(28)
            void i(View view0, Boolean boolean0) {
                Api28Impl.j(view0, boolean0.booleanValue());
            }

            boolean j(Boolean boolean0, Boolean boolean1) {
                return !this.a(boolean0, boolean1);
            }
        };
    }

    public static void I2(View view0, float f) {
        Api21Impl.w(view0, f);
    }

    @ReplaceWith(expression = "view.getAccessibilityLiveRegion()")
    @Deprecated
    public static int J(View view0) {
        return view0.getAccessibilityLiveRegion();
    }

    @ReplaceWith(expression = "view.getY()")
    @Deprecated
    public static float J0(View view0) {
        return view0.getY();
    }

    public static void J1(View view0, AccessibilityDelegateCompat accessibilityDelegateCompat0) {
        if(accessibilityDelegateCompat0 == null && ViewCompat.H(view0) instanceof AccessibilityDelegateAdapter) {
            accessibilityDelegateCompat0 = new AccessibilityDelegateCompat();
        }
        ViewCompat.c2(view0);
        view0.setAccessibilityDelegate((accessibilityDelegateCompat0 == null ? null : accessibilityDelegateCompat0.d()));
    }

    public static void J2(View view0, Callback windowInsetsAnimationCompat$Callback0) {
        WindowInsetsAnimationCompat.h(view0, windowInsetsAnimationCompat$Callback0);
    }

    public static AccessibilityNodeProviderCompat K(View view0) {
        AccessibilityNodeProvider accessibilityNodeProvider0 = view0.getAccessibilityNodeProvider();
        return accessibilityNodeProvider0 == null ? null : new AccessibilityNodeProviderCompat(accessibilityNodeProvider0);
    }

    public static float K0(View view0) {
        return Api21Impl.m(view0);
    }

    @UiThread
    public static void K1(View view0, boolean z) {
        ViewCompat.b().f(view0, Boolean.valueOf(z));
    }

    @ReplaceWith(expression = "view.setX(value)")
    @Deprecated
    public static void K2(View view0, float f) {
        view0.setX(f);
    }

    @UiThread
    public static CharSequence L(View view0) {
        return (CharSequence)ViewCompat.q1().e(view0);
    }

    public static boolean L0(View view0) {
        return ViewCompat.H(view0) != null;
    }

    @ReplaceWith(expression = "view.setAccessibilityLiveRegion(mode)")
    @Deprecated
    public static void L1(View view0, int v) {
        view0.setAccessibilityLiveRegion(v);
    }

    @ReplaceWith(expression = "view.setY(value)")
    @Deprecated
    public static void L2(View view0, float f) {
        view0.setY(f);
    }

    private static List M(View view0) {
        List list0 = (ArrayList)view0.getTag(id.tag_accessibility_actions);
        if(list0 == null) {
            list0 = new ArrayList();
            view0.setTag(0x7F0B0F5A, list0);  // id:tag_accessibility_actions
        }
        return list0;
    }

    public static boolean M0(View view0) {
        return Build.VERSION.SDK_INT < 26 ? view0.hasFocusable() : Api26Impl.e(view0);
    }

    @UiThread
    public static void M1(View view0, CharSequence charSequence0) {
        ViewCompat.q1().f(view0, charSequence0);
        if(charSequence0 != null) {
            ViewCompat.Y.a(view0);
            return;
        }
        ViewCompat.Y.d(view0);
    }

    public static void M2(View view0, float f) {
        Api21Impl.x(view0, f);
    }

    @ReplaceWith(expression = "view.getAlpha()")
    @Deprecated
    public static float N(View view0) {
        return view0.getAlpha();
    }

    public static boolean N0(View view0) {
        return Api21Impl.n(view0);
    }

    @ReplaceWith(expression = "view.setActivated(activated)")
    @Deprecated
    public static void N1(View view0, boolean z) {
        view0.setActivated(z);
    }

    public static boolean N2(View view0, ClipData clipData0, View.DragShadowBuilder view$DragShadowBuilder0, Object object0, int v) {
        return Build.VERSION.SDK_INT < 24 ? view0.startDrag(clipData0, view$DragShadowBuilder0, object0, v) : Api24Impl.e(view0, clipData0, view$DragShadowBuilder0, object0, v);
    }

    public static AutofillIdCompat O(View view0) {
        return Build.VERSION.SDK_INT < 26 ? null : AutofillIdCompat.b(Api26Impl.b(view0));
    }

    public static boolean O0(View view0, int v) {
        if(view0 instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2)view0).hasNestedScrollingParent(v);
            return false;
        }
        return v == 0 ? ViewCompat.N0(view0) : false;
    }

    @ReplaceWith(expression = "view.setAlpha(value)")
    @Deprecated
    public static void O1(View view0, @FloatRange(from = 0.0, to = 1.0) float f) {
        view0.setAlpha(f);
    }

    public static boolean O2(View view0, int v) {
        return Api21Impl.y(view0, v);
    }

    private static int P(View view0, CharSequence charSequence0) {
        List list0 = ViewCompat.M(view0);
        for(int v = 0; v < list0.size(); ++v) {
            if(TextUtils.equals(charSequence0, ((AccessibilityActionCompat)list0.get(v)).c())) {
                return ((AccessibilityActionCompat)list0.get(v)).b();
            }
        }
        int v2 = -1;
        for(int v1 = 0; true; ++v1) {
            int[] arr_v = ViewCompat.W;
            if(v1 >= arr_v.length || v2 != -1) {
                break;
            }
            int v3 = arr_v[v1];
            int v5 = 1;
            for(int v4 = 0; v4 < list0.size(); ++v4) {
                v5 &= (((AccessibilityActionCompat)list0.get(v4)).b() == v3 ? 0 : 1);
            }
            if(v5 != 0) {
                v2 = v3;
            }
        }
        return v2;
    }

    @ReplaceWith(expression = "view.hasOnClickListeners()")
    @Deprecated
    public static boolean P0(View view0) {
        return view0.hasOnClickListeners();
    }

    public static void P1(View view0, String[] arr_s) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.k(view0, arr_s);
        }
    }

    public static boolean P2(View view0, int v, int v1) {
        if(view0 instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2)view0).startNestedScroll(v, v1);
        }
        return v1 == 0 ? ViewCompat.O2(view0, v) : false;
    }

    public static ColorStateList Q(View view0) {
        return Api21Impl.g(view0);
    }

    @ReplaceWith(expression = "view.hasOverlappingRendering()")
    @Deprecated
    public static boolean Q0(View view0) {
        return view0.hasOverlappingRendering();
    }

    public static void Q1(View view0, AutofillIdCompat autofillIdCompat0) {
        if(Build.VERSION.SDK_INT >= 28) {
            Api28Impl.i(view0, autofillIdCompat0);
        }
    }

    private static AccessibilityViewProperty Q2() {
        return new AccessibilityViewProperty(id.tag_state_description, CharSequence.class, 0x40, 30) {
            @Override  // androidx.core.view.ViewCompat$AccessibilityViewProperty
            @RequiresApi(30)
            Object c(View view0) {
                return this.h(view0);
            }

            @Override  // androidx.core.view.ViewCompat$AccessibilityViewProperty
            @RequiresApi(30)
            void d(View view0, Object object0) {
                this.i(view0, ((CharSequence)object0));
            }

            @Override  // androidx.core.view.ViewCompat$AccessibilityViewProperty
            boolean g(Object object0, Object object1) {
                return this.j(((CharSequence)object0), ((CharSequence)object1));
            }

            @RequiresApi(30)
            CharSequence h(View view0) {
                return Api30Impl.c(view0);
            }

            @RequiresApi(30)
            void i(View view0, CharSequence charSequence0) {
                Api30Impl.g(view0, charSequence0);
            }

            boolean j(CharSequence charSequence0, CharSequence charSequence1) {
                return !TextUtils.equals(charSequence0, charSequence1);
            }
        };
    }

    public static PorterDuff.Mode R(View view0) {
        return Api21Impl.h(view0);
    }

    @ReplaceWith(expression = "view.hasTransientState()")
    @Deprecated
    public static boolean R0(View view0) {
        return view0.hasTransientState();
    }

    @ReplaceWith(expression = "view.setBackground(background)")
    @Deprecated
    public static void R1(View view0, Drawable drawable0) {
        view0.setBackground(drawable0);
    }

    public static void R2(View view0) {
        Api21Impl.z(view0);
    }

    @ReplaceWith(expression = "view.getClipBounds()")
    @Deprecated
    public static Rect S(View view0) {
        return view0.getClipBounds();
    }

    @UiThread
    public static boolean S0(View view0) {
        Boolean boolean0 = (Boolean)ViewCompat.b().e(view0);
        return boolean0 != null && boolean0.booleanValue();
    }

    public static void S1(View view0, ColorStateList colorStateList0) {
        int v = Build.VERSION.SDK_INT;
        Api21Impl.q(view0, colorStateList0);
        if(v == 21) {
            Drawable drawable0 = view0.getBackground();
            if(drawable0 != null && (Api21Impl.g(view0) != null || Api21Impl.h(view0) != null)) {
                if(drawable0.isStateful()) {
                    drawable0.setState(view0.getDrawableState());
                }
                view0.setBackground(drawable0);
            }
        }
    }

    public static void S2(View view0, int v) {
        if(view0 instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2)view0).stopNestedScroll(v);
            return;
        }
        if(v == 0) {
            ViewCompat.R2(view0);
        }
    }

    public static ContentCaptureSessionCompat T(View view0) {
        if(Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSession0 = Api29Impl.b(view0);
            return contentCaptureSession0 == null ? null : ContentCaptureSessionCompat.g(contentCaptureSession0, view0);
        }
        return null;
    }

    @ReplaceWith(expression = "view.isAttachedToWindow()")
    @Deprecated
    public static boolean T0(View view0) {
        return view0.isAttachedToWindow();
    }

    public static void T1(View view0, PorterDuff.Mode porterDuff$Mode0) {
        int v = Build.VERSION.SDK_INT;
        Api21Impl.r(view0, porterDuff$Mode0);
        if(v == 21) {
            Drawable drawable0 = view0.getBackground();
            if(drawable0 != null && (Api21Impl.g(view0) != null || Api21Impl.h(view0) != null)) {
                if(drawable0.isStateful()) {
                    drawable0.setState(view0.getDrawableState());
                }
                view0.setBackground(drawable0);
            }
        }
    }

    private static void T2(View view0) {
        float f = view0.getTranslationY();
        view0.setTranslationY(f + 1.0f);
        view0.setTranslationY(f);
    }

    @ReplaceWith(expression = "view.getDisplay()")
    @Deprecated
    public static Display U(View view0) {
        return view0.getDisplay();
    }

    public static boolean U0(View view0) {
        return Build.VERSION.SDK_INT < 26 ? false : Api26Impl.f(view0);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    public static void U1(ViewGroup viewGroup0, boolean z) {
        if(ViewCompat.R == null) {
            try {
                ViewCompat.R = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", noSuchMethodException0);
            }
            ViewCompat.R.setAccessible(true);
        }
        try {
            ViewCompat.R.invoke(viewGroup0, Boolean.valueOf(z));
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", illegalAccessException0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", illegalArgumentException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", invocationTargetException0);
        }
    }

    @SuppressLint({"NewApi"})
    public static void U2(View view0, Matrix matrix0) {
        if(Build.VERSION.SDK_INT >= 29) {
            Api29Impl.g(view0, matrix0);
            return;
        }
        if(ViewCompat.U) {
            try {
                Api29Impl.g(view0, matrix0);
                return;
            }
            catch(NoSuchMethodError unused_ex) {
                ViewCompat.U = false;
            }
        }
        ViewCompat.E(view0, matrix0);
    }

    public static float V(View view0) {
        return Api21Impl.i(view0);
    }

    public static boolean V0(View view0) {
        return Api21Impl.o(view0);
    }

    @ReplaceWith(expression = "view.setClipBounds(clipBounds)")
    @Deprecated
    public static void V1(View view0, Rect rect0) {
        view0.setClipBounds(rect0);
    }

    public static void V2(View view0, View.DragShadowBuilder view$DragShadowBuilder0) {
        if(Build.VERSION.SDK_INT >= 24) {
            Api24Impl.f(view0, view$DragShadowBuilder0);
        }
    }

    private static Rect W() {
        if(ViewCompat.V == null) {
            ViewCompat.V = new ThreadLocal();
        }
        Rect rect0 = (Rect)ViewCompat.V.get();
        if(rect0 == null) {
            rect0 = new Rect();
            ViewCompat.V.set(rect0);
        }
        rect0.setEmpty();
        return rect0;
    }

    public static boolean W0(View view0) {
        return Build.VERSION.SDK_INT < 26 ? true : Api26Impl.g(view0);
    }

    public static void W1(View view0, ContentCaptureSessionCompat contentCaptureSessionCompat0) {
        if(Build.VERSION.SDK_INT >= 29) {
            Api29Impl.e(view0, contentCaptureSessionCompat0);
        }
    }

    // 去混淆评级： 低(20)
    private static OnReceiveContentViewBehavior X(View view0) {
        return view0 instanceof OnReceiveContentViewBehavior ? ((OnReceiveContentViewBehavior)view0) : ViewCompat.X;
    }

    public static boolean X0(View view0) {
        return Build.VERSION.SDK_INT < 30 ? false : Api30Impl.e(view0);
    }

    public static void X1(View view0, float f) {
        Api21Impl.s(view0, f);
    }

    @ReplaceWith(expression = "view.getFitsSystemWindows()")
    @Deprecated
    public static boolean Y(View view0) {
        return view0.getFitsSystemWindows();
    }

    @ReplaceWith(expression = "view.isInLayout()")
    @Deprecated
    public static boolean Y0(View view0) {
        return view0.isInLayout();
    }

    @ReplaceWith(expression = "view.setFitsSystemWindows(fitSystemWindows)")
    @Deprecated
    public static void Y1(View view0, boolean z) {
        view0.setFitsSystemWindows(z);
    }

    @ReplaceWith(expression = "view.getImportantForAccessibility()")
    @Deprecated
    public static int Z(View view0) {
        return view0.getImportantForAccessibility();
    }

    public static boolean Z0(View view0) {
        return Build.VERSION.SDK_INT < 26 ? false : Api26Impl.h(view0);
    }

    public static void Z1(View view0, boolean z) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.l(view0, z);
        }
    }

    // 检测为 Lambda 实现
    public static ContentInfoCompat a(ContentInfoCompat contentInfoCompat0) [...]

    @SuppressLint({"InlinedApi"})
    public static int a0(View view0) {
        return Build.VERSION.SDK_INT < 26 ? 0 : Api26Impl.c(view0);
    }

    @ReplaceWith(expression = "view.isLaidOut()")
    @Deprecated
    public static boolean a1(View view0) {
        return view0.isLaidOut();
    }

    @ReplaceWith(expression = "view.setHasTransientState(hasTransientState)")
    @Deprecated
    public static void a2(View view0, boolean z) {
        view0.setHasTransientState(z);
    }

    private static AccessibilityViewProperty b() {
        return new AccessibilityViewProperty(id.tag_accessibility_heading, Boolean.class, 28) {
            @Override  // androidx.core.view.ViewCompat$AccessibilityViewProperty
            @RequiresApi(28)
            Object c(View view0) {
                return this.h(view0);
            }

            @Override  // androidx.core.view.ViewCompat$AccessibilityViewProperty
            @RequiresApi(28)
            void d(View view0, Object object0) {
                this.i(view0, ((Boolean)object0));
            }

            @Override  // androidx.core.view.ViewCompat$AccessibilityViewProperty
            boolean g(Object object0, Object object1) {
                return this.j(((Boolean)object0), ((Boolean)object1));
            }

            @RequiresApi(28)
            Boolean h(View view0) {
                return Boolean.valueOf(Api28Impl.c(view0));
            }

            @RequiresApi(28)
            void i(View view0, Boolean boolean0) {
                Api28Impl.g(view0, boolean0.booleanValue());
            }

            boolean j(Boolean boolean0, Boolean boolean1) {
                return !this.a(boolean0, boolean1);
            }
        };
    }

    public static int b0(View view0) {
        return Build.VERSION.SDK_INT < 30 ? 0 : Api30Impl.b(view0);
    }

    @ReplaceWith(expression = "view.isLayoutDirectionResolved()")
    @Deprecated
    public static boolean b1(View view0) {
        return view0.isLayoutDirectionResolved();
    }

    @ReplaceWith(expression = "view.setImportantForAccessibility(mode)")
    @UiThread
    @Deprecated
    public static void b2(View view0, int v) {
        view0.setImportantForAccessibility(v);
    }

    public static int c(View view0, CharSequence charSequence0, AccessibilityViewCommand accessibilityViewCommand0) {
        int v = ViewCompat.P(view0, charSequence0);
        if(v != -1) {
            ViewCompat.d(view0, new AccessibilityActionCompat(v, charSequence0, accessibilityViewCommand0));
        }
        return v;
    }

    @ReplaceWith(expression = "view.getLabelFor()")
    @Deprecated
    public static int c0(View view0) {
        return view0.getLabelFor();
    }

    public static boolean c1(View view0) {
        return Api21Impl.p(view0);
    }

    private static void c2(View view0) {
        if(view0.getImportantForAccessibility() == 0) {
            view0.setImportantForAccessibility(1);
        }
    }

    private static void d(View view0, AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat0) {
        ViewCompat.D(view0);
        ViewCompat.A1(accessibilityNodeInfoCompat$AccessibilityActionCompat0.b(), view0);
        ViewCompat.M(view0).add(accessibilityNodeInfoCompat$AccessibilityActionCompat0);
        ViewCompat.j1(view0, 0);
    }

    @ReplaceWith(expression = "view.getLayerType()")
    @Deprecated
    public static int d0(View view0) {
        return view0.getLayerType();
    }

    @ReplaceWith(expression = "view.isOpaque()")
    @Deprecated
    public static boolean d1(View view0) {
        return view0.isOpaque();
    }

    public static void d2(View view0, int v) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m(view0, v);
        }
    }

    public static void e(View view0, Collection collection0, int v) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.a(view0, collection0, v);
        }
    }

    @ReplaceWith(expression = "view.getLayoutDirection()")
    @Deprecated
    public static int e0(View view0) {
        return view0.getLayoutDirection();
    }

    @ReplaceWith(expression = "view.isPaddingRelative()")
    @Deprecated
    public static boolean e1(View view0) {
        return view0.isPaddingRelative();
    }

    public static void e2(View view0, int v) {
        if(Build.VERSION.SDK_INT >= 30) {
            Api30Impl.f(view0, v);
        }
    }

    public static void f(View view0, OnUnhandledKeyEventListenerCompat viewCompat$OnUnhandledKeyEventListenerCompat0) {
        if(Build.VERSION.SDK_INT >= 28) {
            Api28Impl.a(view0, viewCompat$OnUnhandledKeyEventListenerCompat0);
            return;
        }
        ArrayList arrayList0 = (ArrayList)view0.getTag(id.tag_unhandled_key_listeners);
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            view0.setTag(0x7F0B0F67, arrayList0);  // id:tag_unhandled_key_listeners
        }
        arrayList0.add(viewCompat$OnUnhandledKeyEventListenerCompat0);
        if(arrayList0.size() == 1) {
            UnhandledKeyEventManager.h(view0);
        }
    }

    @ReplaceWith(expression = "view.getMatrix()")
    @Deprecated
    public static Matrix f0(View view0) {
        return view0.getMatrix();
    }

    @UiThread
    public static boolean f1(View view0) {
        Boolean boolean0 = (Boolean)ViewCompat.I1().e(view0);
        return boolean0 != null && boolean0.booleanValue();
    }

    public static void f2(View view0, boolean z) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.n(view0, z);
        }
    }

    public static void g(ViewGroup viewGroup0, View view0) {
        viewGroup0.getOverlay().add(view0);
        ViewTree.b(((View)view0.getParent()), viewGroup0);
    }

    @ReplaceWith(expression = "view.getMeasuredHeightAndState()")
    @Deprecated
    public static int g0(View view0) {
        return view0.getMeasuredHeightAndState();
    }

    @ReplaceWith(expression = "view.jumpDrawablesToCurrentState()")
    @Deprecated
    public static void g1(View view0) {
        view0.jumpDrawablesToCurrentState();
    }

    @ReplaceWith(expression = "view.setLabelFor(labeledId)")
    @Deprecated
    public static void g2(View view0, @IdRes int v) {
        view0.setLabelFor(v);
    }

    @Deprecated
    public static ViewPropertyAnimatorCompat h(View view0) {
        if(ViewCompat.Q == null) {
            ViewCompat.Q = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = (ViewPropertyAnimatorCompat)ViewCompat.Q.get(view0);
        if(viewPropertyAnimatorCompat0 == null) {
            viewPropertyAnimatorCompat0 = new ViewPropertyAnimatorCompat(view0);
            ViewCompat.Q.put(view0, viewPropertyAnimatorCompat0);
        }
        return viewPropertyAnimatorCompat0;
    }

    @ReplaceWith(expression = "view.getMeasuredState()")
    @Deprecated
    public static int h0(View view0) {
        return view0.getMeasuredState();
    }

    public static View h1(View view0, View view1, int v) {
        return Build.VERSION.SDK_INT < 26 ? null : Api26Impl.i(view0, view1, v);
    }

    @ReplaceWith(expression = "view.setLayerPaint(paint)")
    @Deprecated
    public static void h2(View view0, Paint paint0) {
        view0.setLayerPaint(paint0);
    }

    private static void i() {
        try {
            ViewCompat.M = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", null);
            ViewCompat.N = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", null);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            Log.e("ViewCompat", "Couldn\'t find method", noSuchMethodException0);
        }
        ViewCompat.O = true;
    }

    @ReplaceWith(expression = "view.getMeasuredWidthAndState()")
    @Deprecated
    public static int i0(View view0) {
        return view0.getMeasuredWidthAndState();
    }

    private static ContentInfoCompat i1(ContentInfoCompat contentInfoCompat0) [...] // Inlined contents

    @ReplaceWith(expression = "view.setLayerType(layerType, paint)")
    @Deprecated
    public static void i2(View view0, int v, Paint paint0) {
        view0.setLayerType(v, paint0);
    }

    @ReplaceWith(expression = "view.canScrollHorizontally(direction)")
    @Deprecated
    public static boolean j(View view0, int v) {
        return view0.canScrollHorizontally(v);
    }

    @ReplaceWith(expression = "view.getMinimumHeight()")
    @Deprecated
    public static int j0(View view0) {
        return view0.getMinimumHeight();
    }

    static void j1(View view0, int v) {
        AccessibilityManager accessibilityManager0 = (AccessibilityManager)view0.getContext().getSystemService("accessibility");
        if(!accessibilityManager0.isEnabled()) {
            return;
        }
        boolean z = ViewCompat.L(view0) != null && view0.isShown() && view0.getWindowVisibility() == 0;
        int v1 = 0x20;
        if(view0.getAccessibilityLiveRegion() != 0 || z) {
            AccessibilityEvent accessibilityEvent1 = AccessibilityEvent.obtain();
            if(!z) {
                v1 = 0x800;
            }
            accessibilityEvent1.setEventType(v1);
            accessibilityEvent1.setContentChangeTypes(v);
            if(z) {
                accessibilityEvent1.getText().add(ViewCompat.L(view0));
                ViewCompat.c2(view0);
            }
            view0.sendAccessibilityEventUnchecked(accessibilityEvent1);
        }
        else {
            if(v == 0x20) {
                AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain();
                view0.onInitializeAccessibilityEvent(accessibilityEvent0);
                accessibilityEvent0.setEventType(0x20);
                accessibilityEvent0.setContentChangeTypes(0x20);
                accessibilityEvent0.setSource(view0);
                view0.onPopulateAccessibilityEvent(accessibilityEvent0);
                accessibilityEvent0.getText().add(ViewCompat.L(view0));
                accessibilityManager0.sendAccessibilityEvent(accessibilityEvent0);
                return;
            }
            if(view0.getParent() != null) {
                ViewParent viewParent0 = view0.getParent();
                try {
                    viewParent0.notifySubtreeAccessibilityStateChanged(view0, view0, v);
                }
                catch(AbstractMethodError abstractMethodError0) {
                    Log.e("ViewCompat", view0.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", abstractMethodError0);
                }
            }
        }
    }

    @ReplaceWith(expression = "view.setLayoutDirection(layoutDirection)")
    @Deprecated
    public static void j2(View view0, int v) {
        view0.setLayoutDirection(v);
    }

    @ReplaceWith(expression = "view.canScrollVertically(direction)")
    @Deprecated
    public static boolean k(View view0, int v) {
        return view0.canScrollVertically(v);
    }

    @ReplaceWith(expression = "view.getMinimumWidth()")
    @Deprecated
    public static int k0(View view0) {
        return view0.getMinimumWidth();
    }

    public static void k1(View view0, int v) {
        int v1;
        if(Build.VERSION.SDK_INT >= 23) {
            view0.offsetLeftAndRight(v);
            return;
        }
        Rect rect0 = ViewCompat.W();
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 instanceof View) {
            rect0.set(((View)viewParent0).getLeft(), ((View)viewParent0).getTop(), ((View)viewParent0).getRight(), ((View)viewParent0).getBottom());
            v1 = !rect0.intersects(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
        }
        else {
            v1 = 0;
        }
        ViewCompat.n(view0, v);
        if(v1 != 0 && rect0.intersect(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom())) {
            ((View)viewParent0).invalidate(rect0);
        }
    }

    public static void k2(View view0, boolean z) {
        Api21Impl.t(view0, z);
    }

    public static void l(View view0) {
        if(Build.VERSION.SDK_INT >= 24) {
            Api24Impl.a(view0);
        }
    }

    public static int l0(View view0) {
        return Build.VERSION.SDK_INT < 26 ? -1 : Api26Impl.d(view0);
    }

    public static void l1(View view0, int v) {
        int v1;
        if(Build.VERSION.SDK_INT >= 23) {
            view0.offsetTopAndBottom(v);
            return;
        }
        Rect rect0 = ViewCompat.W();
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 instanceof View) {
            rect0.set(((View)viewParent0).getLeft(), ((View)viewParent0).getTop(), ((View)viewParent0).getRight(), ((View)viewParent0).getBottom());
            v1 = !rect0.intersects(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
        }
        else {
            v1 = 0;
        }
        ViewCompat.o(view0, v);
        if(v1 != 0 && rect0.intersect(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom())) {
            ((View)viewParent0).invalidate(rect0);
        }
    }

    public static void l2(View view0, int v) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.o(view0, v);
        }
    }

    @Deprecated
    public static int m(int v, int v1) {
        return View.combineMeasuredStates(v, v1);
    }

    public static String[] m0(View view0) {
        return Build.VERSION.SDK_INT < 0x1F ? ((String[])view0.getTag(id.tag_on_receive_content_mime_types)) : Api31Impl.a(view0);
    }

    public static WindowInsetsCompat m1(View view0, WindowInsetsCompat windowInsetsCompat0) {
        WindowInsets windowInsets0 = windowInsetsCompat0.K();
        if(windowInsets0 != null) {
            WindowInsets windowInsets1 = Api20Impl.b(view0, windowInsets0);
            return windowInsets1.equals(windowInsets0) ? windowInsetsCompat0 : WindowInsetsCompat.M(windowInsets1, view0);
        }
        return windowInsetsCompat0;
    }

    public static void m2(View view0, OnApplyWindowInsetsListener onApplyWindowInsetsListener0) {
        Api21Impl.u(view0, onApplyWindowInsetsListener0);
    }

    private static void n(View view0, int v) {
        view0.offsetLeftAndRight(v);
        if(view0.getVisibility() == 0) {
            ViewCompat.T2(view0);
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof View) {
                ViewCompat.T2(((View)viewParent0));
            }
        }
    }

    @ReplaceWith(expression = "view.getOverScrollMode()")
    @Deprecated
    public static int n0(View view0) {
        return view0.getOverScrollMode();
    }

    @ReplaceWith(expression = "v.onInitializeAccessibilityEvent(event)")
    @Deprecated
    public static void n1(View view0, AccessibilityEvent accessibilityEvent0) {
        view0.onInitializeAccessibilityEvent(accessibilityEvent0);
    }

    public static void n2(View view0, String[] arr_s, OnReceiveContentListener onReceiveContentListener0) {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            Api31Impl.c(view0, arr_s, onReceiveContentListener0);
            return;
        }
        if(arr_s == null || arr_s.length == 0) {
            arr_s = null;
        }
        int v = 0;
        if(onReceiveContentListener0 != null) {
            Preconditions.b(arr_s != null, "When the listener is set, MIME types must also be set");
        }
        if(arr_s != null) {
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(arr_s[v1].startsWith("*")) {
                    v = 1;
                    break;
                }
            }
            Preconditions.b(((boolean)(v ^ 1)), "A MIME type set here must not start with *: " + Arrays.toString(arr_s));
        }
        view0.setTag(id.tag_on_receive_content_mime_types, arr_s);
        view0.setTag(id.tag_on_receive_content_listener, onReceiveContentListener0);
    }

    private static void o(View view0, int v) {
        view0.offsetTopAndBottom(v);
        if(view0.getVisibility() == 0) {
            ViewCompat.T2(view0);
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof View) {
                ViewCompat.T2(((View)viewParent0));
            }
        }
    }

    @Px
    @ReplaceWith(expression = "view.getPaddingEnd()")
    @Deprecated
    public static int o0(View view0) {
        return view0.getPaddingEnd();
    }

    @ReplaceWith(expression = "v.onInitializeAccessibilityNodeInfo(info.unwrap())")
    @Deprecated
    public static void o1(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        view0.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat0.s2());
    }

    @ReplaceWith(expression = "view.setOverScrollMode(overScrollMode)")
    @Deprecated
    public static void o2(View view0, int v) {
        view0.setOverScrollMode(v);
    }

    public static WindowInsetsCompat p(View view0, WindowInsetsCompat windowInsetsCompat0, Rect rect0) {
        return Api21Impl.b(view0, windowInsetsCompat0, rect0);
    }

    @Px
    @ReplaceWith(expression = "view.getPaddingStart()")
    @Deprecated
    public static int p0(View view0) {
        return view0.getPaddingStart();
    }

    @ReplaceWith(expression = "v.onPopulateAccessibilityEvent(event)")
    @Deprecated
    public static void p1(View view0, AccessibilityEvent accessibilityEvent0) {
        view0.onPopulateAccessibilityEvent(accessibilityEvent0);
    }

    @ReplaceWith(expression = "view.setPaddingRelative(start, top, end, bottom)")
    @Deprecated
    public static void p2(View view0, @Px int v, @Px int v1, @Px int v2, @Px int v3) {
        view0.setPaddingRelative(v, v1, v2, v3);
    }

    public static WindowInsetsCompat q(View view0, WindowInsetsCompat windowInsetsCompat0) {
        int v = Build.VERSION.SDK_INT;
        WindowInsets windowInsets0 = windowInsetsCompat0.K();
        if(windowInsets0 != null) {
            WindowInsets windowInsets1 = v < 30 ? Api20Impl.a(view0, windowInsets0) : Api30Impl.a(view0, windowInsets0);
            return windowInsets1.equals(windowInsets0) ? windowInsetsCompat0 : WindowInsetsCompat.M(windowInsets1, view0);
        }
        return windowInsetsCompat0;
    }

    @ReplaceWith(expression = "view.getParentForAccessibility()")
    @Deprecated
    public static ViewParent q0(View view0) {
        return view0.getParentForAccessibility();
    }

    private static AccessibilityViewProperty q1() {
        return new AccessibilityViewProperty(id.tag_accessibility_pane_title, CharSequence.class, 8, 28) {
            @Override  // androidx.core.view.ViewCompat$AccessibilityViewProperty
            @RequiresApi(28)
            Object c(View view0) {
                return this.h(view0);
            }

            @Override  // androidx.core.view.ViewCompat$AccessibilityViewProperty
            @RequiresApi(28)
            void d(View view0, Object object0) {
                this.i(view0, ((CharSequence)object0));
            }

            @Override  // androidx.core.view.ViewCompat$AccessibilityViewProperty
            boolean g(Object object0, Object object1) {
                return this.j(((CharSequence)object0), ((CharSequence)object1));
            }

            @RequiresApi(28)
            CharSequence h(View view0) {
                return Api28Impl.b(view0);
            }

            @RequiresApi(28)
            void i(View view0, CharSequence charSequence0) {
                Api28Impl.h(view0, charSequence0);
            }

            boolean j(CharSequence charSequence0, CharSequence charSequence1) {
                return !TextUtils.equals(charSequence0, charSequence1);
            }
        };
    }

    @ReplaceWith(expression = "view.setPivotX(value)")
    @Deprecated
    public static void q2(View view0, float f) {
        view0.setPivotX(f);
    }

    public static void r(View view0) {
        if(Build.VERSION.SDK_INT >= 24) {
            Api24Impl.b(view0);
            return;
        }
        if(!ViewCompat.O) {
            ViewCompat.i();
        }
        Method method0 = ViewCompat.N;
        if(method0 != null) {
            try {
                method0.invoke(view0, null);
            }
            catch(Exception exception0) {
                Log.d("ViewCompat", "Error calling dispatchFinishTemporaryDetach", exception0);
            }
            return;
        }
        view0.onFinishTemporaryDetach();
    }

    @ReplaceWith(expression = "view.getPivotX()")
    @Deprecated
    public static float r0(View view0) {
        return view0.getPivotX();
    }

    @ReplaceWith(expression = "view.performAccessibilityAction(action, arguments)")
    @Deprecated
    public static boolean r1(View view0, int v, Bundle bundle0) {
        return view0.performAccessibilityAction(v, bundle0);
    }

    @ReplaceWith(expression = "view.setPivotY(value)")
    @Deprecated
    public static void r2(View view0, float f) {
        view0.setPivotY(f);
    }

    public static boolean s(View view0, float f, float f1, boolean z) {
        return Api21Impl.c(view0, f, f1, z);
    }

    @ReplaceWith(expression = "view.getPivotY()")
    @Deprecated
    public static float s0(View view0) {
        return view0.getPivotY();
    }

    public static boolean s1(View view0, int v) {
        int v1 = HapticFeedbackConstantsCompat.a(v);
        return v1 == -1 ? false : view0.performHapticFeedback(v1);
    }

    public static void s2(View view0, PointerIconCompat pointerIconCompat0) {
        if(Build.VERSION.SDK_INT >= 24) {
            Api24Impl.d(view0, ((PointerIcon)(pointerIconCompat0 == null ? null : pointerIconCompat0.b())));
        }
    }

    public static boolean t(View view0, float f, float f1) {
        return Api21Impl.d(view0, f, f1);
    }

    public static WindowInsetsCompat t0(View view0) {
        return Build.VERSION.SDK_INT < 23 ? Api21Impl.j(view0) : Api23Impl.a(view0);
    }

    public static boolean t1(View view0, int v, int v1) {
        int v2 = HapticFeedbackConstantsCompat.a(v);
        return v2 == -1 ? false : view0.performHapticFeedback(v2, v1);
    }

    @ReplaceWith(expression = "view.setRotation(value)")
    @Deprecated
    public static void t2(View view0, float f) {
        view0.setRotation(f);
    }

    public static boolean u(View view0, int v, int v1, int[] arr_v, int[] arr_v1) {
        return Api21Impl.e(view0, v, v1, arr_v, arr_v1);
    }

    @ReplaceWith(expression = "view.getRotation()")
    @Deprecated
    public static float u0(View view0) {
        return view0.getRotation();
    }

    public static ContentInfoCompat u1(View view0, ContentInfoCompat contentInfoCompat0) {
        if(Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat0 + ", view=" + view0.getClass().getSimpleName() + "[" + view0.getId() + "]");
        }
        if(Build.VERSION.SDK_INT >= 0x1F) {
            return Api31Impl.b(view0, contentInfoCompat0);
        }
        OnReceiveContentListener onReceiveContentListener0 = (OnReceiveContentListener)view0.getTag(id.tag_on_receive_content_listener);
        if(onReceiveContentListener0 != null) {
            ContentInfoCompat contentInfoCompat1 = onReceiveContentListener0.a(view0, contentInfoCompat0);
            return contentInfoCompat1 == null ? null : ViewCompat.X(view0).b(contentInfoCompat1);
        }
        return ViewCompat.X(view0).b(contentInfoCompat0);
    }

    @ReplaceWith(expression = "view.setRotationX(value)")
    @Deprecated
    public static void u2(View view0, float f) {
        view0.setRotationX(f);
    }

    public static boolean v(View view0, int v, int v1, int[] arr_v, int[] arr_v1, int v2) {
        if(view0 instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2)view0).dispatchNestedPreScroll(v, v1, arr_v, arr_v1, v2);
        }
        return v2 == 0 ? ViewCompat.u(view0, v, v1, arr_v, arr_v1) : false;
    }

    @ReplaceWith(expression = "view.getRotationX()")
    @Deprecated
    public static float v0(View view0) {
        return view0.getRotationX();
    }

    @ReplaceWith(expression = "view.postInvalidateOnAnimation()")
    @Deprecated
    public static void v1(View view0) {
        view0.postInvalidateOnAnimation();
    }

    @ReplaceWith(expression = "view.setRotationY(value)")
    @Deprecated
    public static void v2(View view0, float f) {
        view0.setRotationY(f);
    }

    public static void w(View view0, int v, int v1, int v2, int v3, int[] arr_v, int v4, int[] arr_v1) {
        if(view0 instanceof NestedScrollingChild3) {
            ((NestedScrollingChild3)view0).dispatchNestedScroll(v, v1, v2, v3, arr_v, v4, arr_v1);
            return;
        }
        ViewCompat.y(view0, v, v1, v2, v3, arr_v, v4);
    }

    @ReplaceWith(expression = "view.getRotationY()")
    @Deprecated
    public static float w0(View view0) {
        return view0.getRotationY();
    }

    @ReplaceWith(expression = "view.postInvalidateOnAnimation(left, top, right, bottom)")
    @Deprecated
    public static void w1(View view0, int v, int v1, int v2, int v3) {
        view0.postInvalidateOnAnimation(v, v1, v2, v3);
    }

    @ReplaceWith(expression = "view.setSaveFromParentEnabled(enabled)")
    @Deprecated
    public static void w2(View view0, boolean z) {
        view0.setSaveFromParentEnabled(z);
    }

    public static boolean x(View view0, int v, int v1, int v2, int v3, int[] arr_v) {
        return Api21Impl.f(view0, v, v1, v2, v3, arr_v);
    }

    @ReplaceWith(expression = "view.getScaleX()")
    @Deprecated
    public static float x0(View view0) {
        return view0.getScaleX();
    }

    @ReplaceWith(expression = "view.postOnAnimation(action)")
    @Deprecated
    public static void x1(View view0, Runnable runnable0) {
        view0.postOnAnimation(runnable0);
    }

    @ReplaceWith(expression = "view.setScaleX(value)")
    @Deprecated
    public static void x2(View view0, float f) {
        view0.setScaleX(f);
    }

    public static boolean y(View view0, int v, int v1, int v2, int v3, int[] arr_v, int v4) {
        if(view0 instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2)view0).dispatchNestedScroll(v, v1, v2, v3, arr_v, v4);
        }
        return v4 == 0 ? ViewCompat.x(view0, v, v1, v2, v3, arr_v) : false;
    }

    @ReplaceWith(expression = "view.getScaleY()")
    @Deprecated
    public static float y0(View view0) {
        return view0.getScaleY();
    }

    @SuppressLint({"LambdaLast"})
    @ReplaceWith(expression = "view.postOnAnimationDelayed(action, delayMillis)")
    @Deprecated
    public static void y1(View view0, Runnable runnable0, long v) {
        view0.postOnAnimationDelayed(runnable0, v);
    }

    @ReplaceWith(expression = "view.setScaleY(value)")
    @Deprecated
    public static void y2(View view0, float f) {
        view0.setScaleY(f);
    }

    public static void z(View view0) {
        if(Build.VERSION.SDK_INT >= 24) {
            Api24Impl.c(view0);
            return;
        }
        if(!ViewCompat.O) {
            ViewCompat.i();
        }
        Method method0 = ViewCompat.M;
        if(method0 != null) {
            try {
                method0.invoke(view0, null);
            }
            catch(Exception exception0) {
                Log.d("ViewCompat", "Error calling dispatchStartTemporaryDetach", exception0);
            }
            return;
        }
        view0.onStartTemporaryDetach();
    }

    public static int z0(View view0) {
        return Build.VERSION.SDK_INT < 23 ? 0 : Api23Impl.b(view0);
    }

    public static void z1(View view0, int v) {
        ViewCompat.A1(v, view0);
        ViewCompat.j1(view0, 0);
    }

    @UiThread
    public static void z2(View view0, boolean z) {
        ViewCompat.I1().f(view0, Boolean.valueOf(z));
    }
}

