
package api.genius.model;

import java.util.HashMap;
import java.util.List;
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
    "annotation_count",
    "api_path",
    "artist_names",
    "full_title",
    "header_image_thumbnail_url",
    "header_image_url",
    "id",
    "instrumental",
    "lyrics_owner_id",
    "lyrics_state",
    "lyrics_updated_at",
    "path",
    "pyongs_count",
    "release_date_for_display",
    "song_art_image_thumbnail_url",
    "song_art_image_url",
    "stats",
    "title",
    "title_with_featured",
    "updated_by_human_at",
    "url",
    "featured_artists",
    "primary_artist"
})

public class Result {

    @JsonProperty("_type")
    private String type;
    @JsonProperty("annotation_count")
    private Integer annotationCount;
    @JsonProperty("api_path")
    private String apiPath;
    @JsonProperty("artist_names")
    private String artistNames;
    @JsonProperty("full_title")
    private String fullTitle;
    @JsonProperty("header_image_thumbnail_url")
    private String headerImageThumbnailUrl;
    @JsonProperty("header_image_url")
    private String headerImageUrl;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("instrumental")
    private Boolean instrumental;
    @JsonProperty("lyrics_owner_id")
    private Integer lyricsOwnerId;
    @JsonProperty("lyrics_state")
    private String lyricsState;
    @JsonProperty("lyrics_updated_at")
    private Integer lyricsUpdatedAt;
    @JsonProperty("path")
    private String path;
    @JsonProperty("pyongs_count")
    private Integer pyongsCount;
    @JsonProperty("release_date_for_display")
    private String releaseDateForDisplay;
    @JsonProperty("song_art_image_thumbnail_url")
    private String songArtImageThumbnailUrl;
    @JsonProperty("song_art_image_url")
    private String songArtImageUrl;
    @JsonProperty("stats")
    private Stats stats;
    @JsonProperty("title")
    private String title;
    @JsonProperty("title_with_featured")
    private String titleWithFeatured;
    @JsonProperty("updated_by_human_at")
    private Integer updatedByHumanAt;
    @JsonProperty("url")
    private String url;
    @JsonProperty("featured_artists")
    private List<FeaturedArtist> featuredArtists = null;
    @JsonProperty("primary_artist")
    private PrimaryArtist primaryArtist;
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

    @JsonProperty("annotation_count")
    public Integer getAnnotationCount() {
        return annotationCount;
    }

    @JsonProperty("annotation_count")
    public void setAnnotationCount(Integer annotationCount) {
        this.annotationCount = annotationCount;
    }

    @JsonProperty("api_path")
    public String getApiPath() {
        return apiPath;
    }

    @JsonProperty("api_path")
    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    @JsonProperty("artist_names")
    public String getArtistNames() {
        return artistNames;
    }

    @JsonProperty("artist_names")
    public void setArtistNames(String artistNames) {
        this.artistNames = artistNames;
    }

    @JsonProperty("full_title")
    public String getFullTitle() {
        return fullTitle;
    }

    @JsonProperty("full_title")
    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    @JsonProperty("header_image_thumbnail_url")
    public String getHeaderImageThumbnailUrl() {
        return headerImageThumbnailUrl;
    }

    @JsonProperty("header_image_thumbnail_url")
    public void setHeaderImageThumbnailUrl(String headerImageThumbnailUrl) {
        this.headerImageThumbnailUrl = headerImageThumbnailUrl;
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

    @JsonProperty("instrumental")
    public Boolean getInstrumental() {
        return instrumental;
    }

    @JsonProperty("instrumental")
    public void setInstrumental(Boolean instrumental) {
        this.instrumental = instrumental;
    }

    @JsonProperty("lyrics_owner_id")
    public Integer getLyricsOwnerId() {
        return lyricsOwnerId;
    }

    @JsonProperty("lyrics_owner_id")
    public void setLyricsOwnerId(Integer lyricsOwnerId) {
        this.lyricsOwnerId = lyricsOwnerId;
    }

    @JsonProperty("lyrics_state")
    public String getLyricsState() {
        return lyricsState;
    }

    @JsonProperty("lyrics_state")
    public void setLyricsState(String lyricsState) {
        this.lyricsState = lyricsState;
    }

    @JsonProperty("lyrics_updated_at")
    public Integer getLyricsUpdatedAt() {
        return lyricsUpdatedAt;
    }

    @JsonProperty("lyrics_updated_at")
    public void setLyricsUpdatedAt(Integer lyricsUpdatedAt) {
        this.lyricsUpdatedAt = lyricsUpdatedAt;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("pyongs_count")
    public Integer getPyongsCount() {
        return pyongsCount;
    }

    @JsonProperty("pyongs_count")
    public void setPyongsCount(Integer pyongsCount) {
        this.pyongsCount = pyongsCount;
    }

    @JsonProperty("release_date_for_display")
    public String getReleaseDateForDisplay() {
        return releaseDateForDisplay;
    }

    @JsonProperty("release_date_for_display")
    public void setReleaseDateForDisplay(String releaseDateForDisplay) {
        this.releaseDateForDisplay = releaseDateForDisplay;
    }

    @JsonProperty("song_art_image_thumbnail_url")
    public String getSongArtImageThumbnailUrl() {
        return songArtImageThumbnailUrl;
    }

    @JsonProperty("song_art_image_thumbnail_url")
    public void setSongArtImageThumbnailUrl(String songArtImageThumbnailUrl) {
        this.songArtImageThumbnailUrl = songArtImageThumbnailUrl;
    }

    @JsonProperty("song_art_image_url")
    public String getSongArtImageUrl() {
        return songArtImageUrl;
    }

    @JsonProperty("song_art_image_url")
    public void setSongArtImageUrl(String songArtImageUrl) {
        this.songArtImageUrl = songArtImageUrl;
    }

    @JsonProperty("stats")
    public Stats getStats() {
        return stats;
    }

    @JsonProperty("stats")
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("title_with_featured")
    public String getTitleWithFeatured() {
        return titleWithFeatured;
    }

    @JsonProperty("title_with_featured")
    public void setTitleWithFeatured(String titleWithFeatured) {
        this.titleWithFeatured = titleWithFeatured;
    }

    @JsonProperty("updated_by_human_at")
    public Integer getUpdatedByHumanAt() {
        return updatedByHumanAt;
    }

    @JsonProperty("updated_by_human_at")
    public void setUpdatedByHumanAt(Integer updatedByHumanAt) {
        this.updatedByHumanAt = updatedByHumanAt;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("featured_artists")
    public List<FeaturedArtist> getFeaturedArtists() {
        return featuredArtists;
    }

    @JsonProperty("featured_artists")
    public void setFeaturedArtists(List<FeaturedArtist> featuredArtists) {
        this.featuredArtists = featuredArtists;
    }

    @JsonProperty("primary_artist")
    public PrimaryArtist getPrimaryArtist() {
        return primaryArtist;
    }

    @JsonProperty("primary_artist")
    public void setPrimaryArtist(PrimaryArtist primaryArtist) {
        this.primaryArtist = primaryArtist;
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
        sb.append(Result.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("annotationCount");
        sb.append('=');
        sb.append(((this.annotationCount == null)?"<null>":this.annotationCount));
        sb.append(',');
        sb.append("apiPath");
        sb.append('=');
        sb.append(((this.apiPath == null)?"<null>":this.apiPath));
        sb.append(',');
        sb.append("artistNames");
        sb.append('=');
        sb.append(((this.artistNames == null)?"<null>":this.artistNames));
        sb.append(',');
        sb.append("fullTitle");
        sb.append('=');
        sb.append(((this.fullTitle == null)?"<null>":this.fullTitle));
        sb.append(',');
        sb.append("headerImageThumbnailUrl");
        sb.append('=');
        sb.append(((this.headerImageThumbnailUrl == null)?"<null>":this.headerImageThumbnailUrl));
        sb.append(',');
        sb.append("headerImageUrl");
        sb.append('=');
        sb.append(((this.headerImageUrl == null)?"<null>":this.headerImageUrl));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("instrumental");
        sb.append('=');
        sb.append(((this.instrumental == null)?"<null>":this.instrumental));
        sb.append(',');
        sb.append("lyricsOwnerId");
        sb.append('=');
        sb.append(((this.lyricsOwnerId == null)?"<null>":this.lyricsOwnerId));
        sb.append(',');
        sb.append("lyricsState");
        sb.append('=');
        sb.append(((this.lyricsState == null)?"<null>":this.lyricsState));
        sb.append(',');
        sb.append("lyricsUpdatedAt");
        sb.append('=');
        sb.append(((this.lyricsUpdatedAt == null)?"<null>":this.lyricsUpdatedAt));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("pyongsCount");
        sb.append('=');
        sb.append(((this.pyongsCount == null)?"<null>":this.pyongsCount));
        sb.append(',');
        sb.append("releaseDateForDisplay");
        sb.append('=');
        sb.append(((this.releaseDateForDisplay == null)?"<null>":this.releaseDateForDisplay));
        sb.append(',');
        sb.append("songArtImageThumbnailUrl");
        sb.append('=');
        sb.append(((this.songArtImageThumbnailUrl == null)?"<null>":this.songArtImageThumbnailUrl));
        sb.append(',');
        sb.append("songArtImageUrl");
        sb.append('=');
        sb.append(((this.songArtImageUrl == null)?"<null>":this.songArtImageUrl));
        sb.append(',');
        sb.append("stats");
        sb.append('=');
        sb.append(((this.stats == null)?"<null>":this.stats));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("titleWithFeatured");
        sb.append('=');
        sb.append(((this.titleWithFeatured == null)?"<null>":this.titleWithFeatured));
        sb.append(',');
        sb.append("updatedByHumanAt");
        sb.append('=');
        sb.append(((this.updatedByHumanAt == null)?"<null>":this.updatedByHumanAt));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("featuredArtists");
        sb.append('=');
        sb.append(((this.featuredArtists == null)?"<null>":this.featuredArtists));
        sb.append(',');
        sb.append("primaryArtist");
        sb.append('=');
        sb.append(((this.primaryArtist == null)?"<null>":this.primaryArtist));
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
        result = ((result* 31)+((this.primaryArtist == null)? 0 :this.primaryArtist.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.titleWithFeatured == null)? 0 :this.titleWithFeatured.hashCode()));
        result = ((result* 31)+((this.artistNames == null)? 0 :this.artistNames.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.stats == null)? 0 :this.stats.hashCode()));
        result = ((result* 31)+((this.apiPath == null)? 0 :this.apiPath.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.songArtImageThumbnailUrl == null)? 0 :this.songArtImageThumbnailUrl.hashCode()));
        result = ((result* 31)+((this.fullTitle == null)? 0 :this.fullTitle.hashCode()));
        result = ((result* 31)+((this.annotationCount == null)? 0 :this.annotationCount.hashCode()));
        result = ((result* 31)+((this.songArtImageUrl == null)? 0 :this.songArtImageUrl.hashCode()));
        result = ((result* 31)+((this.releaseDateForDisplay == null)? 0 :this.releaseDateForDisplay.hashCode()));
        result = ((result* 31)+((this.lyricsState == null)? 0 :this.lyricsState.hashCode()));
        result = ((result* 31)+((this.updatedByHumanAt == null)? 0 :this.updatedByHumanAt.hashCode()));
        result = ((result* 31)+((this.featuredArtists == null)? 0 :this.featuredArtists.hashCode()));
        result = ((result* 31)+((this.pyongsCount == null)? 0 :this.pyongsCount.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.instrumental == null)? 0 :this.instrumental.hashCode()));
        result = ((result* 31)+((this.lyricsOwnerId == null)? 0 :this.lyricsOwnerId.hashCode()));
        result = ((result* 31)+((this.lyricsUpdatedAt == null)? 0 :this.lyricsUpdatedAt.hashCode()));
        result = ((result* 31)+((this.headerImageThumbnailUrl == null)? 0 :this.headerImageThumbnailUrl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
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
        return ((((((((((((((((((((((((((this.headerImageUrl == rhs.headerImageUrl)||((this.headerImageUrl!= null)&&this.headerImageUrl.equals(rhs.headerImageUrl)))&&((this.primaryArtist == rhs.primaryArtist)||((this.primaryArtist!= null)&&this.primaryArtist.equals(rhs.primaryArtist))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.titleWithFeatured == rhs.titleWithFeatured)||((this.titleWithFeatured!= null)&&this.titleWithFeatured.equals(rhs.titleWithFeatured))))&&((this.artistNames == rhs.artistNames)||((this.artistNames!= null)&&this.artistNames.equals(rhs.artistNames))))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this.stats == rhs.stats)||((this.stats!= null)&&this.stats.equals(rhs.stats))))&&((this.apiPath == rhs.apiPath)||((this.apiPath!= null)&&this.apiPath.equals(rhs.apiPath))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.songArtImageThumbnailUrl == rhs.songArtImageThumbnailUrl)||((this.songArtImageThumbnailUrl!= null)&&this.songArtImageThumbnailUrl.equals(rhs.songArtImageThumbnailUrl))))&&((this.fullTitle == rhs.fullTitle)||((this.fullTitle!= null)&&this.fullTitle.equals(rhs.fullTitle))))&&((this.annotationCount == rhs.annotationCount)||((this.annotationCount!= null)&&this.annotationCount.equals(rhs.annotationCount))))&&((this.songArtImageUrl == rhs.songArtImageUrl)||((this.songArtImageUrl!= null)&&this.songArtImageUrl.equals(rhs.songArtImageUrl))))&&((this.releaseDateForDisplay == rhs.releaseDateForDisplay)||((this.releaseDateForDisplay!= null)&&this.releaseDateForDisplay.equals(rhs.releaseDateForDisplay))))&&((this.lyricsState == rhs.lyricsState)||((this.lyricsState!= null)&&this.lyricsState.equals(rhs.lyricsState))))&&((this.updatedByHumanAt == rhs.updatedByHumanAt)||((this.updatedByHumanAt!= null)&&this.updatedByHumanAt.equals(rhs.updatedByHumanAt))))&&((this.featuredArtists == rhs.featuredArtists)||((this.featuredArtists!= null)&&this.featuredArtists.equals(rhs.featuredArtists))))&&((this.pyongsCount == rhs.pyongsCount)||((this.pyongsCount!= null)&&this.pyongsCount.equals(rhs.pyongsCount))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.instrumental == rhs.instrumental)||((this.instrumental!= null)&&this.instrumental.equals(rhs.instrumental))))&&((this.lyricsOwnerId == rhs.lyricsOwnerId)||((this.lyricsOwnerId!= null)&&this.lyricsOwnerId.equals(rhs.lyricsOwnerId))))&&((this.lyricsUpdatedAt == rhs.lyricsUpdatedAt)||((this.lyricsUpdatedAt!= null)&&this.lyricsUpdatedAt.equals(rhs.lyricsUpdatedAt))))&&((this.headerImageThumbnailUrl == rhs.headerImageThumbnailUrl)||((this.headerImageThumbnailUrl!= null)&&this.headerImageThumbnailUrl.equals(rhs.headerImageThumbnailUrl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
