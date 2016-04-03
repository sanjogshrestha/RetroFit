package sanjogshrestha.retrofittutorial.API;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import sanjogshrestha.retrofittutorial.model.Content;

/**
 * Created by {Sanjog_Shrestha} on 4/3/2016.
 */
public interface GetResultAPI {
    String BASE_URL="https://api.stackexchange.com";

    @GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")
    Call<Content> loadQuestions();

    class Factory{
        private  static  GetResultAPI apiService;
        public static GetResultAPI getApiService(){
            if(apiService==null){
                Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
                apiService = retrofit.create(GetResultAPI.class);
                return apiService;
            }else {
                return apiService;
            }
        }
    }
}
