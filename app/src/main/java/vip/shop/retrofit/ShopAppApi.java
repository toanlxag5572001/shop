package vip.shop.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import vip.shop.model.CateroryModel;

public interface ShopAppApi {
    @GET("category.php")
    Call<CateroryModel> getCategory();

    }

