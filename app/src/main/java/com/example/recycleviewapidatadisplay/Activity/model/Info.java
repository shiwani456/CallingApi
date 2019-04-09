
package com.example.recycleviewapidatadisplay.Activity.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "seed",
    "results",
    "page",
    "version"
})
public class Info implements Serializable, Parcelable
{

    @JsonProperty("seed")
    private String seed;
    @JsonProperty("results")
    private long results;
    @JsonProperty("page")
    private long page;
    @JsonProperty("version")
    private String version;
    @JsonIgnore

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Info> CREATOR = new Creator<Info>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Info createFromParcel(Parcel in) {
            return new Info(in);
        }

        public Info[] newArray(int size) {
            return (new Info[size]);
        }

    }
    ;
    private final static long serialVersionUID = -5621814051297530450L;

    protected Info(Parcel in) {
        this.seed = ((String) in.readValue((String.class.getClassLoader())));
        this.results = ((long) in.readValue((long.class.getClassLoader())));
        this.page = ((long) in.readValue((long.class.getClassLoader())));
        this.version = ((String) in.readValue((String.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Info() {
    }

    /**
     * 
     * @param results
     * @param page
     * @param seed
     * @param version
     */
    public Info(String seed, long results, long page, String version) {
        super();
        this.seed = seed;
        this.results = results;
        this.page = page;
        this.version = version;
    }

    @JsonProperty("seed")
    public String getSeed() {
        return seed;
    }

    @JsonProperty("seed")
    public void setSeed(String seed) {
        this.seed = seed;
    }

    public Info withSeed(String seed) {
        this.seed = seed;
        return this;
    }

    @JsonProperty("results")
    public long getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(long results) {
        this.results = results;
    }

    public Info withResults(long results) {
        this.results = results;
        return this;
    }

    @JsonProperty("page")
    public long getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(long page) {
        this.page = page;
    }

    public Info withPage(long page) {
        this.page = page;
        return this;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public Info withVersion(String version) {
        this.version = version;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Info withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("seed", seed).append("results", results).append("page", page).append("version", version).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(results).append(page).append(additionalProperties).append(seed).append(version).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Info) == false) {
            return false;
        }
        Info rhs = ((Info) other);
        return new EqualsBuilder().append(results, rhs.results).append(page, rhs.page).append(additionalProperties, rhs.additionalProperties).append(seed, rhs.seed).append(version, rhs.version).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(seed);
        dest.writeValue(results);
        dest.writeValue(page);
        dest.writeValue(version);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
