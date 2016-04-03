package sanjogshrestha.retrofittutorial.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import sanjogshrestha.retrofittutorial.R;
import sanjogshrestha.retrofittutorial.model.StackOverFlowHolder;

/**
 * Created by {Sanjog_Shrestha} on 3/28/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    ArrayList<StackOverFlowHolder> mDataSet;
    public RecyclerViewAdapter(ArrayList<StackOverFlowHolder> resultStackOverFlowHolders) {
        mDataSet = resultStackOverFlowHolders;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_adapter, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(mDataSet.get(position).getNameHolder());
        holder.accept_rate.setText(Integer.toString(mDataSet.get(position).getAcceptHolder()));
        holder.reputation.setText(Integer.toString(mDataSet.get(position).getReputationHolder()));
    }

    /**
     * Returns the total number of items in the data set hold by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, accept_rate, reputation;
        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.nameTextView);
            accept_rate = (TextView) itemView.findViewById(R.id.acceptRateTextView);
            reputation = (TextView) itemView.findViewById(R.id.reputationTextView);
        }
    }
}
