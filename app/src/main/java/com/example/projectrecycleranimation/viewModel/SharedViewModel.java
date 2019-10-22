package com.example.projectrecycleranimation.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.projectrecycleranimation.model.Movies;

public class SharedViewModel extends AndroidViewModel {

    private MutableLiveData<Movies> mMovies;

    public SharedViewModel(@NonNull Application application) {
        super(application);
        mMovies = new MutableLiveData<>();
    }

    public LiveData<Movies> getMovies() {
        return mMovies;
    }

    public void setMovies(Movies movies) {
        mMovies = mMovies;
    }
}
