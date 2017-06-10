import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class testLog
{
    private static Logger log = LogManager.getLogger(testLog.class.getName());

    @Test
    public void test1()
    {
        log.info("{}" , "就爱看圣诞节疯狂");
        log.debug("我是debug");
        log.error("{}---{}" , "你是" , " 1233");
        log.trace("{}---{}" , "你是333" , " 1233");
    }
}
