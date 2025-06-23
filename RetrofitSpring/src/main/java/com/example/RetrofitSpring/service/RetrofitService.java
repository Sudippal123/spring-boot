package com.example.RetrofitSpring.service;

import com.example.RetrofitSpring.api.JsonPlaceholderApi;


import com.example.RetrofitSpring.model.Post;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

@Service
public class RetrofitService {
    private final JsonPlaceholderApi jsonPlaceholderApi;

    public RetrofitService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        jsonPlaceholderApi = retrofit.create(JsonPlaceholderApi.class);
    }

    public List<Post> fetchPosts(){
        Call<List<Post>> call = jsonPlaceholderApi.getPosts();
        try{
            Response<List<Post>> response = call.execute();
            return response.isSuccessful() ? response.body() : null;
        } catch (IOException e) {
            throw new RuntimeException("Failed to fetch the data"+e);
        }
    }

}
/*
Controllers => It will decide which service to call
Service => It contains Business Logics
Model / DAO => It is the model of the response body
Gateway / API => It integrates the external apis
*/
