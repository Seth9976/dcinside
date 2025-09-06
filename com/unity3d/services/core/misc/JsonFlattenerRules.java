package com.unity3d.services.core.misc;

import java.util.List;

public class JsonFlattenerRules {
    List _reduceKeys;
    List _skipKeys;
    List _topLevelToInclude;

    public JsonFlattenerRules(List list0, List list1, List list2) {
        this._topLevelToInclude = list0;
        this._reduceKeys = list1;
        this._skipKeys = list2;
    }

    public List getReduceKeys() {
        return this._reduceKeys;
    }

    public List getSkipKeys() {
        return this._skipKeys;
    }

    public List getTopLevelToInclude() {
        return this._topLevelToInclude;
    }
}

