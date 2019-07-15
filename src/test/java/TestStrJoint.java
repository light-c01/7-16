import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestStrJoint {

    @Test
    public void test(){
        String str = StrUtil.strJoint("user_create_time");
        assertEquals(str, "userCreateTime");

    }
}
