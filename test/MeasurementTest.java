import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class MeasurementTest {

    @Test
    public void shouldVerifyThatOneInchIsEqualsToOneInch()  {
        assertThat(new Measurement(1, Unit.Inch),is(new Measurement(1, Unit.Inch)));
    }

    @Test
    public void shouldVerifyThatOneInchIsNotEqualToOneFoot() {
        assertThat(new Measurement(1, Unit.Inch),is(not(new Measurement(1, Unit.Foot))));
    }
}