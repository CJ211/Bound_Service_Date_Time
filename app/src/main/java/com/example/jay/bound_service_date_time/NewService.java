package com.example.jay.bound_service_date_time;

import android.app.Service;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Binder;
import android.os.IBinder;

import java.util.Date;

public class NewService extends Service {

    private final IBinder binder = new LocalBinder();
    public class LocalBinder extends Binder
    {
        NewService getService()
        {
            return NewService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent)
    {
        return binder;
    }
    public Date getCurrentDate()
    {
        return Calendar.getInstance().getTime();
    }
}
