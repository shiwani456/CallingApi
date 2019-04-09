
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
    "large",
    "medium",
    "thumbnail"
})
public class Picture implements Serializable, Parcelable
{

    @JsonProperty("large")
    private String large;
    @JsonProperty("medium")
    private String medium;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonIgnore

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Picture> CREATOR = new Creator<Picture>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Picture createFromParcel(Parcel in) {
            return new Picture(in);
        }

        public Picture[] newArray(int size) {
            return (new Picture[size]);
        }

    }
    ;
    private final static long serialVersionUID = 489102574421790543L;

    protected Picture(Parcel in) {
        this.large = ((String) in.readValue((String.class.getClassLoader())));
        this.medium = ((String) in.readValue((String.class.getClassLoader())));
        this.thumbnail = ((String) in.readValue((String.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Picture() {
    }

    /**
     * 
     * @param thumbnail
     * @param medium
     * @param large
     */
    public Picture(String large, String medium, String thumbnail) {
        super();
        this.large = large;
        this.medium = medium;
        this.thumbnail = thumbnail;
    }

    @JsonProperty("large")
    public String getLarge() {
        return large;
    }

    @JsonProperty("large")
    public void setLarge(String large) {
        this.large = large;
    }

    public Picture withLarge(String large) {
        this.large = large;
        return this;
    }

    @JsonProperty("medium")
    public String getMedium() {
        return medium;
    }

    @JsonProperty("medium")
    public void setMedium(String medium) {
        this.medium = medium;
    }

    public Picture withMedium(String medium) {
        this.medium = medium;
        return this;
    }

    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Picture withThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
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

    public Picture withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("large", large).append("medium", medium).append("thumbnail", thumbnail).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(thumbnail).append(additionalProperties).append(medium).append(large).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Picture) == false) {
            return false;
        }
        Picture rhs = ((Picture) other);
        return new EqualsBuilder().append(thumbnail, rhs.thumbnail).append(additionalProperties, rhs.additionalProperties).append(medium, rhs.medium).append(large, rhs.large).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(large);
        dest.writeValue(medium);
        dest.writeValue(thumbnail);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
