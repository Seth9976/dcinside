package com.unity3d.services.ads.adunit;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;

public class AdUnitRelativeLayout extends RelativeLayout {
    private InputEvent _lastInputEvent;
    private int _maxEvents;
    private final ArrayList _motionEvents;
    private boolean _shouldCapture;

    public AdUnitRelativeLayout(Context context0) {
        super(context0);
        this._motionEvents = new ArrayList();
        this._maxEvents = 10000;
        this._shouldCapture = false;
    }

    public void clearCapture() {
        synchronized(this._motionEvents) {
            this._motionEvents.clear();
        }
    }

    public void endCapture() {
        this._shouldCapture = false;
    }

    public int getCurrentEventCount() {
        synchronized(this._motionEvents) {
        }
        return this._motionEvents.size();
    }

    public SparseIntArray getEventCount(ArrayList arrayList0) {
        Integer integer0;
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        synchronized(this._motionEvents) {
            Iterator iterator0 = this._motionEvents.iterator();
        label_5:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                AdUnitMotionEvent adUnitMotionEvent0 = (AdUnitMotionEvent)object0;
                Iterator iterator1 = arrayList0.iterator();
                do {
                    if(!iterator1.hasNext()) {
                        continue label_5;
                    }
                    Object object1 = iterator1.next();
                    integer0 = (Integer)object1;
                }
                while(adUnitMotionEvent0.getAction() != ((int)integer0));
                sparseIntArray0.put(((int)integer0), sparseIntArray0.get(((int)integer0), 0) + 1);
            }
            return sparseIntArray0;
        }
    }

    public SparseArray getEvents(SparseArray sparseArray0) {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        SparseArray sparseArray1 = new SparseArray();
        synchronized(this._motionEvents) {
            for(Object object0: this._motionEvents) {
                AdUnitMotionEvent adUnitMotionEvent0 = (AdUnitMotionEvent)object0;
                ArrayList arrayList1 = (ArrayList)sparseArray0.get(adUnitMotionEvent0.getAction());
                if(arrayList1 != null) {
                    int v1 = (int)(((Integer)arrayList1.get(0)));
                    if(sparseIntArray0.get(adUnitMotionEvent0.getAction(), 0) == v1) {
                        if(sparseArray1.get(adUnitMotionEvent0.getAction()) == null) {
                            sparseArray1.put(adUnitMotionEvent0.getAction(), new SparseArray());
                        }
                        ((SparseArray)sparseArray1.get(adUnitMotionEvent0.getAction())).put(v1, adUnitMotionEvent0);
                        arrayList1.remove(0);
                    }
                    sparseIntArray0.put(adUnitMotionEvent0.getAction(), sparseIntArray0.get(adUnitMotionEvent0.getAction()) + 1);
                }
            }
            return sparseArray1;
        }
    }

    public InputEvent getLastInputEvent() {
        return this._lastInputEvent;
    }

    public int getMaxEventCount() {
        return this._maxEvents;
    }

    @Override  // android.view.ViewGroup
    @TargetApi(14)
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        super.onInterceptTouchEvent(motionEvent0);
        switch(motionEvent0.getActionMasked()) {
            case 0: 
            case 1: 
            case 5: 
            case 6: {
                this._lastInputEvent = motionEvent0;
            }
        }
        if(this._shouldCapture && this._motionEvents.size() < this._maxEvents) {
            boolean z = (motionEvent0.getFlags() & 1) != 0;
            synchronized(this._motionEvents) {
                AdUnitMotionEvent adUnitMotionEvent0 = new AdUnitMotionEvent(motionEvent0.getActionMasked(), z, motionEvent0.getToolType(0), motionEvent0.getSource(), motionEvent0.getDeviceId(), motionEvent0.getX(0), motionEvent0.getY(0), motionEvent0.getEventTime(), motionEvent0.getPressure(0), motionEvent0.getSize(0));
                this._motionEvents.add(adUnitMotionEvent0);
                return false;
            }
        }
        return false;
    }

    public void startCapture(int v) {
        this._maxEvents = v;
        this._shouldCapture = true;
    }
}

