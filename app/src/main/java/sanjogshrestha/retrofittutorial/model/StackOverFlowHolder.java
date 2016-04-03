package sanjogshrestha.retrofittutorial.model;

/**
 * Created by {Sanjog_Shrestha} on 4/3/2016.
 */
public class StackOverFlowHolder {
    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public int getReputationHolder() {
        return reputationHolder;
    }

    public void setReputationHolder(int reputationHolder) {
        this.reputationHolder = reputationHolder;
    }

    public int getAcceptHolder() {
        return acceptHolder;
    }

    public void setAcceptHolder(int acceptHolder) {
        this.acceptHolder = acceptHolder;
    }

    String nameHolder;
    int reputationHolder;
    int acceptHolder;
    public StackOverFlowHolder(String name, int reputation, int accept_rate) {
        this.nameHolder = name;
        this.reputationHolder = reputation;
        this.acceptHolder = accept_rate;
    }
}
