
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
    "offset",
    "description"
})
public class Timezone implements Serializable, Parcelable
{

    @JsonProperty("offset")
    private String offset;
    @JsonProperty("description")
    private String description;
    @JsonIgnore

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Timezone> CREATOR = new Creator<Timezone>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Timezone createFromParcel(Parcel in) {
            return new Timezone(in);
        }

        public Timezone[] newArray(int size) {
            return (new Timezone[size]);
        }

    }
    ;
    private final static long serialVersionUID = -6506434367574817805L;

    protected Timezone(Parcel in) {
        this.offset = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Timezone() {
    }

    /**
     * 
     * @param description
     * @param offset
     */
    public Timezone(String offset, String description) {
        super();
        this.offset = offset;
        this.description = description;
    }

    @JsonProperty("offset")
    public String getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(String offset) {
        this.offset = offset;
    }

    public Timezone withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Timezone withDescription(String description) {
        this.description = description;
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

    public Timezone withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("offset", offset).append("description", description).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(description).append(offset).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Timezone) == false) {
            return false;
        }
        Timezone rhs = ((Timezone) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(description, rhs.description).append(offset, rhs.offset).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(offset);
        dest.writeValue(description);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
