package com.ziadoua.zcard.async;

import java.util.concurrent.Callable;

public interface CompatCallable<T> extends Callable<T> {
    void onPostExecute(Object result);

    void onPreExecute();
}
