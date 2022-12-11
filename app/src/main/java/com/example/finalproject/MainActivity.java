//Mason Kjolso
package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;


import com.example.finalproject.adapter.ItemAdapter;
import com.example.finalproject.model.CardViewModel;
import com.example.finalproject.model.Item;
import com.example.finalproject.model.Volumes;
import com.example.finalproject.network.GoogleBooksService;
import com.example.finalproject.network.RetrofitClientInstance;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GoogleBooksService bookService = RetrofitClientInstance.getRetrofitInstance().create(GoogleBooksService.class);

        EditText bookSearch = findViewById(R.id.bookSearch);
        Button submit = findViewById(R.id.submit);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        ProgressBar pBar = findViewById(R.id.progressBar);
        pBar.setVisibility(View.INVISIBLE);
        CardView card = findViewById(R.id.cardView);

        submit.setOnClickListener(v -> {
            Call<Volumes> volumes = bookService.getVolumes(bookSearch.getText().toString());
            pBar.setVisibility(View.VISIBLE);
            bookSearch.setVisibility(View.INVISIBLE);
            card.setVisibility(View.INVISIBLE);
            submit.setVisibility(View.INVISIBLE);



            volumes.enqueue(new Callback<Volumes>() {

                @Override
                public void onResponse(Call<Volumes> call, Response<Volumes> response) {
                    if (response.body() != null) {
                        ArrayList<Item> items = response.body().items;
                        ArrayList<CardViewModel> cardViewModels = new ArrayList<>();
                        for(Item i: items){
                            cardViewModels.add(new CardViewModel(i));
                        }

                        ItemAdapter itemAdapter = new ItemAdapter(getApplicationContext(), cardViewModels);
                        recyclerView.setAdapter(itemAdapter);
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

                        recyclerView.setVisibility(View.VISIBLE);
                        pBar.setVisibility(View.INVISIBLE);


                    }
                }

                @Override
                public void onFailure(Call<Volumes> call, Throwable t) {
                    Toast.makeText(getApplicationContext(), "Sorry, an error has occured", Toast.LENGTH_SHORT).show();
                }
            });
        });

    }
}