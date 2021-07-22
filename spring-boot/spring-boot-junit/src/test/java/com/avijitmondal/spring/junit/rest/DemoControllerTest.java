package com.avijitmondal.spring.junit.rest;

import com.avijitmondal.spring.junit.controller.DemoController;
import com.avijitmondal.spring.junit.service.SomeBusinessService;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RunWith(MockitoJUnitRunner.class)
public class DemoControllerTest {

    @Mock
    private SomeBusinessService mockSomeBusinessService;

    private DemoController demoController;

    @Before
    public void setup() {
        this.demoController = new DemoController(this.mockSomeBusinessService);
    }

    @Test
    public void shouldRetrieveAnEntity() {
        // Given
        Mockito.when(this.mockSomeBusinessService.findEntity("blah")).thenReturn("meh");
        // When
        ResponseEntity<String> actualResponse = this.demoController.findEntity("blah");
        // Then
        Assert.assertThat(actualResponse.getStatusCode(), Matchers.equalTo(HttpStatus.OK));
        Assert.assertThat(actualResponse.getBody(), Matchers.equalTo("meh"));
    }
}