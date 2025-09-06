package com.bytedance.adsdk.ugeno.yoga;

import com.bytedance.adsdk.ugeno.yoga.PjT.PjT;

@PjT
public class YogaNative {
    static {
        System.loadLibrary("tt_ugen_layout");
    }

    static native void jni_YGConfigFreeJNI(long arg0) {
    }

    static native int jni_YGConfigGetErrataJNI(long arg0) {
    }

    static native long jni_YGConfigNewJNI() {
    }

    static native void jni_YGConfigSetErrataJNI(long arg0, int arg1) {
    }

    static native void jni_YGConfigSetExperimentalFeatureEnabledJNI(long arg0, int arg1, boolean arg2) {
    }

    static native void jni_YGConfigSetLoggerJNI(long arg0, YogaLogger arg1) {
    }

    static native void jni_YGConfigSetPointScaleFactorJNI(long arg0, float arg1) {
    }

    static native void jni_YGConfigSetPrintTreeFlagJNI(long arg0, boolean arg1) {
    }

    static native void jni_YGConfigSetUseLegacyStretchBehaviourJNI(long arg0, boolean arg1) {
    }

    static native void jni_YGConfigSetUseWebDefaultsJNI(long arg0, boolean arg1) {
    }

    static native void jni_YGNodeCalculateLayoutJNI(long arg0, float arg1, float arg2, long[] arg3, YogaNodeJNIBase[] arg4) {
    }

    static native long jni_YGNodeCloneJNI(long arg0) {
    }

    static native void jni_YGNodeCopyStyleJNI(long arg0, long arg1) {
    }

    static native void jni_YGNodeDeallocateJNI(long arg0) {
    }

    static native void jni_YGNodeInsertChildJNI(long arg0, long arg1, int arg2) {
    }

    static native boolean jni_YGNodeIsDirtyJNI(long arg0) {
    }

    static native boolean jni_YGNodeIsReferenceBaselineJNI(long arg0) {
    }

    static native void jni_YGNodeMarkDirtyAndPropagateToDescendantsJNI(long arg0) {
    }

    static native void jni_YGNodeMarkDirtyJNI(long arg0) {
    }

    static native long jni_YGNodeNewJNI() {
    }

    static native long jni_YGNodeNewWithConfigJNI(long arg0) {
    }

    static native void jni_YGNodePrintJNI(long arg0) {
    }

    static native void jni_YGNodeRemoveAllChildrenJNI(long arg0) {
    }

    static native void jni_YGNodeRemoveChildJNI(long arg0, long arg1) {
    }

    static native void jni_YGNodeResetJNI(long arg0) {
    }

    static native void jni_YGNodeSetHasBaselineFuncJNI(long arg0, boolean arg1) {
    }

    static native void jni_YGNodeSetHasMeasureFuncJNI(long arg0, boolean arg1) {
    }

    static native void jni_YGNodeSetIsReferenceBaselineJNI(long arg0, boolean arg1) {
    }

    static native void jni_YGNodeSetStyleInputsJNI(long arg0, float[] arg1, int arg2) {
    }

    static native int jni_YGNodeStyleGetAlignContentJNI(long arg0) {
    }

    static native int jni_YGNodeStyleGetAlignItemsJNI(long arg0) {
    }

    static native int jni_YGNodeStyleGetAlignSelfJNI(long arg0) {
    }

    static native float jni_YGNodeStyleGetAspectRatioJNI(long arg0) {
    }

    static native float jni_YGNodeStyleGetBorderJNI(long arg0, int arg1) {
    }

    static native int jni_YGNodeStyleGetDirectionJNI(long arg0) {
    }

    static native int jni_YGNodeStyleGetDisplayJNI(long arg0) {
    }

    static native long jni_YGNodeStyleGetFlexBasisJNI(long arg0) {
    }

    static native int jni_YGNodeStyleGetFlexDirectionJNI(long arg0) {
    }

    static native float jni_YGNodeStyleGetFlexGrowJNI(long arg0) {
    }

    static native float jni_YGNodeStyleGetFlexJNI(long arg0) {
    }

    static native float jni_YGNodeStyleGetFlexShrinkJNI(long arg0) {
    }

    static native int jni_YGNodeStyleGetFlexWrapJNI(long arg0) {
    }

    static native float jni_YGNodeStyleGetGapJNI(long arg0, int arg1) {
    }

    static native long jni_YGNodeStyleGetHeightJNI(long arg0) {
    }

    static native int jni_YGNodeStyleGetJustifyContentJNI(long arg0) {
    }

    static native long jni_YGNodeStyleGetMarginJNI(long arg0, int arg1) {
    }

    static native long jni_YGNodeStyleGetMaxHeightJNI(long arg0) {
    }

    static native long jni_YGNodeStyleGetMaxWidthJNI(long arg0) {
    }

    static native long jni_YGNodeStyleGetMinHeightJNI(long arg0) {
    }

    static native long jni_YGNodeStyleGetMinWidthJNI(long arg0) {
    }

    static native int jni_YGNodeStyleGetOverflowJNI(long arg0) {
    }

    static native long jni_YGNodeStyleGetPaddingJNI(long arg0, int arg1) {
    }

    static native long jni_YGNodeStyleGetPositionJNI(long arg0, int arg1) {
    }

    static native int jni_YGNodeStyleGetPositionTypeJNI(long arg0) {
    }

    static native long jni_YGNodeStyleGetWidthJNI(long arg0) {
    }

    static native void jni_YGNodeStyleSetAlignContentJNI(long arg0, int arg1) {
    }

    static native void jni_YGNodeStyleSetAlignItemsJNI(long arg0, int arg1) {
    }

    static native void jni_YGNodeStyleSetAlignSelfJNI(long arg0, int arg1) {
    }

    static native void jni_YGNodeStyleSetAspectRatioJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetBorderJNI(long arg0, int arg1, float arg2) {
    }

    static native void jni_YGNodeStyleSetDirectionJNI(long arg0, int arg1) {
    }

    static native void jni_YGNodeStyleSetDisplayJNI(long arg0, int arg1) {
    }

    static native void jni_YGNodeStyleSetFlexBasisAutoJNI(long arg0) {
    }

    static native void jni_YGNodeStyleSetFlexBasisJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetFlexBasisPercentJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetFlexDirectionJNI(long arg0, int arg1) {
    }

    static native void jni_YGNodeStyleSetFlexGrowJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetFlexJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetFlexShrinkJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetFlexWrapJNI(long arg0, int arg1) {
    }

    static native void jni_YGNodeStyleSetGapJNI(long arg0, int arg1, float arg2) {
    }

    static native void jni_YGNodeStyleSetHeightAutoJNI(long arg0) {
    }

    static native void jni_YGNodeStyleSetHeightJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetHeightPercentJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetJustifyContentJNI(long arg0, int arg1) {
    }

    static native void jni_YGNodeStyleSetMarginAutoJNI(long arg0, int arg1) {
    }

    static native void jni_YGNodeStyleSetMarginJNI(long arg0, int arg1, float arg2) {
    }

    static native void jni_YGNodeStyleSetMarginPercentJNI(long arg0, int arg1, float arg2) {
    }

    static native void jni_YGNodeStyleSetMaxHeightJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetMaxHeightPercentJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetMaxWidthJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetMaxWidthPercentJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetMinHeightJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetMinHeightPercentJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetMinWidthJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetMinWidthPercentJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetOverflowJNI(long arg0, int arg1) {
    }

    static native void jni_YGNodeStyleSetPaddingJNI(long arg0, int arg1, float arg2) {
    }

    static native void jni_YGNodeStyleSetPaddingPercentJNI(long arg0, int arg1, float arg2) {
    }

    static native void jni_YGNodeStyleSetPositionJNI(long arg0, int arg1, float arg2) {
    }

    static native void jni_YGNodeStyleSetPositionPercentJNI(long arg0, int arg1, float arg2) {
    }

    static native void jni_YGNodeStyleSetPositionTypeJNI(long arg0, int arg1) {
    }

    static native void jni_YGNodeStyleSetWidthAutoJNI(long arg0) {
    }

    static native void jni_YGNodeStyleSetWidthJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeStyleSetWidthPercentJNI(long arg0, float arg1) {
    }

    static native void jni_YGNodeSwapChildJNI(long arg0, long arg1, int arg2) {
    }
}

