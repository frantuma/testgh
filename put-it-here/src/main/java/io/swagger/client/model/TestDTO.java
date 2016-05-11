package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-11T10:06:04.993Z")
public class TestDTO   {
  
  private String token = null;
  private String owner = null;
  private String repository = null;
  private String branch = null;
  private String path = null;
  private String yamlPath = null;
  private String notificationEmail = null;

  
  /**
   **/
  public TestDTO token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   **/
  public TestDTO owner(String owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  
  /**
   **/
  public TestDTO repository(String repository) {
    this.repository = repository;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("repository")
  public String getRepository() {
    return repository;
  }
  public void setRepository(String repository) {
    this.repository = repository;
  }

  
  /**
   **/
  public TestDTO branch(String branch) {
    this.branch = branch;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("branch")
  public String getBranch() {
    return branch;
  }
  public void setBranch(String branch) {
    this.branch = branch;
  }

  
  /**
   **/
  public TestDTO path(String path) {
    this.path = path;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("path")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  
  /**
   **/
  public TestDTO yamlPath(String yamlPath) {
    this.yamlPath = yamlPath;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("yamlPath")
  public String getYamlPath() {
    return yamlPath;
  }
  public void setYamlPath(String yamlPath) {
    this.yamlPath = yamlPath;
  }

  
  /**
   **/
  public TestDTO notificationEmail(String notificationEmail) {
    this.notificationEmail = notificationEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("notificationEmail")
  public String getNotificationEmail() {
    return notificationEmail;
  }
  public void setNotificationEmail(String notificationEmail) {
    this.notificationEmail = notificationEmail;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestDTO testDTO = (TestDTO) o;
    return Objects.equals(this.token, testDTO.token) &&
        Objects.equals(this.owner, testDTO.owner) &&
        Objects.equals(this.repository, testDTO.repository) &&
        Objects.equals(this.branch, testDTO.branch) &&
        Objects.equals(this.path, testDTO.path) &&
        Objects.equals(this.yamlPath, testDTO.yamlPath) &&
        Objects.equals(this.notificationEmail, testDTO.notificationEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, owner, repository, branch, path, yamlPath, notificationEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestDTO {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    yamlPath: ").append(toIndentedString(yamlPath)).append("\n");
    sb.append("    notificationEmail: ").append(toIndentedString(notificationEmail)).append("\n");
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

