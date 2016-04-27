package com.smartbear.har.builder;

import com.smartbear.har.model.HarRequest;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HarRequestBuilderTest {

    private HarRequestBuilder harRequestBuilder;

    @Before
    public void setUp() throws Exception {
        harRequestBuilder = new HarRequestBuilder();
    }

    @Test
    public void shouldDecodeQueryValue() throws Exception {
        String queryString="command=Killer%20serve";
        String expectedParamValue = "Killer serve";

        final HarRequest request = harRequestBuilder.withQueryString(queryString).build();

        assertThat(request.getQueryString().get(0).getValue(), is(expectedParamValue));
    }

    @Test
    public void shouldKeepSpaceInQueryValue() throws Exception {
        String queryString="command=Killer serve";
        String expectedParamValue = "Killer serve";

        final HarRequest request = harRequestBuilder.withQueryString(queryString).build();

        assertThat(request.getQueryString().get(0).getValue(), is(expectedParamValue));
    }

    @Test
    public void shouldKeepSpecialCharacterInQueryValue() throws Exception {
        String queryString="uri=spotify:artist:4YrKBkKSVeqDamzBPWVnSJ;";
        String expectedParamValue = "spotify:artist:4YrKBkKSVeqDamzBPWVnSJ;";

        final HarRequest request = harRequestBuilder.withQueryString(queryString).build();

        assertThat(request.getQueryString().get(0).getValue(), is(expectedParamValue));
    }

    @Test
    public void shouldCreateMultipleQueryParam() throws Exception {
        String queryString="param1=vaue1&param2=value2&param3=value3434=34343";
        String expectedParam3Value = "value3434=34343";

        HarRequest request = harRequestBuilder.withQueryString(queryString).build();

        assertThat(request.getQueryString().size(), is(3));
        assertThat(request.getQueryString().get(2).getValue(), is(expectedParam3Value));
    }

    @Test
    public void shouldCreateQueryParamForEmptyValue() throws Exception {
        String queryString="param1";
        String expectedParamValue = "";

        HarRequest request = harRequestBuilder.withQueryString(queryString).build();

        assertThat(request.getQueryString().get(0).getValue(), is(expectedParamValue));
    }

    @Test
    public void shouldCreateQueryParamForEmptyString() throws Exception {
        String queryString="";
        String expectedParamValue = "";

        HarRequest request = harRequestBuilder.withQueryString(queryString).build();

        assertThat(request.getQueryString().size(), is(0));
    }
}