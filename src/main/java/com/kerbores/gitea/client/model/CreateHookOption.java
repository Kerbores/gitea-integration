/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kerbores.gitea.client.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CreateHookOption options when create a hook
 */
@ApiModel(description = "CreateHookOption options when create a hook")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-17T06:59:13.679Z")
public class CreateHookOption {
  @SerializedName("active")
  private Boolean active = false;

  @SerializedName("branch_filter")
  private String branchFilter = null;

  @SerializedName("config")
  private CreateHookOptionConfig config = null;

  @SerializedName("events")
  private List<String> events = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DINGTALK("dingtalk"),
    
    DISCORD("discord"),
    
    GITEA("gitea"),
    
    GOGS("gogs"),
    
    MSTEAMS("msteams"),
    
    SLACK("slack"),
    
    TELEGRAM("telegram");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public CreateHookOption active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CreateHookOption branchFilter(String branchFilter) {
    this.branchFilter = branchFilter;
    return this;
  }

   /**
   * Get branchFilter
   * @return branchFilter
  **/
  @ApiModelProperty(value = "")
  public String getBranchFilter() {
    return branchFilter;
  }

  public void setBranchFilter(String branchFilter) {
    this.branchFilter = branchFilter;
  }

  public CreateHookOption config(CreateHookOptionConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(required = true, value = "")
  public CreateHookOptionConfig getConfig() {
    return config;
  }

  public void setConfig(CreateHookOptionConfig config) {
    this.config = config;
  }

  public CreateHookOption events(List<String> events) {
    this.events = events;
    return this;
  }

  public CreateHookOption addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<String>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(value = "")
  public List<String> getEvents() {
    return events;
  }

  public void setEvents(List<String> events) {
    this.events = events;
  }

  public CreateHookOption type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateHookOption createHookOption = (CreateHookOption) o;
    return Objects.equals(this.active, createHookOption.active) &&
        Objects.equals(this.branchFilter, createHookOption.branchFilter) &&
        Objects.equals(this.config, createHookOption.config) &&
        Objects.equals(this.events, createHookOption.events) &&
        Objects.equals(this.type, createHookOption.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, branchFilter, config, events, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateHookOption {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    branchFilter: ").append(toIndentedString(branchFilter)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
