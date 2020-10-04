package com.example.api;

import kotlin.reflect.KCallable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {
    @POST("mail.ru/")
   Call<LoginResponse> userLogin(@Body LoginRequest loginRequest);
}
