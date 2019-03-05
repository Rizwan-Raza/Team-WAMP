package com.wampinfotech.teamwamp.fragments;

import com.wampinfotech.teamwamp.notifications.MyResponse;
import com.wampinfotech.teamwamp.notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAhp4v9E0:APA91bGhF054ISdaxdxVk8nf9wDugy9sY2n8JANn4EhIj5k-seK9qBAimmdnpD5Zo-2z9vtogFJdl9_BF7SdZW4meXS0xmN6qcg3FRVaWoODLAumCDU03GkSGa7KWU91SaWgb55zrW-2"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
