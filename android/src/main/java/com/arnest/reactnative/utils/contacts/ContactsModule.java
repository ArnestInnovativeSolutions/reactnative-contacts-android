package com.arnest.reactnative.utils.contacts;

import android.content.ContentResolver;
import android.content.Context;
import android.os.AsyncTask;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;

public class ContactsModule extends ReactContextBaseJavaModule  {

    public ContactsModule(ReactApplicationContext reactContext) {
        super(reactContext);
      
    }

    @Override
    public String getName() {
        return "GetContacts";
    }

    /**
     * Retrieves contacts matching String.
     * Uses raw URI when <code>rawUri</code> is <code>true</code>, makes assets copy otherwise.
     *
     * @param searchString String to match
     * @param callback user provided callback to run at completion
     */
    @ReactMethod
    public void getContactsMatchingString(final String searchString, final Callback callback) {
        AsyncTask<Void,Void,Void> myAsyncTask = new AsyncTask<Void,Void,Void>() {
            @Override
            protected Void doInBackground(final Void ... params) {
                Context context = getReactApplicationContext();
                ContentResolver cr = context.getContentResolver();
                ContactsProvider contactsProvider = new ContactsProvider(cr);
                WritableArray contacts = contactsProvider.getContactsMatchingString(searchString);

                callback.invoke(null, contacts);
                return null;
            }
        };
        myAsyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }
}