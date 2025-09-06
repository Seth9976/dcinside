package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface HttpClient {
    @m
    Object execute(@l HttpRequest arg1, @l d arg2);

    @l
    HttpResponse executeBlocking(@l HttpRequest arg1) throws Exception;
}

