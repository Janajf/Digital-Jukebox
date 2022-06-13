
package api.genius.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_type",
    "api_path",
    "header_image_url",
    "id",
    "image_url",
    "index_character",
    "is_meme_verified",
    "is_verified",
    "name",
    "slug",
    "url",
    "iq"
})

public class PrimaryArtist {

    @JsonProperty("_type")
    private String type;
    @JsonProperty("api_path")
    private String apiPath;
    @JsonProperty("header_image_url")
    private String headerImageUrl;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("index_character")
    private String indexCharacter;
    @JsonProperty("is_meme_verified")
    private Boolean isMemeVerified;
    @JsonProperty("is_verified")
    private Boolean isVerified;
    @JsonProperty("name")
    private String name;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("url")
    private String url;
    @JsonProperty("iq")
    private Integer iq;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_type")
    public String getType() {
        return type;
    }

    @JsonProperty("_type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("api_path")
    public String getApiPath() {
        return apiPath;
    }

    @JsonProperty("api_path")
    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    @JsonProperty("header_image_url")
    public String getHeaderImageUrl() {
        return headerImageUrl;
    }

    @JsonProperty("header_image_url")
    public void setHeaderImageUrl(String headerImageUrl) {
        this.headerImageUrl = headerImageUrl;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("index_character")
    public String getIndexCharacter() {
        return indexCharacter;
    }

    @JsonProperty("index_character")
    public void setIndexCharacter(String indexCharacter) {
        this.indexCharacter = indexCharacter;
    }

    @JsonProperty("is_meme_verified")
    public Boolean getIsMemeVerified() {
        return isMemeVerified;
    }

    @JsonProperty("is_meme_verified")
    public void setIsMemeVerified(Boolean isMemeVerified) {
        this.isMemeVerified = isMemeVerified;
    }

    @JsonProperty("is_verified")
    public Boolean getIsVerified() {
        return isVerified;
    }

    @JsonProperty("is_verified")
    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("iq")
    public Integer getIq() {
        return iq;
    }

    @JsonProperty("iq")
    public void setIq(Integer iq) {
        this.iq = iq;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PrimaryArtist.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("apiPath");
        sb.append('=');
        sb.append(((this.apiPath == null)?"<null>":this.apiPath));
        sb.append(',');
        sb.append("headerImageUrl");
        sb.append('=');
        sb.append(((this.headerImageUrl == null)?"<null>":this.headerImageUrl));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("imageUrl");
        sb.append('=');
        sb.append(((this.imageUrl == null)?"<null>":this.imageUrl));
        sb.append(',');
        sb.append("indexCharacter");
        sb.append('=');
        sb.append(((this.indexCharacter == null)?"<null>":this.indexCharacter));
        sb.append(',');
        sb.append("isMemeVerified");
        sb.append('=');
        sb.append(((this.isMemeVerified == null)?"<null>":this.isMemeVerified));
        sb.append(',');
        sb.append("isVerified");
        sb.append('=');
        sb.append(((this.isVerified == null)?"<null>":this.isVerified));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("slug");
        sb.append('=');
        sb.append(((this.slug == null)?"<null>":this.slug));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("iq");
        sb.append('=');
        sb.append(((this.iq == null)?"<null>":this.iq));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.headerImageUrl == null)? 0 :this.headerImageUrl.hashCode()));
        result = ((result* 31)+((this.isVerified == null)? 0 :this.isVerified.hashCode()));
        result = ((result* 31)+((this.iq == null)? 0 :this.iq.hashCode()));
        result = ((result* 31)+((this.indexCharacter == null)? 0 :this.indexCharacter.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.apiPath == null)? 0 :this.apiPath.hashCode()));
        result = ((result* 31)+((this.imageUrl == null)? 0 :this.imageUrl.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.isMemeVerified == null)? 0 :this.isMemeVerified.hashCode()));
        result = ((result* 31)+((this.slug == null)? 0 :this.slug.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PrimaryArtist) == false) {
            return false;
        }
        PrimaryArtist rhs = ((PrimaryArtist) other);
        return ((((((((((((((this.headerImageUrl == rhs.headerImageUrl)||((this.headerImageUrl!= null)&&this.headerImageUrl.equals(rhs.headerImageUrl)))&&((this.isVerified == rhs.isVerified)||((this.isVerified!= null)&&this.isVerified.equals(rhs.isVerified))))&&((this.iq == rhs.iq)||((this.iq!= null)&&this.iq.equals(rhs.iq))))&&((this.indexCharacter == rhs.indexCharacter)||((this.indexCharacter!= null)&&this.indexCharacter.equals(rhs.indexCharacter))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.apiPath == rhs.apiPath)||((this.apiPath!= null)&&this.apiPath.equals(rhs.apiPath))))&&((this.imageUrl == rhs.imageUrl)||((this.imageUrl!= null)&&this.imageUrl.equals(rhs.imageUrl))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.isMemeVerified == rhs.isMemeVerified)||((this.isMemeVerified!= null)&&this.isMemeVerified.equals(rhs.isMemeVerified))))&&((this.slug == rhs.slug)||((this.slug!= null)&&this.slug.equals(rhs.slug))));
    }

}
