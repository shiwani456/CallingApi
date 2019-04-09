
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
    "street",
    "city",
    "state",
    "postcode",
    "coordinates",
    "timezone"
})
public class Location implements Serializable, Parcelable
{

    @JsonProperty("street")
    private String street;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("coordinates")

    private Coordinates coordinates;
    @JsonProperty("timezone")

    private Timezone timezone;
    @JsonIgnore

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Location> CREATOR = new Creator<Location>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Location createFromParcel(Parcel in) {
            return new Location(in);
        }

        public Location[] newArray(int size) {
            return (new Location[size]);
        }

    }
    ;
    private final static long serialVersionUID = 5086080842595771211L;

    protected Location(Parcel in) {
        this.street = ((String) in.readValue((String.class.getClassLoader())));
        this.city = ((String) in.readValue((String.class.getClassLoader())));
        this.state = ((String) in.readValue((String.class.getClassLoader())));
        this.postcode = ((String) in.readValue((String.class.getClassLoader())));
        this.coordinates = ((Coordinates) in.readValue((Coordinates.class.getClassLoader())));
        this.timezone = ((Timezone) in.readValue((Timezone.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location() {
    }

    /**
     * 
     * @param timezone
     * @param street
     * @param state
     * @param postcode
     * @param coordinates
     * @param city
     */
    public Location(String street, String city, String state, String postcode, Coordinates coordinates, Timezone timezone) {
        super();
        this.street = street;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.coordinates = coordinates;
        this.timezone = timezone;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    public Location withStreet(String street) {
        this.street = street;
        return this;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Location withCity(String city) {
        this.city = city;
        return this;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Location withState(String state) {
        this.state = state;
        return this;
    }

    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Location withPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    @JsonProperty("coordinates")
    public Coordinates getCoordinates() {
        return coordinates;
    }

    @JsonProperty("coordinates")
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Location withCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    @JsonProperty("timezone")
    public Timezone getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(Timezone timezone) {
        this.timezone = timezone;
    }

    public Location withTimezone(Timezone timezone) {
        this.timezone = timezone;
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

    public Location withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("street", street).append("city", city).append("state", state).append("postcode", postcode).append("coordinates", coordinates).append("timezone", timezone).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(timezone).append(additionalProperties).append(street).append(state).append(postcode).append(coordinates).append(city).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return new EqualsBuilder().append(timezone, rhs.timezone).append(additionalProperties, rhs.additionalProperties).append(street, rhs.street).append(state, rhs.state).append(postcode, rhs.postcode).append(coordinates, rhs.coordinates).append(city, rhs.city).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(street);
        dest.writeValue(city);
        dest.writeValue(state);
        dest.writeValue(postcode);
        dest.writeValue(coordinates);
        dest.writeValue(timezone);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
