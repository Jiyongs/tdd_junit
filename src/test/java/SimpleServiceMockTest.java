import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SimpleServiceMockTest {

    @Test
    public void calculateSumUsingDataService() {
        // given
        SimpleService simpleService = new SimpleService();
        SimpleDataRepository simpleDataRepositoryMock = mock(SimpleDataRepository.class);

        // when
        // specify mock : when, then
        when(simpleDataRepositoryMock.findAll()).thenReturn(new int[] {1, 2, 3});

        simpleService.setSimpleDataRepository(simpleDataRepositoryMock);
        int actualResult = simpleService.calculateSumUsingDataService();
        int expectedResult = 6;

        // then
        assertEquals(expectedResult, actualResult);
    }

}
