
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
    "gender",
    "name",
    "location",
    "email",
    "login",
    "dob",
    "registered",
    "phone",
    "cell",
    "id",
    "picture",
    "nat"
})
public class Result implements Serializable, Parcelable
{

    @JsonProperty("gender")
    private String gender;
    @JsonProperty("name")

    private Name name;
    @JsonProperty("location")

    private Location location;
    @JsonProperty("email")
    private String email;
    @JsonProperty("login")

    private Login login;
    @JsonProperty("dob")

    private Dob dob;
    @JsonProperty("registered")

    private Registered registered;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("cell")
    private String cell;
    @JsonProperty("id")

    private Id id;
    @JsonProperty("picture")

    private Picture picture;
    @JsonProperty("nat")
    private String nat;
    @JsonIgnore

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Result> CREATOR = new Creator<Result>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Result createFromParcel(Parcel in) {
            return new Result(in);
        }

        public Result[] newArray(int size) {
            return (new Result[size]);
        }

    }
    ;
    private final static long serialVersionUID = 6890923216273751273L;

    protected Result(Parcel in) {
        this.gender = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((Name) in.readValue((Name.class.getClassLoader())));
        this.location = ((Location) in.readValue((Location.class.getClassLoader())));
        this.email = ((String) in.readValue((String.class.getClassLoader())));
        this.login = ((Login) in.readValue((Login.class.getClassLoader())));
        this.dob = ((Dob) in.readValue((Dob.class.getClassLoader())));
        this.registered = ((Registered) in.readValue((Registered.class.getClassLoader())));
        this.phone = ((String) in.readValue((String.class.getClassLoader())));
        this.cell = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((Id) in.readValue((Id.class.getClassLoader())));
        this.picture = ((Picture) in.readValue((Picture.class.getClassLoader())));
        this.nat = ((String) in.readValue((String.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param picture
     * @param id
     * @param phone
     * @param email
     * @param location
     * @param registered
     * @param cell
     * @param dob
     * @param name
     * @param gender
     * @param nat
     * @param login
     */
    public Result(String gender, Name name, Location location, String email, Login login, Dob dob, Registered registered, String phone, String cell, Id id, Picture picture, String nat) {
        super();
        this.gender = gender;
        this.name = name;
        this.location = location;
        this.email = email;
        this.login = login;
        this.dob = dob;
        this.registered = registered;
        this.phone = phone;
        this.cell = cell;
        this.id = id;
        this.picture = picture;
        this.nat = nat;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Result withGender(String gender) {
        this.gender = gender;
        return this;
    }

    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    public Result withName(Name name) {
        this.name = name;
        return this;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    public Result withLocation(Location location) {
        this.location = location;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Result withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("login")
    public Login getLogin() {
        return login;
    }

    @JsonProperty("login")
    public void setLogin(Login login) {
        this.login = login;
    }

    public Result withLogin(Login login) {
        this.login = login;
        return this;
    }

    @JsonProperty("dob")
    public Dob getDob() {
        return dob;
    }

    @JsonProperty("dob")
    public void setDob(Dob dob) {
        this.dob = dob;
    }

    public Result withDob(Dob dob) {
        this.dob = dob;
        return this;
    }

    @JsonProperty("registered")
    public Registered getRegistered() {
        return registered;
    }

    @JsonProperty("registered")
    public void setRegistered(Registered registered) {
        this.registered = registered;
    }

    public Result withRegistered(Registered registered) {
        this.registered = registered;
        return this;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Result withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @JsonProperty("cell")
    public String getCell() {
        return cell;
    }

    @JsonProperty("cell")
    public void setCell(String cell) {
        this.cell = cell;
    }

    public Result withCell(String cell) {
        this.cell = cell;
        return this;
    }

    @JsonProperty("id")
    public Id getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Id id) {
        this.id = id;
    }

    public Result withId(Id id) {
        this.id = id;
        return this;
    }

    @JsonProperty("picture")
    public Picture getPicture() {
        return picture;
    }

    @JsonProperty("picture")
    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public Result withPicture(Picture picture) {
        this.picture = picture;
        return this;
    }

    @JsonProperty("nat")
    public String getNat() {
        return nat;
    }

    @JsonProperty("nat")
    public void setNat(String nat) {
        this.nat = nat;
    }

    public Result withNat(String nat) {
        this.nat = nat;
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

    public Result withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("gender", gender).append("name", name).append("location", location).append("email", email).append("login", login).append("dob", dob).append("registered", registered).append("phone", phone).append("cell", cell).append("id", id).append("picture", picture).append("nat", nat).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(phone).append(location).append(cell).append(picture).append(id).append(email).append(additionalProperties).append(registered).append(dob).append(name).append(gender).append(nat).append(login).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result) == false) {
            return false;
        }
        Result rhs = ((Result) other);
        return new EqualsBuilder().append(phone, rhs.phone).append(location, rhs.location).append(cell, rhs.cell).append(picture, rhs.picture).append(id, rhs.id).append(email, rhs.email).append(additionalProperties, rhs.additionalProperties).append(registered, rhs.registered).append(dob, rhs.dob).append(name, rhs.name).append(gender, rhs.gender).append(nat, rhs.nat).append(login, rhs.login).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(gender);
        dest.writeValue(name);
        dest.writeValue(location);
        dest.writeValue(email);
        dest.writeValue(login);
        dest.writeValue(dob);
        dest.writeValue(registered);
        dest.writeValue(phone);
        dest.writeValue(cell);
        dest.writeValue(id);
        dest.writeValue(picture);
        dest.writeValue(nat);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
