//Mason Kjolso
package com.example.finalproject.network;


import com.example.finalproject.model.Volumes;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GoogleBooksService {
    @GET("books/v1/volumes")
    Call<Volumes> getVolumes(@Query("q") String q);
}
