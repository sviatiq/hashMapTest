import org.junit.Assert;
import org.junit.Test;

public class HashMapProjTest {

    @Test
    public void putItemTest() {
        HashMapProj hmp = new HashMapProj(2);

        hmp.put(1, 11);
        hmp.put(2, 12);
        hmp.put(3, 13);

        Assert.assertEquals(hmp.size(), 2);
    }
    @Test
    public void getItemTest(){
        HashMapProj hashMapProj = new HashMapProj(2);

        hashMapProj.put(1, 11);
        hashMapProj.put(2, 12);

        Assert.assertEquals(hashMapProj.get(1), 11);
    }
    @Test
    public void replaceItemTest(){
        HashMapProj hashMapProj = new HashMapProj(2);

        hashMapProj.put(1, 11);
        hashMapProj.put(1, 12);

        Assert.assertEquals(hashMapProj.get(1), 12);
    }
    @Test
    public void sizeHashMapTest(){
        HashMapProj hashMapProj = new HashMapProj(2);

        hashMapProj.put(1, 11);
        hashMapProj.put(1, 12);

        Assert.assertEquals(hashMapProj.size(), 1);
    }
}