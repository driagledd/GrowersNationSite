package org.growersnation.site.dao.soil.http;

import org.growersnation.site.model.soil.nutrients.TopsoilNutrientsFields;
import org.growersnation.site.model.soil.ph.FeatureInfoResponse;
import org.growersnation.site.model.soil.ph.PHBulkDensityFields;
import org.junit.Ignore;
import org.junit.Test;

import javax.xml.bind.JAXB;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TopsoilNutrientsDaoTest {

  @Test
  public void testJAXB() {

    InputStream is = TopsoilNutrientsDaoTest.class.getResourceAsStream("/fixtures/soil/nutrients/test-nerc-topsoil-nutrients-1.xml");
    FeatureInfoResponse fir = JAXB.unmarshal(is, FeatureInfoResponse.class);

    PHBulkDensityFields fields = fir.getFields().get(0);

    assertEquals("Improved grassland",fields.getDominantBroadHabitat());

  }

  /**
   * Only required during development
   */
  @Ignore
  public void testLiveData() {

    TopsoilNutrientsDao testObject = new TopsoilNutrientsDao();

    List<TopsoilNutrientsFields> fields = testObject.getTopsoilNutrientsData(51.2, 0.1);

    assertEquals("Improved grassland",fields.get(0).getDominantBroadHabitat());

  }


}
