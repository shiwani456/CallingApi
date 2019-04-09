
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
    "date",
    "age"
})
public class Dob implements Serializable, Parcelable
{

    @JsonProperty("date")
    private String date;
    @JsonProperty("age")
    private long age;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Dob> CREATOR = new Creator<Dob>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Dob createFromParcel(Parcel in) {
            return new Dob(in);
        }

        public Dob[] newArray(int size) {
            return (new Dob[size]);
        }

    }
    ;
    private final static long serialVersionUID = -668988834813151599L;

    protected Dob(Parcel in) {
        this.date = ((String) in.readValue((String.class.getClassLoader())));
        this.age = ((long) in.readValue((long.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Dob() {
    }

    /**
     * 
     * @param age
     * @param date
     */
    public Dob(String date, long age) {
        super();
        this.date = date;
        this.age = age;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public Dob withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("age")
    public long getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(long age) {
        this.age = age;
    }

    public Dob withAge(long age) {
        this.age = age;
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

    public Dob withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("date", date).append("age", age).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(age).append(date).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dob) == false) {
            return false;
        }
        Dob rhs = ((Dob) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(age, rhs.age).append(date, rhs.date).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(date);
        dest.writeValue(age);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
