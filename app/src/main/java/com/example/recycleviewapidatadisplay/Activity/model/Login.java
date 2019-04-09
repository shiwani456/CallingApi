
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
    "uuid",
    "username",
    "password",
    "salt",
    "md5",
    "sha1",
    "sha256"
})
public class Login implements Serializable, Parcelable
{

    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("salt")
    private String salt;
    @JsonProperty("md5")
    private String md5;
    @JsonProperty("sha1")
    private String sha1;
    @JsonProperty("sha256")
    private String sha256;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Login> CREATOR = new Creator<Login>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Login createFromParcel(Parcel in) {
            return new Login(in);
        }

        public Login[] newArray(int size) {
            return (new Login[size]);
        }

    }
    ;
    private final static long serialVersionUID = 7142854141337591350L;

    protected Login(Parcel in) {
        this.uuid = ((String) in.readValue((String.class.getClassLoader())));
        this.username = ((String) in.readValue((String.class.getClassLoader())));
        this.password = ((String) in.readValue((String.class.getClassLoader())));
        this.salt = ((String) in.readValue((String.class.getClassLoader())));
        this.md5 = ((String) in.readValue((String.class.getClassLoader())));
        this.sha1 = ((String) in.readValue((String.class.getClassLoader())));
        this.sha256 = ((String) in.readValue((String.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Login() {
    }

    /**
     * 
     * @param username
     * @param sha256
     * @param md5
     * @param sha1
     * @param uuid
     * @param password
     * @param salt
     */
    public Login(String uuid, String username, String password, String salt, String md5, String sha1, String sha256) {
        super();
        this.uuid = uuid;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.md5 = md5;
        this.sha1 = sha1;
        this.sha256 = sha256;
    }

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Login withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public Login withUsername(String username) {
        this.username = username;
        return this;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public Login withPassword(String password) {
        this.password = password;
        return this;
    }

    @JsonProperty("salt")
    public String getSalt() {
        return salt;
    }

    @JsonProperty("salt")
    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Login withSalt(String salt) {
        this.salt = salt;
        return this;
    }

    @JsonProperty("md5")
    public String getMd5() {
        return md5;
    }

    @JsonProperty("md5")
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Login withMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    @JsonProperty("sha1")
    public String getSha1() {
        return sha1;
    }

    @JsonProperty("sha1")
    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public Login withSha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }

    @JsonProperty("sha256")
    public String getSha256() {
        return sha256;
    }

    @JsonProperty("sha256")
    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    public Login withSha256(String sha256) {
        this.sha256 = sha256;
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

    public Login withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("uuid", uuid).append("username", username).append("password", password).append("salt", salt).append("md5", md5).append("sha1", sha1).append("sha256", sha256).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(username).append(sha256).append(additionalProperties).append(md5).append(sha1).append(uuid).append(password).append(salt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Login) == false) {
            return false;
        }
        Login rhs = ((Login) other);
        return new EqualsBuilder().append(username, rhs.username).append(sha256, rhs.sha256).append(additionalProperties, rhs.additionalProperties).append(md5, rhs.md5).append(sha1, rhs.sha1).append(uuid, rhs.uuid).append(password, rhs.password).append(salt, rhs.salt).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(uuid);
        dest.writeValue(username);
        dest.writeValue(password);
        dest.writeValue(salt);
        dest.writeValue(md5);
        dest.writeValue(sha1);
        dest.writeValue(sha256);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
