package com.sematec.sematecandroidbasictir98;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TestBroadcastReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Airplane Mode!", Toast.LENGTH_LONG).show();

    }
}
