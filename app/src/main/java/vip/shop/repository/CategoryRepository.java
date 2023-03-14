package vip.shop.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import vip.shop.model.CateroryModel;
import vip.shop.retrofit.RetrofitInstance;
import vip.shop.retrofit.ShopAppApi;

public class CategoryRepository {
    private ShopAppApi shopAppApi;

    public CategoryRepository(){
        shopAppApi = RetrofitInstance.getRetrofit().create(ShopAppApi.class);
    }
    public MutableLiveData<CateroryModel> getCategory(){
        MutableLiveData<CateroryModel> data = new MutableLiveData<>();
        shopAppApi.getCategory().enqueue(new Callback<CateroryModel>() {
            @Override
            public void onResponse(Call<CateroryModel> call, Response<CateroryModel> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<CateroryModel> call, Throwable t) {
                Log.d("logg", t.getMessage());
                data.setValue(null);
            }
        });
        return data;
    }
}
