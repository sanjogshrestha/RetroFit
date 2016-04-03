package sanjogshrestha.retrofittutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sanjogshrestha.retrofittutorial.API.GetResultAPI;
import sanjogshrestha.retrofittutorial.adapter.RecyclerViewAdapter;
import sanjogshrestha.retrofittutorial.model.Content;
import sanjogshrestha.retrofittutorial.model.StackOverFlowHolder;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.recyclerView)
    RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private RecyclerViewAdapter mAdapter;
    private ArrayList<StackOverFlowHolder> resultStackOverFlowHolders;
    private String name;
    private int reputation;
    private int accept_rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        GetResultAPI.Factory.getApiService().loadQuestions().enqueue(new Callback<Content>() {
           @Override
           public void onResponse(Call<Content> call, Response<Content> response) {

               resultStackOverFlowHolders = new ArrayList<StackOverFlowHolder>();

               for(int i=0; i <response.body().getItems().size(); i++){
                   name = response.body().getItems().get(i).getOwner().getDisplayName();
                   reputation = response.body().getItems().get(i).getOwner().getReputation();
                   accept_rate = response.body().getItems().get(i).getOwner().getAccept_rate();

                   resultStackOverFlowHolders.add(i, new StackOverFlowHolder(name, reputation, accept_rate));

                   // specify an adapter (see also next example)
                   mAdapter = new RecyclerViewAdapter(resultStackOverFlowHolders);
                   mRecyclerView.setAdapter(mAdapter);
                   mAdapter.notifyDataSetChanged();
               }
           }

           @Override
           public void onFailure(Call<Content> call, Throwable t) {
               System.out.println("response2="+ t.getLocalizedMessage());
           }
       });
    }
}
