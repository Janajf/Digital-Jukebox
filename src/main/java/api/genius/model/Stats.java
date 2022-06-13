
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
    "unreviewed_annotations",
    "concurrents",
    "hot",
    "pageviews"
})

public class Stats {

    @JsonProperty("unreviewed_annotations")
    private Integer unreviewedAnnotations;
    @JsonProperty("concurrents")
    private Integer concurrents;
    @JsonProperty("hot")
    private Boolean hot;
    @JsonProperty("pageviews")
    private Integer pageviews;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("unreviewed_annotations")
    public Integer getUnreviewedAnnotations() {
        return unreviewedAnnotations;
    }

    @JsonProperty("unreviewed_annotations")
    public void setUnreviewedAnnotations(Integer unreviewedAnnotations) {
        this.unreviewedAnnotations = unreviewedAnnotations;
    }

    @JsonProperty("concurrents")
    public Integer getConcurrents() {
        return concurrents;
    }

    @JsonProperty("concurrents")
    public void setConcurrents(Integer concurrents) {
        this.concurrents = concurrents;
    }

    @JsonProperty("hot")
    public Boolean getHot() {
        return hot;
    }

    @JsonProperty("hot")
    public void setHot(Boolean hot) {
        this.hot = hot;
    }

    @JsonProperty("pageviews")
    public Integer getPageviews() {
        return pageviews;
    }

    @JsonProperty("pageviews")
    public void setPageviews(Integer pageviews) {
        this.pageviews = pageviews;
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
        sb.append(Stats.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("unreviewedAnnotations");
        sb.append('=');
        sb.append(((this.unreviewedAnnotations == null)?"<null>":this.unreviewedAnnotations));
        sb.append(',');
        sb.append("concurrents");
        sb.append('=');
        sb.append(((this.concurrents == null)?"<null>":this.concurrents));
        sb.append(',');
        sb.append("hot");
        sb.append('=');
        sb.append(((this.hot == null)?"<null>":this.hot));
        sb.append(',');
        sb.append("pageviews");
        sb.append('=');
        sb.append(((this.pageviews == null)?"<null>":this.pageviews));
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
        result = ((result* 31)+((this.concurrents == null)? 0 :this.concurrents.hashCode()));
        result = ((result* 31)+((this.pageviews == null)? 0 :this.pageviews.hashCode()));
        result = ((result* 31)+((this.unreviewedAnnotations == null)? 0 :this.unreviewedAnnotations.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.hot == null)? 0 :this.hot.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stats) == false) {
            return false;
        }
        Stats rhs = ((Stats) other);
        return ((((((this.concurrents == rhs.concurrents)||((this.concurrents!= null)&&this.concurrents.equals(rhs.concurrents)))&&((this.pageviews == rhs.pageviews)||((this.pageviews!= null)&&this.pageviews.equals(rhs.pageviews))))&&((this.unreviewedAnnotations == rhs.unreviewedAnnotations)||((this.unreviewedAnnotations!= null)&&this.unreviewedAnnotations.equals(rhs.unreviewedAnnotations))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.hot == rhs.hot)||((this.hot!= null)&&this.hot.equals(rhs.hot))));
    }

}
