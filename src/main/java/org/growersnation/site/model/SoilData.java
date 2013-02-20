package org.growersnation.site.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;
import org.growersnation.site.model.carbon.CarbonFields;
import org.growersnation.site.model.nutrients.TopsoilNutrientsFields;
import org.growersnation.site.model.ph.PHBulkDensityFields;
import org.growersnation.site.model.texture.SoilTextureFields;

import java.util.List;

/**
 * <p>[Pattern] to provide the following to {@link Object}:</p>
 * <ul>
 * <li></li>
 * </ul>
 * <p>Example:</p>
 * <pre>
 * </pre>
 *
 * @since 0.0.1
 *         
 */
public class SoilData {

  @JsonProperty
  private List<CarbonFields> carbonFields = Lists.newArrayList();

  @JsonProperty
  private List<TopsoilNutrientsFields> topsoilNutrientsFields = Lists.newArrayList();

  @JsonProperty
  private List<PHBulkDensityFields> phBulkDensityFields = Lists.newArrayList();

  @JsonProperty
  private List<SoilTextureFields> soilTextureFields = Lists.newArrayList();

  public List<CarbonFields> getCarbonFields() {
    return carbonFields;
  }

  public void setCarbonFields(List<CarbonFields> carbonFields) {
    this.carbonFields = carbonFields;
  }

  public List<TopsoilNutrientsFields> getTopsoilNutrientsFields() {
    return topsoilNutrientsFields;
  }

  public void setTopsoilNutrientsFields(List<TopsoilNutrientsFields> topsoilNutrientsFields) {
    this.topsoilNutrientsFields = topsoilNutrientsFields;
  }

  public List<PHBulkDensityFields> getPhBulkDensityFields() {
    return phBulkDensityFields;
  }

  public void setPhBulkDensityFields(List<PHBulkDensityFields> phBulkDensityFields) {
    this.phBulkDensityFields = phBulkDensityFields;
  }

  public List<SoilTextureFields> getSoilTextureFields() {
    return soilTextureFields;
  }

  public void setSoilTextureFields(List<SoilTextureFields> soilTextureFields) {
    this.soilTextureFields = soilTextureFields;
  }
}
