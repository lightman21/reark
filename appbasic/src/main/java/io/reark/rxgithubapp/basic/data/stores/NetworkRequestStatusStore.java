/*
 * The MIT License
 *
 * Copyright (c) 2013-2016 reark project contributors
 *
 * https://github.com/reark/reark/graphs/contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.reark.rxgithubapp.basic.data.stores;

import io.reark.reark.data.stores.MemoryStore;
import io.reark.reark.pojo.NetworkRequestStatus;
import io.reark.reark.utils.Log;
import rx.Observable;

public class NetworkRequestStatusStore extends MemoryStore<Integer, NetworkRequestStatus> {
    private static final String TAG = NetworkRequestStatusStore.class.getSimpleName();

    public NetworkRequestStatusStore() {
        super(networkRequestStatus -> networkRequestStatus.getUri().hashCode());
    }

    @Override
    public void put(NetworkRequestStatus item) {
        super.put(item);
        Log.d(TAG, "network put: " + item.getUri().hashCode());
    }

    @Override
    public Observable<NetworkRequestStatus> getOnceAndStream(Integer id) {
        Log.d(TAG, "network get: " + id);
        return super.getOnceAndStream(id);
    }
}
