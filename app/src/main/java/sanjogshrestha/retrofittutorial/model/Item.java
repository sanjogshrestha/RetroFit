
package sanjogshrestha.retrofittutorial.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Item {

    @SerializedName("tags")
    @Expose
    private List<String> tags = new ArrayList<String>();
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("is_answered")
    @Expose
    private boolean isAnswered;
    @SerializedName("view_count")
    @Expose
    private int viewCount;
    @SerializedName("answer_count")
    @Expose
    private int answerCount;
    @SerializedName("score")
    @Expose
    private int score;
    @SerializedName("last_activity_date")
    @Expose
    private int lastActivityDate;
    @SerializedName("creation_date")
    @Expose
    private int creationDate;
    @SerializedName("question_id")
    @Expose
    private int questionId;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("title")
    @Expose
    private String title;

    /**
     * 
     * @return
     *     The tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * 
     * @param owner
     *     The owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * 
     * @return
     *     The isAnswered
     */
    public boolean isIsAnswered() {
        return isAnswered;
    }

    /**
     * 
     * @param isAnswered
     *     The is_answered
     */
    public void setIsAnswered(boolean isAnswered) {
        this.isAnswered = isAnswered;
    }

    /**
     * 
     * @return
     *     The viewCount
     */
    public int getViewCount() {
        return viewCount;
    }

    /**
     * 
     * @param viewCount
     *     The view_count
     */
    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * 
     * @return
     *     The answerCount
     */
    public int getAnswerCount() {
        return answerCount;
    }

    /**
     * 
     * @param answerCount
     *     The answer_count
     */
    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    /**
     * 
     * @return
     *     The score
     */
    public int getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * 
     * @return
     *     The lastActivityDate
     */
    public int getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * 
     * @param lastActivityDate
     *     The last_activity_date
     */
    public void setLastActivityDate(int lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    /**
     * 
     * @return
     *     The creationDate
     */
    public int getCreationDate() {
        return creationDate;
    }

    /**
     * 
     * @param creationDate
     *     The creation_date
     */
    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * 
     * @return
     *     The questionId
     */
    public int getQuestionId() {
        return questionId;
    }

    /**
     * 
     * @param questionId
     *     The question_id
     */
    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    /**
     * 
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

}
